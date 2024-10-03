package Principal;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Principal extends JFrame {
    private JPanel contentPane;
    private static DefaultListModel<Pelicula> listModel;
    
    public Principal() {
        // Configura la ventana principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // Inicializa el contentPane
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0)); // Usamos BorderLayout para manejar el cambio de paneles
        setContentPane(contentPane); // Establece contentPane como el panel principal del JFrame

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

        MnIAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Remueve todos los componentes actuales de contentPane
                contentPane.removeAll();

                // Crea una nueva instancia de AgregarPeliculas y le pasa el listModel
                AgregarPeliculas panel = new AgregarPeliculas();
                panel.setDefaultListModel(listModel); // Pasa el DefaultListModel al panel de agregar pel�culas

                // Agrega el panel AgregarPeliculas al centro del contentPane
                contentPane.add(panel, BorderLayout.CENTER);

                // Refresca la ventana para asegurarse de que los cambios se reflejen
                contentPane.repaint();
                contentPane.revalidate();
            }
        });

        JMenuItem MnIListar = new JMenuItem("Listar");
        MnIListar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
                contentPane.removeAll();

                // Crea una nueva instancia de AgregarPeliculas y le pasa el listModel
                Listarpeliculas panel = new Listarpeliculas();
                 // Pasa el DefaultListModel al panel de agregar pel�culas
                panel.setDefaultListModel(listModel);
                // Agrega el panel AgregarPeliculas al centro del contentPane
                contentPane.add(panel, BorderLayout.CENTER);

                // Refresca la ventana para asegurarse de que los cambios se reflejen
                contentPane.repaint();
                contentPane.revalidate();
        	}
        });
        mnPeliculas.add(MnIListar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    // Inicializa el listModel
                    listModel = new DefaultListModel<Pelicula>();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}