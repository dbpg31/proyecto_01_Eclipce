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

public class _04 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtPies, txtPulgadas, txtMetros ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04 frame = new _04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);

		JLabel lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblPulgadas);

		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(50, 170, 80, 30);
		getContentPane().add(lblMetros);

		txtPies = new JTextField();
		txtPies.setBounds(140, 90, 60, 30);
		
		txtPies.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);

		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(140, 130, 60, 30);
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPulgadas);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(140, 170, 60, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);

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
		
		int pies = Integer.parseInt(txtPies.getText() ); 
		int pulgadas = Integer.parseInt( txtPulgadas.getText() );
		double metros = (pies * (1/3.2808)) + (pulgadas * 0.0254) ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMetros.setText(df.format(metros));
	}

}
