package Week2.day1;

public class LearnMethod {
	public void makeCall(int num, String name, boolean status) {

	}
	
	public void takePhoto(int photoSize, String format) {
		System.out.println(photoSize+" "+format);

	}
	
	public int sendMessage()
	{int number=6;
		return number;
	}
	
	public String takeVideo() {
		return "video1";
	}
public static void main(String[] args) {
	LearnMethod mobileOption=new LearnMethod();
	
	mobileOption.makeCall(10, "calling", true);
	mobileOption.takePhoto(7, "png");
	
	int value = mobileOption.sendMessage(); // assigning to local variable ctrl+2
	System.out.println(value);
	
	//String takeVideo = mobileOption.takeVideo();
	System.out.println(mobileOption.takeVideo()+" "+100);
	
	
}
}
