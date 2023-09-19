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

public class _20 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumeroA, txtNumeroB, txtNumeroC, txtOrden ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_20 frame = new _20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumeroA = new JLabel("Número A :");
		lblNumeroA.setBounds(50, 50, 120, 30);
		getContentPane().add(lblNumeroA);
		
		JLabel lblNumeroB = new JLabel("Número B :");
		lblNumeroB.setBounds(50, 90, 120, 30);
		getContentPane().add(lblNumeroB);
		
		JLabel lblNumeroC = new JLabel("Número C :");
		lblNumeroC.setBounds(50, 130, 120, 30);
		getContentPane().add(lblNumeroC);
		
		JLabel lblOrden = new JLabel("Orden :");
		lblOrden.setBounds(50, 170, 120, 30);
		getContentPane().add(lblOrden);
		
		txtNumeroA = new JTextField();
		txtNumeroA.setBounds(130, 50, 120, 30);
		txtNumeroA.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumeroA.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumeroA);

		
		txtNumeroB = new JTextField();
		txtNumeroB.setBounds(130, 90, 120, 30);
		//txtCostoCasa.setFocusable(false);
		txtNumeroB.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumeroB.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumeroB);

		txtNumeroC = new JTextField();
		txtNumeroC.setBounds(130, 130, 120, 30);
		txtNumeroC.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtNumeroC.setFocusable(false);
		txtNumeroC.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumeroC);
		
		txtOrden = new JTextField();
		txtOrden.setBounds(130, 170, 120, 30);
		txtOrden.setHorizontalAlignment( SwingConstants.RIGHT);
		txtOrden.setFocusable(false);
		txtOrden.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtOrden);
		
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
		
		int a = Integer.parseInt( txtNumeroA.getText() );
		int b = Integer.parseInt( txtNumeroB.getText() );
		int c = Integer.parseInt( txtNumeroC.getText() );
		
		if ((a > b) && (b > c)) txtOrden.setText("descendente");
		else if ((a < b) && (b < c)) txtOrden.setText("ascendente");
		else txtOrden.setText("desordenado");
	}

}
