package lambda;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class Main {

	public static void main(String[] args) {
		//1st way - concrete implementation class of interface
		Greeting greeting = new HelloGreeting();
		greeting.sayHello();
		
		//2nd way - anonymous inner class
		Greeting greeting2 = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Anonymous inner class - Hello World");
			}
		};
		greeting2.sayHello();
		
		//3rd way - lambda
		Greeting greeting3 = () -> System.out.println("Lambda - Hello World");
		greeting3.sayHello();

		//OR
		Greeting greeting4 = () -> { System.out.println("Hello World"); };
		
		
		/********Defining Lambda for functional interface with parameters and return values **************/
		Calculator calculator = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println("Adding 2 numbers :" + calculator.calculate(2, 3));
		
		
		/***************Using existing interfaces provided by Java for above calculator example ************/
		BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {return a+b;};
		System.out.println("Adding 2 numbers using Java provided functional interface :" + biFunction.apply(5, 3));

		IntBinaryOperator intBinaryOperator = (int a, int b) -> {return a+b;};
		System.out.println("Adding 2 numbers using Java provided functional interface :" + intBinaryOperator.applyAsInt(5, 3));

	}
}
