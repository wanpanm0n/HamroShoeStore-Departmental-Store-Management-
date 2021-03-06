/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore.supplierinfo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectshoestore.DbUtil;
import projectshoestore.doa;
import projectshoestore.dto;

/**
 *
 * @author saroj_000
 */
public class supplieractivity extends javax.swing.JInternalFrame {

    /**
     * Creates new form supplieractivity
     */
    public supplieractivity() {
        initComponents();
        itemsfill();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierpanel = new javax.swing.JTabbedPane();
        deletepanel = new javax.swing.JPanel();
        supplistd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idtxtBoxd = new javax.swing.JTextField();
        deleteBtnd = new javax.swing.JButton();
        searchpanel = new javax.swing.JPanel();
        supplists = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTxtBox = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        supplierinsert = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idtxtBoxi = new javax.swing.JTextField();
        nametxtBoxi = new javax.swing.JTextField();
        contacttxtBoxi = new javax.swing.JTextField();
        addresstxtBoxi = new javax.swing.JTextField();
        brandtxtBoxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        suppBtnu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idtxtboxu = new javax.swing.JTextField();
        brandtxtboxu = new javax.swing.JTextField();
        addresstxtboxu = new javax.swing.JTextField();
        nametxtboxu = new javax.swing.JTextField();
        contacttxtboxu = new javax.swing.JTextField();
        updatebtnu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        suppTable = new javax.swing.JTable();

        setClosable(true);

        supplistd.setText("all supplieress");
        supplistd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplistdActionPerformed(evt);
            }
        });

        jLabel6.setText("enter the id of the supplier which you wish to delete.   ");

        jLabel12.setText("note pls delete all the product information related to supplier ");

        idtxtBoxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtBoxdActionPerformed(evt);
            }
        });

        deleteBtnd.setText("delete");
        deleteBtnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletepanelLayout = new javax.swing.GroupLayout(deletepanel);
        deletepanel.setLayout(deletepanelLayout);
        deletepanelLayout.setHorizontalGroup(
            deletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletepanelLayout.createSequentialGroup()
                .addGroup(deletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(supplistd))
                    .addGroup(deletepanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(deletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(deletepanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(idtxtBoxd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(deleteBtnd)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        deletepanelLayout.setVerticalGroup(
            deletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplistd)
                .addGap(18, 18, 18)
                .addGroup(deletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idtxtBoxd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        supplierpanel.addTab("delete", deletepanel);

        supplists.setText("all supplieress");
        supplists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplistsActionPerformed(evt);
            }
        });

        jLabel13.setText("Search By");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchpanelLayout = new javax.swing.GroupLayout(searchpanel);
        searchpanel.setLayout(searchpanelLayout);
        searchpanelLayout.setHorizontalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplists)
                    .addGroup(searchpanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        searchpanelLayout.setVerticalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplists)
                .addGap(18, 18, 18)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        supplierpanel.addTab("search", searchpanel);

        jLabel1.setText("Name");

        jLabel2.setText("id");

        jLabel3.setText("address");

        jLabel4.setText("contact no");

        jLabel5.setText("brand");

        idtxtBoxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtBoxiActionPerformed(evt);
            }
        });

        jButton1.setText("all supplieress");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        insertBtn.setText("insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supplierinsertLayout = new javax.swing.GroupLayout(supplierinsert);
        supplierinsert.setLayout(supplierinsertLayout);
        supplierinsertLayout.setHorizontalGroup(
            supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierinsertLayout.createSequentialGroup()
                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(supplierinsertLayout.createSequentialGroup()
                        .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insertBtn)
                            .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(supplierinsertLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(idtxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplierinsertLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nametxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(contacttxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(addresstxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(brandtxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(supplierinsertLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cancelBtn)))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        supplierinsertLayout.setVerticalGroup(
            supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierinsertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacttxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandtxtBoxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supplierinsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        supplierpanel.addTab("insert", supplierinsert);

        suppBtnu.setText("all supplieress");
        suppBtnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBtnuActionPerformed(evt);
            }
        });

        jLabel7.setText("name");

        jLabel8.setText("contact no");

        jLabel9.setText("address");

        jLabel10.setText("brand");

        jLabel11.setText("enter the id where you want to make change");

        idtxtboxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtboxuActionPerformed(evt);
            }
        });

        brandtxtboxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandtxtboxuActionPerformed(evt);
            }
        });

        addresstxtboxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtboxuActionPerformed(evt);
            }
        });

        nametxtboxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtboxuActionPerformed(evt);
            }
        });

        contacttxtboxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtboxuActionPerformed(evt);
            }
        });

        updatebtnu.setText("Update");
        updatebtnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nametxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addresstxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contacttxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(brandtxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(updatebtnu))))
                            .addComponent(jLabel11)))
                    .addComponent(suppBtnu, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idtxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suppBtnu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandtxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacttxtboxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtnu))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        supplierpanel.addTab("update", jPanel2);

        suppTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Address", "Brand", "Contact_no"
            }
        ));
        jScrollPane1.setViewportView(suppTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplierpanel)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(supplierpanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtBoxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtBoxiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtBoxiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        show_table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        Integer idd,contactno;
        String id,name,contact,address,brand;
        
        id= idtxtBoxi.getText().toString();
        name =nametxtBoxi.getText().toString();
        contact=contacttxtBoxi.getText().toString();
        address = addresstxtBoxi.getText().toString();
        brand = brandtxtBoxi.getText().toString();
        
        
        idd = Integer.parseInt(id);
      //  contactno =Integer.parseInt(contact);
        
        try {
            String sql = "INSERT INTO `hamroshoestore`.`supplierinfo` (`supplierid`, `name`, `Address`, `contactno`, `brand`) VALUES ('"+idd+"', '"+name+"', '"+address+"','"+contact+"','"+brand+"');";
            Statement psd = DbUtil.getConnection().createStatement();
            psd.executeUpdate(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(supplieractivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_insertBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void suppBtnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppBtnuActionPerformed
        // TODO add your handling code here:
        show_table();
    }//GEN-LAST:event_suppBtnuActionPerformed

    private void idtxtboxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtboxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtboxuActionPerformed

    private void brandtxtboxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandtxtboxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandtxtboxuActionPerformed

    private void addresstxtboxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtboxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtboxuActionPerformed

    private void nametxtboxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtboxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtboxuActionPerformed

    private void contacttxtboxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtboxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtboxuActionPerformed

    private void updatebtnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnuActionPerformed
        // TODO add your handling code here:
        Integer idd,contactno;
        String id,name,address,contact,brand;
        id = idtxtboxu.getText().toString();
        name=nametxtboxu.getText().toString();
        contact = contacttxtboxu.getText().toString();
        brand = brandtxtboxu.getText().toString();
        address = addresstxtboxu.getText().toString();
        idd=Integer.parseInt(id);
        contactno = Integer.parseInt(contact);
        
        
        try {
            String sql ="UPDATE `hamroshoestore`.`supplierinfo` SET `name`='"+name+"', `Address`='"+address+"', `contactno`='"+contactno+"', `brand`='"+brand+"' WHERE `supplierid`='"+idd+"';";
            Statement psd = DbUtil.getConnection().prepareStatement(sql);
            psd.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(supplieractivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updatebtnuActionPerformed

    private void supplistdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplistdActionPerformed
        // TODO add your handling code here:
        show_table();
    }//GEN-LAST:event_supplistdActionPerformed

    private void idtxtBoxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtBoxdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtBoxdActionPerformed

    private void deleteBtndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtndActionPerformed
        // TODO add your handling code here:
        String id;
        Integer idd;
        id = idtxtBoxd.getText().toString();
        idd=Integer.parseInt(id);
        
        String message = " Are you sure ";
                String title = "Confirm";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
                    
            try {
                String sql="DELETE FROM `hamroshoestore`.`supplierinfo` WHERE `supplierid`='"+idd+"';";
                PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
                psd.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "first all the product information must be delete", "Error", 0);
                Logger.getLogger(supplieractivity.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                }
    }//GEN-LAST:event_deleteBtndActionPerformed

    private void supplistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplistsActionPerformed
        // TODO add your handling code here:
        show_table();
    }//GEN-LAST:event_supplistsActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String st,st1 = null,stbox;
    
        st= searchComboBox.getSelectedItem().toString();
        stbox =searchTxtBox.getText();
        int count=0;
            
        
        try {
            if(st.equals("Name")){
                st1="name";
            }
            else if(st.equals("Brand")){
                st1="Brand";
        
            }
            else if(st.equals("Address")){
                st1="Address";
            }
            else if(st.equals("Contact")){
                st1="contactno";
            }
               System.out.println(st1);
               System.out.println(stbox);
            String sql = "SELECT * FROM hamroshoestore.supplierinfo where "+st1+" ='"+stbox+"';";
            PreparedStatement psd =DbUtil.getConnection().prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            
            DefaultTableModel tablemodel =(DefaultTableModel) suppTable.getModel();
            tablemodel.setRowCount(0);
  
            while(rs.next()){
               tablemodel.addRow(new Object[]{rs.getString("supplierid"),rs.getString("name"),rs.getString("Address"),rs.getString("contactno"),rs.getString("Brand")});
            }

        } catch (SQLException ex) {
            Logger.getLogger(supplieractivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField addresstxtBoxi;
    private javax.swing.JTextField addresstxtboxu;
    private javax.swing.JTextField brandtxtBoxi;
    private javax.swing.JTextField brandtxtboxu;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contacttxtBoxi;
    private javax.swing.JTextField contacttxtboxu;
    private javax.swing.JButton deleteBtnd;
    private javax.swing.JPanel deletepanel;
    private javax.swing.JTextField idtxtBoxd;
    private javax.swing.JTextField idtxtBoxi;
    private javax.swing.JTextField idtxtboxu;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxtBoxi;
    private javax.swing.JTextField nametxtboxu;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTxtBox;
    private javax.swing.JPanel searchpanel;
    private javax.swing.JButton suppBtnu;
    private javax.swing.JTable suppTable;
    private javax.swing.JPanel supplierinsert;
    private javax.swing.JTabbedPane supplierpanel;
    private javax.swing.JButton supplistd;
    private javax.swing.JButton supplists;
    private javax.swing.JButton updatebtnu;
    // End of variables declaration//GEN-END:variables

    private void show_table() {
       List <dto> list = new doa().supplierInfoList();
       DefaultTableModel tableModel = (DefaultTableModel) suppTable.getModel();
       tableModel.setRowCount(0);
       list.forEach(new Consumer<dto>(){
           @Override
           public void accept(dto t) {
               tableModel.addRow(new Object[]{t.getSuppId(),t.getSuppname(),t.getSuppAddress(),t.getSuppBrand(),t.getContactNo()});
           }

          
           
       });
    }

    private void itemsfill() {
        searchComboBox.addItem("Name");
        searchComboBox.addItem("Address");
        searchComboBox.addItem("Brand");
        searchComboBox.addItem("Contact");
        
        
    }
}
