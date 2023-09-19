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

public class _26 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtMonto, txtPrestamo, txtPagoEmpresa ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_26 frame = new _26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMonto = new JLabel("Monto :");
		lblMonto.setBounds(20, 50, 120, 30);
		getContentPane().add(lblMonto);
		
		JLabel lblPrestamo = new JLabel("Prestamo :");
		lblPrestamo.setBounds(20, 90, 120, 30);
		getContentPane().add(lblPrestamo);
		
		JLabel lblPagoEmpresa = new JLabel("Pago de Dinero Propio :");
		lblPagoEmpresa.setBounds(20, 130, 160, 30);
		getContentPane().add(lblPagoEmpresa);
		
		
		
		txtMonto = new JTextField();
		txtMonto.setBounds(160, 50, 90, 30);
		txtMonto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMonto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMonto);

		
		txtPrestamo = new JTextField();
		txtPrestamo.setBounds(160, 90, 90, 30);
		txtPrestamo.setFocusable(false);
		txtPrestamo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPrestamo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrestamo);

		txtPagoEmpresa = new JTextField();
		txtPagoEmpresa.setBounds(160, 130, 90, 30);
		txtPagoEmpresa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPagoEmpresa.setFocusable(false);
		txtPagoEmpresa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPagoEmpresa);
		
				
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
		
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double prestamo = monto * 0.20;
		
		if (monto > 5000) prestamo = monto * 0.30 ;
		double interes = prestamo *0.10 ;
		DecimalFormat df = new DecimalFormat("##.00");
		txtPrestamo.setText(df.format(prestamo));
		txtPagoEmpresa.setText(df.format((monto - prestamo) + interes ));
		
	}

}
