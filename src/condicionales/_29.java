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

public class _29 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtHorasTrabajas, txtPago ;
JTextArea txaRpta ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_29 frame = new _29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas  :");
		lblHorasTrabajadas.setBounds(30, 50, 150, 30);
		getContentPane().add(lblHorasTrabajadas);
		
		JLabel lblPago = new JLabel("Pago por Hora  :");
		lblPago.setBounds(30, 90, 150, 30);
		getContentPane().add(lblPago);
		
		txtHorasTrabajas = new JTextField();
		txtHorasTrabajas.setBounds(170, 50, 80, 30);
		txtHorasTrabajas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHorasTrabajas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHorasTrabajas);

		txtPago = new JTextField();
		txtPago.setBounds(170, 90, 80, 30);
		txtPago.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtCategoria.setFocusable(false);
		txtPago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPago);
		
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
		
		int horastrabajadas = Integer.parseInt( txtHorasTrabajas.getText() );
		int pago = Integer.parseInt( txtPago.getText() );
		
		double descuento = 0 ;
		double horasnormales = 48 ;
		double horasextras = horastrabajadas - horasnormales ;
		double sueldobruto = (horasnormales * pago) + (horasextras * pago * 1.2) ;

		if (horastrabajadas <= 48) sueldobruto = horastrabajadas * pago ;
		if (sueldobruto > 1500) descuento = sueldobruto * 0.11 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Sueldo bruto: S/." + df.format(sueldobruto) + "\n");
		txaRpta.append("Descuento: S/." + df.format(descuento) + "\n");
		txaRpta.append("Total a pagar: S/." + df.format(sueldobruto - descuento));
		
		
		
	}

}
