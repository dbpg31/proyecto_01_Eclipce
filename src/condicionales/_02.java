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

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtUnidades, txtCompra, txtDescuento, txtTotalPago, txtCaramelos ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setBounds(50, 50, 80, 30);
		getContentPane().add(lblUnidades);
		
		JLabel lblCompra = new JLabel("Compra :");
		lblCompra.setBounds(50, 90, 80, 30);
		getContentPane().add(lblCompra);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 130, 80, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotalPago = new JLabel("Total a Pagar :");
		lblTotalPago.setBounds(50, 210, 130, 30);
		getContentPane().add(lblTotalPago);
		
		JLabel lblCaramelos = new JLabel("Caramelos :");
		lblCaramelos.setBounds(50, 170, 130, 30);
		getContentPane().add(lblCaramelos);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(140, 50, 60, 30);
		txtUnidades.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidades.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);

		txtCompra = new JTextField();
		txtCompra.setBounds(140, 90, 60, 30);
		txtCompra.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCompra.setFocusable(false);
		txtCompra.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCompra);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(140, 130, 60, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotalPago = new JTextField();
		txtTotalPago.setBounds(140, 170, 60, 30);
		txtTotalPago.setFocusable(false);
		txtTotalPago.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTotalPago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotalPago);
		
		txtCaramelos = new JTextField();
		txtCaramelos.setBounds(140, 210, 60, 30);
		txtCaramelos.setFocusable(false);
		txtCaramelos.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCaramelos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCaramelos);
		
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
		
		int unidades = Integer.parseInt( txtUnidades.getText() );
		double importe = unidades * 20 ;
		double descuento = 0.14 * importe ;
		if (importe <= 500) descuento = 0.12 * importe ;
		else if (importe > 700) descuento = 0.16 * importe ;
		
		double caramelos = 10 ;
		if (unidades <= 50) caramelos = 5 ;
		if (unidades > 100) caramelos = 15 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCompra.setText(df.format(importe));
		txtDescuento.setText(df.format(descuento)); 
		txtTotalPago.setText(df.format(importe - descuento));		
		txtCaramelos.setText(df.format(caramelos));		
	}

}
