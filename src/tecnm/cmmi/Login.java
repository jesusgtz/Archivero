package tecnm.cmmi;

import java.sql.ResultSet;
import java.sql.SQLException;
import tecnm.cmmi.usuario.Usuario;
import tecnm.cmmi.admin.Admin;
import tecnm.cmmi.db.Connect;

public class Login extends javax.swing.JFrame {

	/**
	 * Creates new form Login
	 */
	public Login() {
		this.setTitle("Inicio de Sesión");
		initComponents();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        matricula_txt = new javax.swing.JTextField();
        error_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entrar_btn.setText("Entrar");
        entrar_btn.setToolTipText("Acceder al sistema");
        entrar_btn.setPreferredSize(new java.awt.Dimension(69, 44));
        entrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_btn, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("  Login");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("Email");

        email_txt.setText("daniel.carlos.sc@itszapopan.edu.mx");
        email_txt.setToolTipText("Ingresa tu email");

        jLabel3.setText("Matricula");

        matricula_txt.setText("12345678");
        matricula_txt.setToolTipText("Ingresa tu password");

        error_lbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        error_lbl.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matricula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(error_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matricula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(error_lbl)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_btnActionPerformed
        
		try {
			Connect conn = new Connect();
			String query = "SELECT Id_Usuario, Matricula, Correo, Nombre, Apellidos, Tipo FROM Usuarios WHERE Correo='"+ this.email_txt.getText() +"' AND Matricula='"+ this.matricula_txt.getText() +"';";
			ResultSet rst = conn.Select(query);
			if (rst != null) {
				boolean empty = true;
				while(rst.next()) {
					empty = false;
					
					int id = rst.getInt("Id_Usuario");
					String matricula = rst.getString("Matricula");
					String correo = rst.getString("Correo");
					String nombre = rst.getString("Nombre") + rst.getString("Apellidos");
					query = rst.getString("Tipo");
					
					if("ADMIN".equals(query)) {
						new Admin(id, matricula, correo, nombre).setVisible(true);
						this.dispose();
					}
					else {
						new Usuario(id, matricula, correo, nombre).setVisible(true);
						this.dispose();
					}
				}
				
				if(empty) this.error_lbl.setText("Error: Usuario y/o contraseña no coinciden.");
				else this.error_lbl.setText("");
			} else {
				this.error_lbl.setText("Error: Ocurrio un error interno.");
			}
		} catch (SQLException ex) {
			System.out.println("Error en Login: "+ ex.getMessage());
		}
    }//GEN-LAST:event_entrar_btnActionPerformed

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
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton entrar_btn;
    private javax.swing.JLabel error_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matricula_txt;
    // End of variables declaration//GEN-END:variables
}
