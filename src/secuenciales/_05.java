package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _05 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes  ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_05 frame = new _05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblGigabytes = new JLabel("Gigabytes :");
		lblGigabytes.setBounds(50, 90, 80, 30);
		getContentPane().add(lblGigabytes);

		JLabel lblMegabytes = new JLabel("Megabytes :");
		lblMegabytes.setBounds(50, 130, 80, 30);
		getContentPane().add(lblMegabytes);

		JLabel lblKilobytes = new JLabel("Kilobytes :");
		lblKilobytes.setBounds(50, 170, 80, 30);
		getContentPane().add(lblKilobytes);

		JLabel lblBytes = new JLabel("Bytes :");
		lblBytes.setBounds(50, 210, 80, 30);
		getContentPane().add(lblBytes);
		
		txtGigabytes = new JTextField();
		txtGigabytes.setBounds(140, 90, 60, 30);
		//txtGigabytes.setFocusable(false);
		txtGigabytes.setHorizontalAlignment( SwingConstants.RIGHT);
		txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtGigabytes);

		txtMegabytes = new JTextField();
		txtMegabytes.setBounds(140, 130, 60, 30);
		txtMegabytes.setFocusable(false); 
		txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMegabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMegabytes);
		
		txtKilobytes = new JTextField();
		txtKilobytes.setBounds(140, 170, 60, 30);
		txtKilobytes.setFocusable(false);
		txtKilobytes.setHorizontalAlignment( SwingConstants.RIGHT);
		txtKilobytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtKilobytes);
	
		txtBytes = new JTextField();
		txtBytes.setBounds(140, 210, 60, 30);
		txtBytes.setFocusable(false);
		txtBytes.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBytes);

		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 250, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		
		int gigabytes = Integer.parseInt(txtGigabytes.getText() ); 
		double megabytes = gigabytes * 1024 ;
		double kilobytes = megabytes * 1024 ;
		double bytes = kilobytes * 1024 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMegabytes.setText(df.format(megabytes));
		txtKilobytes.setText(df.format(kilobytes));
		txtBytes.setText(df.format(bytes));
	}

}
