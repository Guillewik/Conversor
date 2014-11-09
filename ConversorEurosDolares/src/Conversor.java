import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Conversor extends JFrame  {
	private JPanel contentPane;
	private JTextField FieldEuros;
	private JTextField FieldDolares;
	public Conversor(float valorConversion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FieldEuros = new JTextField();
		FieldEuros.setBounds(45, 61, 116, 22);
		contentPane.add(FieldEuros);
		FieldEuros.setColumns(10);
		
		JLabel CampoEuros = new JLabel("Euros");
		CampoEuros.setBounds(69, 32, 56, 16);
		contentPane.add(CampoEuros);
		
		FieldDolares = new JTextField();
		FieldDolares.setColumns(10);
		FieldDolares.setBounds(299, 61, 116, 22);
		contentPane.add(FieldDolares);
		
		JLabel CampoDolares = new JLabel("Dolares");
		CampoDolares.setBounds(329, 32, 56, 16);
		contentPane.add(CampoDolares);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(FieldEuros.getText());
				FieldDolares.setText(String.valueOf(euros*valorConversion));
			}
		});
		btnConvertir.setBounds(182, 59, 97, 25);
		contentPane.add(btnConvertir);
	}
}
