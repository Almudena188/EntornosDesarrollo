import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Calculadora {

	private JFrame frame;
	private JTextField num1TF;
	private JTextField num2TF;
	private JTextField resultadoTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 11, 354, 36);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUMADOR");
		lblNewLabel.setBounds(141, 11, 85, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(42, 71, 354, 132);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel num1JL = new JLabel("N\u00FAmero 1:");
		num1JL.setBounds(10, 26, 66, 14);
		panel_1.add(num1JL);
		
		JLabel num2JL = new JLabel("N\u00FAmero 2:");
		num2JL.setBounds(10, 64, 66, 14);
		panel_1.add(num2JL);
		
		JLabel num3JL = new JLabel("Resultado:");
		num3JL.setBounds(10, 100, 66, 14);
		panel_1.add(num3JL);
		
		num1TF = new JTextField();
		num1TF.setBounds(75, 23, 86, 20);
		panel_1.add(num1TF);
		num1TF.setColumns(10);
		
		num2TF = new JTextField();
		num2TF.setBounds(75, 61, 86, 20);
		panel_1.add(num2TF);
		num2TF.setColumns(10);
		
		resultadoTF = new JTextField();
		resultadoTF.setEditable(false);
		resultadoTF.setDropMode(DropMode.INSERT);
		resultadoTF.setBounds(75, 97, 86, 20);
		panel_1.add(resultadoTF);
		resultadoTF.setColumns(10);
		
		JButton btnSuma = new JButton("SUMAR");
		btnSuma.setBounds(42, 214, 89, 23);
		frame.getContentPane().add(btnSuma);
		
		btnSuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				int num1 = Integer.parseInt(num1TF.getText());
				int num2 = Integer.parseInt(num2TF.getText());
				
				int sum = num1+ num2;
				String sumText = Integer.toString(sum);
				
				
				resultadoTF.setText(sumText);
				
				num1TF.setText(null);
				num2TF.setText(null);
				
			}
		});
		

		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(307, 214, 89, 23);
		frame.getContentPane().add(btnSalir);
		// FUNCIONABILIDAD DEL BOTON DE SALIR
		btnSalir.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				System.exit(0);
	
			}

		});
	}
}
