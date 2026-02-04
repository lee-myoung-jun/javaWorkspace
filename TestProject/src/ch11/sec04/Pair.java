package ch11.sec04;

public class Pair<K,V> {
	private K key;
	private V val;
	
	public Pair() {
		
	}
	
	public Pair(K key, V value) {
		this.key = key;
		this.val = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
	
	
}


















