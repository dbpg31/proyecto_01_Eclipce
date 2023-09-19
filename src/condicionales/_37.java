package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _37 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtPamela, txtKarol, txtFany;
	JTextArea txaRpta; 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_37 frame = new _37();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _37() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 470);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPamela = new JLabel("Pamela votos :");
		lblPamela.setBounds(40, 40, 120, 30);
		getContentPane().add(lblPamela);
	
		JLabel lblKarol = new JLabel("Karol votos :");
		lblKarol.setBounds(40, 80, 120, 30);
		getContentPane().add(lblKarol);
		
		JLabel lblFany = new JLabel("Fany votos :");
		lblFany.setBounds(40, 120, 120, 30);
		getContentPane().add(lblFany);
		
		txtPamela = new JTextField();
		txtPamela.setBounds(150, 40, 80, 30);
		txtPamela.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPamela.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtPamela);
		
		txtKarol = new JTextField();
		txtKarol.setBounds(150, 80, 80, 30);
		txtKarol.setHorizontalAlignment( SwingConstants.RIGHT );
		txtKarol.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtKarol);
		
		txtFany = new JTextField();
		txtFany.setBounds(150, 120, 80, 30);
		txtFany.setHorizontalAlignment( SwingConstants.RIGHT );
		txtFany.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtFany);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 370, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		int pamela = Integer.parseInt( txtPamela.getText() );   
		int karol = Integer.parseInt( txtKarol.getText() );   
		int fany = Integer.parseInt( txtFany.getText() );   
		
		double mitad = (pamela + karol + fany) / 2;
		String mensaje = "" ;
		if (pamela > mitad) mensaje = "Ganó Pamela";
		else if (pamela > mitad) mensaje = "Ganó Karol";
		else if (pamela > mitad) mensaje = "Ganó Fany";
		else if ((pamela < karol) && (pamela < fany)) mensaje = "Pasan a 2da vuelta : Karol y Fany";
		else if ((karol < pamela) && (karol < fany))  mensaje = "Pasan a 2da vuelta : Pamela y Fany";
		else if ((fany < karol) && (fany < pamela))  mensaje = "Pasan a 2da vuelta : Pamela y Karol";
		else if ((pamela == karol) && (pamela == fany) && (karol == fany)) mensaje = "Elecciones anuladas";
		else if ((pamela > karol) && (pamela > fany) && (karol == fany)) mensaje = "Elecciones anuladas";
		else if ((karol > pamela) && (karol > fany) && (pamela == fany)) mensaje = "Elecciones anuladas";
		else if ((fany > pamela) && (fany > karol) && (pamela == karol)) mensaje = "Elecciones anuladas";
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append("Mensaje : " + mensaje + "\n");
		/*txaRpta.append( + "\n");
		txaRpta.append( + "\n");
		txaRpta.append( + "\n");
		txaRpta.append();*/
		
	}

}
