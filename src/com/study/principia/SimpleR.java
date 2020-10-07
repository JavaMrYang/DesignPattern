package com.study.principia;

/**
 * @Author LiuYang
 * @Date 2020/10/7/007  17:52
 * @Version 1.0
 * 单一职责
 **/
class SRCourse{
  public void study(String courseName){
    if("直播课".equals(courseName)){
      System.out.println("不能快进");
    }else{
      System.out.println("可以任意来回播放");
    }
  }
}

/**
 * 使用单一原则改造后
 */
class LiveCourse{
  public void study(String courseName){
    System.out.println(courseName+" 不能快进看");
  }
}
class ReplayCourse{
  public void study(String courseName){
    System.out.println("可以任意来回观看");
  }
}
public class SimpleR {

  public static void main(String[] args) {
    SRCourse course=new SRCourse();
    course.study("直播课");
    course.study("录播课");

    //改造后调用
    LiveCourse liveCourse=new LiveCourse();
    liveCourse.study("直播课");

    ReplayCourse replayCourse=new ReplayCourse();
    replayCourse.study("录播课");
  }
}
