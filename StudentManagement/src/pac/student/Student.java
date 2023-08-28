package pac.student;
import java.util.Scanner;

public class Student  {
	private String name;
	private String rollnum;
	private String grade;
	private String section; 
	Scanner sc=new Scanner(System.in);
	public  Student () {
		
		System.out.println("Please Enter The name:");
		this.name=sc.nextLine();
		System.out.println("Please Enter The Rollnumber:");
		this.rollnum=sc.next();
		System.out.println("Please Enter The Grade:");
		this.grade=sc.next();
		System.out.println("Please Enter The Section:");
		this.section=sc.next();
		
	}
	
    public void disply()
    {   System.out.println("Student Information->");
    	System.out.println("Student Name: "+name+"\nRollnumber Is: "+rollnum+"\nGrade Is: "+grade+"\nSection Is: "+section);   	
    }  
	
}
