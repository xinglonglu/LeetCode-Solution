package com.lxl.design.decorator;

public class DecoratorA extends AbstractComponent{
	 @Override
	 public void operation(){  
	        super.operation();  	        
	        System.out.println("具体装饰对象A的操作。" );  
	    }  
}
