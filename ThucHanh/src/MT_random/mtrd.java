package MT_random;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class mtrd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField so2;
	private JTextField kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mtrd frame = new mtrd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mtrd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 702);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số 1:");
		lblNewLabel.setBounds(51, 24, 68, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		so2 = new JTextField();
		so2.setBounds(129, 78, 241, 38);
		contentPane.add(so2);
		so2.setColumns(10);
		
		JLabel lblS = new JLabel("Số 2:");
		lblS.setBounds(41, 75, 68, 40);
		lblS.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblS);
		
		JTextField so1 = new JTextField();
		so1.setBounds(129, 26, 241, 38);
		so1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		so1.setColumns(10);
		contentPane.add(so1);
		
		JLabel lblKtQua = new JLabel("Kết Quả:");
		lblKtQua.setBounds(30, 126, 68, 40);
		lblKtQua.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblKtQua);
		
		kq = new JTextField();
		kq.setBounds(129, 129, 241, 38);
		kq.setEditable(false);
		kq.setEnabled(false);
		kq.setColumns(10);
		contentPane.add(kq);
		
		JButton btndl = new JButton("Tạo dữ liệu");
		btndl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random ngaunhien = new Random();
                int ngaunhienso1 = ngaunhien.nextInt(10)+1;
                int ngaunhienso2 = ngaunhien.nextInt(10)+1;
                so1.setText(String.valueOf(ngaunhienso1));
                so2.setText(String.valueOf(ngaunhienso2));
			}
		});
		btndl.setBounds(82, 185, 310, 40);
		btndl.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		contentPane.add(btndl);
		
		JButton btnCong = new JButton("");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sothunhat = so1.getText().toString();
		        String sothuhai = so2.getText().toString();
		        int s1 = Integer.parseInt(sothunhat);
		        int s2 = Integer.parseInt(sothuhai);
		        int tong = s1 + s2;
		        String chuoiKq = String.valueOf(tong);
		        kq.setText(chuoiKq);
			}
		});
		btnCong.setBounds(51, 251, 150, 150);
		btnCong.setForeground(new Color(255, 255, 255));
		btnCong.setBackground(new Color(255, 255, 255));
		btnCong.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\cong.jpg"));
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sothunhat = so1.getText().toString();
		        String sothuhai = so2.getText().toString();
		        int s1 = Integer.parseInt(sothunhat);
		        int s2 = Integer.parseInt(sothuhai);
		        int tru = s1 - s2;
		        String chuoiKq = String.valueOf(tru);
		        kq.setText(chuoiKq);
			}
		});
		
		btnTru.setBackground(new Color(255, 255, 255));
		btnTru.setForeground(new Color(255, 255, 255));
		btnTru.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\tru.jpg"));
		btnTru.setBounds(271, 251, 150, 150);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sothunhat = so1.getText().toString();
		        String sothuhai = so2.getText().toString();
		        int s1 = Integer.parseInt(sothunhat);
		        int s2 = Integer.parseInt(sothuhai);
		        int nhan = s1 * s2;
		        String chuoiKq = String.valueOf(nhan);
		        kq.setText(chuoiKq);
			}
		});
		btnNhan.setBackground(new Color(255, 255, 255));
		btnNhan.setForeground(new Color(255, 255, 255));
		btnNhan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\nhan.jpg"));
		btnNhan.setBounds(51, 466, 150, 150);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sothunhat = so1.getText().toString();
		        String sothuhai = so2.getText().toString();
		        int s1 = Integer.parseInt(sothunhat);
		        int s2 = Integer.parseInt(sothuhai);
		        float chia = (float) s1 / s2;
		        String chuoiKq = String.valueOf(chia);
		        kq.setText(chuoiKq);
			}
		});
		btnChia.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\chia.jpg"));
		btnChia.setBounds(271, 466, 150, 150);
		contentPane.add(btnChia);
	}
}
