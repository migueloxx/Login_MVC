package ventanas_login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import java.awt.Font;


public class Vista3Impl extends JFrame implements Vista3{

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Vista3Impl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwellcome = new JLabel("\"WELCOME\"");
		lblwellcome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblwellcome.setBounds(77, 92, 267, 50);
		getContentPane().add(lblwellcome);
	}
}
