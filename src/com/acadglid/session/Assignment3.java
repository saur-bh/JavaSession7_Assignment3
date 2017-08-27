/*
 * Write a program in java to show how the capacity is changing in StringBuffer or in StringBuilder 
 * if we append the string.
 * Hint: - The capacity changes according to the formula = Initial_capacity*2+2.
 */


package com.acadglid.session;

public class Assignment3 {

	public static void main(String[] arg) {

		//1. Create object of StringBuffer which will be created with capicity 16 

		StringBuffer str = new StringBuffer();

		//2. Get the initial capacity i.e. 16

		System.out.println("The initial capacity -->"+str.capacity());


		//3. Append string 

		str.append("Hellothisoflen16"); //length 16 
		System.out.println("The length of the string is-->"+str.length());


		//4. Append one more to increase length

		str.append("add");

		//4. check capacity  it will be 34 (16*2+2)

		System.out.println("The initial capacity -->"+str.capacity());
	}

}
