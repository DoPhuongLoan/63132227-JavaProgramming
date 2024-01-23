/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class KiemTraSo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số: ");
		double so = scanner.nextDouble();
		if(so > 0) {
			double luythua = Math.sqrt(so);
			System.out.println("Căn bậc 2 " + so + " : " + luythua);
		}else {
			System.out.println("Số nhập vào không phải là số dương");
        }
	}

}
