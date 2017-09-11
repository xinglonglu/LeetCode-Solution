package com.lxl.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Transporter implements Watched {
	private List<Watcher> list = new ArrayList<Watcher>();  
	@Override
	public void addWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		list.add(watcher); 
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		 list.remove(watcher);
	}

	@Override
	public void notifyWatchers() {
		// TODO Auto-generated method stub
		 for (Watcher watcher : list)  
         {  
              watcher.update();  
         }  
	}

}
