package practice01;

public class Prob5 {

	public static void main(String[] args) {

		
		for (int i=0; i<100; i++){
			String snum = String.valueOf(i);
			int length = snum.length();
			int clapCount = 0;
			
			for (int j=0; j<length; j++){
				char n = snum.charAt(j);
				if (n=='3' || n=='6' || n=='9'){
					clapCount++;
						}
					}
			if (clapCount == 0){
				continue;
					}			
			else {
				System.out.print(snum);
				for (int k=0; k<clapCount; k++){
					System.out.print("짝");
					}
				System.out.println();
				}	
		}
	}
}