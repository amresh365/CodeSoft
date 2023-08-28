package pac.student;
import java.util.Scanner;
public class Main {
 static Student[] students =new Student[1000]; 
 static int i=0;
public static void main(String[] args) {
	 int num;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("Press 1 for Add\nPress 2 for Remove\nPress 3 for Search \nPress 4 for Disply all Students");
		num=sc.nextInt();
	switch (num)
	{
	case 1:
	Student s1=new Student();	
	students[i]=s1;
	i++;
	break;
	case 2:
		remove();
		break;
	case 3:
		System.out.println("Which Student you want to search Enter Student Nuber");
		int snum=sc.nextInt();
		search(snum);
		break;
	case 4:
	for(int j=0;j<i;j++) {
	System.out.println("--------------------------------");
	System.out.println("STUDENT:"+(j+1));
	students[j].disply();
	}
	System.out.println("--------------------------------");
		break;
		
	default :
		System.out.println("You Are Entered Wrong Choice");
	}
	}while(true);
}
public static void remove()
{   
	if(i!=0) {
	students[i-1]=null;
	i--;
	}
	else {
		System.out.println("Not any Student Enroled");
	}
}
public static void search(int snum){
	students[snum-1].disply();
}
}