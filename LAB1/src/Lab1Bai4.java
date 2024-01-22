/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a, b, c, delta;
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		delta =(b * b) - (4 * a * c);
		if (delta >= 0) {
			System.out.printf("Căn delta: %.1f", Math.sqrt(delta));
		}
		else {
			System.out.printf("Delta số âm, không có căn delta");
		}
	}

}
