package Control;

import Data.Challenge;

public class Interface {

	
	
	public static void main(String[] args) {
		
		boolean[] testing1 = new boolean[9];
		for(int i=0; i<testing1.length;i++) {
			testing1[i] = true;
		}
				
		Challenge test = new Challenge(testing1);	
		
		int[] printing = new int[9];
		printing = test.getTasks();
		for(int j=0; j<testing1.length;j++) {
			System.out.println(printing[j]);;
		}
		
		
		
	}
	
	
}
