package TH_Bai0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tA;
	private JTextField tB;
	private JTextField tkq;
	public ManHinhTT() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("Chương Trình Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(47, 42, 98, 74);
		contentPane.add(lblNewLabel);
		
		tA = new JTextField();
		tA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tA.setBounds(183, 42, 421, 40);
		contentPane.add(tA);
		tA.setColumns(10);
		
		JLabel lblSB = new JLabel("Số b:");
		lblSB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSB.setBounds(47, 130, 98, 74);
		contentPane.add(lblSB);
		
		tB = new JTextField();
		tB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tB.setColumns(10);
		tB.setBounds(183, 148, 421, 40);
		contentPane.add(tB);
		
		JButton btncong = new JButton("+");
		btncong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XLCong();
			}
		});
		btncong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btncong.setBounds(134, 234, 98, 49);
		contentPane.add(btncong);
		
		JButton btntru = new JButton("-");
		btntru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XLTru();
			}
		});
		btntru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btntru.setBounds(261, 234, 98, 49);
		contentPane.add(btntru);
		
		JButton btnnhan = new JButton("*");
		btnnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XLNhan();
			}
		});
		btnnhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnnhan.setBounds(392, 234, 98, 49);
		contentPane.add(btnnhan);
		
		JButton btnchia = new JButton("/");
		btnchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XLChia();
			}
		});
		btnchia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnchia.setBounds(516, 234, 98, 49);
		contentPane.add(btnchia);
		
		JLabel lblKtQua = new JLabel("Kết Quả:");
		lblKtQua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKtQua.setBounds(47, 302, 126, 74);
		contentPane.add(lblKtQua);
		
		tkq = new JTextField();
		tkq.setEnabled(false);
		tkq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tkq.setColumns(10);
		tkq.setBounds(183, 321, 421, 40);
		contentPane.add(tkq);
	}
	void XLCong() {
		String str_soA = tA.getText();
		String str_soB = tB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA + soB;
		tkq.setText(String.valueOf(tong));
	}
	void XLTru() {
		String str_soA = tA.getText();
		String str_soB = tB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tru = soA - soB;
		tkq.setText(String.valueOf(tru));
		
	}
	void XLNhan() {
		String str_soA = tA.getText();
		String str_soB = tB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double nhan = soA * soB;
		tkq.setText(String.valueOf(nhan));
	}
	void XLChia() {
		String str_soA = tA.getText();
		String str_soB = tB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double chia = soA / soB;
		tkq.setText(String.valueOf(chia));
}
}
