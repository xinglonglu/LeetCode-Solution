package com.lxl.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
	private static final float factor = 0.75f;//扩容因子  
    private Map<K, V> map; //数据存储容器  
    private int cacheSize;//缓存大小  
    public LRUCache(int cacheSize) {  
    	this.cacheSize=cacheSize;
    	int capacity = (int) Math.ceil(cacheSize / factor) + 1;  
    	map = new LinkedHashMap<K, V>(capacity, factor,true){
    		@Override
    		  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {  
                boolean todel = size() > LRUCache.this.cacheSize;  
                return todel;  
    		}
    	};
    }
    /** 
     * 根据key获取value 
     * 
     * @param key 
     * @return value 
     **/  
    public synchronized V get(K key) {  
        return map.get(key);  
    }  
    /** 
     * put一个key-value 
     * 
     * @param key 
     *            value 
     **/  
    public synchronized void put(K key, V value) {  
        map.put(key, value);  
    }  
    /** 
     * 根据key来删除一个缓存 
     * 
     * @param key 
     **/  
    public synchronized void remove(K key) {  
        map.remove(key);  
    }  
    /** 
     * 清空缓存 
     **/  
    public synchronized void clear() {  
        map.clear();  
    }  
    /** 
     * 已经使用缓存的大小 
     **/  
    public synchronized int cacheSize() {  
        return map.size();  
    }  
    /** 
     * 获取缓存中所有的键值对 
     **/  
    public synchronized Collection<Map.Entry<K, V>> getAll() {  
        return new ArrayList<Map.Entry<K, V>>(map.entrySet());  
    }  
}
