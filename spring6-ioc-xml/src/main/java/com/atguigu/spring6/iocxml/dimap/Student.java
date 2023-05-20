package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * ClassName:Student
 * Package:com.felix.spring6.iocxml.dimap
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 15:16
 * @Version 1.0
 */
public class Student {

    private Map<String,Teacher> teacherMap;
    private List<Lesson> lessonList;


    private String sId;
    private String sName;

    public void run() {
        System.out.println("学生编号:" + sId + "学生名称:" + sName);
        System.out.println(teacherMap.toString());
        System.out.println(lessonList);
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherMap=" + teacherMap +
                ", sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
