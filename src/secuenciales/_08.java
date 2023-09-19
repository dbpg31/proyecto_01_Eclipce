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

public class _08 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtRadio, txtAltura, txtAreaTotal, txtAreaBase, txtAreaLateral ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_08 frame = new _08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRadio = new JLabel("Radio :");
		lblRadio.setBounds(50, 50, 80, 30);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setBounds(50, 90, 80, 30);
		getContentPane().add(lblAltura);

		JLabel lblAreaBase = new JLabel("Área base :");
		lblAreaBase.setBounds(50, 130, 80, 30);
		getContentPane().add(lblAreaBase);
		
		JLabel lblAreaLateral = new JLabel("Área lateral :");
		lblAreaLateral.setBounds(50, 170, 80, 30);
		getContentPane().add(lblAreaLateral);
		
		JLabel lblAreaTotal = new JLabel("Área total :");
		lblAreaTotal.setBounds(50, 210, 80, 30);
		getContentPane().add(lblAreaTotal);
		
		
		txtRadio = new JTextField();
		txtRadio.setBounds(140, 50, 60, 30);
		
		txtRadio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRadio);

		txtAltura = new JTextField();
		txtAltura.setBounds(140, 90, 60, 30);
		//txtAltura.setFocusable(false);
		txtAltura.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);

		txtAreaBase = new JTextField();
		txtAreaBase.setBounds(140, 130, 60, 30);
		txtAreaBase.setFocusable(false);
		txtAreaBase.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAreaBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaBase);

		txtAreaLateral = new JTextField();
		txtAreaLateral.setBounds(140, 170, 60, 30);
		txtAreaLateral.setFocusable(false);
		txtAreaLateral.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAreaLateral.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaLateral);
		
		txtAreaTotal = new JTextField();
		txtAreaTotal.setBounds(140, 210, 60, 30);
		txtAreaTotal.setFocusable(false);
		txtAreaTotal.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAreaTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaTotal);
						
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
		
		int radio = Integer.parseInt( txtRadio.getText() );
		int altura = Integer.parseInt(txtAltura.getText());
		double areabase = (Math.PI) * Math.pow(radio, 2) ;
		double arealateral = 2 * (Math.PI) * radio * altura ; 
		double areatotal = 2 * areabase * arealateral; 
		DecimalFormat df = new DecimalFormat("##.00");
		txtAreaBase.setText(df.format(areabase));
		txtAreaLateral.setText(df.format(arealateral));
		txtAreaTotal.setText(df.format(areatotal));
		
	}

}
