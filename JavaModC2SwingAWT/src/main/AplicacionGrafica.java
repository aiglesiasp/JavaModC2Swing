/**
 * 
 */
package main;

import javax.swing.*;

/**
 * @author aitor
 *
 */
public class AplicacionGrafica extends JFrame {
	
	//PANEL DE APLICACION
	private JPanel contentPane;
	
	//CONSTRUCTOR
	public AplicacionGrafica() {
		
		//----------------------VENTANA----------------------------------
		setTitle("Titulo de la ventana"); //Añado titulo de ventana
		setBounds(400, 200, 1500, 1000); //Añado posicion, x e y, y tamaño, anchura y altura
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Se cierra aplicacion cuando cerramos ventana
		//setVisible(true); //Hago ventana visible
		//---------------------------------------------------------------
		
		
		//----------------------PANEL----------------------------------
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//---------------------------------------------------------------
		
		
		//----------------------COMPONENETES----------------------------------
		
		//----------------------ETIQUETA----------------------------------
		JLabel etiqueta = new JLabel("Primera Etiqueta JLabel");
		etiqueta.setBounds(60, 20, 100, 20);
		contentPane.add(etiqueta);
		//---------------------------------------------------------------
		
		
		//----------------------TEXTO----------------------------------
		JTextField textField = new JTextField();
		textField.setBounds(43, 67, 86, 26);
		contentPane.add(textField);
		//---------------------------------------------------------------
		
		
		//----------------------BOTON----------------------------------
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(43, 133, 89, 23);
		contentPane.add(btnAceptar);
		//---------------------------------------------------------------
		
		
		//----------------------RADIOBUTTON----------------------------------
		JRadioButton rdbtnOpcion1 = new JRadioButton("Opcion 1", true);
		rdbtnOpcion1.setBounds(43, 194, 109, 23);
		contentPane.add(rdbtnOpcion1);
		
		JRadioButton rdbtnOpcion2 = new JRadioButton("Opcion 2", false);
		rdbtnOpcion2.setBounds(43, 220, 109, 23);
		contentPane.add(rdbtnOpcion2);
		
		JRadioButton rdbtnOpcion3 = new JRadioButton("Opcion 3", false);
		rdbtnOpcion3.setBounds(43, 246, 109, 23);
		contentPane.add(rdbtnOpcion3);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnOpcion1);
		bgroup.add(rdbtnOpcion2);
		bgroup.add(rdbtnOpcion3);
		//---------------------------------------------------------------
		
		
		//----------------------CHECKBOX----------------------------------
		JCheckBox chckbxOpcion1 = new JCheckBox("Opcion 1", true);
		chckbxOpcion1.setBounds(43, 305, 97, 23);
		contentPane.add(chckbxOpcion1);
		
		JCheckBox chckbxOpcion2 = new JCheckBox("Opcion 2", true);
		chckbxOpcion2.setBounds(43, 325, 97, 23);
		contentPane.add(chckbxOpcion2);
		
		JCheckBox chckbxOpcion3 = new JCheckBox("Opcion 3", false);
		chckbxOpcion3.setBounds(43, 345, 97, 23);
		contentPane.add(chckbxOpcion3);
		//---------------------------------------------------------------
		
		//----------------------TEXTAREA----------------------------------
		JTextArea textArea = new JTextArea("esto es un text area");
		textArea.setBounds(189, 18, 141, 117);
		//textArea.setLineWrap(true); //Me corta la palabra y baja
		textArea.setWrapStyleWord(true); //Me baja la palabra entera al terminar
		contentPane.add(textArea);
		
		//Añadimos SCROLL
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(189, 18, 141, 117);
		contentPane.add(scroll);
		//---------------------------------------------------------------
		
		
		//----------------------PASSWORD---------------------------------
		JPasswordField pwd = new JPasswordField("aitor");
		pwd.setBounds(189, 171, 139, 20);
		contentPane.add(pwd);
		//---------------------------------------------------------------
		
		
		//----------------------MENU SELECCION---------------------------
		JComboBox comboBox = new JComboBox<>();
		comboBox.setBounds(189, 221, 141, 22);
		contentPane.add(comboBox);
		
		comboBox.addItem("Fernando");
		comboBox.addItem("Alberto");
		comboBox.addItem("Arturo");
		//---------------------------------------------------------------
		
		
		//----------------------TOGGLEBUTTON---------------------------
		JToggleButton tglbtnBoton = new JToggleButton("Interruptor", true);
		tglbtnBoton.setBounds(189, 291, 121, 23);
		contentPane.add(tglbtnBoton);
		
		//------------------------------------------------------------
		
		
		//----------------------SPINNER(CONTADOR)------------------------
		JSpinner spinner = new JSpinner();
		spinner.setBounds(371, 20, 34, 20);
		contentPane.add(spinner);
		//---------------------------------------------------------------
		
		
		//----------------------LISTA------------------------------------
		String pelis[] = {"Star Wars: la vengaza de los siths", "Revolution", "007: Todo o Nada"};
		JList list = new JList<>(pelis);
		list.setBounds(371, 72, 86, 80);
		contentPane.add(list);
		
		//Añadimos SCROLL
		JScrollPane scrollList = new JScrollPane(list);
		scrollList.setBounds(371, 72, 86, 80);
		contentPane.add(scrollList);
		//---------------------------------------------------------------
		
		//----------------------MENU BARRA ARRIBA------------------------
		//Creo la barra
		JMenuBar barraMenu = new JMenuBar();
		//Creo componenetes de la barra
		JMenu ejercicio1 = new JMenu("Ejercicio 1");
		JMenu ejercicio2 = new JMenu("Ejercicio 2");
		JMenu ejercicio3 = new JMenu("Ejercicio 3");
		barraMenu.add(ejercicio1);
		barraMenu.add(ejercicio2);
		barraMenu.add(ejercicio3);
		//Creo items de cada compoenete
		JMenuItem abrir = new JMenuItem("Abrir");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem cargar = new JMenuItem("Cargar");
		JMenuItem salir = new JMenuItem("Salir");
		
		ejercicio1.add(abrir);
		ejercicio1.add(guardar);
		ejercicio2.add(cargar);
		ejercicio2.add(salir);
		
		setJMenuBar(barraMenu);
		//---------------------------------------------------------------
		
		
		
		
		
		setVisible(true); //Hago ventana visible
	}
	
	

}
