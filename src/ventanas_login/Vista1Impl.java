package ventanas_login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;
import java.awt.Font;

public class Vista1Impl extends JFrame implements Vista1 {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel contentPane; 
	private Vista2Impl miVista2;
	private Vista3Impl miVista3;
	

	/**
	 * @param miVista3
	 *            el miVista3 a establecer
	 */
	public void setMiVista3(Vista3Impl miVista3) {
		this.miVista3 = miVista3;
	}

	/**
	 * @param miVista2
	 *            el miVista2 a establecer
	 */
	public void setMiVista2(Vista2Impl miVista2) {
		this.miVista2 = miVista2;
	}

	public Vista1Impl() {
		setTitle("LOGIN");
//		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);

		JLabel nombre = new JLabel("NOMBRE");
		nombre.setBounds(33, 62, 84, 30);
		getContentPane().add(nombre);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(33, 122, 84, 30);
		getContentPane().add(lblPassword);

		textField = new JTextField();
		textField.setBounds(121, 58, 275, 30);
		getContentPane().add(textField);
		textField.setColumns(10);

		// BOTON REGISTRO*************************************
		JButton btnNewButton = new JButton("REGISTRO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				setVisible(false);
				miVista2.setVisible(true);
			}
		});
		btnNewButton.setBounds(307, 194, 89, 23);
		getContentPane().add(btnNewButton);

		// BOTON ENTRAR***************************************
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pwd = new String(passwordField.getPassword());
				if (pwd.equals(textField.getText()) && (pwd.length()>=1)) {

					setVisible(false);
					//miVista3.setVisible(true);
					System.out.println("Ahora se abriria la ventana 3");
				}

			}
		});
		btnEntrar.setBounds(307, 160, 89, 23);
		getContentPane().add(btnEntrar);

		passwordField = new JPasswordField();
		passwordField.setBounds(127, 119, 269, 30);
		getContentPane().add(passwordField);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0); 
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(307, 229, 89, 23);
		getContentPane().add(btnSalir);
	}
}
