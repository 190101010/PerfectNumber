/*
 * Kübra YAYLA
 * Problem:
 *  Write a program that lists all perfect numbers between 6 and N, an upper
limit entered by the user. After you verify the program with a small number
for N, gradually increase the value for N and see how long the program takes
to generate the perfect numbers. Since there are only a few perfect numbers,
you might want to display the numbers that are not perfect so you can easily
tell that the program is still running
 * Date: 19.07.2022
 */


import java.util.Date;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		  
		System.out.println("please enter a limit number");
		int N = s.nextInt();
		//the sum of divisors
		int sum;
		//find divisors
		int j,i;
		Date startTime = new Date();
		for(j=1; j<N; j++)
		{
			sum = 0;
			for(i=1; i<j; i++)
			
				if(j%i==0)
					sum +=i;
				if(sum==j)
					System.out.println(j+" perfect<3");
				else
					System.out.println(j+" not perfect");
				
			
		}
		Date endTime = new Date();
		double elapsedTime  = 
				endTime.getTime() - startTime.getTime();
		System.out.println("Time-miliseconds-: "+elapsedTime );
	}
		
}


