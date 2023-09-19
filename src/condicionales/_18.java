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

public class _18 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtDonacion, txtSalud, txtComedor, txtBolsa ;
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
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDonacion = new JLabel("Donación :");
		lblDonacion.setBounds(50, 50, 120, 30);
		getContentPane().add(lblDonacion);
		
		JLabel lblSalud = new JLabel("Centro de Salud :");
		lblSalud.setBounds(50, 90, 120, 30);
		getContentPane().add(lblSalud);
		
		JLabel lblComedor = new JLabel("Comedor de Niños :");
		lblComedor.setBounds(50, 130, 120, 30);
		getContentPane().add(lblComedor);
		
		JLabel lblBolsa = new JLabel("Bolsa :");
		lblBolsa.setBounds(50, 170, 120, 30);
		getContentPane().add(lblBolsa);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(180, 50, 60, 30);
		txtDonacion.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDonacion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDonacion);

		
		txtSalud = new JTextField();
		txtSalud.setBounds(180, 90, 60, 30);
		txtSalud.setFocusable(false);
		txtSalud.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSalud.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSalud);

		txtComedor = new JTextField();
		txtComedor.setBounds(180, 130, 60, 30);
		txtComedor.setHorizontalAlignment( SwingConstants.RIGHT);
		txtComedor.setFocusable(false);
		txtComedor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtComedor);
		
		txtBolsa = new JTextField();
		txtBolsa.setBounds(180, 170, 60, 30);
		txtBolsa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBolsa.setFocusable(false);
		txtBolsa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBolsa);
		
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
		
		int donacion = Integer.parseInt( txtDonacion.getText() );
		
		double salud = 0;
		double comedor = 0;
		double bolsa = 0;
		
		if (donacion >= 10000) {salud = donacion * 0.30 ; comedor = donacion * 0.50 ; bolsa = donacion * 0.20;}
		else if (donacion < 10000) {salud = donacion * 0.25 ; comedor = donacion * 0.60 ; bolsa = donacion * 0.15;}
				
		DecimalFormat df = new DecimalFormat("##.00");
		txtSalud.setText(df.format(salud));
		txtComedor.setText(df.format(comedor));
		txtBolsa.setText(df.format(bolsa)); 
				
	}

}
