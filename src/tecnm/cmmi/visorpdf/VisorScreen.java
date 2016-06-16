package tecnm.cmmi.visorpdf;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.sun.pdfview.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tecnm.cmmi.db.Connect;
/**
 *
 * @author jesusgtz
 */
public class VisorScreen extends javax.swing.JFrame {
    
    PagePanel panelpdf;
    JFileChooser selector;
    PDFFile pdffile;
    int indice=0;

    /**
     * Creates new form VisorScreen
     */
    public VisorScreen(String Id) {
        super("Visualizacion de PDFs");

        try {
            panelpdf=new PagePanel();
            String path = VisorScreen.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = URLDecoder.decode(path, "UTF-8");
            /**
             * Aqui necesito:
             * Hacer la query con la string del constructor
             * Volver a generar el archivo pdf
             * Guardarlo en el sistema de archivos de la pc
             * Seleccionarlo para desplegarse en el panel
             */
            Connect conn = new Connect();
            String query = "SELECT * FROM proyectos_files WHERE Id_ProyectoFile='" + Id + "';";
            ResultSet rst = conn.Select(query);
            if (rst != null) {
                while(rst.next()) {
                    byte[]d = rst.getBytes("Data");    
                    FileOutputStream fos = new FileOutputStream("" + decodedPath +"/File.pdf");
                    fos.write(d);
                    fos.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error interno!", "Resultado vacío", JOptionPane.ERROR_MESSAGE);
            }
            
            indice=0;
            selector=new JFileChooser();
            
            selector.setSelectedFile(new File("" + decodedPath +"/File.pdf"));
            RandomAccessFile raf = new RandomAccessFile(selector.getSelectedFile(), "r");
            FileChannel channel = raf.getChannel();
            ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,0, channel.size());
            pdffile = new PDFFile(buf);
            PDFPage page = pdffile.getPage(indice);
            panelpdf.showPage(page);
            repaint();
            
            JPanel pabajo=new JPanel();
            JButton bsiguiente=new JButton("Siguiente");
            bsiguiente.addActionListener(new ActionListener(){
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    indice++;
                    PDFPage page = pdffile.getPage(indice);
                    panelpdf.showPage(page);
                }
            });
            JButton banterior=new JButton("Anterior");
            banterior.addActionListener(new ActionListener(){
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    indice--;
                    PDFPage page = pdffile.getPage(indice);
                    panelpdf.showPage(page);
                }
            });
            pabajo.add(banterior);
            pabajo.add(bsiguiente);
            add(panelpdf);
            add(pabajo,BorderLayout.SOUTH);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setBounds(0, 0, 500, 500);
            setLocationRelativeTo(null);
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VisorScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VisorScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VisorScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VisorScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
