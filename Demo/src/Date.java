/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Date {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tháng: ");
		int thang = scanner.nextInt();
		if (thang < 1 || thang > 12) {
			System.out.println("Tháng không hợp lệ");
		}
		System.out.print("Nhập năm: ");
		int nam = scanner.nextInt();
		if (nam <= 0) {
			System.out.println("Năm không hợp lệ");
		}
		int soNgay = 0;
		switch (thang) {
			case 1, 3, 5, 7, 8, 10, 12:
				soNgay = 31;
				break;
			case 4, 6, 9, 11:
				soNgay = 30;
				break;
			case 2:
				if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
					soNgay = 29;
				}else {
					soNgay = 28;
				}
				break;
		 }
		System.out.printf("Tháng %d năm %d có %d ngày %n", thang, nam, soNgay);
	}

}
