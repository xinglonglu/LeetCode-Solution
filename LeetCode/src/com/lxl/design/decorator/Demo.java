package com.lxl.design.decorator;

public class Demo {
public static void main(String[] args) {
	RealComponent re = new RealComponent();
	DecoratorA deA = new DecoratorA();
	deA.setComponent(re);
	deA.operation();
}
}
