package usingRunable;

public class UsingRunableInterface {
	
	public static void main(String[] args) {
		
		Car obj1= new Car();
		Bike obj2=new Bike();
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t1.start();
		t2.start();
		
		
	}

}






class Car implements Runnable{
	
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

class Bike implements Runnable {
	
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