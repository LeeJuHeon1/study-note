package testPackage;

	import java.util.Scanner;
	public class testJava {
		public static void main(String[] args) {
			int[] num = new int[5]; // 배열 생성
			int max, min;
			Scanner sc = new Scanner(System.in);
			System.out.println("5개의 정수를 입력하시오.");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt(); // 데이터 입력 및 배열에 저장
			}
			max = num[0]; // 최대값 초기 설정
			min = num[0]; // 최소값 초기 설정
			for (int i = 0; i < num.length; i++) {
				if (max < num[i]) { // 최대값 비교
					max = num[i]; // 최대값 할당
				}
				if (min > num[i]) { // 최소값 비교
					min = num[i]; // 최대값 할당
				}
			}
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
			System.out.println("확인");
		}
}