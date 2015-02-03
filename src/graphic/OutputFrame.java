package graphic;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import launcher.OpenPdf;
import launcher.Stampa;

/**
 * 
 * Generate the basic screen for the input of the file. the user can choose if
 * give as input the code writing it on his own or select the code from a file.
 * 
 * @author Falcone Federico
 */
public class OutputFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the Frame.
	 * 
	 * @param Output
	 *            Production of the Compiler.
	 */

	public static void creaOutputFrame(String output) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutputFrame frame = new OutputFrame(output);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the elements of the Frame
	 * 
	 * @param output
	 *            Production of the compiler
	 */
	private OutputFrame(String output) {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Output");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 669, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		/** OutputField Area where is shown the production of the Compiler **/
		JTextArea OutputField = new JTextArea();
		OutputField.setEditable(false);
		OutputField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		OutputField.setText(output);
		OutputField.setBounds(58, 177, 503, 183);
		OutputField.setCaretPosition(0);
		contentPane.add(OutputField);

		/** OutputFieldScroll add a scoll at OutputField **/
		JScrollPane OutputFieldScroll = new JScrollPane(OutputField);
		OutputFieldScroll.setBounds(58, 13, 521, 344);
		contentPane.add(OutputFieldScroll);

		/**
		 * StampaSuFileButton file to close the window and save the output on a
		 * file
		 **/
		JButton StampaSuFileButton = new JButton("Chiudi e Stampa su File");
		StampaSuFileButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StampaSuFileButton.setBackground(Color.GREEN);
		StampaSuFileButton.setBounds(210, 370, 193, 42);
		contentPane.add(StampaSuFileButton);

		/**
		 * Listener on StampaSuFileButton. If mouse-clicked print on a file the
		 * output of the compiler. The location of the directory is already
		 * selected by the user in previous method.
		 */
		StampaSuFileButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {

				Stampa.stampaFileFinale(output, "ProgramOutput");

				OpenPdf.drawTex("ProgramOutput");

				try {

					Thread.sleep(6000);
					SwingUtilities.invokeLater(new Runnable() {

						@Override
						public void run() {

							try {

								// apertura automatica del file
								Desktop.getDesktop()
										.open(new File(
												"C:\\Antlr\\LatexBlockDiagrams\\ProgramOutput.pdf"));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}
					});
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispose();
			}
		});
	}
}
