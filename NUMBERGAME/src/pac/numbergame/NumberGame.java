package pac.numbergame;

import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String temp = null;
 int score=0;
 int limit=5;
   System.out.println("Plese Enter start");
   String play=sc.nextLine();
switch(play)
{
 case "start":
 while(limit!=0)
{
    System.out.println("Enter the number:");
    int n =sc.nextInt();
    random r1=new random(n);
    if(r1.rannum()==n)
    {
    System.out.println("YOU WON");
    score++;
    }
    else if(r1.rannum()>n)
    {
	System.out.println("NUMBER IS TOO LESS"); 
    }
    else {
	System.out.println("NUMBER IS TOO HIGH");
    }
    limit--;
    if(limit==0)
    {
      System.out.println("You have Cross the limit");
    }
}
}
System.out.println("Your Score Is:"+score);


}
}
