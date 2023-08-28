package pac.numbergame;

import java.util.Random;

public class random {
	int num;
	random(int num){
		this.num=num;
	}
	
   public int rannum()
   {
	 Random random=new Random();
	 return random.nextInt(1, 10);
	 
   }
}
