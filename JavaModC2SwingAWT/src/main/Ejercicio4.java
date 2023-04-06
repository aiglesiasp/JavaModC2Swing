/**
 * 
 */
package main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window;

/**
 * @author aitor
 *
 */
public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField firstNum;
	private JTextField secondNum;
	private JTextField result;
	private JButton btnSuma;
	private JButton btnSalir;
	private JButton btnDivi;
	private JButton btnMulti;
	private JButton btnResta;
	private JButton btnC;

	public Ejercicio4() {

		setTitle("EJERCICIO 4");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// NUMERO 1
		JLabel primerNumero = new JLabel("Introduce el primer numero: ");
		primerNumero.setBounds(40, 20, 200, 20);
		contentPane.add(primerNumero);

		firstNum = new JTextField();
		firstNum.setBounds(300, 20, 100, 20);
		contentPane.add(firstNum);

		// NUMERO 2
		JLabel segundoNumero = new JLabel("Introduce el segundo numero: ");
		segundoNumero.setBounds(40, 50, 200, 20);
		contentPane.add(segundoNumero);

		secondNum = new JTextField();
		secondNum.setBounds(300, 50, 100, 20);
		contentPane.add(secondNum);

		// RESULTADO
		JLabel resultado = new JLabel("El resultado es : ");
		resultado.setBounds(40, 180, 200, 20);
		contentPane.add(resultado);

		result = new JTextField();
		result.setBounds(193, 180, 269, 20);
		contentPane.add(result);

		// BOTONES DE OPERACIONES
		// BOTON SUMA
		btnSuma = new JButton("+");
		btnSuma.addActionListener(al);
		btnSuma.setBounds(80, 130, 40, 40);
		contentPane.add(btnSuma);

		// BOTON RESTA
		btnResta = new JButton("-");
		btnResta.addActionListener(al);
		btnResta.setBounds(160, 130, 40, 40);
		contentPane.add(btnResta);

		// BOTON MULTIPLICACION
		btnMulti = new JButton("*");
		btnMulti.addActionListener(al);
		btnMulti.setBounds(240, 130, 40, 40);
		contentPane.add(btnMulti);

		// BOTON DIVISION
		btnDivi = new JButton("/");
		btnDivi.addActionListener(al);
		btnDivi.setBounds(320, 130, 40, 40);
		contentPane.add(btnDivi);

		JLabel lblElijeUnOperador = new JLabel("Elije un operador");
		lblElijeUnOperador.setBounds(40, 88, 200, 20);
		contentPane.add(lblElijeUnOperador);

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(al);
		btnSalir.setForeground(new Color(69, 69, 72));
		btnSalir.setBounds(179, 261, 139, 40);
		contentPane.add(btnSalir);

		btnC = new JButton("C");
		btnC.addActionListener(al);
		btnC.setBounds(400, 130, 40, 40);
		contentPane.add(btnC);

		setVisible(true);
	}

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			double num1 = 0.0;
			double num2 = 0.0;
			double res = 0.0;
			// BOTON SUMA
			if (button == btnSuma) {
				num1 = Double.valueOf(firstNum.getText());
				num2 = Double.valueOf(secondNum.getText());
				res = num1 + num2;
				result.setText("" + res);
			}
			// BOTON RESTA
			if (button == btnResta) {
				num1 = Double.valueOf(firstNum.getText());
				num2 = Double.valueOf(secondNum.getText());
				res = num1 - num2;
				result.setText("" + res);
			}
			// BOTON MULTIPLICACION
			if (button == btnMulti) {
				num1 = Double.valueOf(firstNum.getText());
				num2 = Double.valueOf(secondNum.getText());
				res = num1 * num2;
				result.setText("" + res);
			}
			// BOTON DIVISION
			if (button == btnDivi) {
				num1 = Double.valueOf(firstNum.getText());
				num2 = Double.valueOf(secondNum.getText());
				res = num1 / num2;
				result.setText("" + res);
			}
			// BOTON SALIR
			if (button == btnSalir) {
				setVisible(false);
			}
			// BOTON C
			if (button == btnC) {
				firstNum.setText("");
				secondNum.setText("");
				result.setText("");
			}
		}
	};
}
