/**

 * 
 */

/**
 * 
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		JFrame f = new JFrame();//tạo một thể hiện(đối tượng) của lớp
		f.setTitle("V i du JFram");//tiêu đề cửa sổ 
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200);//kích thước cửa sổ
		//quy định loại bố cục
		 f.setLayout(new FlowLayout());
		//tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi");
		//tạo tai nghe
		BoLangNgheOK ngheok = new BoLangNgheOK();
		btnOK.addActionListener(null);
		JButton btnko = new JButton("Nhấn 5");

		//gắn lên form
		f.add(btnOK);
		f.add(btnko);

		f.show();//hiển thị cửa sổ
	}
	class BoLangNgheOk implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//mã xử lý thực thi user khi click chuột ở đây
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo");
			dialog.show();
		}
		
	}
}

