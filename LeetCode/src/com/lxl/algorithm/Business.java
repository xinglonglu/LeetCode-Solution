package com.lxl.algorithm;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Business {
		private static volatile  int state = 0;
		public static void main(String[] args) {
			
			final ReentrantLock lock = new ReentrantLock();
			
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(state<=1){
						try{
							lock.lock();
							if(state%3==0){
								System.out.println("A");
								state++;
							}
						}finally{
							lock.unlock();
						}
					}
					
				}
			});
			
			Thread t2 =new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(state<=1){
						try{
							lock.lock();
							if(state%3==1){
								System.out.println("B");
								state++;
							}
						}finally{
							lock.unlock();
						}
					}
					
				}
			});
			Thread t3 =new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(state<=1){
						try{
							lock.lock();
							if(state%3==2){
								System.out.println("C");
								state++;
							}
						}finally{
							lock.unlock();
						}
					}
					
				}
			});
			
			t1.start();
			t2.start();
			t3.start();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
}
