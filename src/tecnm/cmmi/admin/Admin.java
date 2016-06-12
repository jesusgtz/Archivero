package tecnm.cmmi.admin;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cdcarlos
 */
public class Admin extends javax.swing.JFrame {
	
	private int idUser;
	private String matricula;
	private String correo;
	private String nombre;
	
	private int idProyecto;

	/**
	 * Admin form
	 * Recibe como parametro los datos del usuario logueado.
	 * @param id
	 * @param matricula
	 * @param correo
	 * @param nombre
	 */
	public Admin(int id, String matricula, String correo, String nombre) {
		this.idUser = id;
		this.matricula = matricula;
		this.correo = correo;
		this.nombre = nombre;
		
		this.idProyecto = 0;
		
		this.setTitle("Panel de Administración");
		initComponents();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.nombre_lbl.setText(this.nombre);
		this.matricula_lbl.setText(this.matricula);
		this.correo_lbl.setText(this.correo);
		
		this.loadRegisters();
	}

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        matricula_lbl = new javax.swing.JLabel();
        correo_lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        resumeProyecto_txt = new javax.swing.JTextField();
        visualizar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        agregar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProyectosUsuarios_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Correo:");

        nombre_lbl.setText("jLabel4");

        matricula_lbl.setText("jLabel5");

        correo_lbl.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_lbl)
                    .addComponent(matricula_lbl)
                    .addComponent(correo_lbl))
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricula_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correo_lbl))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel4.setText("Proyecto:");
        jPanel2.add(jLabel4);

        resumeProyecto_txt.setFont(new java.awt.Font("Droid Sans Mono", 0, 13)); // NOI18N
        resumeProyecto_txt.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(resumeProyecto_txt);

        visualizar_btn.setText("Visualizar");
        jPanel2.add(visualizar_btn);

        eliminar_btn.setText("Eliminar");
        jPanel2.add(eliminar_btn);

        agregar_btn.setText("Agregar");
        jPanel2.add(agregar_btn);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        listaProyectosUsuarios_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaProyectosUsuarios_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaProyectosUsuarios_tbl);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Admin(1, "1234567890", "daniel.carlos.sc@itszapopan.edu.mx", "Carlos Carlos Daniel").setVisible(true);
			}
		});
	}
	
	private void loadRegisters() {
		DefaultTableModel tableModel = new DefaultTableModel();
		this.listaProyectosUsuarios_tbl.setModel(tableModel);
		
		String columns[] = {"Matricula", "Estudiante", "Proyecto", "ID", "Fecha"};
		for (int i = 0, n = columns.length; i < n; i++)
				tableModel.addColumn(columns[i]);
		
		Object row[] = new Object[5];
		row[0] = "1234567890";
		row[1] = "Carlos Carlos Daniel";
		row[2] = "Sistema de Tutorias";
		row[3] = "12";
		row[4] = "24/06/1991";
		
		tableModel.addRow(row);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JLabel correo_lbl;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaProyectosUsuarios_tbl;
    private javax.swing.JLabel matricula_lbl;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField resumeProyecto_txt;
    private javax.swing.JButton visualizar_btn;
    // End of variables declaration//GEN-END:variables
}
