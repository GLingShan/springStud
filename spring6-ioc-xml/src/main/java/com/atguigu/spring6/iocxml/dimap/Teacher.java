package com.atguigu.spring6.iocxml.dimap;

/**
 * ClassName:Teacher
 * Package:com.felix.spring6.iocxml.dimap
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 15:16
 * @Version 1.0
 */
public class Teacher {

    private String teacherId;
    private String teacherName;



    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
