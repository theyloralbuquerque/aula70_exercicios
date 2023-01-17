package entities;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double noteFinal() {
		return n1 + n2 + n3;
	}

	public double missingPoints() {
		if (noteFinal() < 60.0) {
			return 60.0 - noteFinal();
		} else {
			return 0.0;
		}
	}

	
}
