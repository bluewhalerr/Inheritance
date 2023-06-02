package inherit;

public class C extends D {
	
	
	public void day() {
		String day = "Today is Thursday";
		System.out.println(day);
	}
	public static void main(String[] args) {
		C c  = new C();
		c.day();
		c.date();
		
	}

}
