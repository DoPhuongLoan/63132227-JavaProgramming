/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class KiemTraSo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số: ");
		double so = scanner.nextDouble();
		if (so > 0) {
			double canso = Math.sqrt(so);
			System.out.println("Căn bậc 2 của " + so + " : " + canso);
		}else {
			System.out.println("Số nhập vào không phải là số dương");
		}
	}

}
