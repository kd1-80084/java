package com.sunbeam;
@FunctionalInterface
public interface Check<T> {

	
	 public abstract boolean compare(T x, T y);
}
