// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.bean;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import com.atguigu.anno.Bean;

/**
 * AnnotationApplicationContext
 */
public class AnnotationApplicationContext implements ApplicationContext{

  //创建Map，模拟ioc容器
  private static Map<Class,Object> beanFactory = new HashMap<>();

  private static String rootPath;

  @Override
  public Object getBean(Class clazz) {
    return beanFactory.get(clazz);
  }

  //当前包及子包，谁有@Bean，通过反射抓过来
  //根据basePackage设置包扫描规则
  public AnnotationApplicationContext (String basePackage){
    //1.获取"com.atguigu"绝对路径
    String packagePath = basePackage.replaceAll("\\.", "\\\\");

    ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
    try {
      Enumeration<URL> urls = contextClassLoader.getResources(packagePath);
      while (urls.hasMoreElements()){
        URL url = urls.nextElement();
        String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
        System.out.println(filePath);
        //字符串截取
        rootPath = filePath.substring(0, filePath.length() - packagePath.length());
        //包扫描,bean进行实例化
        loadBean(new File(filePath));
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private void loadBean(File file) throws Exception {

    //1.判断当前内容是否是文件夹
    if(file.isDirectory()){
      //2.获取文件夹所有内容
      File[] childrenFiles = file.listFiles();
      //3.判断文件夹内是否有内容
      if (childrenFiles == null || childrenFiles.length ==0) {
        return;
      }
      //4.不为空，遍历文件夹所有内容
      for (File child : childrenFiles) {
        //4.1便利得到的每个file对象，继续判断 ，还是一个文件夹，递归
        if (child.isDirectory()){
          loadBean(child);
        }else {
          //4.2遍历得到了文件，
          //4.3得到包的路径+类名称部分
          String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
          //4.4 判断当前文件类型是不是.class文件
          if(pathWithClass.contains(".class")){
            //4.5 是，把路径\替换为.  去掉class
            // com.atguigu.service.UserServiceImpl
            String allName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
            //4.6 判断类上面有没有@Bean，有则反射实例化
            //4.6.1 获取类的Class
            Class<?> clazz = Class.forName(allName);
            //4.6.2 判断不是接口
            if(!clazz.isInterface()){
              //4.6.3 判断有没有注解
              Bean annotation = clazz.getAnnotation(Bean.class);
              if (annotation != null) {
                // 4.6.4 实例化
                Object instance = clazz.getConstructor().newInstance();
                //4.7 放入ioc(map)
                if (clazz.getInterfaces().length > 0) {
                  // 4.7.1 当前类如果有接口，让接口class作为key
                  beanFactory.put(clazz.getInterfaces()[0],instance );
                }else {
                  // 4.7.2 当前类没有接口，自己作为key
                  beanFactory.put(clazz,instance);
                }
              }
            }
          }
        }
      }
    }
  }
}
