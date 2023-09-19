package condicionales;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _19 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtSexo, txtEdad, txtCategoria;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_19 frame = new _19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(50, 50, 120, 30);
		getContentPane().add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setBounds(50, 90, 120, 30);
		getContentPane().add(lblEdad);
		
		JLabel lblCategoria = new JLabel("Categoría :");
		lblCategoria.setBounds(50, 130, 120, 30);
		getContentPane().add(lblCategoria);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(150, 50, 130, 30);
		txtSexo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtSexo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSexo);

		
		txtEdad = new JTextField();
		txtEdad.setBounds(150, 90, 130, 30);
		//txtEdad.setFocusable(false);
		txtEdad.setHorizontalAlignment( SwingConstants.RIGHT);
		txtEdad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad);

		txtCategoria = new JTextField();
		txtCategoria.setBounds(150, 130, 130, 30);
		txtCategoria.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCategoria.setFocusable(false);
		txtCategoria.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
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
		
		String sexo =txtSexo.getText();
		int edad = Integer.parseInt( txtEdad.getText() );
		
		
		if (sexo.equals("femenino") && edad <= 23) txtCategoria.setText("FA") ;  
		else if (sexo.equals("femenino") && edad > 23) txtCategoria.setText("FB") ;

		else if (sexo.equals("masculino") && edad <= 25) txtCategoria.setText("MA") ;
		else if (sexo.equals("masculino") && edad > 25) txtCategoria.setText("MB") ;
				
	}

}
