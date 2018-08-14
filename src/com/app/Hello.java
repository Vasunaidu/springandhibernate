package com.app;
interface Myinter
{
	public int show(int a);
}

public class Hello implements Myinter{

	public int show(int a) {
		return a;
	}
public static void main(String[] args) {
	Hello l=new Hello();
	
	System.out.println(l.show(100));
}
}
