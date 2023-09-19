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

public class _04 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNota1, txtNota2, txtNota3, txtNotaFinal ;
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
		
		JLabel lblNota1 = new JLabel("1ra Nota :");
		lblNota1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("2da Nota :");
		lblNota2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblNota2);
		
		JLabel lblNota3 = new JLabel("3ra Nota :");
		lblNota3.setBounds(50, 130, 80, 30);
		getContentPane().add(lblNota3);
		
		JLabel lblNotaFinal = new JLabel("Nota Final :");
		lblNotaFinal.setBounds(50, 170, 130, 30);
		getContentPane().add(lblNotaFinal);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(140, 50, 60, 30);
		txtNota1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota1);

		txtNota2 = new JTextField();
		txtNota2.setBounds(140, 90, 60, 30);
		txtNota2.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtNota2.setFocusable(false);
		txtNota2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(140, 130, 60, 30);
		txtNota3.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtNota3.setFocusable(false);
		txtNota3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota3);
		
		txtNotaFinal = new JTextField();
		txtNotaFinal.setBounds(140, 170, 60, 30);
		txtNotaFinal.setFocusable(false);
		txtNotaFinal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNotaFinal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNotaFinal);
		
		
		
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
		
		int nota1 = Integer.parseInt( txtNota1.getText() );
		int nota2 = Integer.parseInt( txtNota2.getText() );
		int nota3 = Integer.parseInt( txtNota3.getText() );
		
		if (nota3 >= 10) nota3 = nota3 + 2 ;
		double notafinal = (nota1 + nota2 + nota3) / 3 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtNotaFinal.setText(df.format(notafinal));
				
	}

}
