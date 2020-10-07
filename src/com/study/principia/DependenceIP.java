package com.study.principia;

/**
 * @Author LiuYang
 * @Date 2020/10/7/007  17:18
 * @Version 1.0
 * 依赖倒置原则指设计代码结构，高层模块不应该依赖底层模块，二者都应该依赖抽象，抽象不要依赖细节，细节依赖抽象
 **/
class Tom{

  /**
   * Tom热爱学习，目前正在学习java课程和python课程，大家知道学习会上瘾的。随着学习兴趣的暴涨，tom还想学习ai课程。这个时候，需要业务扩展，代码要从底层到高层
   * (调用层)一次修改代码。在tom类中
   * */
  public void studyJavaCourse(){
    System.out.println("Tom在学习Java的课程");
  }

  public void studyPythonCourse(){
    System.out.println("Tom在学习python的课程");
  }
}

/**
 * 改造后
 */
interface IDIPCourse{
  void study();
}

class DIPJavaCourse implements IDIPCourse{

  @Override
  public void study() {
    System.out.println("tom 正在学习java课程");
  }
}
class DIPPythonCourse implements IDIPCourse{

  @Override
  public void study() {
    System.out.println("tom 正在学习python课程");
  }
}

class DIPTom{
  private IDIPCourse course;
  /*public DIPTom(IDIPCourse course){
    this.course=course;
  }*/
  public void setCourse(IDIPCourse course){
    this.course=course;
  }

  public void study(){
    course.study();;
  }
}
public class DependenceIP {

  public static void main(String[] args) {
    Tom tom=new Tom();
    tom.studyJavaCourse();
    tom.studyPythonCourse();

    //改造后实现方式
    /*DIPTom tom1=new DIPTom(new DIPJavaCourse());
    tom1.study();*/

    //setter注入方式
    DIPTom dipTom=new DIPTom();
    dipTom.setCourse(new DIPJavaCourse());
    dipTom.study();;

    dipTom.setCourse(new DIPPythonCourse());
    dipTom.study();
  }
}
