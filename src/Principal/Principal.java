package Principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;


public class Principal  extends JFrame{
	public Principal() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		mnPeliculas.setBackground(Color.WHITE);
		mnPeliculas.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnPeliculas.setForeground(Color.BLACK);
		menuBar.add(mnPeliculas);
	}

	public static void main(String[] args) {
		
		

	}
}
