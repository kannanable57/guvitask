package example;
import java.util.Scanner;



public class grades {

	public static void main(String[] args) {
		float[] marks = new float [8];
		float sum=0, avg;
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter marks obtained in 8 subjects:");
		for(i=0; i<8; i++);
		marks[i] = scan.nextFloat();
		for(i=0; i<8; i++);
		sum= sum + marks[i];
		avg = sum/8;
		System.out.print("\nGrade = ");
		if (avg>=100)
		System.out.println("s");
		else if(avg>=90 && avg<99)
		System.out.println("A");
		else if(avg>=80 && avg<89)
		System.out.println("B");
		else if(avg>=70 && avg<79)
		System.out.println("c");
		else if(avg>=60 && avg<69)
		System.out.println("D");
		else if(avg>=50 && avg<59)
		System.out.println("E");
			
			
				

	}

}
