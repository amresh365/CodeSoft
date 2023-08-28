package pac.word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWord {
public static void main(String[] args) throws FileNotFoundException {
	File file =new File("C:\\Users\\91959\\OneDrive\\Desktop\\myfile.txt");
	 Scanner sc = new Scanner(file);
	 String[] arr=null;
	 String s = null;
	 int counter=0;
    while (sc.hasNextLine())
    {
     s=sc.nextLine();
    }
   
  arr=s.split(" ");
    for(int i=0;i<arr.length;i++)
    {
    	counter++;
    }
    System.out.println("Your Total word is In The File:"+counter);
}
}
