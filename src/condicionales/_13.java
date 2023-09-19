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

public class _13 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtTipo ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_13 frame = new _13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblDia = new JLabel("Es consecutivo :");
		lblDia.setBounds(50, 90, 120, 30);
		getContentPane().add(lblDia);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 50, 100, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtTipo = new JTextField();
		txtTipo.setBounds(160, 90, 100, 30);
		txtTipo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTipo.setFocusable(false);
		txtTipo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTipo);
		
		
		
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
		
		int cifra3 = numero % 10 ;
		int cifra2 = ((numero % 100) / 10) ; 
		int cifra1 = ((numero % 1000) / 100);
		
		if ((cifra3 == cifra2 - 1 && cifra2 == cifra1 - 1)) txtTipo.setText("Descendente");
		else if ((cifra3 == cifra2 + 1 && cifra2 == cifra1 + 1)) txtTipo.setText("Ascendente");
		else txtTipo.setText("no consecutivo");
		
		
		
	}

}
