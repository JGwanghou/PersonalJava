package ex;

import java.util.Scanner;

public class Ex4_2 {
	public static void main(String[] args) {
		int input; // input 변수 선언
		
	    System.out.println("숫자를 입력하세요.>"); // 숫자를 입력하세요 출력
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환
		
		if(input==0){
			System.out.println("입력하신 숫자는 0입니다."); // 입력값이 0 일때 입력하신 숫자는 0입니다 출력
	}
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.", input);
		}
		// 입력값이 0이 아닐떄 멘트출력, 입력한 숫자 출력
		
	}

}
