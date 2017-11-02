package com.lxl.algorithm;

public class DoubleLinklist<E> {
	private static class Entry<E>{
		E e;
		Entry<E>  nextEntry;
		Entry<E>  preEntry;
		
		public Entry(E e , Entry<E> preEntry,Entry<E>  nextEntry){
			this.e = e;  
            this.nextEntry = nextEntry;  
            this.preEntry = preEntry;
		}
	}
	
	private Entry<E>  head = new Entry<E>(null, null, null);
	public void DoubleChain() {  
        head.nextEntry = head.preEntry = head;  
    }
	
	private void addBefore(E e,Entry<E> entry){
		Entry<E> newEntry = new Entry<E>(e,entry.preEntry,entry); 
		
		newEntry.preEntry.nextEntry=newEntry;
		newEntry.nextEntry.preEntry=newEntry;
		
		
	}
	public void addHead(E e){
		this.addBefore(e, head.nextEntry);
	}
	public void addLast(E e){
		this.addBefore(e, head);
	}
	public void addindex(E e,int index){
		int count = 0;
		for (Entry<E> p = head.nextEntry;p!=head ; p=p.nextEntry) {
			if(count==index){
				this.addBefore(e, p);
			}
			count++;
		}
	}
	public void removeindex(int index){
		int count = 0;
		for (Entry<E> p = head.nextEntry;p!=head ; p=p.nextEntry) {
			if(count==index){
				p.preEntry.nextEntry=p.nextEntry;
				p.nextEntry.preEntry=p.preEntry;
			}
			count++;
		}
	}
}
