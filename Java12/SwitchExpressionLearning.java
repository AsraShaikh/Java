
/*
	Checking switch expression - preview feature introduced in Java-12
*/
public class SwitchExpressionLearning{
	public static void main(String[] args){
		System.out.println("Learning switch expressions with Java 12");

		String inputDayName = "Monday";

		System.out.println("Output from fall through old style classic switch-case statement : " + testFallThroughBehaviourSwitchStatement(inputDayName));
		System.out.println("Output from non - fall through old style classic switch-case statement : " + testNonFallThroughBehaviourSwitchStatement(inputDayName));
		System.out.println("Output from switch-case expression with old-style: " + testNonFallThroughSwitchExpressionOldStyle(inputDayName));
		System.out.println("Output from switch-case expression with new-style: " + testNonFallThroughSwitchExpressionNewStyle(inputDayName));
		System.out.println("Output from switch-case expression with new-style arrow syntax: " + testSwitchExpressionUsingArrowSyntax(inputDayName));
	
	}


	//old style - classic switch case
	public static String testFallThroughBehaviourSwitchStatement(String inputDayName){
		
		String result = "";

		switch(inputDayName){
			case "Monday"   : System.out.println("Day is : " + inputDayName);
							  result = "1 - "+ inputDayName;
			case "Tuesday"  : System.out.println("Day is : " + inputDayName);
							  result = "2 - "+ inputDayName;
			case "Wednesday" : System.out.println("Day is : " + inputDayName);
							  result = "3 - "+ inputDayName;
		}

		return result;
	}

	public static String testNonFallThroughBehaviourSwitchStatement(String inputDayName){
		
		String result = "";

		switch(inputDayName){
			case "Monday"   : System.out.println("Day is : " + inputDayName);
							  result = "1 - "+ inputDayName;
							  break;
			case "Tuesday"  : System.out.println("Day is : " + inputDayName);
							  result = "2 - "+ inputDayName;
							  break;
			case "Wednesday" : System.out.println("Day is : " + inputDayName);
							  result = "3 - "+ inputDayName;
			case "SAT" :
			case "SUN" : result =  "weekend";
		}

		return result;
	}

	//switch expression - old style case...:
	public static String testNonFallThroughSwitchExpressionOldStyle(String inputDayName){
		
		String result = switch(inputDayName){
			case "Monday"   : System.out.println("Day is : " + inputDayName);
							  break "1 - "+ inputDayName;
			case "Tuesday"  : System.out.println("Day is : " + inputDayName);
							  break "2 - "+ inputDayName;
			case "Wednesday" : System.out.println("Day is : " + inputDayName);
							  break "3 - "+ inputDayName;
			default         : System.out.println("Day is : " + inputDayName);
							  break "any day";			
		};

		return result;
	} 

	//switch expression - new style case...-> 
	public static String testNonFallThroughSwitchExpressionNewStyle(String inputDayName){
		
		String result = switch(inputDayName){
			case "Monday"   -> {System.out.println("Day is : " + inputDayName);
							   break "1 - "+ inputDayName;}
			case "Tuesday"  -> {System.out.println("Day is : " + inputDayName);
							   break "2 - "+ inputDayName;}
			case "Wednesday"-> {System.out.println("Day is : " + inputDayName);
							   break "3 - "+ inputDayName;}
			default         -> {System.out.println("Day is : " + inputDayName);
							   break "any day";	}		
		};

		return result;
	} 

	//switch expression - new style case...->  - without the need of break
	public static String testSwitchExpressionUsingArrowSyntax(String inputDayName){
		
		String result = switch(inputDayName){
			case "Monday"   -> "1 - "+ inputDayName;
			case "Tuesday"  -> "2 - "+ inputDayName;
			case "Wednesday"-> "3 - "+ inputDayName;
			case "SAT", "SUN" -> "weekend";
			default         -> "any day";			
		};

		return result;
	} 

}