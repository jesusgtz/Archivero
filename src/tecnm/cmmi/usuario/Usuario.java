package tecnm.cmmi.usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import tecnm.cmmi.visorpdf.VisorScreen;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tecnm.cmmi.db.Connect;
import tecnm.cmmi.agregar.Agregar;

/**
 *
 * @author cdcarlos
 */
public class Usuario extends javax.swing.JFrame {
	
	private int idUser;
	private String matricula;
	private String correo;
	private String nombre;
	
	private int idUserReg;
	private int idProyecto;
	
	private final String COLUMNS[] = {"IDP", "Proyecto", "Fecha"};
	private DefaultTableModel tableModel;

	/**
	 * Usuario form
	 * Recibe como parametro los datos del usuario logueado.
	 * @param id
	 * @param matricula
	 * @param correo
	 * @param nombre
	 */
	public Usuario(int id, String matricula, String correo, String nombre) {
		this.idUser = id;
		this.matricula = matricula;
		this.correo = correo;
		this.nombre = nombre;
		
		this.idUserReg = -1;
		this.idProyecto = -1;
		
		this.setTitle("Panel de Usuario");
		initComponents();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.nombre_lbl.setText(this.nombre);
		this.matricula_lbl.setText(this.matricula);
		this.correo_lbl.setText(this.correo);
		
		this.setHeader();
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
        cargarProyectos_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        resumeProyecto_txt = new javax.swing.JTextField();
        visualizar_btn = new javax.swing.JButton();
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

        cargarProyectos_btn.setText("Cargar Proyectos");
        cargarProyectos_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cargarProyectos_btnMouseReleased(evt);
            }
        });

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_lbl)
                            .addComponent(correo_lbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(matricula_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                        .addComponent(cargarProyectos_btn)
                        .addGap(39, 39, 39))))
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
                    .addComponent(matricula_lbl)
                    .addComponent(cargarProyectos_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correo_lbl))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel4.setText("Proyecto:");
        jPanel2.add(jLabel4);

        resumeProyecto_txt.setEditable(false);
        resumeProyecto_txt.setFont(new java.awt.Font("Droid Sans Mono", 0, 13)); // NOI18N
        resumeProyecto_txt.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(resumeProyecto_txt);

        visualizar_btn.setText("Visualizar");
        visualizar_btn.setEnabled(false);
        visualizar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visualizar_btnMouseReleased(evt);
            }
        });
        jPanel2.add(visualizar_btn);

        agregar_btn.setText("Agregar");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        jPanel2.add(agregar_btn);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        listaProyectosUsuarios_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaProyectosUsuarios_tbl.getTableHeader().setReorderingAllowed(false);
        listaProyectosUsuarios_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaProyectosUsuarios_tblMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaProyectosUsuarios_tbl);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaProyectosUsuarios_tblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProyectosUsuarios_tblMouseReleased
        int row = this.listaProyectosUsuarios_tbl.getSelectedRow();
        this.idProyecto = Integer.parseInt((String)this.listaProyectosUsuarios_tbl.getValueAt(row, 0));
        String nomProyecto = (String) this.listaProyectosUsuarios_tbl.getValueAt(row, 1);

        this.resumeProyecto_txt.setText("["+ this.idProyecto +"] - "+ nomProyecto);
        this.visualizar_btn.setEnabled(true);
    }//GEN-LAST:event_listaProyectosUsuarios_tblMouseReleased

    private void cargarProyectos_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarProyectos_btnMouseReleased
        this.loadRegisters();
    }//GEN-LAST:event_cargarProyectos_btnMouseReleased

    private void visualizar_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizar_btnMouseReleased
        if(this.idProyecto != -1) {
                        String foo = String.valueOf(this.idProyecto);
                        System.out.println(foo+"fdfdsfsd");
                        VisorScreen visor = new VisorScreen(foo);
			JOptionPane.showMessageDialog(this, "Visualizar PDF [ID: "+ this.idProyecto +"]", "Visualización de Proyectos", JOptionPane.INFORMATION_MESSAGE);
		}
    }//GEN-LAST:event_visualizar_btnMouseReleased

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        Agregar add = new Agregar();
        add.setVisible(true);
    }//GEN-LAST:event_agregar_btnActionPerformed

	
	private void setHeader() {
            this.tableModel = new DefaultTableModel();
            this.listaProyectosUsuarios_tbl.setModel(tableModel);

            for (int i = 0, n = this.COLUMNS.length; i < n; i++)
                    this.tableModel.addColumn(this.COLUMNS[i]);

            this.listaProyectosUsuarios_tbl.getColumn(this.tableModel.getColumnName(0)).setMaxWidth(180);
            this.listaProyectosUsuarios_tbl.getColumn(this.tableModel.getColumnName(2)).setMaxWidth(150);
	}
	
	private void clearTable(int totalRegs) {
            while(totalRegs-- > 0) this.tableModel.removeRow(0);
	}
	
	private void loadRegisters() {
		try {
			Connect conn = new Connect();
			
			String query = "SELECT "
                                + "Proyectos.Id_Proyecto as idProyecto,"
                                + "Proyectos.Nombre AS pNombre,"
                                + "Proyectos.Fecha "
                                + "FROM Proyectos "
                            + "WHERE Proyectos.Id_Usuario="+ this.idUser;
			
			ResultSet rst = conn.Select(query);
			if(rst != null) {
				
				this.idUserReg = -1;
				this.idProyecto = -1;
				
				int n = this.tableModel.getRowCount(); // registros que se muestran actualmente
				if(n > 0) this.clearTable(n);
				
				this.resumeProyecto_txt.setText("");
				this.visualizar_btn.setEnabled(false);
				//this.eliminar_btn.setEnabled(false);
				
				boolean vacio = true;
				while(rst.next()) {
					vacio = false;
					String[] row = new String[this.COLUMNS.length];
					row[0] = rst.getString("idProyecto");
					row[1] = rst.getString("pNombre");
					row[2] = rst.getString("Fecha");
					//row[4] = rst.getString("Fecha");
					
					this.tableModel.addRow(row);
				}
				
				if(vacio) {
					this.resumeProyecto_txt.setText("");
					this.visualizar_btn.setEnabled(false);
					//this.eliminar_btn.setEnabled(false);
                                        JOptionPane.showMessageDialog(null, "\nNo existen proyectos para mostrar.", "Lista de Proyectos", JOptionPane.QUESTION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Imposible recuperar lista de proyectos", "Lista de Proyectos", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException ex) {
			JOptionPane.showInternalMessageDialog(this, "Imposible cargar los proyectos.", "Cargar Proyectos", JOptionPane.ERROR_MESSAGE);
		}
	}
		
	
	
	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		/* Set the Nimbus look and feel */
//		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
//		//</editor-fold>
//
//		/* Create and display the form */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//                           
//			 new Usuario(3, "1234567890", "daniel.carlos.sc@itszapopan.edu.mx", "Carlos Carlos Daniel").setVisible(true);
//                                
//			}
//		});
//	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JButton cargarProyectos_btn;
    private javax.swing.JLabel correo_lbl;
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
