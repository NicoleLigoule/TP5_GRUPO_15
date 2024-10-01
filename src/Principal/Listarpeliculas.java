package Principal;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class Listarpeliculas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Listarpeliculas() {
		setLayout(new BorderLayout(0, 0));
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		add(editorPane, BorderLayout.CENTER);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		add(lblPeliculas, BorderLayout.WEST);

	}

}
