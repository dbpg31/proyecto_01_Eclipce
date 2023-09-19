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

public class _17 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtPrecio, txtMonto, txtDescuento, txtLapiceros ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_17 frame = new _17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero de Docenas :");
		lblNumero.setBounds(50, 50, 120, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(50, 90, 120, 30);
		getContentPane().add(lblPrecio);
		
		JLabel lblMonto = new JLabel("Monto de Compra :");
		lblMonto.setBounds(50, 130, 120, 30);
		getContentPane().add(lblMonto);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 170, 120, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblLapiceros = new JLabel("Lapiceros :");
		lblLapiceros.setBounds(50, 210, 120, 30);
		getContentPane().add(lblLapiceros);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(180, 50, 60, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(180, 90, 60, 30);
		txtPrecio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPrecio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);

		txtMonto = new JTextField();
		txtMonto.setBounds(180, 130, 60, 30);
		txtMonto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMonto.setFocusable(false);
		txtMonto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMonto);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(180, 170, 60, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtLapiceros = new JTextField();
		txtLapiceros.setBounds(180, 210, 60, 30);
		txtLapiceros.setFocusable(false);
		txtLapiceros.setHorizontalAlignment( SwingConstants.RIGHT);
		txtLapiceros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtLapiceros);
		
		
		
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
		int precio = Integer.parseInt( txtPrecio.getText() );
		
		double venta = (numero * precio) ;
		double descuento = 0;
		if (numero >= 6) descuento = venta * 0.15 ;
		else if (numero <6) descuento = venta * 0.10 ;
		int lapiceros = 0;
		if (numero >= 30) lapiceros = (numero/3) * 2;
				
		DecimalFormat df = new DecimalFormat("##.00");
		txtMonto.setText(df.format(venta));
		txtDescuento.setText(df.format(descuento)); 
		txtLapiceros.setText("" + lapiceros);		
				
	}

}
