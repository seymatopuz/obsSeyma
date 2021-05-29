
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class mufredat extends javax.swing.JFrame {
     int aktsToplamı = 0;
     int krediToplamı = 0;

    /**
     * Creates new form deneme
     */
   derskayitislemleri dersKayitIslemler = new derskayitislemleri();
    DefaultTableModel model;
    static int ogrenciId;
    public mufredat(int ogrenciId) {

        try {
            mufredat.ogrenciId = 1;
            initComponents();
            
            dersleriGetir(1);
            dersleriGetir2(2);
            dersleriGetir3(3);
            dersleriGetir4(4);
            dersleriGetir5(1);
            dersleriGetir6(2);
            dersleriGetir7(3);
            dersleriGetir8(4);
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(mufredat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
      
    }
      public void dersleriGetir(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table1.getModel();
        
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
            aktsToplamı+= ders.getAkts();
            krediToplamı+=ders.getKredi();
         model.addRow(eklenecek);
         }
    }
    public void dersleriGetir2(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table2.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
            aktsToplamı+= ders.getAkts();
            krediToplamı+=ders.getKredi();
         model.addRow(eklenecek);
         }
    }
        public void dersleriGetir3(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table3.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
            aktsToplamı+= ders.getAkts();
            krediToplamı+=ders.getKredi();
         model.addRow(eklenecek);
         }
    }
        public void dersleriGetir4(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table4.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
            aktsToplamı+= ders.getAkts();
            krediToplamı+=ders.getKredi();
         model.addRow(eklenecek);
         }
        labeltext.setText("D.AKTS : "+ aktsToplamı + "       D. Kredi : "+ krediToplamı);

    }
         public void dersleriGetir5(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table5.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());
         

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
             System.out.println(ders.getDersAdi());
         model.addRow(eklenecek);
         }
 

    }
         public void dersleriGetir6(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table6.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
             System.out.println(ders.getDersAdi());
         model.addRow(eklenecek);
         }

    }
           public void dersleriGetir7(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table7.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
             System.out.println(ders.getDersAdi());
         model.addRow(eklenecek);
         }

    }
             public void dersleriGetir8(int donem) throws java.sql.SQLException {
        model = (DefaultTableModel)table8.getModel();
         model.setRowCount(0);

         ArrayList<Ders> dersler= new ArrayList<Ders>();
         derskayitislemleri islemler = new derskayitislemleri();
         Ogrenci ogrenci = islemler.getOgrenci(ogrenciId);
         dersler =islemler.dersleriGoruntuleDvm(donem,ogrenci.getBolum_id());

         for(Ders ders : dersler){
            Object[] eklenecek ={ders.getDersAdi(),ders.getDersKodu(),ders.getAkts(),ders.getKredi(),ders.getDurumu()};
             System.out.println(ders.getDersAdi());
         model.addRow(eklenecek);
         }

    }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        geri = new javax.swing.JButton();
        ogrenci_bilgi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labeltext = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        table8 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        table6 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Ders Adı", "AKTS", "Krd", "Z/S"
            }
        ));
        jScrollPane1.setViewportView(table7);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Müfredat Durum");

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(geri)
                .addGap(174, 174, 174)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ogrenci_bilgi.setText("                         ");

        jButton1.setText("X");

        labeltext.setToolTipText("");
        labeltext.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton2.setText("Müfredatından Almadığı Dersler");

        jButton3.setText("Müfredat Durum Yazdır");

        jLabel2.setText("1.Sınıf Güz");

        jLabel4.setText("1.Sınıf Bahar");

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Müfredat Ders Adı", "AKTS", "Kredi", "Z/S"
            }
        ));
        jScrollPane2.setViewportView(table3);

        jLabel5.setText("2.Sınıf Güz");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Müfredat Ders Adı", "AKTS", "Kredi", "Z/S"
            }
        ));
        jScrollPane3.setViewportView(table2);

        jLabel6.setText("2.Sınıf Bahar");

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Müfredat Ders Adı", "AKTS", "Kredi", "Z/S"
            }
        ));
        jScrollPane4.setViewportView(table4);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Müfredat Ders Adı", "AKTS", "Kredi", "Z/S"
            }
        ));
        jScrollPane5.setViewportView(table1);

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Ders Adı", "AKTS", "Krd", "Z/S"
            }
        ));
        jScrollPane6.setViewportView(table5);

        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Ders Adı", "AKTS", "Krd", "Z/S"
            }
        ));
        jScrollPane7.setViewportView(table8);

        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Kodu", "Ders Adı", "AKTS", "Krd", "Z/S"
            }
        ));
        jScrollPane8.setViewportView(table6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ogrenci_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(430, 430, 430))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labeltext, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ogrenci_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labeltext, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
         setVisible(false);
        new OBS(ogrenciId).setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

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
            java.util.logging.Logger.getLogger(mufredat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mufredat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mufredat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mufredat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mufredat(ogrenciId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labeltext;
    private javax.swing.JLabel ogrenci_bilgi;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    private javax.swing.JTable table6;
    private javax.swing.JTable table7;
    private javax.swing.JTable table8;
    // End of variables declaration//GEN-END:variables
}
