package Assignment;

import java.util.*;

interface SumOfDigits
{
	void sum(int a);
}

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits s=(a)->{
			System.out.println(a*a);
		};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		s.sum(sc.nextInt());
		sc.close();

	}

}
