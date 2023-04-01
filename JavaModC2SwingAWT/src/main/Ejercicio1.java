/**
 * 
 */
package main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author aitor
 *
 */
public class Ejercicio1 extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	public Ejercicio1() {
		
		setTitle("EJERCICIO 1"); 
		setBounds(400, 200, 500, 400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(150, 50, 250, 30);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(100, 90, 300, 30);
		contentPane.add(textField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(al);
		btnAceptar.setBounds(200, 150, 100, 40);
		contentPane.add(btnAceptar);
	
		
		setVisible(true); 
	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Hello "+textField.getText());
			}
	};

}
