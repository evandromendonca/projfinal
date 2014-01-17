/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.model.Sala;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro
 */
public class JPanelSalas extends javax.swing.JPanel {

    EstadoTela estadoTela;
    Sala salaCorrente;

    /**
     * Creates new form JPanelSalas
     */
    public JPanelSalas() {
        initComponents();

        salaCorrente = null;

        configInicial();
        definirLayout(EstadoTela.inicial);
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
        jLabel1 = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JSpinnerQuantidadeAlunos = new javax.swing.JSpinner();
        panelBotoesAcao = new javax.swing.JPanel();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();
        JButtonBuscar = new javax.swing.JButton();
        painelPesquisaCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePesquisa = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome.:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Quantidade máxima de alunos.:");

        JSpinnerQuantidadeAlunos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        JSpinnerQuantidadeAlunos.setName("JSpinnerQuantidadeAlunos"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSpinnerQuantidadeAlunos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JSpinnerQuantidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelBotoesAcao.setMaximumSize(new java.awt.Dimension(700, 75));
        panelBotoesAcao.setMinimumSize(new java.awt.Dimension(700, 75));

        JButtonExcluir.setText("Excluir");
        JButtonExcluir.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.setName("JButtonExcluir"); // NOI18N
        JButtonExcluir.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirActionPerformed(evt);
            }
        });

        JButtonAlterar.setText("Alterar");
        JButtonAlterar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.setName("JButtonAlterar"); // NOI18N
        JButtonAlterar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAcaoLayout = new javax.swing.GroupLayout(panelBotoesAcao);
        panelBotoesAcao.setLayout(panelBotoesAcaoLayout);
        panelBotoesAcaoLayout.setHorizontalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelBotoesAcaoLayout.setVerticalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAcaoLayout.createSequentialGroup()
                .addGroup(panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JButtonCadastrar.setText("Cadastrar");
        JButtonCadastrar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.setName("JButtonCadastrar"); // NOI18N
        JButtonCadastrar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastrarActionPerformed(evt);
            }
        });

        JButtonBuscar.setText("Buscar");
        JButtonBuscar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.setName("JButtonBuscar"); // NOI18N
        JButtonBuscar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });

        painelPesquisaCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 100));

        JTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade máxima de alunos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTablePesquisa.setShowHorizontalLines(false);
        JTablePesquisa.setShowVerticalLines(false);
        jScrollPane1.setViewportView(JTablePesquisa);

        javax.swing.GroupLayout painelPesquisaCursosLayout = new javax.swing.GroupLayout(painelPesquisaCursos);
        painelPesquisaCursos.setLayout(painelPesquisaCursosLayout);
        painelPesquisaCursosLayout.setHorizontalGroup(
            painelPesquisaCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPesquisaCursosLayout.setVerticalGroup(
            painelPesquisaCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursosLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotoesAcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma sala selecionada!");
            return;
        }

        try {
            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();

            String nomeSalaSelecionada = String.valueOf(modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0));
            Sala salaSelecionada = (Sala) new SalaController().buscaSalaPorNome(nomeSalaSelecionada);

            new SalaController().excluir(salaSelecionada.getId());
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir a sala!");
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma sala selecionada");
            return;
        }

        try {

            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
            Sala salaSelecionada = (Sala) modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0);            

            this.JTextNome.setText(salaSelecionada.getNome());
            this.JSpinnerQuantidadeAlunos.setValue(salaSelecionada.getQuantidadeUtil());
            salaCorrente = salaSelecionada;

            modelTable.removeRow(JTablePesquisa.getSelectedRow());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problemas ao alterar sala");
        }

        definirLayout(EstadoTela.alterando);
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        if (JTextNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campos de busca 'Nome' vazio!");
            return;
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Cadastrar")) {
            try {
                new SalaController().salvar(JTextNome.getText(), Integer.parseInt(JSpinnerQuantidadeAlunos.getValue().toString()));
                JOptionPane.showMessageDialog(this, "Cadastrada com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(JPanelSalas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Alterar")) {

            if (salaCorrente == null) {
                JOptionPane.showMessageDialog(this, "Nenhuma sala para ser alterada!");
                return;
            }

            try {
                new SalaController().alterar(salaCorrente.getId(), JTextNome.getText(), Integer.parseInt(JSpinnerQuantidadeAlunos.getValue().toString()));
                JOptionPane.showMessageDialog(this, "Alterada com sucesso!");
                salaCorrente = null;
            } catch (Exception ex) {
                Logger.getLogger(JPanelSalas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed

        ArrayList<Sala> salasBuscados = new ArrayList<>();

        if (JTextNome.getText().equalsIgnoreCase("")) {
            try {
                salasBuscados = new ArrayList<>(new SalaController().listaSalas());
            } catch (Exception e) {
                return;
            }
        } else if (!JTextNome.getText().equalsIgnoreCase("")) {
            try {
                salasBuscados = new ArrayList<>(new SalaController().buscaTodasSalasPorNome(JTextNome.getText()));
            } catch (Exception e) {
                return;
            }
        }

        if (salasBuscados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma sala encontrada!");
            return;
        }

        DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
        modelTable.setRowCount(0);

        for (Sala s : salasBuscados) {
            modelTable.addRow(new Object[]{s, s.getQuantidadeUtil()});
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCadastrar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JSpinner JSpinnerQuantidadeAlunos;
    private javax.swing.JTable JTablePesquisa;
    private javax.swing.JTextField JTextNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelPesquisaCursos;
    private javax.swing.JPanel panelBotoesAcao;
    // End of variables declaration//GEN-END:variables

    private void configInicial() {
        Color c = new Color(this.getBackground().getRGB());

        this.JButtonAlterar.setBackground(c);
        this.JButtonBuscar.setBackground(c);
        this.JButtonCadastrar.setBackground(c);
        this.JButtonExcluir.setBackground(c);
    }

    private void definirLayout(EstadoTela estado) {

        estadoTela = estado;

        if (estadoTela.equals(EstadoTela.inicial)) {
            JButtonExcluir.setEnabled(true);
            JButtonAlterar.setEnabled(true);
            JButtonBuscar.setEnabled(true);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Cadastrar");

            this.JTextNome.setText("");
            this.JSpinnerQuantidadeAlunos.setValue(1);
        }

        if (estadoTela.equals(EstadoTela.alterando)) {
            JButtonExcluir.setEnabled(false);
            JButtonAlterar.setEnabled(false);
            JButtonBuscar.setEnabled(false);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Alterar");
        }
    }

}
