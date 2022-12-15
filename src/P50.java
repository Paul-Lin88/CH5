public class P50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car6 car1 = new Car6("一號車");
		Thread th1 = new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的工作");
		}
	}
}
class Car6 implements Runnable{
	private String name;
	public Car6(String nm){
		name = nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理");
		}
	}
	
}
