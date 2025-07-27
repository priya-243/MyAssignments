package Week3.day1;

public class APIClient {
	public void sendRequest(String endpoint)
	{
		System.out.println("End Point of APIClient is" +endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus )
	{
		System.out.println("sendRequest is:" + endpoint+" "+requestBody+" "+requestStatus);
	
	}
	public static void main(String[] args) {
		APIClient a1=new APIClient();
		a1.sendRequest("Response received");
a1.sendRequest("response received", "sucessfull status", true);
		
	}

}
