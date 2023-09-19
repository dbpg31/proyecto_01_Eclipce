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

public class _15 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtJuan, txtRosa, txtDaniel, txtInvercion ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_15 frame = new _15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblJuan = new JLabel("Juan : $");
		lblJuan.setBounds(30, 50, 150, 30);
		getContentPane().add(lblJuan);
		
		JLabel lblRosa = new JLabel("Rosa : $");
		lblRosa.setBounds(30, 90, 150, 30);
		getContentPane().add(lblRosa);
		
		JLabel lblDaniel = new JLabel("Daniel : S/");
		lblDaniel.setBounds(30, 130, 130, 30);
		getContentPane().add(lblDaniel);
		
		JLabel lblInvercion = new JLabel("Inverción : $");
		lblInvercion.setBounds(30, 170, 130, 30);
		getContentPane().add(lblInvercion);
		
		txtJuan = new JTextField();
		txtJuan.setBounds(180, 50, 60, 30);
		
		txtJuan.setHorizontalAlignment( SwingConstants.RIGHT);
		txtJuan.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtJuan);

		txtRosa = new JTextField();
		txtRosa.setBounds(180, 90, 60, 30);
		
		txtRosa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtRosa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRosa);

		txtDaniel = new JTextField();
		txtDaniel.setBounds(180, 130, 60, 30);
		//txtDaniel.setFocusable(false);
		txtDaniel.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDaniel.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDaniel);
						
		txtInvercion = new JTextField();
		txtInvercion.setBounds(180, 170, 60, 30);
		txtInvercion.setFocusable(false);
		txtInvercion.setHorizontalAlignment( SwingConstants.RIGHT);
		txtInvercion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtInvercion);
						
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 250, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		
		int juan = Integer.parseInt( txtJuan.getText() );
		int rosa = Integer.parseInt( txtRosa.getText() );
		int daniel = Integer.parseInt( txtDaniel.getText() );
		
		double invercion = juan + rosa + (daniel/3);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtInvercion.setText(df.format(invercion));
				
		
	}

}
