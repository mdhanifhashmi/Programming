package org;

import com.Father;

// Accessing protected members in different package
class Son extends Father{
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("Name:"+s.name);
		System.out.println("Age:"+s.age);
	}
}
