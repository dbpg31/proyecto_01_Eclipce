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

public class _31 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtHoras, txtCategoria ;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_31 frame = new _31();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblHoras);
		
		JLabel lblCategoria = new JLabel("Categoria :");
		lblCategoria.setBounds(50, 90, 120, 30);
		getContentPane().add(lblCategoria);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(150, 50, 80, 30);
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHoras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);

		txtCategoria = new JTextField();
		txtCategoria.setBounds(150, 90, 80, 30);
		txtCategoria.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtCategoria.setFocusable(false);
		txtCategoria.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50, 150, 150, 150);
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
		
		int horas = Integer.parseInt( txtHoras.getText() );
		String scategoria = txtCategoria.getText();
		
		double tarifa =0;
		if (scategoria.equals("A")) tarifa = 21;
		if (scategoria.equals("B")) tarifa = 19.5;
		if (scategoria.equals("C")) tarifa = 17;
		
		double sueldobruto = horas * tarifa ;
		double descuento = (sueldobruto > 2500 ? 0.20 : 0.15) * sueldobruto ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Horas            : " + horas + "\n");
		txaRpta.append("categoria       : " + scategoria + "\n");
		txaRpta.append("Sueldo Bruto : " + "S/ "+ df.format(sueldobruto) + "\n");
		txaRpta.append("Descuento    : " + "S/ " + df.format(descuento) + "\n");
		txaRpta.append("Sueldo Neto  : " + "S/ " + df.format(sueldobruto - descuento));
		
		
		
	}

}
