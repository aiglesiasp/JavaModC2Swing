/**
 * 
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author aitor
 *
 */
public class Ejercicio2 extends JFrame {
	// PANEL DE APLICACION
	private JPanel contentPane;
	private String message;
	private JComboBox<Object> comboBoxPeliculas;
	private JTextField textField;

	// CONSTRUCTOR
	public Ejercicio2() {

		setTitle("EJERCICIO 2");
		setBounds(400, 200, 1000, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel titulo = new JLabel("Escribe el título de una película");
		titulo.setBounds(150, 50, 250, 30);
		contentPane.add(titulo);

		textField = new JTextField();
		textField.setBounds(100, 90, 300, 30);
		contentPane.add(textField);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(200, 150, 100, 40);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(al);

		JLabel peliculas = new JLabel("Películas");
		peliculas.setBounds(600, 50, 150, 30);
		contentPane.add(peliculas);

		comboBoxPeliculas = new JComboBox<>();
		comboBoxPeliculas.setBounds(600, 90, 150, 30);
		contentPane.add(comboBoxPeliculas);

		setVisible(true); // Hago ventana visible
	}

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			message = textField.getText();
			comboBoxPeliculas.addItem(message);
		}
	};

}
