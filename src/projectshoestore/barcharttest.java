/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author saroj_000
 */
public class barcharttest extends javax.swing.JFrame {

    /**
     * Creates new form barcharttest
     */
    public barcharttest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barcharBtn = new javax.swing.JButton();
        barcharttest2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        barcharBtn.setText("bar show");
        barcharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcharBtnActionPerformed(evt);
            }
        });

        barcharttest2.setText("jButton1");
        barcharttest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcharttest2ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barcharBtn)
                .addGap(43, 43, 43)
                .addComponent(barcharttest2)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcharBtn)
                    .addComponent(barcharttest2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barcharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcharBtnActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barchardata = new DefaultCategoryDataset();
        barchardata.setValue(20000, "amount", "janaury");
        barchardata.setValue(2000, "amount", "febary");
        barchardata.setValue(12000, "amount", "aotj ");
        barchardata.setValue(1000, "amount", "deeksk");
        JFreeChart barchart = ChartFactory.createBarChart("Contribution","monthy", "amount", barchardata,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot brchart = barchart.getCategoryPlot();
        brchart.setRangeGridlinePaint(Color.GREEN);
        
        ChartFrame chartfram = new ChartFrame("Contribution",barchart,true);
        chartfram.setVisible(true);
        chartfram.setSize(500,400);

//        ChartPanel barpanel = new ChartPanel(barchart);
//        jPanel1.removeAll();
//        jPanel1.add(barpanel,BorderLayout.CENTER);
//        jPanel1.validate();
    }//GEN-LAST:event_barcharBtnActionPerformed

    private void barcharttest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcharttest2ActionPerformed
        // TODO add your handling code here:
        List<dto> list = new doa().showlist();
        DefaultCategoryDataset barchardata = new DefaultCategoryDataset();
        list.forEach(new Consumer<dto>() {
                @Override//self generated
                public void accept(dto t) {
                   barchardata.setValue(t.getPrice(), "amount", t.getBrand()+t.getProductName());
                }
            });  
          
       
//        barchardata.setValue(2000, "amount", "febary");
//        barchardata.setValue(12000, "amount", "aotj ");
//        barchardata.setValue(1000, "amount", "deeksk");
        JFreeChart barchart = ChartFactory.createBarChart("Contribution","monthy", "amount", barchardata,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot brchart = barchart.getCategoryPlot();
        brchart.setRangeGridlinePaint(Color.GREEN);
        
        ChartFrame chartfram = new ChartFrame("Contribution",barchart,true);
        chartfram.setVisible(true);
        chartfram.setSize(500,400);
    }//GEN-LAST:event_barcharttest2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       List<dto> list = new doa().productsale();
        DefaultPieDataset piedataset = new DefaultPieDataset();
        list.forEach(new Consumer<dto>() {
                @Override//self generated
                public void accept(dto t) {
                    
                    piedataset.setValue(t.getBrand(),t.getQuantity());
                }
            });  
      
       
       JFreeChart piechart =ChartFactory.createPieChart("testpie", piedataset,true,true,true);
        PiePlot p= (PiePlot)piechart.getPlot();
        //p.setForegroundAlpha(TOP_ALIGNMENT);
       ChartFrame frame = new ChartFrame("Piechart",piechart);
       
       
       frame.setVisible(true);
       frame.setSize(450,500);
        
       List<dto> list2 = new doa().productsale();
        DefaultPieDataset piedataset2 = new DefaultPieDataset();
        list.forEach(new Consumer<dto>() {
                @Override//self generated
                public void accept(dto t) {
                    
                    piedataset2.setValue(t.getBrand(),t.getQuantity());
                }
            });  
      
       
       JFreeChart piechart2 =ChartFactory.createPieChart("testpie", piedataset2,true,true,true);
        PiePlot p2= (PiePlot)piechart2.getPlot();
        //p.setForegroundAlpha(TOP_ALIGNMENT);
       frame.add(new ChartFrame("pie",piechart2));
       frame.setVisible(true);
       frame.setSize(45,50);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(barcharttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barcharttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barcharttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barcharttest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barcharttest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barcharBtn;
    private javax.swing.JButton barcharttest2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
