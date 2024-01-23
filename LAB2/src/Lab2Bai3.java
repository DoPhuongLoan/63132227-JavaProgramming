/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float sodien, tien;
		System.out.print("Nhập số điện sử dụng của tháng: ");
		sodien = scanner.nextFloat();
		if(sodien <= 50) {
			tien = sodien * 1000;
		}else {
			tien = 50 * 1000 + (sodien - 50) * 1200;
		}
		System.out.printf("Tiền điện: %,.0fđ", tien);
	}

}
