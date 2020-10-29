package com.study.design;

/**
 * @Author LiuYang
 * @Date 2020/10/25/025  15:19
 * @Version 1.0
 **/
public class ConcreateFactoryB implements IFactory {

  @Override
  public IProfuct makeProduct() {
    return new ConcreateProductB();
  }
}
