package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			
		
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		int result = 0;
		int i = 0;
		
		while (true){
			
			i++;
		
			if (num % 2 == 0){
				
				if (i % 2 == 0){
					result += i;
				}
				else{
					continue;
				}
			}
			else {
				if ( i % 2 != 0) {
					result += i;
				}
				else {
					continue;
				}
			}
			
			if (i == num){
				break;
			}
			
		}
		
		System.out.println("결과 값 : " + result);
		
	}

}
