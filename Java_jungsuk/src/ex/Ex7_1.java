package ex;

class Tv {
	boolean power; // 전원 인스턴스
	int channel; // 채널 인스턴스
	
	void power(){
		power = !power; // 파워 기능
	}
	void channelUp() {
		++channel; // 채널 업 기능
	}
	void channelDown() {
		--channel;
	}
	// 채널 당누기능
}

class SmartTv extends Tv {
	boolean smart; // 캡션상태(ON/OFF)
	
	void displaysmart(String text){
		if(smart) {
			System.out.println(text);// 캡션이 참이면 text 출력할수 있도록한다.
		}
	}
	
}
public class Ex7_1 {
	public static void main(String[] args) {
		 SmartTv smart = new SmartTv();// 객체 생성
		 smart.channel = 42; // 채널 값
		 smart.channelUp();// 채널 기능사용
		 System.out.println(smart.channel);// 현재 채널 출력
		 smart.displaysmart("Hello, Smart");// 캡션 참일시 출력할 문장
		 smart.smart = true;// 캡션 참
		 smart.displaysmart("Hello, Smart");
		
		
	}
}
