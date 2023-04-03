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

	public Ejercicio4() {

		setTitle("EJERCICIO 4");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//NUMERO 1
		JLabel primerNumero = new JLabel("Introduce el primer numero: ");
		primerNumero.setBounds(40, 20, 200, 20);
		contentPane.add(primerNumero);

		firstNum = new JTextField();
		firstNum.setBounds(300, 20, 100, 20);
		contentPane.add(firstNum);

		//NUMERO 2
		JLabel segundoNumero = new JLabel("Introduce el segundo numero: ");
		segundoNumero.setBounds(40, 50, 200, 20);
		contentPane.add(segundoNumero);

		secondNum = new JTextField();
		secondNum.setBounds(300, 50, 100, 20);
		contentPane.add(secondNum);

		//RESULTADO
		JLabel resultado = new JLabel("El resultado es : ");
		resultado.setBounds(40, 180, 200, 20);
		contentPane.add(resultado);

		result = new JTextField();
		result.setBounds(193, 180, 269, 20);
		contentPane.add(result);

		//BOTONES DE OPERACIONES
		//BOTON SUMA
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(firstNum.getText());
				double num2 = Double.valueOf(secondNum.getText());
				double res = num1 + num2;
				result.setText(""+res);
			}
		});
		btnSuma.setBounds(80, 130, 40, 40);
		contentPane.add(btnSuma);
		
		//BOTON RESTA
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(firstNum.getText());
				double num2 = Double.valueOf(secondNum.getText());
				double res = num1 - num2;
				result.setText(""+res);
				
			}
		});
		btnResta.setBounds(160, 130, 40, 40);
		contentPane.add(btnResta);
		
		//BOTON MULTIPLICACION
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(firstNum.getText());
				double num2 = Double.valueOf(secondNum.getText());
				double res = num1 * num2;
				result.setText(""+res);
			}
		});
		btnMulti.setBounds(240, 130, 40, 40);
		contentPane.add(btnMulti);
		
		//BOTON DIVISION
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(firstNum.getText());
				double num2 = Double.valueOf(secondNum.getText());
				double res = num1 / num2;
				result.setText(""+res);
			}
		});
		btnDivi.setBounds(320, 130, 40, 40);
		contentPane.add(btnDivi);
		
		
		JLabel lblElijeUnOperador = new JLabel("Elije un operador");
		lblElijeUnOperador.setBounds(40, 88, 200, 20);
		contentPane.add(lblElijeUnOperador);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setForeground(new Color(69, 69, 72));
		btnSalir.setBounds(179, 261, 139, 40);
		contentPane.add(btnSalir);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum.setText("");
				secondNum.setText("");
				result.setText("");
			}
		});
		btnC.setBounds(400, 130, 40, 40);
		contentPane.add(btnC);
		
		
		

		setVisible(true);
	}
}
