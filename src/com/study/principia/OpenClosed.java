package com.study.principia;

/**
 * @Author LiuYang
 * @Date 2020/10/7/007  17:05
 * @Version 1.0
 * 开闭原则指一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。也正是对扩展和修改两个行为的一个原则
 **/
interface ICourse{
  Integer getId();
  String getName();
  Double getPrice();
}

/**
 * 整个java架构、大数据、人工智能、前端、软件测试
 */
class JavaCourse implements ICourse{
  private Integer id;
  private String name;
  private Double price;

  public JavaCourse(Integer id, String name, Double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  @Override
  public Integer getId() {
    return this.id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Double getPrice() {
    return this.price;
  }
}

class JavaDiscountCourse extends JavaCourse{

  public JavaDiscountCourse(Integer id, String name, Double price) {
    super(id, name, price);
  }

  public Double getOriginPrice(){
    return  super.getPrice();
  }

  public Double getPrice(){
    return super.getPrice()*0.61;
  }
}
public class OpenClosed {

  public static void main(String[] args) {
    ICourse course=new JavaDiscountCourse(1,"jack",67d);
    System.out.println("这是我原始价格:"+((JavaDiscountCourse) course).getOriginPrice());
    System.out.println("这是我打折后的价格:"+course.getPrice());
  }
}
