import java.util.Scanner;

public class CutDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String star = "*";
		String dash = "-";
		System.out.println("다이아몬드의 세로 길이의 반을 입력해주세요");
		int num = sc.nextInt();
		for (int i=0; i<num; i++) {
			for (int j=(-num+i); j<num; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=(i*2); j++) {
				System.out.print(star);
			}
			System.out.println();
			if (i==(num-1)) {
				for (int j=0; j<(num-i); j++) {
					System.out.print(" ");
				}
				for (int j=-2; j<=(i*4); j++) {
					System.out.print(dash);
				}
			}
		}
		System.out.println();
		
		for (int i=1; i<=num; i++) {
			for (int j=num+i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j=num; j>=(-num)+(2*i); j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
	