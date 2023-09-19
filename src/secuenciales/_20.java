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

public class _20 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtBilletes, txtBilletes200, txtBilletes100, txtBilletes50, txtBilletes20, txtBilletes10, txtMonedas5, txtMonedas2, txtMonedas1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_20 frame = new _20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDinero = new JLabel("Dinero :");
		lblDinero.setBounds(50, 50, 130, 30);
		getContentPane().add(lblDinero);
		
		JLabel lblBilletes200 = new JLabel("billetes de 200 :");
		lblBilletes200.setBounds(50, 90, 130, 30);
		getContentPane().add(lblBilletes200);

		JLabel lblBilletes100 = new JLabel("Billetes de 100 :");
		lblBilletes100.setBounds(50, 130, 130, 30);
		getContentPane().add(lblBilletes100);

		JLabel lblBilletes50 = new JLabel("Billetes de 50 :");
		lblBilletes50.setBounds(50, 170, 130, 30);
		getContentPane().add(lblBilletes50);

		JLabel lblBilletes20 = new JLabel("Billetes de 20 :");
		lblBilletes20.setBounds(50, 210, 130, 30);
		getContentPane().add(lblBilletes20);
		
		JLabel lblBilletes10 = new JLabel("Billetes de 10 :");
		lblBilletes10.setBounds(50, 250, 130, 30);
		getContentPane().add(lblBilletes10);
		
		txtBilletes = new JTextField();
		txtBilletes.setBounds(160, 50, 60, 30);
		
		txtBilletes.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes);

		txtBilletes200 = new JTextField();
		txtBilletes200.setBounds(160, 90, 60, 30);
		txtBilletes200.setFocusable(false);
		txtBilletes200.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes200.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes200);

		txtBilletes100 = new JTextField();
		txtBilletes100.setBounds(160, 130, 60, 30);
		txtBilletes100.setFocusable(false);
		txtBilletes100.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes100.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes100);

		txtBilletes50 = new JTextField();
		txtBilletes50.setBounds(160, 170, 60, 30);
		txtBilletes50.setFocusable(false);
		txtBilletes50.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes50.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes50);

		txtBilletes20 = new JTextField();
		txtBilletes20.setBounds(160, 210, 60, 30);
		txtBilletes20.setFocusable(false);
		txtBilletes20.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes20.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes20);

		txtBilletes10 = new JTextField();
		txtBilletes10.setBounds(160, 250, 60, 30);
		txtBilletes10.setFocusable(false);
		txtBilletes10.setHorizontalAlignment( SwingConstants.RIGHT);
		txtBilletes10.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBilletes10);
		
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 350, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		
		int metros = Integer.parseInt( txtMetros.getText() );
		double centimetros = metros * 100 ;
		double pulgadas = centimetros / 2.54 ; 
		double pies = pulgadas / 12 ; 
		double yardas = pies / 3;
	
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCentimetros.setText(df.format(centimetros));
		txtPies.setText(df.format(pies));
		txtPulgadas.setText(df.format(pulgadas));
		txtYardas.setText(df.format(yardas));
		
	}

}
