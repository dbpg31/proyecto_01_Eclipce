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
import java.awt.event.ActionEvent;

public class _30 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtCuota, txtTDia, txtMontoPago;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_30 frame = new _30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuota = new JLabel("Cuota :");
		lblCuota.setBounds(40, 40, 120, 30);
		getContentPane().add(lblCuota);
	
		JLabel lblTDia = new JLabel("Día :");
		lblTDia.setBounds(40, 80, 120, 30);
		getContentPane().add(lblTDia);
		
		JLabel lblMontoPago = new JLabel("Cuota a pagar :");
		lblMontoPago.setBounds(40, 120, 120, 30);
		getContentPane().add(lblMontoPago);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(150, 40, 60, 30);
		txtCuota.setHorizontalAlignment( SwingConstants.RIGHT );
		txtCuota.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtCuota);
		
		txtTDia = new JTextField();
		txtTDia.setBounds(150, 80, 60, 30);
		txtTDia.setHorizontalAlignment( SwingConstants.RIGHT );
		txtTDia.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtTDia);
		
		txtMontoPago = new JTextField();
		txtMontoPago.setBounds(150, 120, 60, 30);
		txtMontoPago.setFocusable(false);
		txtMontoPago.setHorizontalAlignment( SwingConstants.RIGHT );
		txtMontoPago.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtMontoPago);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		int cuota = Integer.parseInt(txtCuota.getText() );   
		int dia = Integer.parseInt( txtTDia.getText() );   
		
		double descuento = 0;
		if (dia <=10) descuento = -Math.max(5, 0.02 * cuota);
		else if (dia >=20) descuento = Math.max(10, 0.03 * cuota);
		
		DecimalFormat df = new DecimalFormat ("##.00");
		txtMontoPago.setText(df.format(cuota + descuento));
		
	}

}
