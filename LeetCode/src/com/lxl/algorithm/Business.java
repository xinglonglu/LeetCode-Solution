package com.lxl.algorithm;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Business {
		private Lock lock = new ReentrantLock();
		private Condition conditionA = lock.newCondition();
		private Condition conditionB = lock.newCondition();
		private Condition conditionC = lock.newCondition();
		private String type = "A";
		public void printA(){
		System.out.println("A启动");
			lock.lock();
			try{
				while(type!="A"){
					try {
						conditionA.await();
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			System.out.println(Thread.currentThread().getName()+"输出A");
			type="b";
			conditionB.signal();
			}finally{
			lock.unlock();	
			}
		}
		 public void printB() {
			 System.out.println("B启动");
		        lock.lock(); //锁
		        try {
		            while (type != "B") { //type不为B，
		                try {
		                    conditionB.await(); //将当前线程阻塞于conditionB对象上，将被阻塞。
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }

		            //type为B，则执行。
		            System.out.println(Thread.currentThread().getName() + " 正在打印B");
		            type = "C"; //将type设置为C。
		            conditionC.signal(); //唤醒在等待conditionC对象上的一个线程。将信号传递出去。
		        } finally {
		            lock.unlock(); //解锁
		        }
		    }

		    public void printC() {
		    	System.out.println("C启动");
		        lock.lock(); //锁
		        try {
		            while (type != "C") {
		                try {
		                    conditionC.await();
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }

		            System.out.println(Thread.currentThread().getName() + " 正在打印C");
		            type = "A";
		            conditionA.signal();
		        } finally {
		            lock.unlock(); //解锁
		        }
		    }
		 

		        public static void main(String[] args) {
		            final Business business = new Business();//业务对象。

		            //线程1号，打印10次A。
		            Thread ta = new Thread(new Runnable() {

		                @Override
		                public void run() {
		                    for(int i=0;i<10;i++){
		                        business.printA();
		                    }
		                }
		            });

		            //线程2号，打印10次B。
		            Thread tb = new Thread(new Runnable() {

		                @Override
		                public void run() {
		                    for(int i=0;i<10;i++){
		                        business.printB();
		                    }
		                }
		            });

		            //线程3号，打印10次C。
		            Thread tc = new Thread(new Runnable() {

		                @Override
		                public void run() {
		                    for(int i=0;i<10;i++){
		                        business.printC();
		                    }
		                }
		            });

		            //执行3条线程。
		            ta.start();
		            tb.start();
		            tc.start();
		        }

		
}
