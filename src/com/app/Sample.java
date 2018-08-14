package com.app;
interface My
{
	public int show(int a);
}
interface Show
{
	public int demo(int b);
}
public class Sample {
public static void main(String[] args) {
	My m=(a)-> a;
	System.out.println(m.show(100));
}
}
