import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling 
{
	public void Calculator() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation");
		int op= sc.nextInt();
		System.out.println("Enter first number");
		int s =sc.nextInt();
		System.out.println("Enter Second number");
		int p=sc.nextInt();
		if(op == 1)
			System.out.println("Addition: "+ (s+p));
		
		if(op == 2)
			System.out.println("Subtraction: "+ (s-p));
		
		if(op == 3)
			System.out.println("Division: "+ (s/p));

			
			File file=new File("E:\\File\\testFile.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already Exist");
			}			
			
			FileWriter w=new FileWriter(file);
			w.append("First num="+s+"\nSecond num="+p+"\nOperaton Done");
			w.close();
			
			FileReader reader= new FileReader("E:\\File\\testFile.txt");
			int data;
			while((data=reader.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println(" ");
		}
	
	public static void main(String[] args) throws IOException
	{
		FileHandling f = new FileHandling();
		f.Calculator();
		
	}
}
		
