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

public class _07 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero1, txtNumero2, txtNumero3, txtMedio ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_07 frame = new _07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero1 = new JLabel("1ra Edad :");
		lblNumero1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("2da Edad :");
		lblNumero2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblNumero2);
		
		JLabel lblNumero3 = new JLabel("3ra Edad :");
		lblNumero3.setBounds(50, 130, 80, 30);
		getContentPane().add(lblNumero3);
		
		JLabel lblMedio = new JLabel("Numero Medio  :");
		lblMedio.setBounds(50, 170, 130, 30);
		getContentPane().add(lblMedio);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(150, 50, 60, 30);
		txtNumero1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero1);

		txtNumero2 = new JTextField();
		txtNumero2.setBounds(150, 90, 60, 30);
		txtNumero2.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtNumero2.setFocusable(false);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero2);
		
		txtNumero3 = new JTextField();
		txtNumero3.setBounds(150, 130, 60, 30);
		txtNumero3.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtNumero3.setFocusable(false);
		txtNumero3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero3);
		
		txtMedio = new JTextField();
		txtMedio.setBounds(150, 170, 60, 30);
		txtMedio.setFocusable(false);
		txtMedio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMedio);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 270, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}
	
	protected void btnCalcular_actionperfomed() {
		
		int numero1 = Integer.parseInt(txtNumero1.getText() );
		int numero2 = Integer.parseInt(txtNumero2.getText() );
		int numero3 = Integer.parseInt(txtNumero3.getText() );
		
		int medio = 0;
		
		if ((numero1 > numero2) && (numero1 < numero3)) medio = numero1; 
		else if ((numero1 < numero2) && (numero1 > numero3)) medio = numero1 ; 
		else if ((numero2 > numero1) && (numero2 < numero3)) medio = numero2 ;
		else if ((numero2 < numero1) && (numero2 > numero3)) medio = numero2 ;
		else if ((numero3 > numero2) && (numero3 < numero1)) medio = numero3 ;
		else if ((numero3 < numero2) && (numero3 > numero1)) medio = numero3 ;
		
		DecimalFormat df = new DecimalFormat("##");
		txtMedio.setText(df.format(medio));
		
	}

}
