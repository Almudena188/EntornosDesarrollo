import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ejer1 {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("SUMATORIO");
	private JTextField num1TField;
	private JTextField num2TField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer1 window = new ejer1();
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
	public ejer1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("\r\n");
		panel_1.setForeground(Color.BLACK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JLabel num1JLabel = new JLabel("Número 1: ");
		num1JLabel.setBounds(37, 45, 87, 14);
		num1JLabel.setBackground(Color.WHITE);
		num1JLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		
		num1TField = new JTextField();
		num1TField.setForeground(new Color(0, 0, 0));
		num1TField.setBackground(new Color(248, 248, 255));
		num1TField.setBounds(134, 42, 86, 20);
		num1TField.setColumns(10);
		
		JLabel num2JLabel = new JLabel("Número 2: ");
		num2JLabel.setBounds(37, 82, 87, 14);
		num2JLabel.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.add(num1JLabel);
		panel_1.add(num1TField);
		panel_1.add(num2JLabel);
		
		num2TField = new JTextField();
		num2TField.setForeground(new Color(0, 0, 0));
		num2TField.setColumns(10);
		num2TField.setBackground(new Color(248, 248, 255));
		num2TField.setBounds(134, 79, 86, 20);
		panel_1.add(num2TField);
		
		JLabel resultadoJLabel = new JLabel("Resultado: ");
		resultadoJLabel.setBackground(Color.WHITE);
		resultadoJLabel.setBounds(37, 127, 65, 14);
		panel_1.add(resultadoJLabel);
		
		JTextPane resultadoTextPane = new JTextPane();
		resultadoTextPane.setEditable(false);
		resultadoTextPane.setBounds(134, 121, 86, 20);
		panel_1.add(resultadoTextPane);
		
		JButton sumaJButton = new JButton("SUMA");
		sumaJButton.setBounds(37, 183, 89, 23);
		panel_1.add(sumaJButton);
		
		JButton salirJButton = new JButton("SALIR");
		salirJButton.setBounds(211, 183, 89, 23);
		panel_1.add(salirJButton);
		
		// funcionabilidad al boton de salir
		salirJButton.addMouseListener(new MouseAdapter() {			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		// funcionabilidad al boton de sumar
		sumaJButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int suma;
				
			}
		});
		
		
	}
	
	
		  
		  
}
	
	

