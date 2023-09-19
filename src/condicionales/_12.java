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

public class _12 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtDia ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_12 frame = new _12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblDia = new JLabel("Dia de la semana :");
		lblDia.setBounds(50, 90, 120, 30);
		getContentPane().add(lblDia);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 50, 80, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtDia = new JTextField();
		txtDia.setBounds(160, 90, 80, 30);
		txtDia.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDia.setFocusable(false);
		txtDia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDia);
		
		
		
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
		
		if (numero == 1) txtDia.setText("Lunes");
		else if (numero == 2) txtDia.setText("Martes");
		else if (numero == 3) txtDia.setText("Miercoles");
		else if (numero == 4) txtDia.setText("Jueves");
		else if (numero == 5) txtDia.setText("Viernes");
		else if (numero == 6) txtDia.setText("Sabado");
		else if (numero == 7) txtDia.setText("Domingo");
		
		
	}

}
