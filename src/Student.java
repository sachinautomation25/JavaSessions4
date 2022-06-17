
public class Student {

	String name;
	int rollNo;

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.name + "\n" + s.rollNo);
		
		System.out.println(s);//address of the object or memory location:Student@15db9742
		
		new Student();
		
		System.out.println(new Student().name);
	}
}
