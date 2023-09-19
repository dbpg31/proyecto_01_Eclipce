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

public class _27 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtVentas;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_27 frame = new _27();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVentas = new JLabel("Total Vendido :");
		lblVentas.setBounds(30, 50, 150, 30);
		getContentPane().add(lblVentas);
		
		txtVentas = new JTextField();
		txtVentas.setBounds(170, 50, 80, 30);
		txtVentas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVentas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVentas);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50, 120, 200, 180);
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
		
		double sueldobasico = 600 ;
		double comision = ventas * 0.15 ;
		double sueldobruto = sueldobasico + comision ;
		double descuento = sueldobruto  * 0.05 ;
		if (sueldobruto > 1800) descuento = sueldobruto * 0.10 ;

		double polos = 1;
		if (ventas > 1000) polos = 3;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Sueldo bruto: S/." + df.format(sueldobruto) + "\n");
		txaRpta.append("Descuento: S/." + df.format(descuento) + "\n");
		txaRpta.append("Sueldo neto: S/."+ df.format(sueldobruto - descuento) + "\n");
		txaRpta.append("Polos obsequiados: " + polos);
		
		
		
	}

}
