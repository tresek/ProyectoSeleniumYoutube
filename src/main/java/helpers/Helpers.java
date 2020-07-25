package helpers;

public class Helpers {
	
	public void contador(int seconds){
		try {
			Thread.sleep(seconds *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
