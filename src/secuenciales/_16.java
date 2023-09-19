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

public class _16 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtSueldo, txtHoras, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16 frame = new _16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblSueldo = new JLabel("Sueldo :");
		lblSueldo.setBounds(30, 50, 130, 30);
		getContentPane().add(lblSueldo);
		
		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(30, 90, 130, 30);
		getContentPane().add(lblHoras);

		JLabel lblSueldoBasico = new JLabel("Sueldo Básico :");
		lblSueldoBasico.setBounds(30, 130, 130, 30);
		getContentPane().add(lblSueldoBasico);

		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto :");
		lblSueldoBruto.setBounds(30, 170, 80, 30);
		getContentPane().add(lblSueldoBruto);

		JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
		lblSueldoNeto.setBounds(30, 210, 80, 30);
		getContentPane().add(lblSueldoNeto);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(160, 50, 60, 30);
		
		txtSueldo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldo);

		txtHoras = new JTextField();
		txtHoras.setBounds(160, 90, 60, 30);
		
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHoras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);

		txtSueldoBasico = new JTextField();
		txtSueldoBasico.setBounds(160, 130, 60, 30);
		txtSueldoBasico.setFocusable(false);
		txtSueldoBasico.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBasico.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBasico);

		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setBounds(160, 170, 60, 30);
		txtSueldoBruto.setFocusable(false);
		txtSueldoBruto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBruto);

		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setBounds(160, 210, 60, 30);
		txtSueldoNeto.setFocusable(false);
		txtSueldoNeto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoNeto);

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
		
		int sueldo = Integer.parseInt( txtSueldo.getText() );
		int horas = Integer.parseInt(txtHoras.getText() ); 
		double sueldobasico = sueldo * horas ;
		double sueldobruto = sueldobasico * (1 + 0.20) ;
		double sueldoneto = sueldobruto * (1 - 0.10) ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSueldoBasico.setText(df.format(sueldobasico));
		txtSueldoBruto.setText(df.format(sueldobruto));
		txtSueldoNeto.setText(df.format(sueldoneto));
		
	}

}
