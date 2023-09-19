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

public class _28 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtHoras_24;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_28 frame = new _28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVentas = new JLabel("Total Vendido :");
		lblVentas.setBounds(30, 50, 150, 30);
		getContentPane().add(lblVentas);
		
		txtHoras_24 = new JTextField();
		txtHoras_24.setBounds(170, 50, 80, 30);
		txtHoras_24.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHoras_24.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras_24);
		
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
		
		String horas_24 = txtHoras_24.setText("HH:MM"); 
		 try {
	            String[] hora_minutos = horas_24.split(":");
	            int hora = Integer.parseInt(hora_minutos[0]);
	            int minutos = Integer.parseInt(hora_minutos[1]);
	            if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
	                throw new IllegalArgumentException("Hora inválida");
	            }
	            String periodo;
	            if (hora < 12) {
	                periodo = "AM";
	                if (hora == 0) {
	                    hora = 12;
	                }
	            } else {
	                periodo = "PM";
	                if (hora > 12) {
	                    hora -= 12;
	                }
	            }
		 }
	      
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Sueldo bruto: S/." + df.format(sueldobruto) + "\n");
		txaRpta.append("Descuento: S/." + df.format(descuento) + "\n");
		txaRpta.append("Sueldo neto: S/."+ df.format(sueldobruto - descuento) + "\n");
		txaRpta.append("Polos obsequiados: " + polos);
		
		
		
	}

}
