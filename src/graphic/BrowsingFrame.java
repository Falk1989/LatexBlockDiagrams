package graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextArea;

import launcher.OutputGenerator;
import launcher.Stampa;
import myComponents.*;
import myProjectPackage.myTesterParser;

import java.awt.Color;
import java.util.Vector;

/**
 * @author Falcone Federico
 * 
 *         Generate the basic screen for the input of the file. the user can
 *         choose if give as input the code writing it on his own or select the
 *         code from a file.
 */

public class BrowsingFrame extends JFrame {

	/** contentPane **/
	private JPanel contentPane;
	/** BrowseField **/
	private JTextField BrowseField;
	/** PathFile **/
	public String PathFile = null;

	/**
	 * @author Falcone Federico
	 * 
	 *         Invoke the method for the frame creation
	 * 
	 * @return Close the window.
	 */

	public static void creaBrowsingFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrowsingFrame frame = new BrowsingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					WarningFrame.creaWarningFrame("", "Errore",
							"Impossibile istanziare la finestra.");
				}
			}
		});

	}

	/**
	 * @author Falcone Federico
	 * 
	 *         Constructor of the window with all his elements
	 */

	public BrowsingFrame() {

		setResizable(false);
		setTitle("Cerca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/** BrowseButton = click on it to give in input a file **/
		JRadioButton BrowseButton = new JRadioButton("Inserimento da file:");
		BrowseButton.setFont(new Font("Tahoma", Font.ITALIC, 16));
		BrowseButton.setBounds(23, 41, 227, 38);
		contentPane.add(BrowseButton);

		/** ManualButton = click on it to digit the code in the field **/
		JRadioButton ManualButton = new JRadioButton("Inserimento manuale:");
		ManualButton.setFont(new Font("Tahoma", Font.ITALIC, 16));
		ManualButton.setBounds(23, 135, 294, 25);
		contentPane.add(ManualButton);

		/** BrowseField = where to digit the Path of the selected file **/
		BrowseField = new JTextField();
		BrowseField.setText("Inserire il Path");
		BrowseField.setBounds(51, 88, 528, 38);
		contentPane.add(BrowseField);
		BrowseField.setColumns(10);

		/** ManualField = where the user can write his own code **/
		JTextArea ManualField = new JTextArea();
		ManualField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ManualField.setText("Inserire il codice");
		ManualField.setBounds(58, 177, 503, 183);
		contentPane.add(ManualField);

		/** scroller for ManualField **/
		JScrollPane ManualFieldScroll = new JScrollPane(ManualField);
		ManualFieldScroll.setBounds(58, 173, 521, 184);
		contentPane.add(ManualFieldScroll);

		/**
		 * Browse: Button to open the dialog window to search the file inside
		 * the pc
		 **/
		JButton Browse = new JButton("Browse");
		Browse.setForeground(Color.BLACK);
		Browse.setIcon(null);
		Browse.setBounds(585, 95, 97, 25);
		contentPane.add(Browse);

		/** Submit: button to send the path or the file at the parser **/
		JButton Submit = new JButton("Submit");
		Submit.setEnabled(ManualButton.isSelected()
				&& BrowseButton.isSelected());
		Submit.setBackground(new Color(60, 179, 113));
		Submit.setForeground(new Color(0, 0, 0));
		Submit.setBounds(585, 369, 97, 25);
		contentPane.add(Submit);

		JLabel lblSelezionareIlFile = new JLabel(
				"Selezionare il file da compilare:");
		lblSelezionareIlFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelezionareIlFile.setBounds(23, 0, 268, 38);
		contentPane.add(lblSelezionareIlFile);
		setLocationRelativeTo(null);

		/**
		 * Listener on BrowseButton. Only one between Browsebutton and
		 * ManualButton must be enable, can't be both switched on at the same
		 * time. Indeed enable and disable useless field on the window which
		 * should not be focussable.
		 **/

		BrowseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (BrowseButton.isSelected()) {
					ManualField.setFocusable(false);
					BrowseField.setFocusable(true);
					Browse.setEnabled(true);
					ManualButton.setSelected(false);
					Submit.setEnabled(true);
				} else {
					ManualField.setFocusable(true);
				}
			}
		});

		/**
		 * Listener on ManualButton. Only one between Browsebutton and
		 * ManualButton must be enable, can't be both switched on at the same
		 * time. Indeed enable and disable useless field on the window which
		 * should not be focussable.
		 **/
		ManualButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if (ManualButton.isSelected()) {
					ManualField.setFocusable(true);
					BrowseField.setFocusable(false);
					BrowseButton.setSelected(false);
					Browse.setEnabled(false);
					Submit.setEnabled(true);
				} else {
					BrowseField.setFocusable(true);
					Browse.setEnabled(true);
				}
			}
		});

		/**
		 * Listener on Browse button. When it's mouseClicked open a new jframe
		 * for the file-search inside the PC. ModifyBrowesButton's text with the
		 * path of the selected file.
		 **/
		Browse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BrowseButton.setSelected(true);
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogTitle("Selezionare il file:");
				chooser.setCurrentDirectory(new java.io.File("."));
				JFrame framex = new JFrame();

				if (chooser.showOpenDialog(framex) == JFileChooser.APPROVE_OPTION) {
					BrowseField.setText(chooser.getSelectedFile().getPath());
					PathFile = BrowseField.getText();
					Submit.setEnabled(true);
				}
			}
		});

		/**
		 * Listener on BrowseField. When is focussed the user can inserit
		 * manualy the path of the file he wants to parse.
		 **/
		BrowseField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				BrowseField.setText("");
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				BrowseField.setText("Inserire il path");
			}
		});
		/**
		 * Submit button Listener. When mouse-clicked checks up that a one
		 * between ManualButton or BrowseButton is enabled, so know if he has to
		 * take the path from BrowseField or the code on ManualField.
		 **/
		Submit.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				if (ManualButton.isSelected() || BrowseButton.isSelected()) {
					if (ManualButton.isSelected()) {
						Stampa.stampaManuale(ManualField.getText());
						dispose();
						setVisible(false);
						startGeneration();
					} else {
						if (PathFile != null) {
							Stampa.stampaLink(PathFile);
							dispose();
							setVisible(false);
							startGeneration();
						}
					}
				}
			}
		});

	}

	public static void startGeneration() {
		Vector<Component<?>> elements = new Vector<Component<?>>();
		String output = "";

		// far partire il compilatore
		elements = myTesterParser.compiler("progetto.file");
		if (elements != null) {
			// se ci sono elementi nella lista vuol dire che il parsin è andato
			// a buon fine quindi lancio la finestra di
			// creazione output LATEX
			output = OutputGenerator.beginGeneration(elements);
			OutputFrame.creaOutputFrame(output);
		}
	}
}