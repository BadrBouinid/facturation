/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyHome;

import Client.DetailsClient;
import Client.ModifierClient;
import Client.NouveauClient;
import Client.SupprimerClient;
import Connection.myCon;
import Facture.Facture;
import MyHome.login;
import Produit.DetailsProduit;
import Produit.ModifierProduit;
import Produit.NouveauProduit;
import Produit.SupprimerProduit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Badr
 */
public class Accueil extends javax.swing.JFrame {
public int z=0;
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
          try {
            Connection con=myCon.getcon();
            Statement stm=con.createStatement();
            ResultSet rs1= stm.executeQuery("select count(*) from client");
               while(rs1.next()) {
                   jLabel19.setText(String.valueOf(rs1.getInt("count(*)")));
               }
              ResultSet rs2= stm.executeQuery("select count(*) from produit");
               while(rs2.next()) {
                   jLabel22.setText(String.valueOf(rs2.getInt("count(*)")));
               }
               
            
               
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete buyer.png"))); // NOI18N
        jButton5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton5ComponentShown(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 82, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        jButton6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton6ComponentShown(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update product.png"))); // NOI18N
        jButton7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton7ComponentShown(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 81, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details product.png"))); // NOI18N
        jButton8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton8ComponentShown(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 100, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete product.png"))); // NOI18N
        jButton9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton9ComponentShown(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing.png"))); // NOI18N
        jButton10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton10ComponentShown(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 75, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton11ComponentShown(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 80, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton12ComponentShown(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 81, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/control hide and show.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 77, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new buyer.png"))); // NOI18N
        jButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton2ComponentShown(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 85, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update buyer.png"))); // NOI18N
        jButton3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton3ComponentShown(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 78, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buyer Details.png"))); // NOI18N
        jButton4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton4ComponentShown(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nouv Client");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 85, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mdf Client");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 78, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Details client");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 93, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Supp Client");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 93, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nouv Produit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mdf Produit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Details Produit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supp Produit");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Facturation");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Déconnecter");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fermer App");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 90, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, 270, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Les produits");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 300, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("jLabel13");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 450, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, 300, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/target.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 270, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Les clients");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 270, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 260, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("jLabel13");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 80, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice (2).png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 146, 270, 320));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arriere.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton5ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton6.setVisible(true);
            jLabel6.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ComponentShown

    private void jButton6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton6ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton7.setVisible(true);
            jLabel7.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ComponentShown

    private void jButton7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton7ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton8.setVisible(true);
            jLabel8.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7ComponentShown

    private void jButton8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton8ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton9.setVisible(true);
            jLabel9.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ComponentShown

    private void jButton9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton9ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton10.setVisible(true);
            jLabel10.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton9ComponentShown

    private void jButton10ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton10ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton11.setVisible(true);
            jLabel11.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton10ComponentShown

    private void jButton11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton11ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton12.setVisible(true);
            jLabel12.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton11ComponentShown

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Voulez vous vraiment déconnecter","select",JOptionPane.YES_OPTION);
        if (a==0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton12ComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton12ComponentShown

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Voulez vous vraiment quitter l'application","select",JOptionPane.YES_OPTION);
        if (a==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(z==0){
            try {
                Thread.sleep(250);
                jButton2.setVisible(true);
                jLabel1.setVisible(true);
            } catch (Exception e) {
            }
        }else{
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton10.setVisible(false);
            jButton11.setVisible(false);
            jButton12.setVisible(false);
            jLabel1.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            z=0;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton3.setVisible(true);
            jLabel3.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new NouveauClient().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
       
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton3ComponentShown
        // TODO add your handling code here:

        try {
            Thread.sleep(250);
            jButton4.setVisible(true);
            jLabel4.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new ModifierClient().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton4ComponentShown
        // TODO add your handling code here:

        try {
            Thread.sleep(250);
            jButton5.setVisible(true);
            jLabel5.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton4ComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new DetailsClient().setVisible(true);
          jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new SupprimerClient().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new NouveauProduit().setVisible(true);
        jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new ModifierProduit().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new DetailsProduit().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new SupprimerProduit().setVisible(true);
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         jLabel16.setVisible(false);
         jLabel20.setVisible(false);
         jLabel15.setVisible(false);
         jLabel14.setVisible(false);
         jLabel22.setVisible(false);
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel19.setVisible(false);
         jLabel22.setVisible(false);
         jLabel22.setVisible(false);
         jSeparator2.setVisible(false);
         jSeparator4.setVisible(false);
     
        new Facture().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}