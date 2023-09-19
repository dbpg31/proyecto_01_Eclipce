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

public class _13 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtCateto1, txtCateto2, txtHipotenusa;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_13 frame = new _13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCateto1 = new JLabel("1er cateto :");
		lblCateto1.setBounds(50, 50, 130, 30);
		getContentPane().add(lblCateto1);
		
		JLabel lblCateto2 = new JLabel("2do cateto :");
		lblCateto2.setBounds(50, 90, 100, 30);
		getContentPane().add(lblCateto2);
		
		JLabel lblHipotenusa = new JLabel("Hipotenusa :");
		lblHipotenusa.setBounds(50, 130, 100, 30);
		getContentPane().add(lblHipotenusa);
		
		txtCateto1 = new JTextField();
		txtCateto1.setBounds(180, 50, 60, 30);
		
		txtCateto1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCateto1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCateto1);

		txtCateto2 = new JTextField();
		txtCateto2.setBounds(180, 90, 60, 30);
		
		txtCateto2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCateto2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCateto2);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setBounds(180, 130, 60, 30);
		txtHipotenusa.setFocusable(false);
		txtHipotenusa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHipotenusa);
						
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}

	protected void btnCalcular_actionperfomed() {
		
		int cateto1 = Integer.parseInt( txtCateto1.getText() );
		int cateto2 = Integer.parseInt( txtCateto2.getText() );
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtHipotenusa.setText(df.format(hipotenusa));
				
	}

}
