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

public class _03 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtAngulo, txtTipo ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03 frame = new _03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblAngulo = new JLabel("Angulo :");
		lblAngulo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblAngulo);
		
		JLabel lblTipo = new JLabel("Clasificación :");
		lblTipo.setBounds(50, 90, 120, 30);
		getContentPane().add(lblTipo);
		
		txtAngulo = new JTextField();
		txtAngulo.setBounds(140, 50, 80, 30);
		txtAngulo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAngulo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAngulo);

		txtTipo = new JTextField();
		txtTipo.setBounds(140, 90, 120, 30);
		txtTipo.setHorizontalAlignment( SwingConstants.RIGHT);
		//txtTipo.setFocusable(false);
		txtTipo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTipo);
		
		
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionperfomed();
			}
		});
	
	}
	
	protected void btnCalcular_actionperfomed() {
		
		int angulo = Integer.parseInt( txtAngulo.getText() );
		
		if (angulo == 0) txtTipo.setText("nulo");
		else if ((angulo > 0) && (angulo < 90)) txtTipo.setText("Angulo agudo") ;
		else if (angulo == 90) txtTipo.setText("Angulo recto") ;
		else if ((angulo > 90) && (angulo < 180)) txtTipo.setText("Angulo obtuso") ;
		else if (angulo == 180) txtTipo.setText("Angulo llano") ;
		else if ((angulo > 180) && (angulo < 360)) txtTipo.setText("Angulo cóncavo") ;
		else if (angulo == 360) txtTipo.setText("Angulo completo") ;
				
	}

}
