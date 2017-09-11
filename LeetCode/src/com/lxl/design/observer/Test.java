package com.lxl.design.observer;

public class Test {
public static void main(String[] args) {
	Transporter transporter = new Transporter();  
	  
    Police police = new Police();  
     
    Thief thief = new Thief();  

    transporter.addWatcher(police);  
    transporter.addWatcher(thief);  
    

    transporter.notifyWatchers();  
}
}
