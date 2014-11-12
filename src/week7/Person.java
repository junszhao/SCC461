package week7;

public class Person {
	String name;
	int age;
	int numberOfKids;
	
	public Person () {
		
	}
	
	public Person(int age) {
	
		this.age = age;	
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void addOne(int x) {
		x = x + 1;
	}
	
	public void addOne(Person x) {
		x.age ++;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	}
}
