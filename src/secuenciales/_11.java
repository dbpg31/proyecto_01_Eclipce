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

public class _11 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero1, txtNumero2, txtNuevoNumero1, txtNuevoNumero2 ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_11 frame = new _11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero1 = new JLabel("1er Número de 3 cifras :");
		lblNumero1.setBounds(30, 50, 150, 30);
		getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("2do Número de 3 cifras :");
		lblNumero2.setBounds(30, 90, 150, 30);
		getContentPane().add(lblNumero2);
		
		JLabel lblNuevoNumero1 = new JLabel("Nuevo Número 1 : ");
		lblNuevoNumero1.setBounds(30, 130, 130, 30);
		getContentPane().add(lblNuevoNumero1);
		
		JLabel lblNuevoNumero2 = new JLabel("Nuevo Número 2 : ");
		lblNuevoNumero2.setBounds(30, 170, 130, 30);
		getContentPane().add(lblNuevoNumero2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(180, 50, 60, 30);
		
		txtNumero1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero1);

		txtNumero2 = new JTextField();
		txtNumero2.setBounds(180, 90, 60, 30);
		
		txtNumero2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero2);

		txtNuevoNumero1 = new JTextField();
		txtNuevoNumero1.setBounds(180, 130, 60, 30);
		txtNuevoNumero1.setFocusable(false);
		txtNuevoNumero1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNuevoNumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNuevoNumero1);
						
		txtNuevoNumero2 = new JTextField();
		txtNuevoNumero2.setBounds(180, 170, 60, 30);
		txtNuevoNumero2.setFocusable(false);
		txtNuevoNumero2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNuevoNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNuevoNumero2);
						
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
		
		int numero1 = Integer.parseInt( txtNumero1.getText() );
		int numero2 = Integer.parseInt( txtNumero2.getText() );
		int cifra3n1 = numero1 % 10 ;
		int cifra2n1 = ((numero1 % 100) / 10) ; 
		int cifra1n1 =((numero1 - (numero1 % 100)) / 100) ;
		int cifra3n2 = numero2 % 10 ;
		int cifra2n2 = ((numero2 % 100) / 10) ; 
		int cifra1n2 =((numero2 - (numero2 % 100)) / 100) ;
		
		
		String NuevoNumero1 = Integer.toString(cifra3n1) + Integer.toString(cifra2n1) + Integer.toString(cifra1n1) ;
		String NuevoNumero2 = Integer.toString(cifra3n2) + Integer.toString(cifra2n2) + Integer.toString(cifra1n2) ;
		txtNuevoNumero1.setText(NuevoNumero1);
		txtNuevoNumero2.setText(NuevoNumero2);
		
	}

}
