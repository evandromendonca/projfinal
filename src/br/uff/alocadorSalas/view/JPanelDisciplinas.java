/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.controller.DisciplinaController;
import br.uff.alocadorSalas.model.Curso;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro
 */
public class JPanelDisciplinas extends javax.swing.JPanel {

    /**
     * Variáveis
     */
    EstadoTela estadoTela;
    Long idDisciplinaCorrente;

    /**
     * Creates new form JPanelDisciplinas
     */
    public JPanelDisciplinas() {
        initComponents();

        idDisciplinaCorrente = (long) 0;

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

        painelConfiguracaoDisciplinas = new javax.swing.JPanel();
        lNomeDisciplina = new javax.swing.JLabel();
        lCursoDisciplina = new javax.swing.JLabel();
        lPeriodoDisciplina = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        JComboBoxCurso = new javax.swing.JComboBox();
        JComboBoxPeriodo = new javax.swing.JComboBox();
        JButtonBuscar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();
        painelPesquisaCursos4 = new javax.swing.JPanel();
        scrollPesquisaCursos4 = new javax.swing.JScrollPane();
        JListPesquisa4 = new javax.swing.JList();
        panelBotoesAcao = new javax.swing.JPanel();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));

        painelConfiguracaoDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        lNomeDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeDisciplina.setText("Nome.:");

        lCursoDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lCursoDisciplina.setText("Curso.:");

        lPeriodoDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lPeriodoDisciplina.setText("Período.:");

        JComboBoxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxCursoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout painelConfiguracaoDisciplinasLayout = new javax.swing.GroupLayout(painelConfiguracaoDisciplinas);
        painelConfiguracaoDisciplinas.setLayout(painelConfiguracaoDisciplinasLayout);
        painelConfiguracaoDisciplinasLayout.setHorizontalGroup(
            painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                        .addComponent(lCursoDisciplina)
                        .addGap(18, 18, 18)
                        .addComponent(JComboBoxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                        .addComponent(lPeriodoDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JComboBoxPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                        .addComponent(lNomeDisciplina)
                        .addGap(18, 18, 18)
                        .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelConfiguracaoDisciplinasLayout.setVerticalGroup(
            painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeDisciplina)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCursoDisciplina)
                    .addComponent(JComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPeriodoDisciplina)
                    .addComponent(JComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

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

        painelPesquisaCursos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        JListPesquisa4.setModel(new DefaultListModel());
        JListPesquisa4.setName("JListPesquisa"); // NOI18N
        scrollPesquisaCursos4.setViewportView(JListPesquisa4);

        javax.swing.GroupLayout painelPesquisaCursos4Layout = new javax.swing.GroupLayout(painelPesquisaCursos4);
        painelPesquisaCursos4.setLayout(painelPesquisaCursos4Layout);
        painelPesquisaCursos4Layout.setHorizontalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPesquisaCursos4)
                .addContainerGap())
        );
        painelPesquisaCursos4Layout.setVerticalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelConfiguracaoDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfiguracaoDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed

//        ArrayList<Disciplina> cursosBuscados = new ArrayList<>();
//
//        if ((JTextNome.getText().equalsIgnoreCase("")) && (JTextSigla.getText().equalsIgnoreCase(""))) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().listaCursos());
//            } catch (Exception e) {
//                return;
//            }
//        } else if ((!JTextNome.getText().equalsIgnoreCase("")) && (!JTextSigla.getText().equalsIgnoreCase(""))) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosPorNomeESigla(JTextNome.getText(), JTextSigla.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        } else if (!JTextNome.getText().equalsIgnoreCase("")) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosCursoPorNome(JTextNome.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        } else if (!JTextSigla.getText().equalsIgnoreCase("")) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosCursoPorSigla(JTextSigla.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        }
//
//        if (cursosBuscados.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Nenhum curso encontrado!");
//            return;
//        }
//
//        DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
//        model.clear();
//
//        for (Curso c : cursosBuscados) {
//            model.add(model.getSize(), c.getNome() + "/" + c.getSigla() + "/" + c.getQuantidadePeriodos());
//        }
//
//        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        if ((JTextNome.getText().equalsIgnoreCase("")) || (JComboBoxCurso.getSelectedIndex() == -1) || (JComboBoxPeriodo.getSelectedIndex() == -1)) {
            JOptionPane.showMessageDialog(this, "Campos de busca 'Nome'ou 'Curso' ou 'Periodo' vazios!");
            return;
        }

        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        DefaultComboBoxModel modelPeriodo = (DefaultComboBoxModel) JComboBoxPeriodo.getModel();

        if (JButtonCadastrar.getText().equalsIgnoreCase("Cadastrar")) {
            try {
                new DisciplinaController().salvar(JTextNome.getText(), Integer.parseInt(modelPeriodo.getSelectedItem().toString()), (Curso) modelCurso.getSelectedItem());
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Alterar")) {

            if (idDisciplinaCorrente == 0) {
                JOptionPane.showMessageDialog(this, "Nenhuma disciplina para ser alterada!");
                return;
            }

            try {
                new DisciplinaController().alterar(idDisciplinaCorrente, JTextNome.getText(), Integer.parseInt(modelPeriodo.getSelectedItem().toString()), (Curso) modelCurso.getSelectedItem());
                JOptionPane.showMessageDialog(this, "Alterada com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        if (JListPesquisa.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum curso selecionado");
            return;
        }

        try {
            DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
            String textoSelecionado = (String) model.getElementAt(JListPesquisa.getSelectedIndex());
            Long id = new CursosController().buscaCursoPorNome(textoSelecionado.split("/")[0]).getId();
            new CursosController().excluir(id);
            model.remove(JListPesquisa.getSelectedIndex());
        } catch (Exception ex) {
            Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        if (JListPesquisa.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum curso selecionado");
            return;
        }

        try {
            DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
            String textoSelecionado = (String) model.getElementAt(JListPesquisa.getSelectedIndex());
            Curso curso = new CursosController().buscaCursoPorNome(textoSelecionado.split("/")[0]);

//            this.JTextNome.setText(curso.getNome());
//            this.JTextSigla.setText(curso.getSigla());
//            this.JSpinnerQuantidadePeriodos.setValue(curso.getQuantidadePeriodos());
//            this.idCursoCorrente = curso.getId();
            model.remove(JListPesquisa.getSelectedIndex());
        } catch (Exception ex) {
            Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        definirLayout(EstadoTela.alterando);
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JComboBoxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxCursoItemStateChanged
        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        preencherComboPeriodo((Curso)modelCurso.getSelectedItem());
    }//GEN-LAST:event_JComboBoxCursoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCadastrar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JComboBox JComboBoxCurso;
    private javax.swing.JComboBox JComboBoxPeriodo;
    private javax.swing.JList JListPesquisa;
    private javax.swing.JList JListPesquisa1;
    private javax.swing.JList JListPesquisa2;
    private javax.swing.JList JListPesquisa3;
    private javax.swing.JList JListPesquisa4;
    private javax.swing.JTextField JTextNome;
    private javax.swing.JLabel lCursoDisciplina;
    private javax.swing.JLabel lNomeDisciplina;
    private javax.swing.JLabel lPeriodoDisciplina;
    private javax.swing.JPanel painelConfiguracaoDisciplinas;
    private javax.swing.JPanel painelPesquisaCursos;
    private javax.swing.JPanel painelPesquisaCursos1;
    private javax.swing.JPanel painelPesquisaCursos2;
    private javax.swing.JPanel painelPesquisaCursos3;
    private javax.swing.JPanel painelPesquisaCursos4;
    private javax.swing.JPanel panelBotoesAcao;
    private javax.swing.JScrollPane scrollPesquisaCursos;
    private javax.swing.JScrollPane scrollPesquisaCursos1;
    private javax.swing.JScrollPane scrollPesquisaCursos2;
    private javax.swing.JScrollPane scrollPesquisaCursos3;
    private javax.swing.JScrollPane scrollPesquisaCursos4;
    // End of variables declaration//GEN-END:variables

    public void configInicial() {
        Color c = new Color(this.getBackground().getRGB());

        this.JButtonAlterar.setBackground(c);
        this.JButtonBuscar.setBackground(c);
        this.JButtonCadastrar.setBackground(c);
        this.JButtonExcluir.setBackground(c);
    }

    public void definirLayout(EstadoTela estado) {

        estadoTela = estado;

        if (estadoTela.equals(EstadoTela.inicial)) {
            JButtonExcluir.setEnabled(true);
            JButtonAlterar.setEnabled(true);
            JButtonBuscar.setEnabled(true);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Cadastrar");

            this.JTextNome.setText("");
            this.JComboBoxCurso.setSelectedIndex(-1);
            this.JComboBoxPeriodo.setSelectedIndex(-1);
        }

        if (estadoTela.equals(EstadoTela.alterando)) {
            JButtonExcluir.setEnabled(false);
            JButtonAlterar.setEnabled(false);
            JButtonBuscar.setEnabled(false);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Alterar");
        }
        
        preencherComboCurso();
    }

    public void preencherComboCurso() {
        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
                
        try {
            ArrayList<Curso> cursosBuscados = new ArrayList<>(new CursosController().listaCursos());

            for (Curso c : cursosBuscados) {
                modelCurso.addElement(c);
            }            

        } catch (Exception ex) {
            Logger.getLogger(JPanelDisciplinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preencherComboPeriodo(Curso c) {
        DefaultComboBoxModel modelPeriodo = (DefaultComboBoxModel) JComboBoxPeriodo.getModel();
        
        for (int i = 0; i < c.getQuantidadePeriodos(); i++) {            
            modelPeriodo.addElement(i);
        }                
    }

}