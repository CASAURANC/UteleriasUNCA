package guardarLogs;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class GuardarLogs {

	public GuardarLogs() {
		
	}
	public void iniciarLogs(Logger logger){
	       //String ruta ="\\\\SRVRAULASVIRT\\Miguel\\LOGS\\Logs.log";
		   String ruta="C:\\Logs.log";
	       try {
	       FileHandler handler = new FileHandler(ruta,true);
	       logger.addHandler(handler);
	       } catch (IOException e) {
	           JOptionPane.showMessageDialog(null,"Error al guardar log" + e);
	       }
	      
	   }
}
