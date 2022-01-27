import java.util.Scanner;
public class ReturnType {
	void div(int a, int b)
	{
	System.out.println(a/b);
	}
	int add(int a, int b)
	{
	return a+b;
	}
	float sub(int a, int b)
	{
	return a-b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ReturnType t = new ReturnType();
		t.div(a,b);
		System.out.println(t.add(a,b));
		System.out.println(t.sub(a,b));	

	}

}
