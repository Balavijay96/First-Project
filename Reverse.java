package com.task;

public class Reverse {
	public static void main(String[] args) {
		int i=1234;
		int sum=0;
		while(i>0) {
			int num=i%10;			// num=1234%10=4; 123%10=3  12%
			sum=(sum*10)+num;		//sum=0x10=0+4=4 ;4x10+3=43
			i=i/10;	//1234/10=123   123/10=12
		}
		System.out.println(sum);
	}
}
