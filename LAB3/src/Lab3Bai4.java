/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab3Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Số lượng sinh viên: ");
		int n = scanner.nextInt();
		String[] hoten = new String[n];
		double[] diem = new double[n];
		String[] hocluc = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
			scanner.nextLine();
			System.out.print("Họ tên sinh viên: ");
			hoten[i] = scanner.nextLine();
			System.out.print("Điểm sinh viên: ");
			diem[i] = scanner.nextDouble();
			if (diem[i] < 5) {
				hocluc[i] = "Yếu";
			}else if (diem[i] < 6.5) {
				hocluc[i] = "Trung bình";
			}else if (diem[i] < 7.5) {
				hocluc[i] = "Khá";
			}else if (diem[i] < 9) {
				hocluc[i] = "Giỏi";
			}else {
				hocluc[i] = "Xuất sắc";
			}
		}
		
		 System.out.println("\nDanh sách sinh viên:");
		 for (int i = 0; i < n; i++) {
			 System.out.printf("Họ và tên: %s%n", hoten[i]);
			 System.out.printf("Điểm: %.2f%n", diem[i]);
			 System.out.printf("Học lực: %s%n", hocluc[i]);
			 System.out.println("+---------------------------------------------------+");
		 }
		 for (int i = 0; i < n - 1; i++) {
			 for (int j = 0; j < n - i - 1; j++) {
				 if (diem[j] > diem[j + 1]) {
					 String temphoten = hoten[j];
					 hoten[j] = hoten[j + 1];
					 hoten[j + 1] = temphoten;
					 double tempdiem = diem[j];
					 diem[j] = diem[j + 1];
					 diem[j + 1] = tempdiem;
					 String temphocluc = hocluc[j];
					 hocluc[j] = hocluc[j + 1];
					 hocluc[j + 1] = temphocluc;
				 }
			 }
		 }
		 System.out.println("\nDanh sách sinh viên sau khi sắp xếp điểm tăng dần:");
		 for (int i = 0; i < n; i++) {
			 System.out.printf("Họ và tên: %s%n", hoten[i]);
			 System.out.printf("Điểm: %.2f%n", diem[i]);
			 System.out.printf("Học lực: %s%n", hocluc[i]);
			 System.out.println("+---------------------------------------------------+");
		 }
	}
	

}
