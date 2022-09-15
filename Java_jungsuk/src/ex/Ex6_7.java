package ex;

public class Ex6_7 {
	public static void main(String[] args) {
		firstmethod();
	}
	
	static void firstmethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
	
}
