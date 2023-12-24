public class TextBlockLearning{
	
	public static void main(String[] args){
		
		System.out.println("Learning text blocks with Java 13");

		checkextBlock();
	
	}

	public static void checkextBlock(){
		
		String multiLineString = "Hi\nHello\nBye";

		String textBlock =  """
		Hi
		Hello
		Bye""";


		System.out.println("Multi line string created with old style : " + multiLineString);
		System.out.println("Text block : " + textBlock);

		String jsonString = "{ \"name\" : \"asra\", \"age\" : 27 }";

		String jsonTextBlock = """
		{ "name" : "asra" }""";

		System.out.println("Json string created with old style : " + jsonString);
		System.out.println("Json Text block : " + jsonTextBlock);

		String textBlockTest = """test
		""";
		System.out.println("Text block test : " + textBlockTest);

	}

}