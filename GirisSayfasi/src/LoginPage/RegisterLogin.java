package LoginPage;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegisterLogin extends javax.swing.JFrame {

	/**
	 *Yeni form oluşturur RegisterLogin
	 */
	public RegisterLogin() {
		initComponents();
	}

	/**
	 * Bu yöntem, başlangıç ​​durumuna getirmek için yapıcının içinden çağrılır.
	 * biçim. UYARI: Bu kodu DEĞİŞTİRMEYİN. Bu yöntemin içeriği
	 * her zaman Form Düzenleyici tarafından yeniden oluşturulur.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                userName = new javax.swing.JTextField();
                register = new javax.swing.JButton();
                password = new javax.swing.JPasswordField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBounds(new java.awt.Rectangle(400, 250, 0, 0));

                jPanel1.setBackground(new java.awt.Color(204, 204, 255));

                jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel1.setText("UserName");

                jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel2.setText("Password");

                register.setText("Register");
                register.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registerActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(124, 124, 124)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                                        .addComponent(password))
                                                .addContainerGap(139, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(register)
                                                .addGap(139, 139, 139))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(register)
                                .addGap(45, 45, 45))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
	String userName = this.userName.getText();
	String password = new String (this.password.getPassword());
	
	if(userName.equals("") || password.equals("")) {
		JOptionPane.showMessageDialog(this, "Username or Password was empty.");
		this.setVisible(false);
	}
	else {
		ArrayList<Info> userInfos = AnaPencere.getUserInfos();
		userInfos.add(new Info(userName, password));
		JOptionPane.showMessageDialog(this, "Registration was successful.");
		this.setVisible(false);
	}
        }//GEN-LAST:event_registerActionPerformed

        /**
    	 * @param komut satırı argümanlarını tartışır
    	 */
	public static void main(String args[]) {
		/* Nimbus görünümünü ve hissini ayarlayın */
		//<editor-fold defaultstate = "collapsed" desc = Görünüm ve his ayar kodu (isteğe bağlı) ">
		/* Nimbus (Java SE 6'da tanıtıldı) mevcut değilse, varsayılan görünüm ve hisle kalın.
         * Ayrıntılar için bkz. http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(RegisterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(RegisterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(RegisterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(RegisterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Formu oluşturun ve görüntüleyin */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegisterLogin().setVisible(true);
			}
		});
	}

        // Değişken bildirimi - değiştirme//GEN-BEGIN:değişkenler
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField password;
        private javax.swing.JButton register;
        private javax.swing.JTextField userName;
        // Değişkenlerin sonu bildirimi//GEN-END:değişkenler
}