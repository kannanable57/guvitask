package example;

public class Student {
	String name;
	int age;
	 public void setname(String name) {
		 this.name = name;
	 }
	 public String getname() {
		 return name;
	 } 
	 public void setAge(int age) {
		 this.age=age;
	 }
	 public int getAge() {
		 return age;
	 }
	 public static void main (String[]args) {
		 Student s1 = new Student();
		 s1.setname("sathish");
		 s1.setage(24);
		 System.out.println(s1.getname());
		 System.out.println(s1.getage());
		 
		 
		 
	 }
		
			}
	

	


