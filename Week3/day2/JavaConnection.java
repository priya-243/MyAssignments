package Week3.day2;

public class JavaConnection implements DatabaseConnection
{
	public static void main(String[] args) {
		JavaConnection object=new JavaConnection();
		object.connect();
		object.disconnect();
		object.executeUpdate();
		
	}

	@Override
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

}
