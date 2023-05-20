package com.atguigu.spring6.iocxml.dimap;

/**
 * ClassName:Lesson
 * Package:com.felix.spring6.iocxml.dimap
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 16:55
 * @Version 1.0
 */
public class Lesson {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
