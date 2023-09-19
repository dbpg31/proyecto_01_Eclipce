package condicionales;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.awt.event.ActionEvent;

public class _05 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtNuevoNumero ;
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
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblNuevoNumero = new JLabel("Nuevo Número :");
		lblNuevoNumero.setBounds(50, 90, 120, 30);
		getContentPane().add(lblNuevoNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(150, 50, 80, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtNuevoNumero = new JTextField();
		txtNuevoNumero.setBounds(150, 90, 80, 30);
		txtNuevoNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNuevoNumero.setFocusable(false);
		txtNuevoNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNuevoNumero);
		
		
		
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
		
		int menor = 0;
		
		if ((cifra4 < cifra1) && (cifra4 < cifra2) && (cifra4 < cifra3)) menor = cifra4;
		else if ((cifra3 < cifra1) && (cifra3 < cifra2) && (cifra3 < cifra4)) menor = cifra3;
		else if ((cifra2 < cifra1) && (cifra2 < cifra3) && (cifra2 < cifra3)) menor = cifra2;
		else if ((cifra1 < cifra2) && (cifra1 < cifra3) && (cifra1 < cifra4)) menor = cifra1;
		
		int mayor = 0;
		
		if ((cifra4 > cifra1) && (cifra4 > cifra2) && (cifra4 > cifra3)) mayor = cifra4;
		else if ((cifra3 > cifra1) && (cifra3 > cifra2) && (cifra3 > cifra4)) mayor = cifra3;
		else if ((cifra2 > cifra1) && (cifra2 > cifra3) && (cifra2 > cifra3)) mayor = cifra2;
		else if ((cifra1 > cifra2) && (cifra1 > cifra3) && (cifra1 > cifra4)) mayor = cifra1;
		
		String nuevonumero = Integer.toString(mayor) + Integer.toString(menor) ;
		
		txtNuevoNumero.setText(nuevonumero);
		
	}

}
