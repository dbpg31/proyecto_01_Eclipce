package repetitivos;
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
JTextField txtDividendo, txtDivisor, txtCociente, txtResiduo ;
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
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDividendo = new JLabel("Dividendo :");
		lblDividendo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblDividendo);
		
		JLabel lblDivisor = new JLabel("Divisor :");
		lblDivisor.setBounds(50, 90, 80, 30);
		getContentPane().add(lblDivisor);
		
		JLabel lblCociente = new JLabel("Cocinete :");
		lblCociente.setBounds(50, 130, 80, 30);
		getContentPane().add(lblCociente);
		
		JLabel lblResiduo = new JLabel("Residuo :");
		lblResiduo.setBounds(50, 170, 130, 30);
		getContentPane().add(lblResiduo);
		
		Insets insets = new Insets(2,5,2,5);
		
		txtDividendo = new JTextField();
		txtDividendo.setBounds(140, 50, 60, 30);
		txtDividendo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDividendo.setMargin(insets);
		getContentPane().add(txtDividendo);

		txtDivisor = new JTextField();
		txtDivisor.setBounds(140, 90, 60, 30);
		txtDivisor.setHorizontalAlignment( SwingConstants.RIGHT);
		//txt.setFocusable(false);
		txtDivisor.setMargin(insets);
		getContentPane().add(txtDivisor);
		
		txtCociente = new JTextField();
		txtCociente.setBounds(140, 130, 60, 30);
		txtCociente.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCociente.setFocusable(false);
		txtCociente.setMargin(insets);
		getContentPane().add(txtCociente);
		
		txtResiduo = new JTextField();
		txtResiduo.setBounds(140, 170, 60, 30);
		txtResiduo.setFocusable(false);
		txtResiduo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtResiduo.setMargin(insets);
		getContentPane().add(txtResiduo);
		
		
		
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
		
		int dividendo = Integer.parseInt( txtDividendo.getText() );
		int divisor = Integer.parseInt( txtDivisor.getText() );
		
		int cociente = 0;
		while (dividendo >= divisor) {
			dividendo -= divisor ;
			cociente++;
			
		}
		
		txtCociente.setText("" + cociente );
		txtResiduo.setText("" + dividendo);		
	}

}
