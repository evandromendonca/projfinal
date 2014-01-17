/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.alocador.AlocadorSala;
import br.uff.alocadorSalas.controller.AulaController;
import br.uff.alocadorSalas.model.Aula;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro
 */
public class JPanelAlocar extends javax.swing.JPanel {

    /**
     * Creates new form JPanelHorarios
     */
    public JPanelAlocar() {
        initComponents();

        configInicial();
        inicializarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfiguracaoCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePesquisa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JButtonAlocarDinamicamente = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        painelConfiguracaoCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alocação Dinâmica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        painelConfiguracaoCursos.setPreferredSize(new java.awt.Dimension(600, 200));

        JTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Turma", "Horário Inicial", "Horário Final", "Dia Semana", "Sala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablePesquisa);

        jLabel1.setText("Aulas não alocadas:");

        javax.swing.GroupLayout painelConfiguracaoCursosLayout = new javax.swing.GroupLayout(painelConfiguracaoCursos);
        painelConfiguracaoCursos.setLayout(painelConfiguracaoCursosLayout);
        painelConfiguracaoCursosLayout.setHorizontalGroup(
            painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelConfiguracaoCursosLayout.setVerticalGroup(
            painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        JButtonAlocarDinamicamente.setText("Alocar Dinamicamente");
        JButtonAlocarDinamicamente.setActionCommand("");
        JButtonAlocarDinamicamente.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonAlocarDinamicamente.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonAlocarDinamicamente.setName("JButtonAlocarDinamicamente"); // NOI18N
        JButtonAlocarDinamicamente.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonAlocarDinamicamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlocarDinamicamenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConfiguracaoCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonAlocarDinamicamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfiguracaoCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButtonAlocarDinamicamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAlocarDinamicamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlocarDinamicamenteActionPerformed
        new AlocadorSala().alocarSalas();
        inicializarTabela();      
    }//GEN-LAST:event_JButtonAlocarDinamicamenteActionPerformed

    private void configInicial() {
        Color c = new Color(this.getBackground().getRGB());

        this.JButtonAlocarDinamicamente.setBackground(c);
    }

    private void inicializarTabela() {
        try {
            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
                        
            ArrayList<Aula> aulasSemSala = (ArrayList<Aula>) new AulaController().buscaTodasSemSala();
            for (Aula aula : aulasSemSala) {
                modelTable.addRow( new Object[] {
                            aula.getTurma().getDisciplina(), 
                            aula.getTurma(), 
                            aula.getHorario().getHorarioInicial(),
                            aula.getHorario().getHorarioFinal(),
                            aula.getDiaSemana(),
                            aula.getSala()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas ao gerar lista!");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlocarDinamicamente;
    private javax.swing.JTable JTablePesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelConfiguracaoCursos;
    // End of variables declaration//GEN-END:variables
}
