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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista3Impl frame = new Vista3Impl();
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
	public Vista3Impl() {
		getContentPane().setLayout(null);
		
		JLabel lblwellcome = new JLabel("\"WELCOME\"");
		lblwellcome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblwellcome.setBounds(77, 92, 267, 50);
		getContentPane().add(lblwellcome);
	}
}
