package example;

public class star {



	public static void main (String[] args)
	{
		// Number of  rows
		int N = 5;
		//output loop runs N times
		for (int i =1; i<=N; i++) {
		//Inner loop prints 'N - i' spaces
		for (int j = 1; j <= N - i; j++ ) {
		System.out.print (" ");
		}
		//Inner loop prints 'i' stars
		for (int j = 1; j<=i; j++) {
			System.out.print("*");
		}
		//Move to the next line
		System.out.println();
		}
	}
}
