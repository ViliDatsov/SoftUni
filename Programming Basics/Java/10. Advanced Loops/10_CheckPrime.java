import java.util.Scanner;
public class NumbersNto1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		boolean isPrime=true;
		if(n<2){
			isPrime=false;
		}
		for (int i = 2; i <= Math.sqrt(n) ; i++) {
			if(n%2==0){
				isPrime=false;
				break;
			}if(n %i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime==true){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
}
10. Check Prime
