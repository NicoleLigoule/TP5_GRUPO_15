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

public class AgregarPeliculas extends JPanel {
    private JTextField textnombre;
    private JComboBox<String> cbGenero;
    private DefaultListModel<Pelicula> listModel;

    /**
     * Create the panel.
     */
    public AgregarPeliculas() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configuraci�n de la etiqueta y campo de texto para el ID (aqu� asumo que es auto-generado)
        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(lblId, gbc);

        JLabel lblIdValue = new JLabel("Auto-Generated");
        lblIdValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gbc.gridx = 1;
        add(lblIdValue, gbc);

        // Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblNombre, gbc);

        textnombre = new JTextField(20);
        gbc.gridx = 1;
        add(textnombre, gbc);

        // G�nero
        JLabel lblGenero = new JLabel("G�nero:");
        lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblGenero, gbc);

        cbGenero = new JComboBox<>();
        cbGenero.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione un g�nero", "Terror", "Acci�n", "Suspenso", "Rom�ntica"}));
        gbc.gridx = 1;
        add(cbGenero, gbc);

        // Bot�n Aceptar
        JButton btnAceptar = new JButton("Aceptar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        add(btnAceptar, gbc);

        // Acci�n para el bot�n "Aceptar"
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textnombre.getText();
                String genero = (String) cbGenero.getSelectedItem();

                if (nombre.isEmpty() || genero.equals("Seleccione un g�nero")) {
                    System.out.println("Por favor, complete todos los campos.");
                } else {
                    // Crear un nuevo objeto Pelicula y agregarlo a listModel
                    Pelicula nuevaPelicula = new Pelicula();
                    listModel.addElement(nuevaPelicula);

                    System.out.println("Pel�cula agregada: " + nombre + " - " + genero);
                }
            }
        });
    }

    // M�todo para recibir el DefaultListModel desde Principal
    public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) {
        this.listModel = listModelRecibido;
    }
}