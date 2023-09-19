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

public class _09 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtSuma;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_09 frame = new _09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número de 4 cifras :");
		lblNumero.setBounds(50, 50, 130, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblSuma = new JLabel("Suma de cifras :");
		lblSuma.setBounds(50, 90, 100, 30);
		getContentPane().add(lblSuma);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(180, 50, 60, 30);
		
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtSuma = new JTextField();
		txtSuma.setBounds(180, 90, 60, 30);
		txtSuma.setFocusable(false);
		txtSuma.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSuma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSuma);
						
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
		double cifra4 = numero % 10 ;
		double cifra3 = ((numero % 100) / 10) ; 
		double cifra2 = ((numero % 1000) / 100);
		double cifra1 =((numero - (numero % 1000)) / 1000) ;
		double suma = cifra1 + cifra2 + cifra3 + cifra4 ; 
		
		DecimalFormat df = new DecimalFormat("");
		txtSuma.setText(df.format(suma));
		
	}

}
