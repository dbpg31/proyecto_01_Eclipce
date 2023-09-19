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
import java.awt.event.ActionEvent;

public class _10 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtNota1, txtNota2, txtNota3, txtNota4, txtNota5, txtMayorNota, txtMenorNota, txtPromedio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_10 frame = new _10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNota1 = new JLabel("1ra Nota :");
		lblNota1.setBounds(50, 50, 130, 30);
		getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("2da Nota :");
		lblNota2.setBounds(50, 90, 130, 30);
		getContentPane().add(lblNota2);

		JLabel lblNota3 = new JLabel("3ra Nota :");
		lblNota3.setBounds(50, 130, 130, 30);
		getContentPane().add(lblNota3);

		JLabel lblNota4 = new JLabel("4ta Nota :");
		lblNota4.setBounds(50, 170, 130, 30);
		getContentPane().add(lblNota4);

		JLabel lblNota5 = new JLabel("5ta Nota :");
		lblNota5.setBounds(50, 210, 130, 30);
		getContentPane().add(lblNota5);
		
		JLabel lblMayorNota = new JLabel("Mayor Nota :");
		lblMayorNota.setBounds(50, 250, 130, 30);
		getContentPane().add(lblMayorNota);
		
		JLabel lblMenorNota = new JLabel("Menor Nota :");
		lblMenorNota.setBounds(50, 290, 130, 30);
		getContentPane().add(lblMenorNota);
		
		JLabel lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(50, 330, 130, 30);
		getContentPane().add(lblPromedio);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(160, 50, 60, 30);
		
		txtNota1.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota1);

		txtNota2 = new JTextField();
		txtNota2.setBounds(160, 90, 60, 30);
		//txtNota2.setFocusable(false);
		txtNota2.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota2);

		txtNota3 = new JTextField();
		txtNota3.setBounds(160, 130, 60, 30);
		//txtNota3.setFocusable(false);
		txtNota3.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota3);

		txtNota4 = new JTextField();
		txtNota4.setBounds(160, 170, 60, 30);
		//txtNota4.setFocusable(false);
		txtNota4.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota4.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota4);

		txtNota5 = new JTextField();
		txtNota5.setBounds(160, 210, 60, 30);
		//txtNota5.setFocusable(false);
		txtNota5.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNota5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota5);

		txtMayorNota = new JTextField();
		txtMayorNota.setBounds(160, 250, 60, 30);
		txtMayorNota.setFocusable(false);
		txtMayorNota.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMayorNota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMayorNota);
		
		txtMenorNota = new JTextField();
		txtMenorNota.setBounds(160, 290, 60, 30);
		txtMenorNota.setFocusable(false);
		txtMenorNota.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMenorNota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMenorNota);
		
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(160, 330, 60, 30);
		txtPromedio.setFocusable(false);
		txtPromedio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);	
	
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 370, 100, 30);
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
		int nota4 = Integer.parseInt( txtNota4.getText() );
		int nota5 = Integer.parseInt( txtNota5.getText() );
		
		double mayor = 0 ;
		if ((nota1 > nota5) && (nota1 > nota4) && (nota1 > nota3) && (nota1 > nota2)) mayor = nota1;
		else if ((nota2 > nota5) && (nota2 > nota4) && (nota2 > nota3) && (nota2 > nota1)) mayor = nota2;
		else if ((nota3 > nota5) && (nota3 > nota4) && (nota3 > nota2) && (nota3 > nota1)) mayor = nota3;
		else if ((nota4 > nota5) && (nota4 > nota3) && (nota4 > nota2) && (nota4 > nota1)) mayor = nota4;
		else if ((nota5 > nota4) && (nota5 > nota3) && (nota5 > nota2) && (nota5 > nota1)) mayor = nota5;
		
		double menor = 0 ;
		if ((nota1 < nota5) && (nota1 < nota4) && (nota1 < nota3) && (nota1 < nota2)) menor = nota1;
		else if ((nota2 < nota5) && (nota2 < nota4) && (nota2 < nota3) && (nota2 < nota1)) menor = nota2;
		else if ((nota3 < nota5) && (nota3 < nota4) && (nota3 < nota2) && (nota3 < nota1)) menor = nota3;
		else if ((nota4 < nota5) && (nota4 < nota3) && (nota4 < nota2) && (nota4 < nota1)) menor = nota4;
		else if ((nota5 < nota4) && (nota5 < nota3) && (nota5 < nota2) && (nota5 < nota1)) menor = nota5;
		
		double promedio = ((nota1+nota2+nota3+nota4+nota5) - (mayor + menor)) / 3; 
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMayorNota.setText(df.format(mayor));
		txtMenorNota.setText(df.format(menor));
		txtPromedio.setText(df.format(promedio));
		
	}

}
