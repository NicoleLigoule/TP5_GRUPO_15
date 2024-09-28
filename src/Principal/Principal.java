package Principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;


public class Principal  extends JFrame{
	public Principal() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		mnPeliculas.setHorizontalAlignment(SwingConstants.LEFT);
		mnPeliculas.setBackground(Color.WHITE);
		mnPeliculas.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnPeliculas.setForeground(Color.BLACK);
		menuBar.add(mnPeliculas);
		
		JMenuItem MnIAgregar = new JMenuItem("Agregar");
		MnIAgregar.setHorizontalAlignment(SwingConstants.LEFT);
		mnPeliculas.add(MnIAgregar);
		
		JMenuItem MnIListar = new JMenuItem("Listar");
		mnPeliculas.add(MnIListar);
		
	}

	public static void main(String[] args) {
		
		

	}
}
