package sub1;

abstract class Unit2 {
	int x,y ;
	abstract void move(int x , int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {
	void move(int x, int y);	// public abstract생략
	void attack(Fightable f);	// public abstract생략
}

class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙: 조상보다(public) 접근제어자가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}	// public abstract생략
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	// 싸울수 있는 상대를 불러온다
	Fightable getFightable(){
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		 return f;
	}
}
public class FighterTest {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		Unit2 f = new Fighter(); // Unit2에는 attack()이 없어서 호출불가
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
		
		Fightable f = new Fighter();
		f.move(100, 200);
		
		Fighter f2 = new Fighter();
		f.attack(f2);
		
	}
}



