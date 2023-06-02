package inherit;

public class A extends D{
	public void month() {
		String month = "This is June";
				System.out.println(month);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.month();
		a.date();
	}

}
