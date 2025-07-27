package Week3.day2;

public class JavaConnect extends MySqlConnection{

	public void connect() {
		System.out.println("Database connected");
			
		}

	@Override
	public void disconnect() {
		System.out.println("Database disconnected");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution updated");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Query Executed");
		
	}
public static void main(String[] args) {
	JavaConnect obj=new JavaConnect();
	obj.connect();
	obj.disconnect();
	obj.executeQuery();
	obj.executeUpdate();
	
}
		

}
