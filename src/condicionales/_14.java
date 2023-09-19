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

public class _14 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtVenta, txtTarjeta, txtDescuento, txtTotalPago ;
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
		
		JLabel lblNumero = new JLabel("Numero de tarjeta :");
		lblNumero.setBounds(50, 50, 120, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblVenta = new JLabel("Venta :");
		lblVenta.setBounds(50, 90, 120, 30);
		getContentPane().add(lblVenta);
		
		JLabel lblTarjeta = new JLabel("Tarjeta :");
		lblTarjeta.setBounds(50, 130, 120, 30);
		getContentPane().add(lblTarjeta);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 170, 120, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotalPago = new JLabel("Total a Pagar :");
		lblTotalPago.setBounds(50, 210, 120, 30);
		getContentPane().add(lblTotalPago);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(180, 50, 60, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		
		txtVenta = new JTextField();
		txtVenta.setBounds(180, 90, 60, 30);
		txtVenta.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVenta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVenta);

		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(180, 130, 60, 30);
		txtTarjeta.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTarjeta.setFocusable(false);
		txtTarjeta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTarjeta);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(180, 170, 60, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotalPago = new JTextField();
		txtTotalPago.setBounds(180, 210, 60, 30);
		txtTotalPago.setFocusable(false);
		txtTotalPago.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTotalPago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotalPago);
		
		
		
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
		
		int numero = Integer.parseInt( txtNumero.getText() );
		int venta = Integer.parseInt( txtVenta.getText() );
		
		double descuento = 0;
		if ((numero >= 100) && ((numero % 2) == 0)) descuento = venta * 0.15 ;
		else descuento = venta * 0.05 ;
				
		DecimalFormat df = new DecimalFormat("##.00");
		txtTarjeta.setText(df.format(numero));
		txtDescuento.setText(df.format(descuento)); 
		txtTotalPago.setText(df.format(venta - descuento));		
				
	}

}
