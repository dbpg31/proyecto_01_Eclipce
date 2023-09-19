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

public class _22 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtUnidadA, txtUnidadB, txtImporteBruto, txtDescuento, txtPagoNeto ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_22 frame = new _22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidadA = new JLabel("Unidades de A :");
		lblUnidadA.setBounds(50, 50, 120, 30);
		getContentPane().add(lblUnidadA);
		
		JLabel lblUnidadB = new JLabel("Unidades de B :");
		lblUnidadB.setBounds(50, 90, 120, 30);
		getContentPane().add(lblUnidadB);
		
		JLabel lblImporteBruto = new JLabel("Importe Bruto :");
		lblImporteBruto.setBounds(50, 130, 120, 30);
		getContentPane().add(lblImporteBruto);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(50, 170, 120, 30);
		getContentPane().add(lblDescuento);
		
		JLabel lblPagoNeto = new JLabel("Neto a Pagar :");
		lblPagoNeto.setBounds(50, 210, 120, 30);
		getContentPane().add(lblPagoNeto);
		
		txtUnidadA = new JTextField();
		txtUnidadA.setBounds(160, 50, 120, 30);
		txtUnidadA.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidadA.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidadA);

		
		txtUnidadB = new JTextField();
		txtUnidadB.setBounds(160, 90, 120, 30);
		//txtUnidadB.setFocusable(false);
		txtUnidadB.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidadB.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidadB);

		txtImporteBruto = new JTextField();
		txtImporteBruto.setBounds(160, 130, 120, 30);
		txtImporteBruto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtImporteBruto.setFocusable(false);
		txtImporteBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtImporteBruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(160, 170, 120, 30);
		txtDescuento.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtPagoNeto = new JTextField();
		txtPagoNeto.setBounds(160, 210, 120, 30);
		txtPagoNeto.setFocusable(false);
		txtPagoNeto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPagoNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPagoNeto);
		
		
		
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
		
		int unidadA = Integer.parseInt( txtUnidadA.getText() );
		int unidadB = Integer.parseInt( txtUnidadB.getText() );
		
		double ventaA = unidadA * 25; 
		double descuentoA = 0; 
		
		if (unidadA > 50) descuentoA = ventaA * 0.15;
		
		double ventaB = unidadB * 30; 
		double descuentoB = 0;
		if (unidadB > 60) descuentoB = ventaB * 0.10; 
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporteBruto.setText(df.format(ventaA + ventaB));
		txtDescuento.setText(df.format(descuentoA + descuentoB)); 
		txtPagoNeto.setText(df.format((ventaA - descuentoA)+(ventaB - descuentoB)));		
				
	}

}
