/**
 * 
 */
package main;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

/**
 * @author aitor
 *
 */
public class Ejercicio3 extends JFrame {
	private JPanel contentPane;
	private JLabel horasDedicadas;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxDisegn;
	private JCheckBox chckbxAdmin;
	private ButtonGroup bgroup;
	private JSlider slider;

	// CONSTRUCTOR
	public Ejercicio3() {

		setTitle("EJERCICIO 3");
		setBounds(400, 200, 500, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// TITULO BIENVENIDA
		JLabel lblBienvenidoRespondeEstas = new JLabel("BIENVENIDO, RESPONDE ESTAS SENCILLAS PREGUNAS");
		lblBienvenidoRespondeEstas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoRespondeEstas.setBounds(23, 8, 430, 30);
		contentPane.add(lblBienvenidoRespondeEstas);

		// RADIOBUTTON - SISTEMA OPERATIVO
		JLabel sistema = new JLabel("Elige un Sistema operativo");
		sistema.setForeground(new Color(169, 25, 36));
		sistema.setBounds(150, 50, 250, 30);
		contentPane.add(sistema);

		JRadioButton rdbtnWindows = new JRadioButton("Windows", true);
		rdbtnWindows.setBounds(150, 90, 109, 30);
		contentPane.add(rdbtnWindows);

		JRadioButton rdbtnLinux = new JRadioButton("Linux", false);
		rdbtnLinux.setBounds(150, 130, 109, 30);
		contentPane.add(rdbtnLinux);

		JRadioButton rdbtnMac = new JRadioButton("Mac", false);
		rdbtnMac.setBounds(150, 170, 109, 30);
		contentPane.add(rdbtnMac);

		bgroup = new ButtonGroup();
		bgroup.add(rdbtnWindows);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMac);

		// CHECKBOX - ESPECIALIDAD
		JLabel especialidad = new JLabel("Elige tu especialidad");
		especialidad.setForeground(new Color(169, 25, 36));
		especialidad.setBounds(150, 212, 250, 30);
		contentPane.add(especialidad);

		chckbxProgramacion = new JCheckBox("Programación", true);
		chckbxProgramacion.setBounds(150, 254, 209, 30);
		contentPane.add(chckbxProgramacion);

		chckbxDisegn = new JCheckBox("Diseño gráfico", true);
		chckbxDisegn.setBounds(150, 296, 209, 30);
		contentPane.add(chckbxDisegn);

		chckbxAdmin = new JCheckBox("Administración", false);
		chckbxAdmin.setBounds(150, 338, 209, 30);
		contentPane.add(chckbxAdmin);

		// SLIDER - HORAS DEDICADAS
		horasDedicadas = new JLabel("Elige la cantidad de horas dedicadas");
		horasDedicadas.setForeground(new Color(169, 25, 36));
		horasDedicadas.setBounds(150, 390, 250, 30);
		contentPane.add(horasDedicadas);

		slider = new JSlider(0, 10);
		slider.setBounds(112, 432, 300, 44);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(2);
		slider.setMinorTickSpacing(1);

		contentPane.add(slider);

		// BOTON ENVIAR
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(al);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.setBounds(150, 544, 194, 52);
		contentPane.add(btnNewButton);

		setVisible(true);
	}

	// CHECK DEL SISTEMA OPERATIVO
	private void checkSistemaOperativo(ButtonGroup bgroup) {
		String sistema = "";
		Enumeration<AbstractButton> enumeration = bgroup.getElements();
		while (enumeration.hasMoreElements()) {
			JRadioButton rdbtn = (JRadioButton) enumeration.nextElement();
			if (rdbtn.isSelected() == true) {
				sistema = rdbtn.getText();
			}
		}
		System.out.println("Su sistema operativo es: " + sistema);
	}

	// CHECK ESPECIALIDAD
	private int checkEspecialidad(JCheckBox checkbox, int contador) {
		int count = contador;
		if (checkbox.isSelected() == true) {
			String sistema = checkbox.getText();
			System.out.println("Especialidad " + count + ": " + sistema);
			count++;
		}
		return count;

	}

	// CHECK SLIDER
	private void checkSlider(JSlider slider) {
		double res = 0.0;
		res = slider.getValue();
		System.out.println("Usted ha dedicado alrededor de: " + res);

	}

	// LISTENNERS
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int contador = 0;
			checkSistemaOperativo(bgroup);
			contador = checkEspecialidad(chckbxProgramacion, contador);
			contador = checkEspecialidad(chckbxDisegn, contador);
			contador = checkEspecialidad(chckbxAdmin, contador);
			checkSlider(slider);
		}
	};
}