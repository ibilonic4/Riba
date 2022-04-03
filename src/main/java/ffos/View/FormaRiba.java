/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.View;

import ffos.Controller.ObradaRiba;
import ffos.Controller.ObradaRibara;
import ffos.Controller.ObradaRibnjaka;
import ffos.Model.Riba;
import ffos.Model.Ribar;
import ffos.Model.Ribnjak;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class FormaRiba extends javax.swing.JFrame implements ViewAktivnosti{
private ObradaRiba oriba;
private ObradaRibara oribar;
private ObradaRibnjaka oribnjak;
    /**
     * Creates new form FormaRiba
     */
    public FormaRiba() {
       oriba = new ObradaRiba();
        oribar = new ObradaRibara();
        oribnjak = new ObradaRibnjaka();
        initComponents();
        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBroj = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        cmbRibar = new javax.swing.JComboBox<>();
        cmbRibnjak = new javax.swing.JComboBox<>();
        btnc = new javax.swing.JButton();
        btnu = new javax.swing.JButton();
        btnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst);

        jLabel1.setText("Broj");

        jLabel2.setText("Datum");

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnu.setText("u");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        btnd.setText("d");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbRibar, 0, 114, Short.MAX_VALUE)
                            .addComponent(cmbRibnjak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnc)
                .addGap(49, 49, 49)
                .addComponent(btnu)
                .addGap(69, 69, 69)
                .addComponent(btnd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbRibar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbRibnjak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc)
                    .addComponent(btnu)
                    .addComponent(btnd))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstValueChanged
if (evt.getValueIsAdjusting() || lst.getSelectedValue() == null) {
     postaviVrijednostiNaViewKontrole();
    
            return;}        }//GEN-LAST:event_lstValueChanged

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        oriba.setEntitet(new Riba());
        ucitajVrijednostiIzViewKontrola();
        try {
            oriba.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_btncActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        if(oriba.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        ucitajVrijednostiIzViewKontrola();
        try {
            oriba.update();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btnuActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        if(oriba.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        try {
            oriba.delete();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btndActionPerformed

    
    
    
    
    
    
    
    @Override
    public void ucitajPodatke() {
DefaultListModel<Riba> riba = new DefaultListModel<>();
        riba.addAll(oriba.read());
        lst.setModel(riba);  

DefaultComboBoxModel<Ribar> ribar = new DefaultComboBoxModel<>();
        ribar.addAll(oribar.read());
        cmbRibar.setModel(ribar);
        
        DefaultComboBoxModel<Ribnjak> ribnjak = new DefaultComboBoxModel<>();
        ribnjak.addAll(oribnjak.read());
        cmbRibnjak.setModel(ribnjak);
    }

    @Override
    public void postaviVrijednostiNaViewKontrole() {
oriba.setEntitet(lst.getSelectedValue());
        txtBroj.setText(lst.getSelectedValue().getBroj().toString());
    txtDatum.setText(lst.getSelectedValue().getDatum().toString());  
     cmbRibar.setSelectedItem(lst.getSelectedValue().getRibar()); 
    cmbRibnjak.setSelectedItem(lst.getSelectedValue().getRibnjak());

    }

    @Override
    public void ucitajVrijednostiIzViewKontrola() {
oriba.SetData(txtBroj.getText(), txtDatum.getText());
oriba.getEntitet().setRibar((Ribar) cmbRibar.getSelectedItem());
oriba.getEntitet().setRibnjak((Ribnjak) cmbRibnjak.getSelectedItem());

        }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnu;
    private javax.swing.JComboBox<Ribar> cmbRibar;
    private javax.swing.JComboBox<Ribnjak> cmbRibnjak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Riba> lst;
    private javax.swing.JTextField txtBroj;
    private javax.swing.JTextField txtDatum;
    // End of variables declaration//GEN-END:variables
}