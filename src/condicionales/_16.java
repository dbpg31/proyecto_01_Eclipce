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

public class _16 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtIngreso, txtCostoCasa, txtCuotaInicial, txtCuota ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16 frame = new _16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblIngreso = new JLabel("Ingreso :");
		lblIngreso.setBounds(50, 50, 120, 30);
		getContentPane().add(lblIngreso);
		
		JLabel lblCostoCasa = new JLabel("Costo de la Casa :");
		lblCostoCasa.setBounds(50, 90, 120, 30);
		getContentPane().add(lblCostoCasa);
		
		JLabel lblCuotaInicial = new JLabel("Cuota Inicial :");
		lblCuotaInicial.setBounds(50, 130, 120, 30);
		getContentPane().add(lblCuotaInicial);
		
		JLabel lblCuota = new JLabel("Cuota :");
		lblCuota.setBounds(50, 170, 120, 30);
		getContentPane().add(lblCuota);
		
		txtIngreso = new JTextField();
		txtIngreso.setBounds(180, 50, 60, 30);
		txtIngreso.setHorizontalAlignment( SwingConstants.RIGHT);
		txtIngreso.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIngreso);

		
		txtCostoCasa = new JTextField();
		txtCostoCasa.setBounds(180, 90, 60, 30);
		//txtCostoCasa.setFocusable(false);
		txtCostoCasa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCostoCasa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCostoCasa);

		txtCuotaInicial = new JTextField();
		txtCuotaInicial.setBounds(180, 130, 60, 30);
		txtCuotaInicial.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCuotaInicial.setFocusable(false);
		txtCuotaInicial.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuotaInicial);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(180, 170, 60, 30);
		txtCuota.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCuota.setFocusable(false);
		txtCuota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuota);
		
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
		
		int ingreso = Integer.parseInt( txtIngreso.getText() );
		int costocasa = Integer.parseInt( txtCostoCasa.getText() );
		
		double cuotainicial = 0;
		double cuota = 0;
		if (ingreso < 1250) {cuotainicial = costocasa * 0.15 ; cuota = (costocasa - cuotainicial)/120;}
		else if (ingreso >= 1250) {cuotainicial = costocasa * 0.30 ; cuota = (costocasa - cuotainicial)/75;}
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCuotaInicial.setText(df.format(cuotainicial));
		txtCuota.setText(df.format(cuota)); 
				
	}

}
