package com.lxl.design.decorator;

public abstract class AbstractComponent extends Component{
	  protected Component component;    
	    public void setComponent(Component component){  
	        this.component = component;  
	    }  
	      
	    @Override  
	    public void operation() {  
	        if(component != null){  
	            component.operation();  
	        }  
	    }  
}
