/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DAO.CategoriaDAO;



/**
 *
 * @author Luan
 */
public class FrameAdcFunc extends javax.swing.JInternalFrame {

    private Connection con = null;
    private boolean result;
    protected String cargo;
    /**
     * Creates new form FrameAdcFunc
     */
    public FrameAdcFunc() {
        initComponents();
        con = ConnectionFactory.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AdcFuncNome = new javax.swing.JTextField();
        AdcFuncCPF = new javax.swing.JTextField();
        AdcFuncCargo = new javax.swing.JComboBox<>();
        AdcFuncEmail = new javax.swing.JTextField();
        AdcFuncFone = new javax.swing.JTextField();
        AdcFuncCancelar = new javax.swing.JButton();
        AdcFuncSalvar = new javax.swing.JButton();
        AdcFuncData = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            AdcFuncData = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar Funcionário");

        jLabel1.setText("Nome");

        jLabel2.setText("Data de nascimento");

        jLabel3.setText("CPF");

        jLabel4.setText("Cargo");

        jLabel6.setText("E-mail");

        jLabel7.setText("Fone");

        AdcFuncNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcFuncNomeActionPerformed(evt);
            }
        });

        AdcFuncCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Vendedor", "Gerente" }));
        AdcFuncCargo.setToolTipText("Vendedor, Gerente");
        AdcFuncCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcFuncCargoActionPerformed(evt);
            }
        });

        AdcFuncCancelar.setBackground(new java.awt.Color(255, 51, 51));
        AdcFuncCancelar.setText("Cancelar");
        AdcFuncCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcFuncCancelarActionPerformed(evt);
            }
        });

        AdcFuncSalvar.setBackground(new java.awt.Color(0, 204, 51));
        AdcFuncSalvar.setText("Salvar");
        AdcFuncSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcFuncSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdcFuncNome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdcFuncData, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdcFuncCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdcFuncCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AdcFuncEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(AdcFuncSalvar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdcFuncCancelar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AdcFuncFone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdcFuncFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdcFuncCancelar)
                    .addComponent(AdcFuncSalvar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdcFuncNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcFuncNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdcFuncNomeActionPerformed

    private void AdcFuncCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcFuncCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_AdcFuncCancelarActionPerformed

    private void AdcFuncSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcFuncSalvarActionPerformed
    
        //System.err.println(AdcFuncNome.getText());
    
    String sql = "INSERT INTO tbl_funcionario (nome, email, cpf, fone, cargo, dataNasci) VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        
        if(AdcFuncCargo.getSelectedIndex()==1){
            cargo = "vendedor";
        }else if (AdcFuncCargo.getSelectedIndex()==2){
            cargo = "gerente";
        }else{
            System.out.println("Selecione uma das opções de cargo");
        }
        
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, AdcFuncNome.getText());
            stmt.setString(2, AdcFuncEmail.getText());
            stmt.setString(3, AdcFuncCPF.getText());
            stmt.setString(4, AdcFuncFone.getText());
            stmt.setString(5, cargo);
            stmt.setString(6, AdcFuncData.getText());
            stmt.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            //System.err.println("Funcionario não inserido!");
            result = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        if (result = true){
            JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso!");
            AdcFuncNome.setText("");
            AdcFuncEmail.setText("");
            AdcFuncCPF.setText("");
            AdcFuncFone.setText("");
            cargo = null;
            AdcFuncData.setText("");
        }
        
        
    }//GEN-LAST:event_AdcFuncSalvarActionPerformed

    private void AdcFuncCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcFuncCargoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_AdcFuncCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdcFuncCPF;
    private javax.swing.JButton AdcFuncCancelar;
    private javax.swing.JComboBox<String> AdcFuncCargo;
    private javax.swing.JTextField AdcFuncData;
    private javax.swing.JTextField AdcFuncEmail;
    private javax.swing.JTextField AdcFuncFone;
    private javax.swing.JTextField AdcFuncNome;
    private javax.swing.JButton AdcFuncSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
