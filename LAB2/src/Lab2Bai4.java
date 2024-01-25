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
				giaiPTB1(scanner);
				break;
			case 2:
				giaiPTB2(scanner);
				break;
			case 3:
				tinhTienDien(scanner);
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
	public static void giaiPTB1(Scanner scanner) {
		double a, b;
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô số nghiệm");
			}else {
				System.out.print("Phương trình vô nghiệm");
			}
		}else {
			float x = (float) (-b / a);
			System.out.printf("Nghiệm của phương trình: %.2f", x);
		}
	}
	public static void giaiPTB2(Scanner scanner) {
		double a, b, c;
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		
		double delta = (b * b) - (4 * a * c);
		double t, x, x1, x2;
		t = -c/b;
		x = -b/(2 * a);
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if(a==0){
			if(b==0){
				if(c==0){
					System.out.print("Phương trình vô số nghiệm");
				}
				else{
					System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				System.out.printf("Phương trình có nghiệm duy nhất: %f",t);
			}
		}
		else {
			if(delta <0 ) {
				System.out.print("Phương trình vô nghiệm");
			}
			if(delta == 0) {
				System.out.printf("Phương trình có nghiệm kép: %f", x);
			}
			if(delta > 0) {
				System.out.printf("Phương trình có nghiệm x1 = %.1f và x2 = %.1f",x1,x2);
			}
		}
	}
	public static void tinhTienDien(Scanner scanner) {
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
