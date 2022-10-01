package sub1;

interface PlayingCard {
	public static final int SPADE = 4;	//public static final DIAMOND = 3;
	final int DIAMOND = 3;				//public static final int HEART = 2; 
	static int HEART = 2;				//public static final int CLOVER = 1;
	int CLOVER = 1;						//상수도 항상
										//public static final이다.
	public abstract String getCardNumbeer();
	String getCardkind(); // public abstract String getCardKind();
}						  // interface는 항상 public과 abstract가 있기때문에 생략가능.


public class ch7_35 {

}
