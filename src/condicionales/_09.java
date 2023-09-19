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

public class _09 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtCodigo, txtUnidades, txtCompra, txtDescuento, txtTotalPago ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_09 frame = new _09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCodigo = new JLabel("Codigo :");
		lblCodigo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblCodigo);
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setBounds(50, 90, 80, 30);
		getContentPane().add(lblUnidades);
		
		JLabel lblCompra = new JLabel("Compra :");
		lblCompra.setBounds(50, 130, 80, 30);
		getContentPane().add(lblCompra);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 170, 80, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotalPago = new JLabel("Total a Pagar :");
		lblTotalPago.setBounds(50, 210, 120, 30);
		getContentPane().add(lblTotalPago);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(140, 50, 60, 30);
		txtCodigo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCodigo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCodigo);

		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(140, 90, 60, 30);
		txtUnidades.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidades.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);

		txtCompra = new JTextField();
		txtCompra.setBounds(140, 130, 60, 30);
		txtCompra.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCompra.setFocusable(false);
		txtCompra.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCompra);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(140, 170, 60, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotalPago = new JTextField();
		txtTotalPago.setBounds(140, 210, 60, 30);
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
		
		int codigo = Integer.parseInt( txtCodigo.getText() );
		int unidades = Integer.parseInt( txtUnidades.getText() );
		
		double precio = 0;
		if (codigo == 101) precio = 17;
		else if (codigo == 102) precio = 25;
		else if (codigo == 103) precio = 16;
		else if (codigo == 104) precio = 27;
		
		double venta = unidades * precio ;

		double descuento = 0;
		if (unidades <= 10) descuento = venta * 0.05;
		else if ((unidades > 10) && (unidades <= 20)) descuento = venta * 0.08;
		else if ((unidades > 20) && (unidades <= 30))descuento = venta * 0.10;
		else if (unidades > 30) descuento = venta * 0.13;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCompra.setText(df.format(venta));
		txtDescuento.setText(df.format(descuento)); 
		txtTotalPago.setText(df.format(venta - descuento));		
				
	}

}
