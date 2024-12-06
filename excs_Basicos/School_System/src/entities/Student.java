package entities;

public class Student {

	public String name;
	public double firs_period;
	public double second_period;
	public double third_period;

	public double finalGrade() {
		return firs_period + second_period + third_period;
	}

	public String aprroved() {
		if (finalGrade() >= 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	public double missingPoints () {
		if (finalGrade() < 60) {
			return 60 - finalGrade(); 
		}
		else {
			return 0;
		}
	}

}