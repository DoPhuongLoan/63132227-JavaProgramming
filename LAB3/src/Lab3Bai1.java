/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab3Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Nhập số nguyên dương: ");
		n = scanner.nextInt();
		boolean check = true;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				check = false;
				break;
			}
		}
	}

}
