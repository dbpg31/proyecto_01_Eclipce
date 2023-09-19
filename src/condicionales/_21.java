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

public class _21 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNumero, txtEstadoCivil, txtEdad, txtGenero ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_21 frame = new _21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(50, 50, 120, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil :");
		lblEstadoCivil.setBounds(50, 90, 120, 30);
		getContentPane().add(lblEstadoCivil);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setBounds(50, 130, 120, 30);
		getContentPane().add(lblEdad);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setBounds(50, 170, 120, 30);
		getContentPane().add(lblGenero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(180, 50, 60, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		
		txtEstadoCivil = new JTextField();
		txtEstadoCivil.setBounds(180, 90, 60, 30);
		txtEstadoCivil.setFocusable(false);
		txtEstadoCivil.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEstadoCivil.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEstadoCivil);

		txtEdad = new JTextField();
		txtEdad.setBounds(180, 130, 60, 30);
		txtEdad.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEdad.setFocusable(false);
		txtEdad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(180, 170, 60, 30);
		txtGenero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtGenero.setFocusable(false);
		txtGenero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtGenero);
		
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
		
		
		
	}

}
