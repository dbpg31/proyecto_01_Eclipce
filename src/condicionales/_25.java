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

public class _25 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtSueldoBruto, txtCantidadHijos ;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_25 frame = new _25();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto :");
		lblSueldoBruto.setBounds(30, 50, 150, 30);
		getContentPane().add(lblSueldoBruto);
		
		JLabel lblCantidadHijos = new JLabel("Cantidad de Hijos :");
		lblCantidadHijos.setBounds(30, 90, 150, 30);
		getContentPane().add(lblCantidadHijos);
		
		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setBounds(170, 50, 80, 30);
		txtSueldoBruto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldoBruto);

		txtCantidadHijos = new JTextField();
		txtCantidadHijos.setBounds(170, 90, 80, 30);
		txtCantidadHijos.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtCategoria.setFocusable(false);
		txtCantidadHijos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidadHijos);
		
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
		
		int sueldobruto = Integer.parseInt( txtSueldoBruto.getText() );
		int cantidadhijos = Integer.parseInt( txtCantidadHijos.getText() );
		double bono = sueldobruto * 0.10;
		if (cantidadhijos > 1) bono = ((sueldobruto * 0.125) +(cantidadhijos * 40)) ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Bonificación: S/." + df.format(bono) + "\n");
		txaRpta.append("Sueldo neto a pagar: S/." + df.format(sueldobruto + bono) + "\n");
		
		
		
	}

}
