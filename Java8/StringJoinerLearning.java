import java.util.*;
public class StringJoinerLearning{
	
	public static void main(String args[]){
		StringJoiner stringJoiner = new StringJoiner(".");
		stringJoiner.add("StringJoiner is a class introduced in java 8");
		stringJoiner.add(" Its purpose is to join together added elements using provided delimiter");
		stringJoiner.add(" Note that, it does not add delimiter after last element");
		stringJoiner.add(" These all sentences before are delimited using StringJoiner.");
		System.out.println(stringJoiner);
		System.out.println("************************************************************");


		stringJoiner = new StringJoiner("!" , "BEGIN" , "END");
		stringJoiner.add(" \n We can also specify prefix and suffixes as done in this example");
		stringJoiner.add(" This is really cool");
		stringJoiner.add(" Isn't it?\n");

		System.out.println(stringJoiner);
		System.out.println("************************************************************");


		System.out.println("Converting string joiner to String gives same result- \n" + stringJoiner.toString());

	}

}