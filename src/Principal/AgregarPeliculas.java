package Principal;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class AgregarPeliculas extends JPanel {
	private JTextField textnombre;
	private JComboBox<String> cbGenero;

	/**
	 * Create the panel.
	 */
	public AgregarPeliculas() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(74dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblId = new JLabel("ID");
		add(lblId, "4, 4");
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, "8, 4");
		
		JLabel lblNombre = new JLabel("Nombre");
		add(lblNombre, "4, 8");
		
		textnombre = new JTextField();
		add(textnombre, "8, 8, fill, default");
		textnombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		add(lblGenero, "4, 12");
		
		cbGenero = new JComboBox<String>();
		cbGenero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un género", "Terror", "Acción", "Suspenso", "Romántica"}));
		add(cbGenero, "8, 12, fill, default");

		
		JButton btnAceptar = new JButton("Aceptar");
		add(btnAceptar, "4, 14");

	}
}
