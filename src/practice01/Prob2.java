package practice01;


public class Prob2 {

	public static void main(String[] args) {

		int num = 1;
		
		
		for (int j=0; j<10; j++){
			for (int i=0; i<=9; i++){
				System.out.print(num + i + " ");
				
			}
			num +=1;
			System.out.println();
		}
	}

}
