package launcher;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenPdf {

	public static void drawTex(String name) {

		Desktop dk = Desktop.getDesktop();
		// Open a file
		try {
			dk.open(new File(name + ".tex"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
