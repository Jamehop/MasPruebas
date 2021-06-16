package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import Model.Ambulancia;
import Model.Bomberos;
import Model.Policia;
import Model.Trabajador;
import Model.UnidadesEmergencia;
import Model.UnidadesEmergenciaBuilder;
import javafx.scene.control.TextField;

import javax.swing.JLabel;

public class DarDeAlta {

	private JFrame frame;
	private JTextField textID;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DarDeAlta window = new DarDeAlta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DarDeAlta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	Trabajador uno = new Trabajador(0, "Manolo");
	Trabajador dos = new Trabajador(1, "Pepe");
	Trabajador tres = new Trabajador(2, "Benito");
	Trabajador cuatro = new Trabajador(3, "Laura");
	Trabajador cinco = new Trabajador(4, "Victoria");
	Trabajador seis = new Trabajador(5, "Rosa");
	Trabajador siete = new Trabajador(6, "Miguel");

	// Creo las unidades de emergencias
	Ambulancia a = UnidadesEmergenciaBuilder.crearAmbulancia(1, Arrays.asList(uno, dos, tres), "Zaragoza");
	Ambulancia b = UnidadesEmergenciaBuilder.crearAmbulancia(2, Arrays.asList(uno, dos, tres), "Teruel");
	Ambulancia c = UnidadesEmergenciaBuilder.crearAmbulancia(3, Arrays.asList(uno, dos, tres), "Huesca");
	private List<Ambulancia> todasAmbulancias = new ArrayList<>();

	Bomberos d = UnidadesEmergenciaBuilder.crearBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), "Zaragoza");
	Bomberos e = UnidadesEmergenciaBuilder.crearBomberos(5, Arrays.asList(uno, dos, tres, cuatro, cinco), "Teruel");
	Bomberos f = UnidadesEmergenciaBuilder.crearBomberos(6, Arrays.asList(uno, dos, tres, cuatro, cinco), "Huesca");
	private List<Bomberos> todosBomberos=new ArrayList<>();

	Policia g = UnidadesEmergenciaBuilder.crearPolicia(7, Arrays.asList(seis, siete), "Zaragoza");
	Policia h = UnidadesEmergenciaBuilder.crearPolicia(8, Arrays.asList(tres, siete), "Teruel");
	Policia i = UnidadesEmergenciaBuilder.crearPolicia(9, Arrays.asList(cinco, siete), "Huesca");
	private List<Policia> todosPolicias=new ArrayList<>();

	private void initialize() {
		todasAmbulancias.add(a);
		todasAmbulancias.add(b);
		todasAmbulancias.add(c);
		
		todosBomberos.add(d);
		todosBomberos.add(e);
		todosBomberos.add(f);
		
		todosPolicias.add(g);
		todosPolicias.add(h);
		todosPolicias.add(i);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JRadioButton rdbtnAmbulancias = new JRadioButton("Ambulancias");
		rdbtnAmbulancias.setBounds(68, 34, 109, 23);
		frame.getContentPane().add(rdbtnAmbulancias);

		JRadioButton rdbtnPolicias = new JRadioButton("Policias");
		rdbtnPolicias.setBounds(68, 87, 109, 23);
		frame.getContentPane().add(rdbtnPolicias);

		JRadioButton rdbtnBomberos = new JRadioButton("Bomberos");
		rdbtnBomberos.setBounds(68, 140, 109, 23);
		frame.getContentPane().add(rdbtnBomberos);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnBomberos);
		buttonGroup.add(rdbtnPolicias);
		buttonGroup.add(rdbtnAmbulancias);

		textID = new JTextField();
		textID.setBounds(299, 52, 86, 20);
		frame.getContentPane().add(textID);
		textID.setColumns(10);

		textNombre = new JTextField();
		textNombre.setBounds(299, 141, 86, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);

		JLabel labelID = new JLabel("Id");
		labelID.setBounds(225, 55, 46, 14);
		frame.getContentPane().add(labelID);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(225, 144, 46, 14);
		frame.getContentPane().add(lblNombre);

		JButton btnNewButton = new JButton("Dar de alta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnAmbulancias.isSelected()) {
					int id_text = Integer.parseInt(textID.getText());
					List<Trabajador> lista = null;
					for (int i = 0; i < todasAmbulancias.size(); i++) {
						lista = todasAmbulancias.get(i).getTrabajadores();
						//lista.addAll(todasAmbulancias.get(i).getTrabajadores());
					}
					for (int x = 0; x < lista.size(); x++) {
						if (id_text == lista.get(x).getId()) {

							System.out.println(lista.get(x).getId());
							System.out.println(lista.get(x).getNombreString());
							//lista.remove(1);
						}
					}
				}
				if (rdbtnBomberos.isSelected()) {
					int id_text = Integer.parseInt(textID.getText());
					List<Trabajador> lista = null;
					for (int i = 0; i < todosBomberos.size(); i++) {
						lista = todosBomberos.get(i).getTrabajadores();

					}
					for (int x = 0; x < lista.size(); x++) {
						if (id_text == lista.get(x).getId()) {

							System.out.println(lista.get(x).getId());
							System.out.println(lista.get(x).getNombreString());
							//lista.remove(1);
						}
					}
				}
				if (rdbtnPolicias.isSelected()) {
					int id_text = Integer.parseInt(textID.getText());
					List<Trabajador> lista = null;
					for (int i = 0; i < todosPolicias.size(); i++) {
						lista = todosPolicias.get(i).getTrabajadores();

					}
					for (int x = 0; x < lista.size(); x++) {
						if (id_text == lista.get(x).getId()) {

							System.out.println(lista.get(x).getId());
							System.out.println(lista.get(x).getNombreString());
							//lista.remove(1);
						}
					}
				}

			}
		});
		btnNewButton.setBounds(161, 196, 148, 23);
		frame.getContentPane().add(btnNewButton);

	}
}
