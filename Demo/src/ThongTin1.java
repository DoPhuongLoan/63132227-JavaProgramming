/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class ThongTin1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String hoten;
		int tuoi;
		System.out.print("Nhập họ tên: ");
		hoten = scanner.nextLine();
		System.out.print("Nhập tuổi: ");
		tuoi = scanner.nextInt();
		System.out.println(hoten + " năm nay " + tuoi + " tuổi");
	}

}
