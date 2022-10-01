package sub1;
/*
 *  인터페이스를 이용한 다형성
 *  
 *  인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만가능
 */
interface Fightable {
	void move(int x, int y);
	void attack (Fightable f);
} 

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	
	public void attack(Fightable f) {}
}

	Unit u = new Fighter(); // 생성가능
	Fightable f = new Fighter(); // 생성가능
	
	//인터페이스 타입 매개변수는 인터페이스를 구현한 클래스의객체만 가능
	f.move(100, 200);
	f.attack(new Fighter());
	
public class ch7_38 {

}

