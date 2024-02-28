package pl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setTitle("Đăng nhập");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 446, 247);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(110, 30, 150, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(110, 70, 150, 20);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Tên đăng nhập:");
        lblUsername.setBounds(20, 30, 80, 20);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Mật khẩu:");
        lblPassword.setBounds(20, 70, 80, 20);
        contentPane.add(lblPassword);

        JButton btnLogin = new JButton("Đăng nhập");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("63CNTT") && password.equals("123")) {
                    // Nếu tên đăng nhập và mật khẩu đúng, hiện thông báo đăng nhập thành công
                    JOptionPane.showMessageDialog(contentPane, "Đăng nhập thành công!");
                    // Thêm mã để hiện Form Màn Hình Chính ở đây
                } else {
                    // Nếu tên đăng nhập hoặc mật khẩu không đúng, hiện thông báo lỗi
                    JOptionPane.showMessageDialog(contentPane, "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.");
                }
            }
        });
        btnLogin.setBounds(110, 110, 150, 30);
        contentPane.add(btnLogin);
    }
}