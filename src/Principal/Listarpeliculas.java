package Principal;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Listarpeliculas extends JPanel {
    private static DefaultListModel<Pelicula> ListModel;
    JList list = new JList();
    
	/**
	 * Create the panel.
	 */
	public Listarpeliculas() {
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		
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

    public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) {
    	List<Pelicula> listaPeliculas = new ArrayList<>();
        for (int i = 0; i < listModelRecibido.size(); i++) {
            listaPeliculas.add(listModelRecibido.getElementAt(i));
        }


        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());    }
        });
        listModelRecibido.clear();
        for (Pelicula p : listaPeliculas) {
            listModelRecibido.addElement(p);
        }
        this.ListModel = listModelRecibido;
        list.setModel(listModelRecibido);
    }
	
}
