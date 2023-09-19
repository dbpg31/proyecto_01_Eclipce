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

public class _14 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero1, txtNumero2, txtNumero3, txtNumero4, txtNumero5, txtPromedio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_14 frame = new _14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero1 = new JLabel("1er número :");
		lblNumero1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("2do número :");
		lblNumero2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblNumero2);

		JLabel lblNumero3 = new JLabel("3er número :");
		lblNumero3.setBounds(50, 130, 80, 30);
		getContentPane().add(lblNumero3);

		JLabel lblNumero4 = new JLabel("4to número :");
		lblNumero4.setBounds(50, 170, 80, 30);
		getContentPane().add(lblNumero4);

		JLabel lblNumero5 = new JLabel("5to número :");
		lblNumero5.setBounds(50, 210, 80, 30);
		getContentPane().add(lblNumero5);
		
		JLabel lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(50, 250, 80, 30);
		getContentPane().add(lblPromedio);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(140, 50, 60, 30);
		
		txtNumero1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero1);

		txtNumero2 = new JTextField();
		txtNumero2.setBounds(140, 90, 60, 30);
		//txtNumero2.setFocusable(false);
		txtNumero2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero2);

		txtNumero3 = new JTextField();
		txtNumero3.setBounds(140, 130, 60, 30);
		//txtNumero3.setFocusable(false);
		txtNumero3.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero3);

		txtNumero4 = new JTextField();
		txtNumero4.setBounds(140, 170, 60, 30);
		//txtNumero4.setFocusable(false);
		txtNumero4.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero4.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero4);

		txtNumero5 = new JTextField();
		txtNumero5.setBounds(140, 210, 60, 30);
		//txtNumero5.setFocusable(false);
		txtNumero5.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero5);

		txtPromedio = new JTextField();
		txtPromedio.setBounds(140, 250, 60, 30);
		txtPromedio.setFocusable(false);
		txtPromedio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);

		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 350, 100, 30);
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
		int numero3 = Integer.parseInt( txtNumero3.getText() );
		int numero4 = Integer.parseInt( txtNumero4.getText() );
		int numero5 = Integer.parseInt( txtNumero5.getText() );
				
		double promedio =  ;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtPromedio.setText(df.format(promedio));
		
		
	}

}
