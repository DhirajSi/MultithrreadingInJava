class Car extends Thread {
	
	public  void run() {
		
		showBrand();
	}
	
	public void showBrand() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("I am BMW");
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}

class Bike extends Thread {
	
	public  void run() {
		
		showBrand();
	}
	
	public void showBrand() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("I am Suzuki spors bike");
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class usingthread {
	
	public static void main(String[] args) {
		Car car= new Car();
		Bike bike = new Bike();
		car.start();
		bike.start();
		
	}

}


