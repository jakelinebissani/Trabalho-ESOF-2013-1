/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.view;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.xml.crypto.Data;

/**
 *
 * @author Ricardo & Ludma
 */
public class CadastroDisciplina extends javax.swing.JFrame {
    
    String dia, horaAula, livros;
    int contaLinhas = 0, contaLinhas2 = 0, linhaTabela;

    /**
     * Creates new form CadastroDisciplina
     */
    public CadastroDisciplina() {
        initComponents();
        listaDiaSemana();
        //preencher_tabela(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeDisciplina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salaAula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        diaSemana = new java.awt.Choice();
        jLabel5 = new javax.swing.JLabel();
        addDiaHora = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDiaAula = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nomeProfessor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailProfessor = new javax.swing.JTextField();
        remvDiaHora = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        livro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabBibliografia = new javax.swing.JTable();
        addLivro = new javax.swing.JButton();
        remveLivro = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(370, 650));

        nomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDisciplinaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Disciplinas");

        jLabel2.setText("Nome Disciplina:");

        jLabel3.setText("Sala:");

        salaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaAulaActionPerformed(evt);
            }
        });

        jLabel4.setText("Dia:");

        jLabel5.setText("Horário:");

        addDiaHora.setText("Adicionar Dia/HoraAula");
        addDiaHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDiaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiaHoraActionPerformed(evt);
            }
        });

        tabelaDiaAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Dia", "Hora/Aula"
            }
        ));
        jScrollPane1.setViewportView(tabelaDiaAula);
        tabelaDiaAula.getColumnModel().getColumn(0).setHeaderValue("Dia");
        tabelaDiaAula.getColumnModel().getColumn(1).setHeaderValue("Hora/Aula");

        jLabel6.setText("Professor:");

        jLabel7.setText("Email:");

        remvDiaHora.setText("Remover Dia/HoraAula");
        remvDiaHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remvDiaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remvDiaHoraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Bibliografia");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Professor");

        jLabel10.setText("Livro:");

        tabBibliografia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Bibliografia"
            }
        ));
        jScrollPane2.setViewportView(tabBibliografia);

        addLivro.setText("Adicionar Livro");
        addLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLivroActionPerformed(evt);
            }
        });

        remveLivro.setText("Remover Livro");
        remveLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remveLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remveLivroActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        btSalvar.setText("Salvar");

        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1,"HH:mm");
        jSpinner1.setEditor(de);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(livro))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailProfessor))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addDiaHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remvDiaHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(addLivro)
                        .addGap(24, 24, 24)
                        .addComponent(remveLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(salaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(diaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDiaHora)
                    .addComponent(remvDiaHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(emailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLivro)
                    .addComponent(remveLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDisciplinaActionPerformed

    private void salaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaAulaActionPerformed

    private void addDiaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiaHoraActionPerformed
            dia = diaSemana.getSelectedItem().toString();
            horaAula = jSpinner1.getEditor().toString();
            //System.out.println("Dia "+dia+", hora/aula: "+horaAula+"!!");
            System.out.println("Hora "+horaAula+"!!");           
            preencher_tabela(dia,horaAula);
            limpaDiaHora();
    }//GEN-LAST:event_addDiaHoraActionPerformed

    private void remvDiaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remvDiaHoraActionPerformed
        linhaTabela = tabelaDiaAula.getSelectedRow();
        //System.out.println("Linha "+linhaTabela);
        removerDaTabela(linhaTabela);
    }//GEN-LAST:event_remvDiaHoraActionPerformed

    private void addLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLivroActionPerformed
        livros = livro.getText().toString();
        preencheBibliografia(livros);
        limpaBibliografia();
    }//GEN-LAST:event_addLivroActionPerformed

    private void remveLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remveLivroActionPerformed
        linhaTabela = tabBibliografia.getSelectedRow();
        removeBibliografia(linhaTabela);
    }//GEN-LAST:event_remveLivroActionPerformed

    public void limpaDiaHora()
    {
        //horarioAula.setText("");
    }
    
    public void limpaBibliografia()
    {
        livro.setText("");
    }
    
    public void listaDiaSemana() {        
        diaSemana.addItem("Segunda");
        diaSemana.addItem("Terça");
        diaSemana.addItem("Quarta");
        diaSemana.addItem("Quinta");
        diaSemana.addItem("Sexta");
        diaSemana.addItem("Sabado");
        
        //edtNumDept.addItem(result.getString("numero").toString());            
    }
    
    public void preencher_tabela(String dia, String horaAula) {
        //Conexao.conectar();        
        DefaultTableModel modelo = (DefaultTableModel) tabelaDiaAula.getModel();
        modelo.setNumRows(contaLinhas);
        modelo.addRow(new Object[]{dia,horaAula});
        contaLinhas++;
    } 
    
    public void removerDaTabela(int linha){
        DefaultTableModel modelo = (DefaultTableModel) tabelaDiaAula.getModel();
        modelo.removeRow(linha);
        contaLinhas--;
    }
    
    public void preencheBibliografia(String livro)
    {
        DefaultTableModel bibliografia = (DefaultTableModel) tabBibliografia.getModel();
        bibliografia.setNumRows(contaLinhas2);
        bibliografia.addRow(new Object[]{livro});
        contaLinhas2++;
    }
    
    public void removeBibliografia(int linha)
    {
        DefaultTableModel bibliografia = (DefaultTableModel) tabBibliografia.getModel();
        bibliografia.removeRow(linha);
        contaLinhas2--;
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
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDisciplina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiaHora;
    private javax.swing.JButton addLivro;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private java.awt.Choice diaSemana;
    private javax.swing.JTextField emailProfessor;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField livro;
    private javax.swing.JTextField nomeDisciplina;
    private javax.swing.JTextField nomeProfessor;
    private javax.swing.JButton remvDiaHora;
    private javax.swing.JButton remveLivro;
    private javax.swing.JTextField salaAula;
    private javax.swing.JTable tabBibliografia;
    private javax.swing.JTable tabelaDiaAula;
    // End of variables declaration//GEN-END:variables
}
