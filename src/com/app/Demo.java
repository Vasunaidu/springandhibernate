package com.app;
interface Myinterface
{
	public int show(int a,int b);
}
public class Demo
{static int a=10,b=20,c=(a+b);
	public static void main(String[] args) {
		Myinterface m=(a,b)->c;
		System.out.println(m.show(100,200));}}