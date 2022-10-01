package sub1;

abstract class ch7_32 {
	boolean pause;
	int currentPos;
	
	ch7_32() {
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos); // 몸통X
	
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}
