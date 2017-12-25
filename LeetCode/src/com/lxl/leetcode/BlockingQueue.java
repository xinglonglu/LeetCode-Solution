package com.lxl.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue {
		private  List queue = new LinkedList();
		private  int limit = 10;
		public BlockingQueue (int limit){
			this.limit = limit;
		}
		Random theRandom = new Random();
		ReentrantLock lock = new ReentrantLock();
		Condition notfull = lock.newCondition() ;
		Condition notempty = lock.newCondition() ;
		public  void enqueue(Object item) throws InterruptedException {
			lock.lock();
				try{
					while(queue.size()==limit){
						notempty.await();					
					}
					queue.add(theRandom.nextInt());
					notfull.signalAll();
				}finally{
					lock.unlock();
				}
		}
		public   void dequeue() throws InterruptedException{
			lock.lock();
			try {
				while(queue.size()==0){
					notfull.await();
				}
				Object a = queue.remove(queue.size()-1);
				notempty.signalAll();
			} finally {
				// TODO: handle exception
				lock.unlock();
			}
		}
}
