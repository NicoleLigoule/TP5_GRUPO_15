package Principal;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;

public class Listarpeliculas extends JPanel {
    private static DefaultListModel<Pelicula> listModel;
	/**
	 * Create the panel.
	 */
	public Listarpeliculas() {
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		
		JList list = new JList();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lblPeliculas)
					.addGap(33)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(list, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(103)
							.addComponent(lblPeliculas)))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

	public static void setListModel(DefaultListModel<Pelicula> listModel) {
		Listarpeliculas.listModel = listModel;
	}
	
}
