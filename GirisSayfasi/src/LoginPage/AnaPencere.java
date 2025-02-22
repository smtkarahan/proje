package LoginPage;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Info {
	private String userName;
	private String password;
	
	// yapıcı
	public Info(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// setters and getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
		
}

public class AnaPencere extends javax.swing.JFrame {
	private static ArrayList<Info> userInfos= new ArrayList<Info>();
	/**
	 * Yeni form MainWindow'u oluşturur
	 */
	public AnaPencere() {
		initComponents();
	}

	// getters and setters
	public static ArrayList<Info> getUserInfos() {
		return userInfos;
	}
	public static void setUserInfos(ArrayList<Info> userInfos) {
		AnaPencere.userInfos = userInfos;
	}
	

	/**
	 *Bu yöntem, başlangıç ​​durumuna getirmek için yapıcının içinden çağrılır.
	 * biçim. UYARI: Bu kodu DEĞİŞTİRMEYİN. Bu yöntemin içeriği
	 * her zaman Form Düzenleyici tarafından yeniden oluşturulur.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                RegisterLoginPanel = new javax.swing.JPanel();
                login = new javax.swing.JButton();
                register = new javax.swing.JButton();
                LoginPanel = new javax.swing.JPanel();
                userNamejlabel = new javax.swing.JLabel();
                userName = new javax.swing.JTextField();
                password = new javax.swing.JPasswordField();
                passwordjlabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBounds(new java.awt.Rectangle(350, 250, 0, 0));

                RegisterLoginPanel.setBackground(new java.awt.Color(204, 0, 204));

                login.setText("Login");
                login.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginActionPerformed(evt);
                        }
                });

                register.setText("Register");
                register.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registerActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout RegisterLoginPanelLayout = new javax.swing.GroupLayout(RegisterLoginPanel);
                RegisterLoginPanel.setLayout(RegisterLoginPanelLayout);
                RegisterLoginPanelLayout.setHorizontalGroup(
                        RegisterLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLoginPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                );
                RegisterLoginPanelLayout.setVerticalGroup(
                        RegisterLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegisterLoginPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(RegisterLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login)
                                        .addComponent(register))
                                .addContainerGap(38, Short.MAX_VALUE))
                );

                LoginPanel.setBackground(new java.awt.Color(102, 255, 255));

                userNamejlabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                userNamejlabel.setText("UserName");

                passwordjlabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                passwordjlabel.setText("Password");

                javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
                LoginPanel.setLayout(LoginPanelLayout);
                LoginPanelLayout.setHorizontalGroup(
                        LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNamejlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                LoginPanelLayout.setVerticalGroup(
                        LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNamejlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userName))
                                .addGap(29, 29, 29)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(78, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RegisterLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(RegisterLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
	RegisterLogin registerLogin = new RegisterLogin();
	
	registerLogin.setVisible(true);
        }//GEN-LAST:event_registerActionPerformed

        private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
	String userName = this.userName.getText();
	String password = new String (this.password.getPassword());
	
	if(this.userInfos.size() == 0 ) {
		JOptionPane.showMessageDialog(this, "There are not any registered users at all.");
	}
	
	else {
		for (Info userInfo : this.userInfos) {
			if(userInfo.getUserName().equals(userName) && userInfo.getPassword().equals(password)) {
				JOptionPane.showMessageDialog(this, "Welcome " + userName);
				return;
			}
		}
		
		JOptionPane.showMessageDialog(this, "Username or Password was wrong. Get Out!");
	}
        }//GEN-LAST:event_loginActionPerformed

	/**
	 * @param args the command line arguments
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
			java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AnaPencere().setVisible(true);
			}
		});
	}

	// Değişken bildirimi - değiştirmeyin//GEN-BEGIN:değişkenler
        private javax.swing.JPanel LoginPanel;
        private javax.swing.JPanel RegisterLoginPanel;
        private javax.swing.JButton login;
        private javax.swing.JPasswordField password;
        private javax.swing.JLabel passwordjlabel;
        private javax.swing.JButton register;
        private javax.swing.JTextField userName;
        private javax.swing.JLabel userNamejlabel;
     // Değişkenlerin sonu bildirimi//GEN-END:değişkenler
}