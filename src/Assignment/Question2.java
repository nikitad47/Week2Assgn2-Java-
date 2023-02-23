package Assignment;

import java.text.*;

class Adder<T,S,B>
{
	T a;
	T b;
	
	/*Adder(T a, T b)
	{
		this.a=a;
		this.b=b;
	}*/
	
	
	T add(S a, B b)
	{
		Double sum = 0d;
		//return a + b;
		sum += Double.valueOf(a.toString());
		sum += Double.valueOf(b.toString());
		/*NumberFormat f = NumberFormat.getInstance();
		Number n1 = f.parse(a.toString());
		Number n2 = f.parse(b.toString());
		return n1.intValue()+n2.intValue();*/
		return (T)(String.valueOf(sum));
	}
}

public class Question2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Adder<String, Integer, Float> a = new Adder<>();
		System.out.println(a.add(10, 10.2f));

	}
}


