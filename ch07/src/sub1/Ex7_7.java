package sub1;
/*
 * 서로 조상,자손 관계이기 떄문에 형변환은 가능하다.
 * 하지만 실제 인스턴스가 중요하다.
 * 현재 실제 인스턴스는 Car 이기 때문에 쓸 수 있는 기능은 4개이다
 * 형변환으로 FireEngine이 추가되면 기능은 5개가 된다.
 * 그러므로 형변환을 하면 안된다.
 */
public class Ex7_7 {
	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c; // 형변환에러
		fe.water(); // 컴파일은 ok...
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}
