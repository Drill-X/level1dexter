package level1;

public class Calculator2 {
	static String greeting = "potato";
	double answer;

	public Calculator2(double answer) {
		this.answer = answer;
	}

	public static void main(String[] args) {
		System.out.println(greeting);
		System.out.println(add(20,10));
		System.out.println(sub(20,10));
		System.out.println(mul(20,10));
		System.out.println(div(20,10));
	}

	static double add(double in1, double in2) {
		double c;
		c = in1 + in2;
		return (c);
	}

	static double sub(double in1, double in2) {
		double c;
		c = in1 - in2;
		return (c);
	}

	static double mul(double in1, double in2) {
		double c;
		c = in1 * in2;
		return (c);
	}

	static double div(double in1, double in2) {
		double c;
		c = in1 / in2;
		return (c);
	}

	String getGreeting() {
		return greeting;
	}

	void setGreeting(String s) {
		greeting = s;
	}
}
