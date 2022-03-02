record Response(String statusCode, String statusMessage){
	//compact constructor
	public Response{
		System.out.println("compact constructor - this is short form of cononical constructor. At any given time, a record can have either compact or cononical constructor but not both since they both are same. ");
	}

	// no-arg constructor
	Response(){
		this("500", "Server error");
		System.out.println("No argument constructor. So at first statement, It must call cononical constuctor passing all the parameters.");
	}
	/*
	//canonical constructor
	public Response(String statusCode, String statusMessage){
		System.out.println("conical constructor - here all arguments are specified as parameters to consturctor. At any given time, a record can have either compact or cononical constructor but not both since they both are same.");
	}
	*/
}

public class RecordLearning{
	public static void main(String args[]){
		Response response = new Response("200", "OK");
		Response response2 = new Response();
		System.out.println(response);
		System.out.println(response2);
	}

}
