package graphic;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;

import launcher.Stampa;

/**
 * This class is meant to generate the base for all possible warning in the
 * program, whichever is the message to give to the client. Creates a new popup
 * in the middle of the screen with the selected message.
 * 
 * @author Falcone Federico
 */

public class WarningErrorFrame extends JDialog {
	/** contentPane **/
	private JPanel contentPane;
	/** warningName **/
	private JLabel warningName;

	/**
	 * creaWarningFrame is a method to create a new dialog window and send a
	 * message to the user.
	 * 
	 * 
	 * @param type
	 *            Type of message to send.
	 * @param message
	 *            message to send at the user
	 */
	public static void creaWarningErrorFrame(String label, String type,
			String message) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				WarningErrorFrame error = new WarningErrorFrame(label, type,
						message);
				error.setVisible(true);

			}
		});
	}

	/**
	 * Constructor of WarningFrame, generates all the object in the frame.
	 * 
	 * @param type
	 *            type of message showed in the tooltip of the window.
	 * @param message
	 *            message to send.
	 */
	private WarningErrorFrame(String label, String type, String message) {

		String input = "";
		input = Stampa.readFile();

		// operative settings
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setModal(true);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setBounds(100, 100, 768, 534);
		contentPane = new JPanel();
		contentPane.setToolTipText(type);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		// window title setting
		setTitle(label);
		contentPane.setLayout(null);
		JButton close = new JButton("Chiudi");
		close.setBounds(82, 235, 141, 25);
		contentPane.add(close);

		/** WarningName contains the title of the warning **/
		warningName = new JLabel(type);
		warningName.setBounds(5, 0, 747, 69);
		warningName.setFont(new Font("Tahoma", Font.BOLD, 18));
		warningName.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(warningName);
		warningName.setHorizontalAlignment(SwingConstants.CENTER);

		JTextArea messageArea = new JTextArea();
		messageArea.setBounds(1, 1, 751, 170);
		messageArea.setEditable(false);
		messageArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		messageArea.setText(message);
		contentPane.add(messageArea);
		messageArea.setCaretPosition(0);

		JScrollPane messageScroll = new JScrollPane(messageArea);
		messageScroll.setBounds(15, 50, 737, 174);
		contentPane.add(messageScroll);

		JButton modificaButton = new JButton("Modifica");

		modificaButton.setBounds(521, 235, 141, 25);
		contentPane.add(modificaButton);

		JTextArea outputField = new JTextArea();
		outputField.setEditable(false);
		outputField.setText(input);
		outputField.setBounds(15, 273, 569, 170);
		contentPane.add(outputField);

		JScrollPane outputScroll = new JScrollPane(outputField);
		outputScroll.setBounds(15, 273, 737, 172);
		contentPane.add(outputScroll);

		JButton reinviaButton = new JButton("Reinvia");
		reinviaButton.setEnabled(false);

		reinviaButton.setBounds(320, 456, 97, 25);
		contentPane.add(reinviaButton);

		/** Listener on the button Close, when pressed close the window **/
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				if (type.equals("CRITICAL GRAMMAR ERROR"))
					System.exit(0);
			}
		});

		modificaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				outputField.setEditable(true);
				reinviaButton.setEnabled(true);
			}
		});

		reinviaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				if (reinviaButton.isEnabled()) {
					Stampa.stampaManuale(outputField.getText());
					dispose();
					setVisible(false);
					BrowsingFrame.startGeneration();
				}
			}
		});
	}
}
