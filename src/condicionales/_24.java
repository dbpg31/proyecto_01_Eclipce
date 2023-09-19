package condicionales;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.awt.event.ActionEvent;

public class _24 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtVentas, txtSueldoBase ;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_24 frame = new _24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVentas = new JLabel("Ventas :");
		lblVentas.setBounds(30, 50, 150, 30);
		getContentPane().add(lblVentas);
		
		JLabel lblSueldoBase = new JLabel("Sueldo Base :");
		lblSueldoBase.setBounds(30, 90, 150, 30);
		getContentPane().add(lblSueldoBase);
		
		txtVentas = new JTextField();
		txtVentas.setBounds(170, 50, 80, 30);
		txtVentas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVentas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVentas);

		txtSueldoBase = new JTextField();
		txtSueldoBase.setBounds(170, 90, 80, 30);
		txtSueldoBase.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBase.setFocusable(false);
		txtSueldoBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBase);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50, 150, 200, 150);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		
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
		
		int ventas = Integer.parseInt( txtVentas.getText() );
		
		double sueldobase = ventas * 0.10 ;
		double excesoventas  = 0 ;
		double bono  = 0 ;
		
		if (ventas > 5000) { excesoventas = ventas - 5000 ; bono = (excesoventas / 500 ) * 25 ;}
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSueldoBase.setText(df.format(sueldobase));
		txaRpta.setText("");
		txaRpta.append("Sueldo base: S/." + df.format(sueldobase) + "\n");
		txaRpta.append("Bono por venta : S/." + bono + "\n");
		txaRpta.append("Sueldo neto : S/."+ df.format(sueldobase + bono) + "\n");
		
		
		
	}

}
