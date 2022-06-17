package com.qa.variablesmethods;

/*
 * based on scope we have 3 types of variables:
 * 1.local:these variable are created inside a method
 * after method call,as soon as method execute
 * no default value,initialized local variable before use
 * within method/within curly braces
 * 
 * 2.instance:
 * declaration:inside a class body but outside a method
 * memory allocation:when we create an object
 * default value:integer family:0
 * floating type:0.0
 * character:single space character
 * boolean:false
 * for any class whether user defined class or pre defined class if you have created a reference variable of class:null nt a value it is just nothing
 * scope:within class
 * 
 * 3.static
 * static members are not object specific,all objects wil share same static members,single copy which will be shared by all class objects
 * within class body but outside a method with static keyword
 * memory allocated after class loading in common memory area/method area
 * JVM will assign default value in case we dnt explictly assign value
 * untill class active in memory
 * static variable are shared property whereas instance variables are private project of each and every object as every variable  copy given to each class object 
 * 
 * when to make a variable as instance variable or static variable?
 * if you think there is some data which should be object specific which you think will be separate for each objects then you should create that variable as 
 * instance variable whereas if you think this data should be common for each object then create that variable as static variable
 * 
 * Declaration time nothing,memory allocation happen at runtime
 * 
 * 
 * 
 * Run/Execute first JVM will load class(.class file-byte code) in memory that is class loading and then allocate memory to static members before executing
 * 
 * 
 * where variable has created
 * object also called instance of class
 */
public class TypeOfVariableBasedOnScope {

	int a; // instance variable-->inside class body but outside a method-->all objects will
			// have a copy of this instance variable-->memory allocation for copies
	// of instance variable inside object
	// instance variable are object specific variable, we use instance variable with
	// object

	String name;
	double d;
	float f;
	char c;
	boolean b;

	// int var;//based on value-integer but based on the scope this is instance
	// variable
	static int var;// now this is static variable
	static String s = "Rahul"; // this is string variable but based on the scope this is static variable

	static int days = 7;// based on value its int variable but based on scope it is static variable

	public static void main(String[] args) {

		int ab;

		// System.out.println(a);

		TypeOfVariableBasedOnScope obj = new TypeOfVariableBasedOnScope();// as soon as this object is created memory allocation for instance
													// variable like a,name and b etc will happen inside
		// an object
		System.out.println(obj.a);
		System.out.println(obj.name + "\n" + obj.f + "\n" + obj.d + "\n" + obj.c + "\n" + obj.b);

		TypeOfVariableBasedOnScope obj2 = new TypeOfVariableBasedOnScope();

		//a=10;//Cannot make a static reference to the non-static field a//suppose
		// compiler nt give error so at runtime JVM know a is instance variable which is
		// object specific variable,JVM will confused for which object it should assign
		// a=10

		System.out.println(obj.a);// JVM will assign default value depend on data type of variable once object
									// created and that default value printed

		System.out.println(obj.a == obj2.a);

		System.out.println("p");

		System.out.println(obj.days);

		obj2.days = 8;

		System.out.println(obj.days);

		System.out.println(days);
		System.out.println(TypeOfVariableBasedOnScope.days);
		days = 6;
		TypeOfVariableBasedOnScope.days = 7;
		System.out.println(days);
		
		int localVariable = 0;//local variable
		
		System.out.println(localVariable);
		
		int a = 10;
		System.out.println(a);
		System.out.println(obj.a);

		obj.name();
		obj.name2();
	}
	public void name() {
		int a=10;// local variable
		//int days = 0;
		 System.out.println(a);
		System.out.println(days);
		System.out.println(TypeOfVariableBasedOnScope.days);
	}
	public void name2() {
		int a = 0; //on the basis of scope this is local variable
		int bbb;
		System.out.println("name2 method...");
		if (true) {
			System.out.println(a);
			int bb = 0;//local variable
			bbb=0;
			System.out.println(b);
		}
//		System.out.println(bb);//bb cannot be resolved to a variable compiler not able to find this variable
		
		//scope of any variable is within curly braces where you have defined the variable
		
		System.out.println(bbb);
	}

}
