/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class QLSV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<SVPoly> danhSachSinhVien = new ArrayList<>();
		int choice;
		do {
			Menu();
			System.out.print("Chọn chức năng: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1: 
			}
		}
	}
	
	
	
	public class SVPoly{ 
		public String hoTen; 
		public Double diemTB; 
		}
	
}
