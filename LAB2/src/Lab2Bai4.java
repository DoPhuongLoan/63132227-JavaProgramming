/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			Menu();
			System.out.print("Chọn chức năng: ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				giaiPTB1();
				break;
			case 2:
				giaiPTB2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				System.out.println("Kết thúc chương trình");
			default:
				System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
			}
		}while (choice != 4);
	}
	public static void Menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

}
