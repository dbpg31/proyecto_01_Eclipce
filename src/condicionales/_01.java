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

public class _01 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtUnidades, txtCompra, txtDescuento, txtTotalPago ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01 frame = new _01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _01() {
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
		lblTotalPago.setBounds(50, 170, 80, 30);
		getContentPane().add(lblTotalPago);
		
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
		double precio = 0;
		if (unidades <= 25) precio = 27;
		else if ((unidades > 25) && (unidades <= 50)) precio = 25 ;
		else if (unidades > 50) precio = 23;
		
		double compra = unidades * precio ;
		double descuento = 0.05 * compra ;
		if (unidades > 50) descuento = 0.15 * compra ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCompra.setText(df.format(compra));
		txtDescuento.setText(df.format(descuento)); 
		txtTotalPago.setText(df.format(compra - descuento));		
				
	}

}
