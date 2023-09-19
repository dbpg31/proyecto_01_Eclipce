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

public class _23 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNotaMatematicas, txtNotaFisica ;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_23 frame = new _23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNotaMatematicas = new JLabel("Nota de Matemáticas :");
		lblNotaMatematicas.setBounds(30, 50, 150, 30);
		getContentPane().add(lblNotaMatematicas);
		
		JLabel lblNotaFisica = new JLabel("Nota de física :");
		lblNotaFisica.setBounds(30, 90, 150, 30);
		getContentPane().add(lblNotaFisica);
		
		txtNotaMatematicas = new JTextField();
		txtNotaMatematicas.setBounds(170, 50, 80, 30);
		txtNotaMatematicas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNotaMatematicas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNotaMatematicas);

		txtNotaFisica = new JTextField();
		txtNotaFisica.setBounds(170, 90, 80, 30);
		txtNotaFisica.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtCategoria.setFocusable(false);
		txtNotaFisica.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNotaFisica);
		
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
		
		int notamatematicas = Integer.parseInt( txtNotaMatematicas.getText() );
		int notafisica = Integer.parseInt( txtNotaFisica.getText() );
		
		double propinamatematicas = (notamatematicas >17 ? (notamatematicas * 3): (notamatematicas * 1));
		double propinafisica = (notafisica >15 ? (notafisica * 2) : (notafisica * 0.50 ));
		
		double promedio = (notamatematicas + notafisica) / 2;
		String obsequio = "" ;
		if (promedio > 16) obsequio = "reloj" ;
		else obsequio = "ninguno" ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Propina por Matemáticas: S/." + df.format(propinamatematicas) + "\n");
		txaRpta.append("Propina por Física: S/." + df.format(propinafisica) + "\n");
		txaRpta.append("Promedio de notas: "+ df.format(promedio) + "\n");
		txaRpta.append("Obsequio: " + obsequio);
		
		
		
	}

}
