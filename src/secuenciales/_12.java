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

public class _12 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtCuadratica, txtLineal, txtIndependiente, txtRespuesta1, txtRespuesta2;

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
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuadratica = new JLabel("Variable Cuadratica :");
		lblCuadratica.setBounds(30, 50, 130, 30);
		getContentPane().add(lblCuadratica);
		
		JLabel lblLineal = new JLabel("Variable Lineal :");
		lblLineal.setBounds(30, 90, 130, 30);
		getContentPane().add(lblLineal);

		JLabel lblIndependiente = new JLabel("Variable Independiente :");
		lblIndependiente.setBounds(30, 130, 130, 30);
		getContentPane().add(lblIndependiente);

		JLabel lblResultado1 = new JLabel("Resultado 1 :");
		lblResultado1.setBounds(30, 170, 80, 30);
		getContentPane().add(lblResultado1);

		JLabel lblResultado2 = new JLabel("Resultado 2 :");
		lblResultado2.setBounds(30, 210, 80, 30);
		getContentPane().add(lblResultado2);
		
		txtCuadratica = new JTextField();
		txtCuadratica.setBounds(160, 50, 60, 30);
		
		txtCuadratica.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCuadratica.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuadratica);

		txtLineal = new JTextField();
		txtLineal.setBounds(160, 90, 60, 30);
		
		txtLineal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtLineal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtLineal);

		txtIndependiente = new JTextField();
		txtIndependiente.setBounds(160, 130, 60, 30);
		
		txtIndependiente.setHorizontalAlignment( SwingConstants.RIGHT);
		txtIndependiente.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIndependiente);

		txtRespuesta1 = new JTextField();
		txtRespuesta1.setBounds(160, 170, 60, 30);
		txtRespuesta1.setFocusable(false);
		txtRespuesta1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtRespuesta1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRespuesta1);

		txtRespuesta2 = new JTextField();
		txtRespuesta2.setBounds(160, 210, 60, 30);
		txtRespuesta2.setFocusable(false);
		txtRespuesta2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtRespuesta2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRespuesta2);

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
		
		int cuadratica = Integer.parseInt( txtCuadratica.getText() );
		int lineal = Integer.parseInt(txtLineal.getText() ); 
		int independiente = Integer.parseInt( txtIndependiente.getText() );
		double respuesta1 = (-lineal + Math.sqrt(Math.pow(lineal, 2)-(4 * cuadratica * independiente))) / (2 * cuadratica) ;
		double respuesta2 = (-lineal - Math.sqrt(Math.pow(lineal, 2)-(4 * cuadratica * independiente))) / (2 * cuadratica) ;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtRespuesta1.setText(df.format(respuesta1));
		txtRespuesta2.setText(df.format(respuesta2));			
	}

}
