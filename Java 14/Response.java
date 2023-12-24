public record Response(String statusCode, String statusMessage){
	public Response{
		System.out.println("testing");
	}
}

public class TestClass{
	public static void main(String args[]){
		Response response = new Response("200", "OK");
		System.out.println(response);
	}

}
