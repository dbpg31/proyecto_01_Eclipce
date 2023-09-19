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

public class _11 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtTipo ;
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
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblTipo = new JLabel("Tipo Número :");
		lblTipo.setBounds(50, 90, 120, 30);
		getContentPane().add(lblTipo);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(150, 50, 80, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtTipo = new JTextField();
		txtTipo.setBounds(150, 90, 80, 30);
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
		
		if (numero > 0) txtTipo.setText("Positivo");
		else if (numero == 0) txtTipo.setText("Cero");
		else if (numero < 0) txtTipo.setText("Negativo");
		
		
	}

}
