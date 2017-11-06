import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bailando extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bailando frame = new Bailando();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bailando() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 416);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// el boton que pasa el texto de derecha a izquerda
		JButton izquerda = new JButton("<<<<<");
		izquerda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1.setText(text2.getText()); // pone el texto del text2 en el text1, que esta a la izquerda
				text2.setText(""); // deja el campo de la derecha vacio
			}
		});
		izquerda.setBackground(Color.BLUE);
		izquerda.setForeground(Color.RED);
		contentPane.add(izquerda, BorderLayout.NORTH);
		// el boton derecha hace lo del boton izquerda pero a reves
		JButton derecha = new JButton(">>>>>");
		derecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText(text1.getText()); // pone el texto del text2 en el text1, que esta a la izquerda
				text1.setText(""); // deja el campo de la derecha vacio
			}
		});
		derecha.setBackground(Color.RED);
		derecha.setForeground(Color.BLUE);
		contentPane.add(derecha, BorderLayout.SOUTH);
		
		text1 = new JTextField();
		contentPane.add(text1, BorderLayout.WEST);
		text1.setColumns(10);
		
		text2 = new JTextField();
		contentPane.add(text2, BorderLayout.EAST);
		text2.setColumns(10);
		
		btnSalir = new JButton("Salir");

		btnSalir.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0); // Cierra la aplicacion
				
			}
		});
		contentPane.add(btnSalir, BorderLayout.CENTER);
	}

}
