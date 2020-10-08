package com.study.principia;

/**
 * @Author LiuYang
 * @Date 2020/10/8/008  11:06
 * @Version 1.0
 * 接口隔离原则指用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。
 * 这个原则指导我们在设计接口时，应当注意以下几点:
 * 1.一个类对另一个类的依赖应该建立在最小接口上
 * 2.建立单一接口，不要建立庞大臃肿的接口
 * 3.尽量细化接口，接口中的方法尽量少
 **/
interface IAnimal{
  void  eat();
  void fly();
  void swim();
}

/**
 * 定义一个鸟类
 */
class Brid implements IAnimal{

  @Override
  public void eat() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void swim() {

  }
}

class Dog implements IAnimal{

  @Override
  public void eat() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void swim() {

  }
}

//改造后
interface IEatAnimal{
  void eat();
}

interface IFlyAnimal{
  void fly();
}

interface ISwimAnimal{
  void swim();
}

class ISBrid implements IFlyAnimal,IEatAnimal{

  @Override
  public void eat() {

  }

  @Override
  public void fly() {

  }
}

class ISDog implements IEatAnimal,ISwimAnimal{

  @Override
  public void eat() {

  }

  @Override
  public void swim() {

  }
}
public class InterfaceS {

}
