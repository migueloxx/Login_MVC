package ventanas_login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vista2Impl extends JFrame implements Vista2{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private Vista1Impl miVista1;
	private Vista3Impl miVista3;


	/**
	 * @param miVista3 el miVista3 a establecer
	 */
	public void setMiVista3(Vista3Impl miVista3) {
		this.miVista3 = miVista3;
	}

	
	public void setMiVista1(Vista1Impl miVista1) {
		this.miVista1 = miVista1;
	}



	/**
	 * Create the frame.
	 */
	public Vista2Impl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(33, 21, 84, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(33, 56, 84, 31);
		contentPane.add(lblUsuario);
		
		JLabel lblCorreo = new JLabel("CORREO");
		lblCorreo.setBounds(33, 93, 84, 31);
		contentPane.add(lblCorreo);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(33, 130, 84, 31);
		contentPane.add(lblContrasea);
		
		JLabel lblRepetir = new JLabel("REPETIR");
		lblRepetir.setBounds(33, 167, 84, 31);
		contentPane.add(lblRepetir);
		
		textField = new JTextField();
		textField.setBounds(113, 26, 286, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 61, 286, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 98, 286, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAlta = new JButton("REGISTRAR");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pwd = new String(passwordField.getPassword());
				if (pwd.equals(textField_1.getText()) && (pwd.length()>=1)) {

					setVisible(false);
					miVista3.setVisible(true);
					System.out.println("Ahora se abriria la ventana 3");
				
				}	
			}
		});
		btnAlta.setBounds(310, 203, 89, 23);
		contentPane.add(btnAlta);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 135, 286, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(113, 172, 286, 20);
		contentPane.add(passwordField_1);
		
		JButton btnVolver = new JButton("CANCELAR");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				miVista1.setVisible(true);
			}
		});
		btnVolver.setBounds(310, 229, 89, 23);
		contentPane.add(btnVolver);
	}




}
