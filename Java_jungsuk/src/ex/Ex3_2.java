package ex;

public class Ex3_2 {
	public static void main(String[] args) {
		int i=5,  j=0;
		
		j = i++; // i를 증감시킨것을 j에 대입한다
		
		System.out.println("j=i++ 을 실행한 후, i="+i+", j="+ j);
		i = 5;
		j = 0;
		
		j = ++i; // 이미 증감시킨 i를 j에 대입한다
		System.out.println("j=++i; 실행 후, i="+ i +", j="+j);
		
		
	}
}
