package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> student=new ArrayList<>();
		student.add(new Student(1,"abhi",21,60f));
		student.add(new Student(2,"abhishek",22,70f));
		student.add(new Student(3,"vishal",23,20f));
		student.add(new Student(4,"avanish",24,900f));
		student.add(new Student(5,"deepak",25,79f));
		student.add(new Student(6,"aditya",19,54f));
		student.add(new Student(7,"priya",22,68f));
		student.add(new Student(8,"rani",21,15f));
		List<Student> newStream=student.stream().filter(s->s.mark>60 && s.mark<80).collect(Collectors.toList());
		for(Student s:newStream)
		{
			System.out.println("student id is "+s.id+"student name is"+s.name+"student age is"+s.age+"student mark is "+s.mark);
		}
		

	}

} 
class Student 
{
	int id;
	String name;
	int age;
	float mark;
	public Student(int id,String name,int age,float mark)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
}
