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

public class _18 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtUnidades, txtPrecioBase, txtVenta, txtDescuentoTotal, txtVentaFinal ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_18 frame = new _18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setBounds(30, 50, 130, 30);
		getContentPane().add(lblUnidades);
		
		JLabel lblPrecioBase = new JLabel("Precio  :");
		lblPrecioBase.setBounds(30, 90, 130, 30);
		getContentPane().add(lblPrecioBase);

		JLabel lblVenta = new JLabel("Venta :");
		lblVenta.setBounds(30, 130, 130, 30);
		getContentPane().add(lblVenta);

		JLabel lblDescuentoTotal = new JLabel("Descuento Total :");
		lblDescuentoTotal.setBounds(30, 170, 130, 30);
		getContentPane().add(lblDescuentoTotal);

		JLabel lblVentaFinal = new JLabel("Venta Final :");
		lblVentaFinal.setBounds(30, 210, 80, 30);
		getContentPane().add(lblVentaFinal);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(160, 50, 60, 30);
		
		txtUnidades.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidades.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);

		txtPrecioBase = new JTextField();
		txtPrecioBase.setBounds(160, 90, 60, 30);
		
		txtPrecioBase.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPrecioBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecioBase);

		txtVenta = new JTextField();
		txtVenta.setBounds(160, 130, 60, 30);
		txtVenta.setFocusable(false);
		txtVenta.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVenta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVenta);

		txtDescuentoTotal = new JTextField();
		txtDescuentoTotal.setBounds(160, 170, 60, 30);
		txtDescuentoTotal.setFocusable(false);
		txtDescuentoTotal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuentoTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuentoTotal);

		txtVentaFinal = new JTextField();
		txtVentaFinal.setBounds(160, 210, 60, 30);
		txtVentaFinal.setFocusable(false);
		txtVentaFinal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVentaFinal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVentaFinal);

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
		
		int unidades = Integer.parseInt( txtUnidades.getText() );
		int preciobase = Integer.parseInt( txtPrecioBase.getText() );
		double venta = unidades * preciobase ;
		double venta1 = unidades * (1 - 0.15) ;
		double ventafinal = venta1 * (1 - 0.15) ;
		double descuento1 = venta * 0.15 ;
		double descuento2 = venta1 * 0.15 ;
		double descuentototal = descuento1 + descuento2 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtVenta.setText(df.format(venta));
		txtDescuentoTotal.setText(df.format(descuentototal));
		txtVentaFinal.setText(df.format(ventafinal));
		
	}

}
