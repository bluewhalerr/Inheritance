package inherit;

import java.time.Year;

public class B extends D {
	
	public void year() {
		String year = "This year is 2023";
		System.out.println(year);
	}
	public static void main(String[] args) {
		B b = new B();
		b.year();
		b.date();
		
	}
}
;