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

public class _15 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtVenta, txtSueldoBruto, txtComision, txtDescuento, txtSueldoNeto ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_15 frame = new _15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVenta = new JLabel("Venta :");
		lblVenta.setBounds(50, 50, 120, 30);
		getContentPane().add(lblVenta);
		
		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto :");
		lblSueldoBruto.setBounds(50, 90, 120, 30);
		getContentPane().add(lblSueldoBruto);
		
		JLabel lblComision = new JLabel("Comisión :");
		lblComision.setBounds(50, 130, 120, 30);
		getContentPane().add(lblComision);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 170, 120, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblSueldoNeto = new JLabel("Sueldo Neto :");
		lblSueldoNeto.setBounds(50, 210, 120, 30);
		getContentPane().add(lblSueldoNeto);
		
		txtVenta = new JTextField();
		txtVenta.setBounds(180, 50, 60, 30);
		txtVenta.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVenta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVenta);

		
		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setBounds(180, 90, 60, 30);
		txtSueldoBruto.setFocusable(false);
		txtSueldoBruto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBruto);

		txtComision = new JTextField();
		txtComision.setBounds(180, 130, 60, 30);
		txtComision.setHorizontalAlignment( SwingConstants.RIGHT);
		txtComision.setFocusable(false);
		txtComision.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtComision);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(180, 170, 60, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setBounds(180, 210, 60, 30);
		txtSueldoNeto.setFocusable(false);
		txtSueldoNeto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoNeto);
		
		
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 300, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}
	
	protected void btnCalcular_actionperfomed() {
		
		int venta = Integer.parseInt( txtVenta.getText() );
		int sueldobase = 250;
		
		double comision = 0;
		double sueldo = 0;
		if (venta <= 5000) {comision = 0.05; sueldo = sueldobase + (venta * 0.05);}
		else if ((venta > 5000) && (venta <= 10000)){comision = 0.08 ; sueldo = sueldobase + (venta * 0.08);}
		else if ((venta > 10000) && (venta <= 20000)) {comision = 0.10 ; sueldo = sueldobase + (venta * 0.10);}
		else if (venta > 20000) {comision = 0.15 ; sueldo = sueldobase + (venta * 0.15);}
		
		double descuento = 0;
		if (sueldo > 3500)descuento = sueldo * 0.15;
		else descuento = sueldo * 0.08;		
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSueldoBruto.setText(df.format(sueldo));
		txtComision.setText(df.format(comision * venta));
		txtDescuento.setText(df.format(descuento)); 
		txtSueldoNeto.setText(df.format(sueldo - descuento));		
				
	}

}
