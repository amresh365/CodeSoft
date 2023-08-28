package pac.atm;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 int withammount;
		 int depositammount;
		ATM atm=new ATM();
		Scanner sc1=new Scanner(System.in);
		 do {
			 System.out.println("Please Enter:\n1 For CheakBalence:\n2 For Deposit:\n3 For Withdraw:");
			 int num=sc1.nextInt();
		switch(num)
		{
		case 1:
			 System.out.println(atm.CheakBalence());	
	         break;
		case 2:
			System.out.println("Please Enter Ammount For Deposit:");
			depositammount=sc1.nextInt();
			atm.Deposit(depositammount);
			break;
		case 3:
			System.out.println("Please Enter Ammount For WithDraw:");
			withammount=sc1.nextInt();
			atm.Withdraw(withammount);
			break;
		default:
			System.out.println("Please Enter Valid Number");
		}
		 }while(true);
	    
	}

}
