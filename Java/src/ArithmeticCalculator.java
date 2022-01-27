import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		System.out.println("Addition:"+(i+j));
		System.out.println("Subtraction:"+(i-j));
		System.out.println("Division:"+(i/j));
		System.out.println("Mod:"+(i%j));
	}

}