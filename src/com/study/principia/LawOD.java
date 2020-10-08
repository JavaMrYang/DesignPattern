package com.study.principia;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiuYang
 * @Date 2020/10/8/008  11:23
 * @Version 1.0
 * 迪米特法则又叫最少知道原则，指一个对象应该对其他对象保存最少的了解，尽量降低类与类之间的耦合。迪米特法则强调只和朋友交流，不和陌生人说话。
 **/

class LODCourse{

}
class Employee{
  public void checkNumberOfCourses(List<LODCourse> courseList){
    System.out.println("目前已发表的课程数量:"+courseList.size());
  }
}
class TeamLeader{
  public void commandCheckNumber(Employee employee){
    List<LODCourse> courseList=new ArrayList<LODCourse>();
    for (int i=0;i<20;i++){
      courseList.add(new LODCourse());
    }
    employee.checkNumberOfCourses(courseList);
  }
}

//改造后
class Employee1{
  public void checkNumberOfCourse(){
    List<LODCourse> courseList=new ArrayList<LODCourse>();
    for (int i=0;i<20;i++){
      courseList.add(new LODCourse());
    }
    System.out.println("目前已发表的课程数量:"+courseList.size());
  }
}

class TeamLeader1{
  public void commandCheckNumber(Employee1 employee){
    employee.checkNumberOfCourse();
  }
}
public class LawOD {

  public static void main(String[] args) {
    TeamLeader teamLeader=new TeamLeader();
    Employee employee=new Employee();
    teamLeader.commandCheckNumber(employee);

    //改造后
    Employee1 employee1=new Employee1();
    TeamLeader1 teamLeader1=new TeamLeader1();
    teamLeader1.commandCheckNumber(employee1);
  }
}
