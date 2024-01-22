/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.print("Điểm Trung Bình: ");
		double diemtb = scanner.nextDouble();
		
		System.out.printf("%s: %.1f điểm",hoten,diemtb);
	}

}
