/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package winecatalog.frames;
import helpers.TableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import winecatalog.object.WineObject;

/**
 *
 * @author wans8
 */
public class HomeFrame extends javax.swing.JFrame {

    public Color clicked = new Color(201, 51, 58, 255);
    public Color stock = new Color(176, 0, 29, 255);
    public int menuItem = 0; 
    public List<WineObject> list = new ArrayList<>();
     /** Creates new form HomeFrame */
    public HomeFrame() {
        initComponents();
        customInit();
        }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        basic = new javax.swing.JPanel();
        sidemenu = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        all_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        red_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        white_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rose_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        shamp_panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tablepanel = new javax.swing.JPanel();
        headpanel = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        head_title = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        basic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidemenu.setBackground(new java.awt.Color(176, 0, 29));
        sidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_focus(evt);
            }
        });
        sidemenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/head2.png"))); // NOI18N
        sidemenu.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        all_panel.setBackground(new java.awt.Color(176, 0, 29));
        all_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_panelMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Menu_24px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Все");

        javax.swing.GroupLayout all_panelLayout = new javax.swing.GroupLayout(all_panel);
        all_panel.setLayout(all_panelLayout);
        all_panelLayout.setHorizontalGroup(
            all_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_panelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        all_panelLayout.setVerticalGroup(
            all_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidemenu.add(all_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 360, 80));

        red_panel.setBackground(new java.awt.Color(176, 0, 29));
        red_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                red_panelMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Bar_24px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Красное вино");

        javax.swing.GroupLayout red_panelLayout = new javax.swing.GroupLayout(red_panel);
        red_panel.setLayout(red_panelLayout);
        red_panelLayout.setHorizontalGroup(
            red_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(red_panelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        red_panelLayout.setVerticalGroup(
            red_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidemenu.add(red_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 360, 80));

        white_panel.setBackground(new java.awt.Color(176, 0, 29));
        white_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                white_panelMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_White_Wine_24px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Белое вино");

        javax.swing.GroupLayout white_panelLayout = new javax.swing.GroupLayout(white_panel);
        white_panel.setLayout(white_panelLayout);
        white_panelLayout.setHorizontalGroup(
            white_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(white_panelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        white_panelLayout.setVerticalGroup(
            white_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidemenu.add(white_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 80));

        rose_panel.setBackground(new java.awt.Color(176, 0, 29));
        rose_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rose_panelMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Wine_Glass_24px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Розовое вино");

        javax.swing.GroupLayout rose_panelLayout = new javax.swing.GroupLayout(rose_panel);
        rose_panel.setLayout(rose_panelLayout);
        rose_panelLayout.setHorizontalGroup(
            rose_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rose_panelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        rose_panelLayout.setVerticalGroup(
            rose_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidemenu.add(rose_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 360, 80));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Designed&Developed by ArtyomV");
        sidemenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, -1, 20));

        shamp_panel.setBackground(new java.awt.Color(176, 0, 29));
        shamp_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shamp_panelMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Champagne_24px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Игристое вино");

        javax.swing.GroupLayout shamp_panelLayout = new javax.swing.GroupLayout(shamp_panel);
        shamp_panel.setLayout(shamp_panelLayout);
        shamp_panelLayout.setHorizontalGroup(
            shamp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shamp_panelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        shamp_panelLayout.setVerticalGroup(
            shamp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidemenu.add(shamp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 360, 80));

        basic.add(sidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        tablepanel.setBackground(new java.awt.Color(255, 255, 255));
        tablepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headpanel.setBackground(new java.awt.Color(176, 0, 29));
        headpanel.setEnabled(false);
        headpanel.setPreferredSize(new java.awt.Dimension(750, 190));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_24px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        head_title.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        head_title.setForeground(new java.awt.Color(255, 255, 255));
        head_title.setText("Каталог");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout headpanelLayout = new javax.swing.GroupLayout(headpanel);
        headpanel.setLayout(headpanelLayout);
        headpanelLayout.setHorizontalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(head_title, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap())
        );
        headpanelLayout.setVerticalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headpanelLayout.createSequentialGroup()
                        .addGroup(headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exit)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(head_title, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablepanel.add(headpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        catTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        catTable.setToolTipText("");
        catTable.setFillsViewportHeight(true);
        catTable.setGridColor(new java.awt.Color(255, 255, 255));
        catTable.setRowHeight(22);
        catTable.setSelectionBackground(new java.awt.Color(250, 0, 42));
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catTable);

        tablepanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 500));

        basic.add(tablepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 750, 710));

        getContentPane().add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customInit() {
        for (int i = 0; i < 10; i++) {
          WineObject obj = new WineObject(i, "Имя " + i, "Цвет " + i, "Виноград " + i, "Украина " + i, 122 + i);  
          list.add(obj);
        }
        
        TableModel tModel = new TableModel(list.size(), 6, list);
        catTable.setModel(tModel);
        jScrollPane1.setVisible(false);
        catTable.setVisible(false);
    }
    
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void menu_focus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_focus
        // TODO add your handling code here:
        skipSelection(0, "Каталог");            
    }//GEN-LAST:event_menu_focus

    private void red_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_panelMouseClicked
        // TODO add your handling code here:
        skipSelection(1, "Красное вино");
        red_panel.setBackground(clicked); 
    }//GEN-LAST:event_red_panelMouseClicked

    private void white_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_white_panelMouseClicked
        // TODO add your handling code here:
        skipSelection(2, "Белое вино");
        white_panel.setBackground(clicked);
    }//GEN-LAST:event_white_panelMouseClicked

    private void rose_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rose_panelMouseClicked
        // TODO add your handling code here:
        skipSelection(3, "Розовое вино");
        rose_panel.setBackground(clicked);      
    }//GEN-LAST:event_rose_panelMouseClicked

    private void all_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_panelMouseClicked
        // TODO add your handling code here:
        skipSelection(5, "Все");
        all_panel.setBackground(clicked);   
    }//GEN-LAST:event_all_panelMouseClicked

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
        // TODO add your handling code here:
        System.out.println(catTable.getSelectedRow());
              
    }//GEN-LAST:event_catTableMouseClicked

    private void shamp_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shamp_panelMouseClicked
        // TODO add your handling code here:
        skipSelection(4, "Игристое вино");
        shamp_panel.setBackground(clicked); 
    }//GEN-LAST:event_shamp_panelMouseClicked

    private void skipSelection(int itemNum, String name) {
        red_panel.setBackground(stock);
        white_panel.setBackground(stock);
        rose_panel.setBackground(stock);
        all_panel.setBackground(stock);
        shamp_panel.setBackground(stock);
        menuItem = itemNum;
        head_title.setText(name);
        if (itemNum == 0) {
            catTable.setVisible(false);
            jScrollPane1.setVisible(false);
        } else {
            jScrollPane1.setVisible(true);
            catTable.setVisible(true);
        }
    }
 
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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeFrame().setVisible(true);
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all_panel;
    private javax.swing.JPanel basic;
    private static javax.swing.JTable catTable;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel head;
    private javax.swing.JLabel head_title;
    private javax.swing.JPanel headpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel red_panel;
    private javax.swing.JPanel rose_panel;
    private javax.swing.JPanel shamp_panel;
    private javax.swing.JPanel sidemenu;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JPanel white_panel;
    // End of variables declaration//GEN-END:variables

}
