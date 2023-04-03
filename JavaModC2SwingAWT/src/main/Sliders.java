/**
 * 
 */
package main;

import javax.swing.*;
import java.awt.*;
/**
 * @author aitor
 *
 */
public class Sliders extends JFrame{
	
	public Sliders( ) {
		setTitle("EJERCICIO 4");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Lamina_Slider milamina = new Lamina_Slider();
		add(milamina);
		setVisible(true);
	}

}

class Lamina_Slider extends JPanel {
	
	public Lamina_Slider() {
		
		JSlider control = new JSlider(0, 10);
		add(control);
	}
}
