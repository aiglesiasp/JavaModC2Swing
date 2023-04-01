/**
 * 
 */
package main;

import javax.swing.*;

/**
 * @author aitor
 *
 */
public class Ejercicio3 extends JFrame {
	private JPanel contentPane;

	// CONSTRUCTOR
	public Ejercicio3() {

		setTitle("EJERCICIO 3");
		setBounds(400, 200, 500, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		
		//RADIOBUTTON
		JLabel sistema = new JLabel("Elige un Sistema operativo");
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
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnWindows);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMac);
		
		//CHECKBOX
		JLabel especialidad = new JLabel("Elige tu especialidad");
		especialidad.setBounds(150, 250, 250, 30);
		contentPane.add(especialidad);
		
		JCheckBox chckbxOpcion1 = new JCheckBox("Programación", true);
		chckbxOpcion1.setBounds(150, 290, 209, 30);
		contentPane.add(chckbxOpcion1);
		
		JCheckBox chckbxOpcion2 = new JCheckBox("Diseño gráfico", true);
		chckbxOpcion2.setBounds(150, 330, 209, 30);
		contentPane.add(chckbxOpcion2);
		
		JCheckBox chckbxOpcion3 = new JCheckBox("Administración", false);
		chckbxOpcion3.setBounds(150, 370, 209, 30);
		contentPane.add(chckbxOpcion3);
		
		
		setVisible(true);
	}
}