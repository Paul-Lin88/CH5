public class P32 {
	public static void main(String[] args)throws CarException1 {
		Car10 car1 = new Car10();
		car1.setCar(1233, -10);
		car1.show();
	}
}
class CarException1 extends Exception{
}
class Car10{
	private int num;
	private double gas;
	public Car10() {
		num = 0;
		gas = 0;
		System.out.println("已生產了車子");
	}
	public void setCar(int n, double g)throws CarException1{
		if(g<0) {
			CarException1 e = new CarException1();
			throw e;
		} else {
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}