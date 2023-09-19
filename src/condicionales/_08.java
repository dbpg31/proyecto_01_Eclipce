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

public class _08 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtExamen1, txtExamen2, txtExamen3, txtTotal ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_08 frame = new _08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblExamen1 = new JLabel("1ra Examen :");
		lblExamen1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblExamen1);
		
		JLabel lblExamen2 = new JLabel("2da Examen :");
		lblExamen2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblExamen2);
		
		JLabel lblExamen3 = new JLabel("3ra Exmen :");
		lblExamen3.setBounds(50, 130, 80, 30);
		getContentPane().add(lblExamen3);
		
		JLabel lblTotal = new JLabel("Total Propina :");
		lblTotal.setBounds(50, 170, 130, 30);
		getContentPane().add(lblTotal);
		
		txtExamen1 = new JTextField();
		txtExamen1.setBounds(140, 50, 60, 30);
		txtExamen1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtExamen1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExamen1);

		txtExamen2 = new JTextField();
		txtExamen2.setBounds(140, 90, 60, 30);
		txtExamen2.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtExamen2.setFocusable(false);
		txtExamen2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExamen2);
		
		txtExamen3 = new JTextField();
		txtExamen3.setBounds(140, 130, 60, 30);
		txtExamen3.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtExamen3.setFocusable(false);
		txtExamen3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExamen3);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(140, 170, 60, 30);
		txtTotal.setFocusable(false);
		txtTotal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotal);
		
		
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 270, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}
	
	protected void btnCalcular_actionperfomed() {
		
		int examen1 = Integer.parseInt( txtExamen1.getText() );
		int examen2 = Integer.parseInt( txtExamen2.getText() );
		int examen3 = Integer.parseInt( txtExamen3.getText() );
		
		
		double aumento1 = 0;
		if (examen1 >= 13) aumento1 = 5 ;
		
		double aumento2 = 0;
		if (examen2 >= 13) aumento2 = 5 ;
		
		double aumento3 = 0;
		if (examen3 >= 13) aumento3 = 5 ;
		
		double total = 20 + (aumento1 + aumento2 + aumento3) ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtTotal.setText(df.format(total));
				
	}

}
