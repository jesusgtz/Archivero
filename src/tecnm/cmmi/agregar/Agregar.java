package tecnm.cmmi.agregar;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import tecnm.cmmi.db.Connect;

/**
 *
 * @author FRK
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputNameProyect = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputDate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        bntLoad = new javax.swing.JButton();
        inputFileName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agregar un archivo o proyecto");

        jLabel2.setText("Ingresa el nombre del proyecto");

        jLabel3.setText("Ingresa tu nombre completo");

        jLabel4.setText("Ingresa tu matricula");

        jLabel5.setText("Fecha");

        btnBack.setBackground(new java.awt.Color(255, 0, 51));
        btnBack.setText("Volver");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        bntLoad.setText("Cargar");
        bntLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bntLoadMousePressed(evt);
            }
        });

        inputFileName.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(inputNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(inputUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bntLoad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputFileName))
                                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(148, 148, 148)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntLoad)
                            .addComponent(inputFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntLoadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLoadMousePressed
        try
        {
            /**llamamos el metodo que permite cargar la ventana*/
            if(!inputMatricula.getText().isEmpty() && !inputNameProyect.getText().isEmpty() && !inputUserName.getText().isEmpty() && !inputDate.getText().isEmpty()){
                JFileChooser file= new JFileChooser();
                file.showSaveDialog(this);
               /**abrimos el archivo seleccionado*/
               File pdf = file.getSelectedFile();
               if(pdf.getName().contains("pdf")){
                    inputFileName.setText(pdf.getName());
                    FileInputStream fis = new FileInputStream(pdf);
                    byte[] bFile = new byte[(int) pdf.length()];     
                    try {
                        //convert file into array of bytes
                        fis.read(bFile);
                        fis.close();
                    }catch(Exception e){
                            e.printStackTrace();
                    }
                    Connect conn = new Connect();
                    String query = "SELECT Id_Usuario FROM Usuarios WHERE Matricula='"+inputMatricula.getText() +"';";
                    ResultSet rst = conn.Select(query);
                    int userId = -1;
                    if (rst != null) {
                            boolean empty = true;
                            while(rst.next()) {
                                    empty = false;
                                    userId = Integer.parseInt(rst.getString("Id_Usuario"));
                            }
                            if(empty)JOptionPane.showMessageDialog(rootPane, "No existe la Matricula seleccionada");
                    }
                    int proyectId = -1;
                    if(userId != -1){
                        String filename = this.inputNameProyect.getText();
                        query = "INSERT INTO Proyectos (Id_Usuario, Nombre, Fecha) VALUES("+userId+",'"+filename+"','"+inputDate.getText()+"')";
                        System.out.println(query);
                        if(!conn.Query(query)){
                            query = "SELECT Id_Proyecto FROM Proyectos WHERE Nombre='"+filename+"' and Fecha='"+inputDate.getText()+"' and id_Usuario="+userId+";";
                             System.out.println(query);
                            rst = conn.Select(query);
                            if (rst != null) {
				while(rst.next()) {
					proyectId = Integer.parseInt(rst.getString("Id_Proyecto"));
				}                              
                            }
                        }else JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error en el guardado!");

                    }
                    if(proyectId != -1){
                        try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection insert = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ "DBCMMI_FINAL", "root", "");
							query = "INSERT INTO Proyectos_Files (Id_ProyectoFile, Id_Proyecto, MimeType, Data ) VALUES(NULL, ?, 'aplication/pdf', ?)";
							PreparedStatement pstmt = insert.prepareStatement(query);
							pstmt.setInt(1, proyectId);
							pstmt.setBytes(2, bFile);
							pstmt.execute();
							
                            JOptionPane.showMessageDialog(rootPane, "Archivo guardado correctamente");
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        } 
                    }
                   //Add file to SQL
               }else  JOptionPane.showMessageDialog(rootPane, "Extension de Archivo no compatible");
           }else {
                JOptionPane.showMessageDialog(rootPane, "No debe existir campos vacios para cargar el archivo");
            }
         }
         catch(Exception ex)
         {
           JOptionPane.showMessageDialog(rootPane,
                    ex.getMessage(),
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          }
    }//GEN-LAST:event_bntLoadMousePressed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
            this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLoad;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputFileName;
    private javax.swing.JTextField inputMatricula;
    private javax.swing.JTextField inputNameProyect;
    private javax.swing.JTextField inputUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
