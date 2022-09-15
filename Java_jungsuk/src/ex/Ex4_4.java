package ex;

import java.util.Scanner;

public class Ex4_4 {
	public static void main(String[] args) {
		
		 int score = 0;// 점수를 저장하기위한 변수
		 char grade = ' ';// 학점을 저장하기 위한 변수
		
		System.out.println("점수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); // 화면을 통해 입력 받은 수 score에 저장
		
		if(score >= 90){
			grade = 'A';// score가 90점 보다 크거나 같으면 A
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+ grade + "입니다.");
		// 당신의 학점은 출력
	}
}
