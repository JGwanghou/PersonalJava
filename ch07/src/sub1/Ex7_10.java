// 인터페이스 : 추상 메서드 집합
// 추상클래스 : 일반 클래스에서 추상 메서드를 가지고 있는 클래스
abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit {
	void move(int x, int y) {}
	void stimPack() {}
}

class Tank extends Unit{
	void move(int x, int y) {}
	void changemode() {}
}

class Dropship extends Unit {
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}