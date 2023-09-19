package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _10 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtNumeroReves;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_10 frame = new _10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número de 4 cifras :");
		lblNumero.setBounds(50, 50, 130, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblNumeroReves = new JLabel("Número al revés :");
		lblNumeroReves.setBounds(50, 90, 100, 30);
		getContentPane().add(lblNumeroReves);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(180, 50, 60, 30);
		
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtNumeroReves = new JTextField();
		txtNumeroReves.setBounds(180, 90, 60, 30);
		txtNumeroReves.setFocusable(false);
		txtNumeroReves.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumeroReves.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumeroReves);
						
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		
		int numero = Integer.parseInt( txtNumero.getText() );
		int cifra4 = numero % 10 ;
		int cifra3 = ((numero % 100) / 10) ; 
		int cifra2 = ((numero % 1000) / 100);
		int cifra1 =((numero - (numero % 1000)) / 1000) ;
		String numeroreves = Integer.toString(cifra4) + Integer.toString(cifra3) + Integer.toString(cifra2) + Integer.toString(cifra1) ; 
		
		txtNumeroReves.setText(numeroreves);
		
	}

}
