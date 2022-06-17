package com.qa.datatypes;

/**
 * this is my first code for data types: multi line comment java will ignore
 * this while run/execute the code
 * 
 * @author Dell
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		// data types: single line comment

		// 1. byte
		// size: 1 byte=8 bits
		// range:-128 to 127 cannot store numeric data less than -128 and beyond 127
		byte b = 10;
		byte b1 = 0;
		byte b2 = -20;
		// byte b3=-129; //Type mismatch: cannot convert from int to byte
		byte b4 = 127;

		// byte b=11;// for variable b memory initilization already done and you are
		// tring to create one more same variable not allowed, it can be
		// reassigned but duplicate not allowed

		b = 12;
		System.out.println(b);

		// 2. short
		// size: 2 byte=16 bits
		// range:-32768 to 32767

		short s = 10;
		short s2 = -32768;
		short s3 = 32767;

		// 3. int
		// size: 4 byte=32 bits
		// range: -2^31 to 2^31-1
		int x = 10;
		int y = 10000;
		System.out.println(x + y);

		// 4. long
		// size:8 byete=64 bits
		// range:-2^63to 2^63-1
		long l = 10000000000l; // The literal 10000000000 of type int is out of range ,so using suffix l
		long l2 = 1000000000;

		// 5. float-the decimal number
		// size 4byte=32 bits

		// float f=1.2; //Type mismatch: cannot convert from double to float

		float f2 = 1.2f;
		float f3 = (float) 1.5;
		float f4 = 100f;

		System.out.println(f2 + "\n" + f4);

		// 6. double
		// size: 8 byte=64 bits
		double d = 10.2;
		double d2 = 12.3;
		System.out.println(d);

		// character:char
		// size: 2byte=16 bits

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);
		System.out.println(c1 + c2);

		char c3 = 97;
		System.out.println(c3);

		char gender = 'm';
		char executionFlag = 'y';

		// 8. boolean:true or false
		// size: aprox 1 bit
		// some trainer says approx 1 bit,some says 1 bit but actually it is not
		// predefined in java.At runtime jvm will decide how much memory to provide
		// boolean
		// variable and also it depneds upon version of jvm
		boolean bb = true;
		boolean bb2 = false;
		boolean isActive = true;
		boolean isUsCitizen = false;

		System.out.println(bb);

	}

}
