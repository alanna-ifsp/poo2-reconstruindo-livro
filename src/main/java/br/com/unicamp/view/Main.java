/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.unicamp.view;

import br.com.unicamp.controller.Controller;
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alanna
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
    }
    private String username;
    private String password;
          
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFileName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxGroup = new javax.swing.JComboBox<>();
        Login = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        buttonAutenticar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane(){@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        }
        ;
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        labelEstadoConexao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonViewText = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar(){@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
            }};
            opcaoArquivo = new javax.swing.JMenu();
            opcaoAutentincar = new javax.swing.JMenuItem();
            opcaoSair = new javax.swing.JMenuItem();
            menuAjuda = new javax.swing.JMenu();
            opcaoAjuda = new javax.swing.JMenuItem();
            opcaoSobre = new javax.swing.JMenuItem();

            Grupo.setMinimumSize(new java.awt.Dimension(400, 400));
            Grupo.setModal(true);

            jLabel4.setText("Nome do arquivo");

            jLabel5.setText("*Informar nome do arquivo sem a extensão");

            jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
            jButton1.setText("Escolher");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
            jLabel3.setText("Escolha do Grupo");

            jLabel6.setText("Escolha o grupo que deseja visualizar o texto");

            jLabel7.setText("Grupo");

            jComboBoxGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo 1", "Grupo 2", "Grupo 3", "Grupo 4", "Grupo 5", "Grupo 6", "Grupo 7", "Grupo 8", "Grupo 9", "Grupo 10" }));

            javax.swing.GroupLayout GrupoLayout = new javax.swing.GroupLayout(Grupo.getContentPane());
            Grupo.getContentPane().setLayout(GrupoLayout);
            GrupoLayout.setHorizontalGroup(
                GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GrupoLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(GrupoLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GrupoLayout.createSequentialGroup()
                            .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(GrupoLayout.createSequentialGroup()
                                    .addComponent(jComboBoxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextFieldFileName))
                            .addGap(56, 56, 56))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrupoLayout.createSequentialGroup()
                    .addContainerGap(71, Short.MAX_VALUE)
                    .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrupoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(118, 118, 118))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrupoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrupoLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(47, 47, 47))))
            );
            GrupoLayout.setVerticalGroup(
                GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GrupoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6)
                    .addGap(37, 37, 37)
                    .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(14, 14, 14))
            );

            Login.setMinimumSize(new java.awt.Dimension(400, 400));

            jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
            jLabel2.setText("Usuário");

            jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
            jLabel8.setText("Senha");

            usernameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    usernameFieldActionPerformed(evt);
                }
            });

            buttonAutenticar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
            buttonAutenticar.setText("Autenticar");
            buttonAutenticar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonAutenticarActionPerformed(evt);
                }
            });

            jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
            jLabel9.setText("Autenticação");

            passwordField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    passwordFieldActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
            Login.getContentPane().setLayout(LoginLayout);
            LoginLayout.setHorizontalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoginLayout.createSequentialGroup()
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginLayout.createSequentialGroup()
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LoginLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(jLabel9))
                                .addGroup(LoginLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonAutenticar)
                                        .addGroup(LoginLayout.createSequentialGroup()
                                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(usernameField)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(0, 51, Short.MAX_VALUE))
                        .addGroup(LoginLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jSeparator2)))
                    .addContainerGap())
            );
            LoginLayout.setVerticalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoginLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(buttonAutenticar)
                    .addContainerGap(106, Short.MAX_VALUE))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jDesktopPane1.setBackground(new java.awt.Color(0, 0, 0));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Status da Conexão:");

            labelEstadoConexao.setBackground(new java.awt.Color(0, 0, 0));
            labelEstadoConexao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            labelEstadoConexao.setForeground(new java.awt.Color(255, 0, 0));
            labelEstadoConexao.setText("Fechada");

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);

            buttonViewText.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
            buttonViewText.setText("Mostrar Texto");
            buttonViewText.setEnabled(false);
            buttonViewText.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonViewTextActionPerformed(evt);
                }
            });

            jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(255, 255, 255));
            jLabel10.setText("Recuperendo Textos");

            jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(labelEstadoConexao, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(buttonViewText, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 33, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonViewText)
                    .addGap(75, 75, 75))
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(413, 413, 413)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelEstadoConexao)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(jLabel10)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(buttonViewText)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEstadoConexao)
                        .addComponent(jLabel1))
                    .addGap(16, 16, 16))
            );

            menu.setBackground(new java.awt.Color(0, 0, 0));

            opcaoArquivo.setForeground(new java.awt.Color(255, 255, 255));
            opcaoArquivo.setText("Arquivo");
            opcaoArquivo.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N

            opcaoAutentincar.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
            opcaoAutentincar.setText("Autenticar");
            opcaoAutentincar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    opcaoAutentincarMouseClicked(evt);
                }
            });
            opcaoAutentincar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    opcaoAutentincarActionPerformed(evt);
                }
            });
            opcaoArquivo.add(opcaoAutentincar);

            opcaoSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            opcaoSair.setText("Sair");
            opcaoSair.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    opcaoSairActionPerformed(evt);
                }
            });
            opcaoArquivo.add(opcaoSair);

            menu.add(opcaoArquivo);

            menuAjuda.setForeground(new java.awt.Color(255, 255, 255));
            menuAjuda.setText("Ajuda");
            menuAjuda.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
            menuAjuda.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuAjudaActionPerformed(evt);
                }
            });

            opcaoAjuda.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
            opcaoAjuda.setText("Ajuda");
            opcaoAjuda.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    opcaoAjudaActionPerformed(evt);
                }
            });
            menuAjuda.add(opcaoAjuda);

            opcaoSobre.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
            opcaoSobre.setText("Sobre");
            opcaoSobre.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    opcaoSobreMouseClicked(evt);
                }
            });
            opcaoSobre.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    opcaoSobreActionPerformed(evt);
                }
            });
            menuAjuda.add(opcaoSobre);

            menu.add(menuAjuda);

            setJMenuBar(menu);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void opcaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSobreActionPerformed
        // TODO add your handling code here:
        JInternalFrameAbout about = new JInternalFrameAbout();
        jDesktopPane1.add(about);
        about.show();
    }//GEN-LAST:event_opcaoSobreActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void opcaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoAjudaActionPerformed
        // TODO add your handling code here:
        JInternalFrameHelp help = new JInternalFrameHelp();
        jDesktopPane1.add(help);
        help.show();
    }//GEN-LAST:event_opcaoAjudaActionPerformed

    private void opcaoSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoSobreMouseClicked
 
    }//GEN-LAST:event_opcaoSobreMouseClicked

    private void opcaoAutentincarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoAutentincarMouseClicked

    
    }//GEN-LAST:event_opcaoAutentincarMouseClicked

    private void opcaoAutentincarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoAutentincarActionPerformed
        // TODO add your handling code here:
      Login.setVisible(true);
    }//GEN-LAST:event_opcaoAutentincarActionPerformed

    private void buttonViewTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewTextActionPerformed
        // TODO add your handling code here:
        Controller c = new Controller();
        Grupo.setVisible(true);      
    }//GEN-LAST:event_buttonViewTextActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_opcaoSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Controller c = new Controller();
        String text = null;
        try {
           c.login(username,password);
            text = String.join("\n", c.getText(jComboBoxGroup.getSelectedIndex()+1,jTextFieldFileName.getText()));
           jTextArea1.setText(text);
           Grupo.setVisible(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void buttonAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAutenticarActionPerformed
        // TODO add your handling code here:
        try
        {
            Controller c = new Controller();
            username = usernameField.getText();
            password = passwordField.getText();
            c.login(username, password);
            labelEstadoConexao.setText("Aberta");
            labelEstadoConexao.setForeground(Color.green);
            Login.setVisible(false);
            buttonViewText.setEnabled(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao tentar autenticar! Verfique o usuário e senha!");
        }

    }//GEN-LAST:event_buttonAutenticarActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Grupo;
    private javax.swing.JDialog Login;
    private javax.swing.JToggleButton buttonAutenticar;
    private javax.swing.JButton buttonViewText;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxGroup;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldFileName;
    private javax.swing.JLabel labelEstadoConexao;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem opcaoAjuda;
    private javax.swing.JMenu opcaoArquivo;
    private javax.swing.JMenuItem opcaoAutentincar;
    private javax.swing.JMenuItem opcaoSair;
    private javax.swing.JMenuItem opcaoSobre;
    private javax.swing.JFormattedTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}