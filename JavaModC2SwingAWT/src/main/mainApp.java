/**
 * 
 */
package main;

import java.awt.EventQueue;

/**
 * @author aitor
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 ej = new Ejercicio4();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
