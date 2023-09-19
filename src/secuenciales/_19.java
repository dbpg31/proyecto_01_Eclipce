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

public class _19 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtVentas, txtSueldoBase, txtSueldoBruto, txtSueldoNeto ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_19 frame = new _19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVentas = new JLabel("Ventas :");
		lblVentas.setBounds(30, 50, 130, 30);
		getContentPane().add(lblVentas);

		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto :");
		lblSueldoBruto.setBounds(30, 90, 130, 30);
		getContentPane().add(lblSueldoBruto);
		
		JLabel lblSueldoBase = new JLabel("Descuento  :");
		lblSueldoBase.setBounds(30, 130, 130, 30);
		getContentPane().add(lblSueldoBase);

		JLabel lblSueldoNeto = new JLabel("Sueldo Neto :");
		lblSueldoNeto.setBounds(30, 170, 130, 30);
		getContentPane().add(lblSueldoNeto);
		
		txtVentas = new JTextField();
		txtVentas.setBounds(160, 50, 60, 30);
		
		txtVentas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVentas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVentas);

		txtSueldoBase = new JTextField();
		txtSueldoBase.setBounds(160, 90, 60, 30);
		txtSueldoBase.setFocusable(false);
		txtSueldoBase.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBase);

		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setBounds(160, 130, 60, 30);
		txtSueldoBruto.setFocusable(false);
		txtSueldoBruto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBruto);

		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setBounds(160, 170, 60, 30);
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
		
		int ventas = Integer.parseInt( txtVentas.getText() );
		double sueldo = 500 ;
		double sueldobruto = sueldo + (ventas * 0.09) ;
		double sueldoneto = sueldobruto + (1 - 0.11) ;
		double descuento = sueldobruto * 0.11 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSueldoBruto.setText(df.format(sueldobruto));
		txtSueldoBase.setText(df.format(descuento));
		txtSueldoNeto.setText(df.format(sueldoneto));
		
	}

}
