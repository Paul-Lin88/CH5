package pa;

public class Car2 {
	private int num;
	private double gas;
	public Car2() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("獎車號設為"+num+"汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
