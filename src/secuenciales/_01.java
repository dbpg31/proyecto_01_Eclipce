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
import java.text.Format;
import java.awt.event.ActionEvent;

public class _01 extends JFrame {
	private static final long serialVersionUID = 1L;
JLabel lblpVarones, lblpMujeres;
JTextField txtVarones, txtMujeres;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01 frame = new _01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVarones = new JLabel("Varones :");
		lblVarones.setBounds(50, 50, 80, 30);
		getContentPane().add(lblVarones);
		
		JLabel lblMujeres = new JLabel("Mujeres :");
		lblMujeres.setBounds(50, 90, 80, 30);
		getContentPane().add(lblMujeres);
		
		lblpVarones = new JLabel("%");
		lblpVarones.setBounds(210, 50, 80, 30);
		getContentPane().add(lblpVarones);
		
		lblpMujeres = new JLabel("%");
		lblpMujeres.setBounds(210, 90, 80, 30);
		getContentPane().add(lblpMujeres);
		
		txtVarones = new JTextField();
		txtVarones.setBounds(140, 50, 60, 30);
		txtVarones.setHorizontalAlignment( SwingConstants.RIGHT);
		txtVarones.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVarones);

		txtMujeres = new JTextField();
		txtMujeres.setBounds(140, 90, 60, 30);
		txtMujeres.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMujeres.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMujeres);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		int varones = Integer.parseInt( txtVarones.getText() );
		int mujeres = Integer.parseInt( txtMujeres.getText() );
		int total = varones + mujeres; 
		double pVarones = varones * 100 / total;  
		double pMujeres = mujeres * 100 / total;
		
		DecimalFormat df = new DecimalFormat("##.00");
		lblpVarones.setText("" + df.format(pVarones)+"%");
		lblpMujeres.setText("" + df.format(pMujeres)+"%");
				
				
	}

}
