/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class ThueTN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập lương: ");
		double luong = scanner.nextDouble();
		System.out.print("Nhập thưởng: ");
		double thuong = scanner.nextDouble();
		double tongTN = luong + thuong;
		double thueTN = 0;
		if(tongTN <= 9000000) {
			thueTN = 0;
		}else if(tongTN <= 15000000) {
			thueTN = tongTN * 0.1;
		}else if(tongTN <= 30000000) {
			thueTN = tongTN * 0.15;
		}else {
			thueTN = tongTN * 0.2;
		}
		
		System.out.printf("Tổng thu nhập: %.0f\n", tongTN);
		System.out.printf("Thuế thu nhập: %.0f", thueTN);
	}

}
