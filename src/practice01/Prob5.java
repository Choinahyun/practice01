package practice01;

public class Prob5 {

	public static void main(String[] args) {

		int num = 1;
		int dnum = 0;
		
		while (num<100){
			if (num <= 10){
				if (num % 3 == 0){
					System.out.println(num + " 짝");
				}
			}
			else {
				dnum = num % 10;
				if (dnum % 3 == 0){
					System.out.println(num + " 짝");
				}
			}
			num ++;
		}

		
		
	}
}
