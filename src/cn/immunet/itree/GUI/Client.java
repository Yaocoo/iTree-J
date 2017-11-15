/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.immunet.itree.GUI;

import cn.immunet.itree.BO.SystemHelperFactory;
import cn.immunet.itree.model.Config;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author YC Duan <ycduan_uestc@163.com>
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        customInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        modeBtnGroup = new javax.swing.ButtonGroup();
        group1Panel = new javax.swing.JPanel();
        group1ScrollPane = new javax.swing.JScrollPane();
        group1List = new javax.swing.JList<>();
        group1Add = new javax.swing.JButton();
        group1Delete = new javax.swing.JButton();
        group1Reset = new javax.swing.JButton();
        group2Panel = new javax.swing.JPanel();
        group2ScrollPane = new javax.swing.JScrollPane();
        group2List = new javax.swing.JList<>();
        group2Add = new javax.swing.JButton();
        group2Delete = new javax.swing.JButton();
        group2Reset = new javax.swing.JButton();
        buttomPanel = new javax.swing.JPanel();
        start = new javax.swing.JButton();
        modePanel = new javax.swing.JPanel();
        generateTree = new javax.swing.JRadioButton();
        generateDist = new javax.swing.JRadioButton();
        openWorkspace = new javax.swing.JButton();
        option = new javax.swing.JButton();
        help = new javax.swing.JButton();

        fileChooser.setCurrentDirectory(new File(Config.getInstance().getWorkPath()));
        fileChooser.setDialogTitle("FileChooser");
        fileChooser.setMultiSelectionEnabled(true);

        modeBtnGroup.add(generateDist);
        modeBtnGroup.add(generateTree);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iTree - J");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 520));

        group1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 1, 12))); // NOI18N
        group1Panel.setPreferredSize(new java.awt.Dimension(380, 370));

        group1ListModel = new DefaultListModel<String>();
        group1List.setModel(group1ListModel);
        group1ScrollPane.setViewportView(group1List);

        group1Add.setText("Add");
        group1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group1AddActionPerformed(evt);
            }
        });

        group1Delete.setText("Delete");
        group1Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group1DeleteActionPerformed(evt);
            }
        });

        group1Reset.setText("Reset");
        group1Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group1ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout group1PanelLayout = new javax.swing.GroupLayout(group1Panel);
        group1Panel.setLayout(group1PanelLayout);
        group1PanelLayout.setHorizontalGroup(
            group1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(group1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(group1PanelLayout.createSequentialGroup()
                        .addComponent(group1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(group1Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(group1Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(group1ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        group1PanelLayout.setVerticalGroup(
            group1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(group1ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(group1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(group1Reset)
                    .addComponent(group1Delete)
                    .addComponent(group1Add))
                .addContainerGap())
        );

        group2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 1, 12))); // NOI18N
        group2Panel.setPreferredSize(new java.awt.Dimension(380, 370));

        group2ListModel = new DefaultListModel<String>();
        group2List.setModel(group2ListModel);
        group2ScrollPane.setViewportView(group2List);

        group2Add.setText("Add");
        group2Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group2AddActionPerformed(evt);
            }
        });

        group2Delete.setText("Delete");
        group2Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group2DeleteActionPerformed(evt);
            }
        });

        group2Reset.setText("Reset");
        group2Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group2ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout group2PanelLayout = new javax.swing.GroupLayout(group2Panel);
        group2Panel.setLayout(group2PanelLayout);
        group2PanelLayout.setHorizontalGroup(
            group2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(group2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(group2ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(group2PanelLayout.createSequentialGroup()
                        .addComponent(group2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(group2Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(group2Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        group2PanelLayout.setVerticalGroup(
            group2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(group2ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(group2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(group2Add)
                    .addComponent(group2Delete)
                    .addComponent(group2Reset))
                .addContainerGap())
        );

        buttomPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        modePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Mode"));

        generateTree.setText("Generate Tree");
        generateTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTreeActionPerformed(evt);
            }
        });

        generateDist.setText("Generate Distance");
        generateDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateDistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modePanelLayout = new javax.swing.GroupLayout(modePanel);
        modePanel.setLayout(modePanelLayout);
        modePanelLayout.setHorizontalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateTree)
                    .addComponent(generateDist))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        modePanelLayout.setVerticalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateTree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateDist)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        openWorkspace.setText("Folder");
        openWorkspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openWorkspaceActionPerformed(evt);
            }
        });

        option.setText("Option");
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttomPanelLayout = new javax.swing.GroupLayout(buttomPanel);
        buttomPanel.setLayout(buttomPanelLayout);
        buttomPanelLayout.setHorizontalGroup(
            buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttomPanelLayout.setVerticalGroup(
            buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openWorkspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(group1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(group2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(group2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(group1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void group1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group1AddActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            for (File file : files) {
                group1ListModel.addElement(file.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_group1AddActionPerformed

    private void group2AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group2AddActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            for (File file : files) {
                group2ListModel.addElement(file.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_group2AddActionPerformed

    private void group1DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group1DeleteActionPerformed
        int[] indexs = group1List.getSelectedIndices();
        for (int i = indexs.length - 1; i > -1; i-- ) {
            group1ListModel.remove(indexs[i]);
        }
    }//GEN-LAST:event_group1DeleteActionPerformed

    private void group1ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group1ResetActionPerformed
        group1ListModel.removeAllElements();
    }//GEN-LAST:event_group1ResetActionPerformed

    private void group2DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group2DeleteActionPerformed
        int[] indexs = group2List.getSelectedIndices();
        for (int i = indexs.length - 1; i > -1; i-- ) {
            group2ListModel.remove(indexs[i]);
        }
    }//GEN-LAST:event_group2DeleteActionPerformed

    private void group2ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group2ResetActionPerformed
        group2ListModel.removeAllElements();
    }//GEN-LAST:event_group2ResetActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start.setEnabled(false);
        if (generateTree.isSelected() && group1ListModel.size() > 1) {
            ITreeGUI.run(ITreeGUI.GENERATE_TREE, this);
        } else if (generateDist.isSelected() && group1ListModel.size() > 0 && group2ListModel.size() > 0 ) {
            ITreeGUI.run(ITreeGUI.GENERATE_DIST, this);
        }
        start.setEnabled(true);
    }//GEN-LAST:event_startActionPerformed

    private void generateTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTreeActionPerformed
        group2Panel.setEnabled(false);
        group2List.setEnabled(false);
        group2Add.setEnabled(false);
        group2Delete.setEnabled(false);
        group2Reset.setEnabled(false);
    }//GEN-LAST:event_generateTreeActionPerformed

    private void generateDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateDistActionPerformed
        group2Panel.setEnabled(true);
        group2List.setEnabled(true);
        group2Add.setEnabled(true);
        group2Delete.setEnabled(true);
        group2Reset.setEnabled(true);
    }//GEN-LAST:event_generateDistActionPerformed

    private void openWorkspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openWorkspaceActionPerformed
        SystemHelperFactory.getSystemHelper().openWorkspace();
    }//GEN-LAST:event_openWorkspaceActionPerformed

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        optionDialog = new OptionDialog(this, true);
        optionDialog.setVisible(true);
    }//GEN-LAST:event_optionActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        SystemHelperFactory.getSystemHelper().execHelp();
    }//GEN-LAST:event_helpActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
    private void customInit() {
        generateTree.doClick();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttomPanel;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JRadioButton generateDist;
    private javax.swing.JRadioButton generateTree;
    private javax.swing.JButton group1Add;
    private javax.swing.JButton group1Delete;
    private javax.swing.JList<String> group1List;
    private javax.swing.JPanel group1Panel;
    private javax.swing.JButton group1Reset;
    private javax.swing.JScrollPane group1ScrollPane;
    private javax.swing.JButton group2Add;
    private javax.swing.JButton group2Delete;
    private javax.swing.JList<String> group2List;
    private javax.swing.JPanel group2Panel;
    private javax.swing.JButton group2Reset;
    private javax.swing.JScrollPane group2ScrollPane;
    private javax.swing.JButton help;
    private javax.swing.ButtonGroup modeBtnGroup;
    private javax.swing.JPanel modePanel;
    private javax.swing.JButton openWorkspace;
    private javax.swing.JButton option;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
    // Custom variables declaration - be allowed to modify
    DefaultListModel<String> group1ListModel;
    DefaultListModel<String> group2ListModel;
    OptionDialog optionDialog;
    // End of variables declaration
}