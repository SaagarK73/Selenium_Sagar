package com.sort;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
	
	
	public static void main(String[] args) {
		LinkedList<Student> ll = new LinkedList<Student>();
		Student abc = new Student(45, "fgdfg", "dgdg");
		ll.add(new Student(10,"Sagar","Pune"));
		ll.add(new Student(2,"Varsha","Bhopal"));
		ll.add(new Student(5,"Amit","Premnagar"));
		ll.add(new Student(7,"Shaggy","Premnagar"));
		System.out.println((Student)abc);
		
		
		Collections.sort(ll, new NameComparator());
		for (Student student : ll) {
			System.out.println(student.rollNo+ " " + student.name);
		}
	}
}
