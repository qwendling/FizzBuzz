package fr.unistra.fizzbuzz;

public class FizzBuzz {

	public String convert(int number) {
		if(number % 3 != 0 && number % 5 !=0)
			return new Integer(number).toString();
		else 
			return (number%5 != 0)?"Fizz":(number%3 != 0)?"Buzz":"FizzBuzz";
	}
}
