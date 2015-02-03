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

/**
 * This class is meant to generate the base for all possible warning in the
 * program, whichever is the message to give to the client. Creates a new popup
 * in the middle of the screen with the selected message.
 * 
 * @author Falcone Federico
 */

public class WarningFrame extends JDialog {
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
	public static void creaWarningFrame(String label, String type,
			String message) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarningFrame frame = new WarningFrame(label, type, message);
					frame.setVisible(true);
				} catch (Exception e) {
					WarningFrame.creaWarningFrame("", "ERRORE",
							"Impossibile creare la finestra.");
				}
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
	private WarningFrame(String label, String type, String message) {

		// operative settings
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setModal(true);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setBounds(100, 100, 606, 299);
		contentPane = new JPanel();
		contentPane.setToolTipText(type);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		// window title setting
		setTitle(label);

		/** close button to close the frame **/
		contentPane.setLayout(null);
		JButton close = new JButton("Chiudi");
		close.setBounds(233, 233, 141, 25);
		contentPane.add(close);

		/** WarningName contains the title of the warning **/
		warningName = new JLabel(type);
		warningName.setBounds(5, 0, 579, 69);
		warningName.setFont(new Font("Tahoma", Font.BOLD, 18));
		warningName.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(warningName);
		warningName.setHorizontalAlignment(SwingConstants.CENTER);

		JTextArea messageArea = new JTextArea();
		messageArea.setBounds(1, 1, 657, 185);
		messageArea.setEditable(false);
		messageArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		messageArea.setText(message);
		contentPane.add(messageArea);
		messageArea.setCaretPosition(0);

		JScrollPane messageScroll = new JScrollPane(messageArea);
		messageScroll.setBounds(12, 53, 572, 169);
		contentPane.add(messageScroll);

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
	}

}
