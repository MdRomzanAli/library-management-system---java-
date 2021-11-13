

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;



import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
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
	public WelcomeWindow() {
		setTitle("Welcome Window");
		setResizable(false);
		setBackground(new Color(102, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 102));
		panel.setBorder(new LineBorder(new Color(51, 255, 51), 2, true));
		panel.setBounds(10, 11, 507, 283);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 102));
		panel_1.setBorder(new LineBorder(new Color(255, 51, 0), 2, true));
		panel_1.setBounds(10, 11, 487, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNsuBookShop = new JLabel("NSU BOOK SHOP");
		lblNsuBookShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblNsuBookShop.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNsuBookShop.setBounds(112, 11, 270, 30);
		panel_1.add(lblNsuBookShop);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBorder(new LineBorder(new Color(102, 51, 51), 2, true));
		panel_2.setBounds(10, 73, 487, 199);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdminLoginWindow adminLogin = new AdminLoginWindow();
				adminLogin.setVisible(true);
			}
		});
		btnAdminLogin.setForeground(new Color(102, 0, 153));
		btnAdminLogin.setBackground(UIManager.getColor("Button.background"));
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAdminLogin.setBounds(129, 48, 216, 35);
		panel_2.add(btnAdminLogin);
		
		JButton btnCashierLogin = new JButton("CASHIER LOGIN");
		btnCashierLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCashierLogin.setForeground(new Color(102, 0, 153));
		btnCashierLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCashierLogin.setBackground(UIManager.getColor("Button.background"));
		btnCashierLogin.setBounds(129, 107, 216, 35);
		panel_2.add(btnCashierLogin);
	}
}
