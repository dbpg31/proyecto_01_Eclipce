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

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;
JTextField txtMultiplicando, txtMultiplicador, txtProducto ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando :");
		lblMultiplicando.setBounds(50, 50, 120, 30);
		getContentPane().add(lblMultiplicando);
		
		JLabel lblMultiplicador = new JLabel("Multiplicador :");
		lblMultiplicador.setBounds(50, 90, 120, 30);
		getContentPane().add(lblMultiplicador);
		
		JLabel lblProducto = new JLabel("Producto :");
		lblProducto.setBounds(50, 130, 80, 30);
		getContentPane().add(lblProducto);
		
		Insets insets = new Insets(2,5,2,5);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(140, 50, 60, 30);
		txtMultiplicando.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMultiplicando.setMargin(insets);
		getContentPane().add(txtMultiplicando);

		txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(140, 90, 60, 30);
		txtMultiplicador.setHorizontalAlignment( SwingConstants.RIGHT);
		//txt.setFocusable(false);
		txtMultiplicador.setMargin(insets);
		getContentPane().add(txtMultiplicador);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(140, 130, 60, 30);
		txtProducto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtProducto.setFocusable(false);
		txtProducto.setMargin(insets);
		getContentPane().add(txtProducto);
		
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
		
		int multiplicando = Integer.parseInt( txtMultiplicando.getText() );
		int multiplicador = Integer.parseInt( txtMultiplicador.getText() );
		int producto = 0;
		while (multiplicador > 0) {
			producto += multiplicando ;
			multiplicador -= 1;
			
		}
		
		txtProducto.setText("" + producto );
	}

}
