import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class Student{
	int rollno;
	String name,branch;
	public Student(int rollno, String name, String branch) {
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}
	
}
class SortName implements Comparator<Student>{
	public int compare(Student a, Student b) {
				return a.name.compareTo(b.name);
	}
}
class SortBranch implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.branch.compareTo(b.branch);
	}
	
}

public class Compare1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Student (1,"anoohya","Ece"));
	al.add(new Student (2,"swathi","cse"));
	al.add(new Student (3,"tarun","Ece"));
	al.add(new Student (4,"sreelekha","Eee"));
	
	System.out.println("Sorting by name");
	Collections.sort(al, new SortName() );
	Iterator i=al.iterator();
	while(i.hasNext()) {
		Student s=(Student)i.next();
		System.out.println(s.rollno+" "+s.name+" "+s.branch);
	}
	
	System.out.println("Sorting by branch");
	Collections.sort(al, new SortBranch() );
	Iterator i1=al.iterator();
	while(i1.hasNext()) {
	Student s=(Student)i1.next();
		System.out.println(s.rollno+" "+s.name+" "+s.branch);
	}
	
}
}
