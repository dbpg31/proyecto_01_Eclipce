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

public class _06 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtEdad1, txtEdad2, txtEdad3, txtEdadMayor, txtEdadMenor ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_06 frame = new _06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblEdad1 = new JLabel("1ra Edad :");
		lblEdad1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblEdad1);
		
		JLabel lblEdad2 = new JLabel("2da Edad :");
		lblEdad2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblEdad2);
		
		JLabel lblEdad3 = new JLabel("3ra Edad :");
		lblEdad3.setBounds(50, 130, 80, 30);
		getContentPane().add(lblEdad3);
		
		JLabel lblEdadMayor = new JLabel("Edad Mayor :");
		lblEdadMayor.setBounds(50, 170, 130, 30);
		getContentPane().add(lblEdadMayor);
		
		JLabel lblEdadMenor = new JLabel("Edad Menor :");
		lblEdadMenor.setBounds(50, 210, 130, 30);
		getContentPane().add(lblEdadMenor);
		
		txtEdad1 = new JTextField();
		txtEdad1.setBounds(140, 50, 60, 30);
		txtEdad1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEdad1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad1);

		txtEdad2 = new JTextField();
		txtEdad2.setBounds(140, 90, 60, 30);
		txtEdad2.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtEdad2.setFocusable(false);
		txtEdad2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad2);
		
		txtEdad3 = new JTextField();
		txtEdad3.setBounds(140, 130, 60, 30);
		txtEdad3.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtEdad3.setFocusable(false);
		txtEdad3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad3);
		
		txtEdadMayor = new JTextField();
		txtEdadMayor.setBounds(140, 170, 60, 30);
		txtEdadMayor.setFocusable(false);
		txtEdadMayor.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEdadMayor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdadMayor);
		
		txtEdadMenor = new JTextField();
		txtEdadMenor.setBounds(140, 210, 60, 30);
		txtEdadMenor.setFocusable(false);
		txtEdadMenor.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEdadMenor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdadMenor);
		
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
		
		int edad1 = Integer.parseInt(txtEdad1.getText() );
		int edad2 = Integer.parseInt(txtEdad2.getText() );
		int edad3 = Integer.parseInt(txtEdad3.getText() );
		
		int mayor = 0;
		
		if ((edad1 > edad3) && (edad1 > edad2)) mayor = edad1; 
		else if ((edad2 > edad1) && (edad2 > edad3)) mayor = edad2; 
		else if ((edad3 > edad1) && (edad3 > edad2)) mayor = edad3;
		int menor = 0;	
		if ((edad1 < edad3) && (edad1 < edad2)) menor = edad1; 
		else if ((edad2 < edad1) && (edad2 < edad3)) menor = edad2;
		else if ((edad3 < edad1) && (edad3 < edad2)) menor = edad3;
		
		DecimalFormat df = new DecimalFormat("##");
		txtEdadMayor.setText(df.format(mayor));
		txtEdadMenor.setText(df.format(menor));
	}

}
