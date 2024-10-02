package Principal;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AgregarPeliculas extends JPanel {
    private JTextField textnombre;
    private JComboBox<String> cbGenero;
    private DefaultListModel<Pelicula> listModel;

    /**
     * Create the panel.
     */
    public AgregarPeliculas() {



        // Configuración de la etiqueta y campo de texto para el ID (aquí asumo que es auto-generado)
        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
       
        
        JLabel lblIdValue = new JLabel("1");
        lblIdValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        // Nombre
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        textnombre = new JTextField(20);
        
        // Género
        JLabel lblGenero = new JLabel("G\u00E9nero");
        lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));


        cbGenero = new JComboBox<>();
        cbGenero.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione un género", "Terror", "Acción", "Suspenso", "Romántica"}));


        // Botón Aceptar
        JButton btnAceptar = new JButton("Aceptar");
        
        JLabel lblId_1 = new JLabel("ID");

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(97)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblId_1)
        								.addComponent(lblGenero)
        								.addComponent(lblNombre))
        							.addGap(87)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblIdValue, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        								.addComponent(textnombre, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        								.addComponent(cbGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))))
        			.addGap(31))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(32)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblId_1)
        						.addComponent(lblIdValue))
        					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
        					.addGap(87)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNombre)
        				.addComponent(textnombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblGenero)
        				.addComponent(cbGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(btnAceptar)
        			.addGap(78))
        );
        setLayout(groupLayout);

        // Acción para el botón "Aceptar"
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textnombre.getText();
                String genero = (String) cbGenero.getSelectedItem();

                if (nombre.isEmpty() || genero.equals("Seleccione un género")) {
                    System.out.println("Por favor, complete todos los campos.");
                } else {
                    // Crear un nuevo objeto Pelicula y agregarlo a listModel
                	Genero textoSeleccionado= new Genero() ;
                	Pelicula peli= new Pelicula();
                	peli.setGenero(textoSeleccionado);
                	peli.setNombre(textnombre.getText());
                    listModel.addElement(peli);
                    int id=peli.getId()+1;
                    lblIdValue.setText(""+id);
                    System.out.println("Película agregada: " + nombre + " - " + genero);
                }
            }
        });
    }

    // Método para recibir el DefaultListModel desde Principal
    public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) {
        this.listModel = listModelRecibido;
    }
}