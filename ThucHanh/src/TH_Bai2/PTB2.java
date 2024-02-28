package TH_Bai2;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTB2 {

    private JFrame ptb2;
    private JTextField tA;
    private JTextField tB;
    private JTextField tC;
    private JTextField tkq;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PTB2 window = new PTB2();
                    window.ptb2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public PTB2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	ptb2 = new JFrame();
    	ptb2.setTitle("PHƯƠNG TRÌNH BẬC 2");
    	ptb2.getContentPane().setForeground(new Color(255, 0, 0));
    	ptb2.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
    	ptb2.setBounds(100, 100, 810, 393);
    	ptb2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ptb2.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(20, 36, 756, 304);
        ptb2.getContentPane().add(panel);
        panel.setBorder(null); 
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Nhập a:");
        lblNewLabel_1.setBackground(new Color(0, 128, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(117, 28, 99, 25);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Nhập b:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(117, 81, 99, 25);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Nhập c:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_2.setBounds(117, 135, 99, 25);
        panel.add(lblNewLabel_1_2);
        
        tA = new JTextField();
        tA.setBounds(351, 29, 337, 31);
        panel.add(tA);
        tA.setColumns(10);
        
        tB = new JTextField();
        tB.setColumns(10);
        tB.setBounds(351, 82, 337, 31);
        panel.add(tB);
        
        tC = new JTextField();
        tC.setColumns(10);
        tC.setBounds(351, 129, 337, 31);
        panel.add(tC);
        
        JLabel lblNewLabel_2 = new JLabel("Kết quả");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(117, 191, 99, 25);
        panel.add(lblNewLabel_2);
        
        tkq = new JTextField();
        tkq.setForeground(new Color(0, 0, 0));
        tkq.setBounds(351, 191, 337, 30);
        tkq.setBorder(new LineBorder(new Color(176, 224, 230)));
        panel.add(tkq);
        tkq.setColumns(10);
        
        JButton btnGii = new JButton("Giải ");
        btnGii.setBounds(300, 243, 116, 37);
        panel.add(btnGii);
        btnGii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XuLyGiaiPTB2();
            }
        });
        btnGii.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }

    void XuLyGiaiPTB2() {
        double a = Double.parseDouble(tA.getText());
        double b = Double.parseDouble(tB.getText());
        double c = Double.parseDouble(tC.getText());
        double delta = b * b - (4 * a * c);
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            tkq.setText("x1 : " + x1 + " x2 : " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            tkq.setText("x = " + x);
        } else {
            tkq.setText("Phương trình không có nghiệm");
        }
    }
}