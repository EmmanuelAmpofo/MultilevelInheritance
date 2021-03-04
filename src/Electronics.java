
public class Electronics {
	void deviceType() {
		System.out.println("Electronic Devices");
	}
}
class Television extends Electronics{
	
	 void category() {
		 
		 
		System.out.println("Samsung Television is a type of Electronic devices");
	}
}

class LED extends Television{
void displayTech() {
		System.out.println("Samsung Television uses LED technology to display its Content");
	}


	public static void main(String[] args) {
		Electronics e = new Television();
		e.deviceType();
		
		Television t = new Television();
		t.category();
			
		LED led = new LED();
		led.displayTech();

	}

}
