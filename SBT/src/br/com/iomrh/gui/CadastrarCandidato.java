/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.gui;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.beans.Profissao;
import br.com.iomrh.dao.CandidatoDAO;
import br.com.iomrh.dao.ProfissaoDAO;
import br.com.iomrh.helpers.Validadores;
import br.com.iomrh.listeners.CadastrarCandidatoListener;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author rpa teste
 */
public class CadastrarCandidato extends javax.swing.JInternalFrame {
    
    
    ButtonGroup buttonGroupSexo = new ButtonGroup(); 
    ButtonGroup buttonGroupPNE = new ButtonGroup(); 
    ButtonGroup buttonGroupDispViajar = new ButtonGroup(); 
    
    public CadastrarCandidato() {
  
       initComponents();
       CadastrarCandidatoListener cadastrarCandidatoListener = new CadastrarCandidatoListener();

        
        buttonGroupSexo.add(Button__Candidato__feminino);
        buttonGroupSexo.add(Button__Candidato__masculino);
        
        buttonGroupPNE.add(Button__Candidato__portadorNecessidadesEspeciais__sim);
        buttonGroupPNE.add(Button__Candidato__portadorNecessidadesEspeciais__nao);
        
        buttonGroupDispViajar.add(Button__Candidato__disponibilidadeViajar__sim);
        buttonGroupDispViajar.add(Button__Candidato__disponibilidadeViajar__nao);
        
        //Popula  o combobox profissão
        ProfissaoDAO profissaoDAO = new ProfissaoDAO();
        List<Profissao> profissoes = profissaoDAO.listarProfissoes();
        
        for(Profissao profissao : profissoes) {
            ComboBox__Candidato__profissao.addItem(profissao);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button__Candidato__sexo = new javax.swing.ButtonGroup();
        jLabel__Mensagem_Candidato__nome3 = new javax.swing.JLabel();
        jLabel__Mensagem_Candidato__nome5 = new javax.swing.JLabel();
        jLabel__Mensagem_Candidato__nome10 = new javax.swing.JLabel();
        javax.swing.JPanel jPanelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Label__Candidato__nome = new javax.swing.JLabel();
        Field__Candidato__nome = new javax.swing.JTextField();
        Field__Candidato__sobrenome = new javax.swing.JTextField();
        Label__Candidato__sexo = new javax.swing.JLabel();
        Button__Candidato__masculino = new javax.swing.JRadioButton();
        Button__Candidato__feminino = new javax.swing.JRadioButton();
        Label__Candidato__CPF = new javax.swing.JLabel();
        Field__Candidato__CPF = new javax.swing.JTextField();
        Label__Candidato__RG = new javax.swing.JLabel();
        Field__Candidato__RG = new javax.swing.JTextField();
        Label__Candidato__dataNascimento = new javax.swing.JLabel();
        Field__Candidato__dataNascimento = new javax.swing.JTextField();
        Label__Candidato__estadoCivil = new javax.swing.JLabel();
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil = new javax.swing.JComboBox();
        Label__Candidato__quantFilhos = new javax.swing.JLabel();
        Field__Candidato__quantFilhos = new javax.swing.JTextField();
        Label__Candidato__portadorNecessidadesEspeciais = new javax.swing.JLabel();
        Field__Candidato__portadorNecessidadesEspeciais = new javax.swing.JTextField();
        Button__Candidato__portadorNecessidadesEspeciais__sim = new javax.swing.JRadioButton();
        Button__Candidato__portadorNecessidadesEspeciais__nao = new javax.swing.JRadioButton();
        Label__Candidato__dispisponibilidadeViajar = new javax.swing.JLabel();
        Button__Candidato__disponibilidadeViajar__sim = new javax.swing.JRadioButton();
        Button__Candidato__disponibilidadeViajar__nao = new javax.swing.JRadioButton();
        Label__Candidato_cnhPossui = new javax.swing.JLabel();
        ComboBox__Candidato__cnhPossui = new javax.swing.JComboBox();
        Label__Candidato__veiculo = new javax.swing.JLabel();
        ComboBox__Candidato__veiculo = new javax.swing.JComboBox();
        jLabel_Mensagens = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__Field__Candidato__nome = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__sobrenome = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__RG = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__CPF = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__dataNascimento = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__ComboBox__Candidato__veiculo = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__quantFilhos = new javax.swing.JLabel();
        jLabel__Mensagem__ComboBox__Candidato__cnhPossui = new javax.swing.JLabel();
        jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Label__Candidato__nome1 = new javax.swing.JLabel();
        Field__Telefone__telefone1 = new javax.swing.JTextField();
        Field__Telefone__tipoTelefone1 = new javax.swing.JComboBox();
        Label__Candidato__nome2 = new javax.swing.JLabel();
        Field__Telefone__telefone2 = new javax.swing.JTextField();
        Field__Telefone__tipoTelefone2 = new javax.swing.JComboBox();
        Label__Candidato__nome3 = new javax.swing.JLabel();
        Field__Telefone__telefone3 = new javax.swing.JTextField();
        Field__Telefone__tipoTelefone3 = new javax.swing.JComboBox();
        Label__Candidato__nome4 = new javax.swing.JLabel();
        Field__Candidato_email = new javax.swing.JTextField();
        Label__Candidato__nome5 = new javax.swing.JLabel();
        Field__RedeSocial__redeSocial = new javax.swing.JTextField();
        jLabel__Mensagem__Field__Telefone__telefone1 = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Telefone__telefone2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__Field__Telefone__telefone3 = new javax.swing.JLabel();
        jLabel__Mensagem__Field__Candidato__nome4 = new javax.swing.JLabel();
        jLabel__Mensagem__Field__RedeSocial__redeSocial = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Field__ComboBox__Estado = new javax.swing.JComboBox();
        Label__Candidato__estadoCivil1 = new javax.swing.JLabel();
        Label__Candidato__estadoCivil2 = new javax.swing.JLabel();
        javax.swing.JComboBox Field__ComboBox__Cidade = new javax.swing.JComboBox();
        Field__ComboBox__Bairro = new javax.swing.JComboBox();
        Label__Candidato__estadoCivil3 = new javax.swing.JLabel();
        Field__ComboBox__Logradouro = new javax.swing.JComboBox();
        Label__Candidato__estadoCivil4 = new javax.swing.JLabel();
        Label__Candidato__nome6 = new javax.swing.JLabel();
        Field__Endereco__numero = new javax.swing.JTextField();
        Field__Endereco__complemento = new javax.swing.JTextField();
        Label__Candidato__nome7 = new javax.swing.JLabel();
        javax.swing.JTextField Field__Endereco_pontoReferencia = new javax.swing.JTextField();
        Label__Candidato__nome8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__Field__ComboBox__Estado = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__Field__ComboBox__Cidade = new javax.swing.JLabel();
        jLabel__Mensagem__Field__ComboBox__Bairro = new javax.swing.JLabel();
        jLabel__Mensagem__Field__ComboBox__Logradouro = new javax.swing.JLabel();
        javax.swing.JLabel jLabel__Mensagem__Field__Endereco__numero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Label__Candidato__cursos = new javax.swing.JLabel();
        Label__Candidato__cursos_idioma = new javax.swing.JLabel();
        ScrollPane__Candidato__cursos = new javax.swing.JScrollPane();
        Table__FormacaoAcademica = new javax.swing.JTable();
        Label__Candidato__cursos_informatica = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table__Informatica = new javax.swing.JTable();
        ScrollPane__Candidato__cursos1 = new javax.swing.JScrollPane();
        Table__Idioma = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        ScrollPane__Candidato__experienciaProfissional = new javax.swing.JScrollPane();
        Table__Candidato__experienciaProfissional = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        ScrollPane__Candidato__indisponibilidadeCandidato = new javax.swing.JScrollPane();
        Table__Candidato__indisponibilidadeCandidato = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Label__Candidato__caracteristica1 = new javax.swing.JLabel();
        ScrollPane__Candidato__caracteristica1 = new javax.swing.JScrollPane();
        Area__Candidato__caracteristica1 = new javax.swing.JTextArea();
        CheckBox__Candidato__gerencia = new javax.swing.JCheckBox();
        CheckBox__Candidato__primeiroEmprego = new javax.swing.JCheckBox();
        ComboBox__Candidato__profissao = new javax.swing.JComboBox();
        ComboBox__Candidato__pretencaoSalarial = new javax.swing.JTextField();
        Label__Candidato__pretencaoSalarial = new javax.swing.JLabel();
        Label__Candidato__profissao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Button__Candidato__cadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel__Mensagem_Candidato__nome3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem_Candidato__nome3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");

        jLabel__Mensagem_Candidato__nome5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem_Candidato__nome5.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");

        jLabel__Mensagem_Candidato__nome10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem_Candidato__nome10.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        Label__Candidato__nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome.setText("Nome ");

        Field__Candidato__nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__nome.setName("nome"); // NOI18N
        Field__Candidato__nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Candidato__nomeActionPerformed(evt);
            }
        });

        Field__Candidato__sobrenome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__sobrenome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__sobrenome.setName("sobrenome"); // NOI18N

        Label__Candidato__sexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__sexo.setText("Sexo");

        Button__Candidato__masculino.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__masculino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__masculino.setText("Masculino");

        Button__Candidato__feminino.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__feminino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__feminino.setText("Feminino");
        Button__Candidato__feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button__Candidato__femininoActionPerformed(evt);
            }
        });

        Label__Candidato__CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__CPF.setText("CPF");

        Field__Candidato__CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__CPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__CPF.setName("CPF"); // NOI18N
        Field__Candidato__CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Candidato__CPFActionPerformed(evt);
            }
        });

        Label__Candidato__RG.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__RG.setText("RG");

        Field__Candidato__RG.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__RG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__RG.setName("RG"); // NOI18N

        Label__Candidato__dataNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__dataNascimento.setText("Data de Nasc.");

        Field__Candidato__dataNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__dataNascimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__dataNascimento.setName("Data de nascimento"); // NOI18N

        Label__Candidato__estadoCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__estadoCivil.setText("Estado Civil");

        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)'", "Outros" }));
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setName("Estado Civil"); // NOI18N
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel__Mensagem__ComboBox__Candidato__estadoCivilActionPerformed(evt);
            }
        });

        Label__Candidato__quantFilhos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__quantFilhos.setText("Quant. de Filhos");

        Field__Candidato__quantFilhos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__quantFilhos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato__quantFilhos.setName("Quant. de filhos"); // NOI18N
        Field__Candidato__quantFilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Candidato__quantFilhosActionPerformed(evt);
            }
        });

        Label__Candidato__portadorNecessidadesEspeciais.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__portadorNecessidadesEspeciais.setText("PNE");

        Field__Candidato__portadorNecessidadesEspeciais.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato__portadorNecessidadesEspeciais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Button__Candidato__portadorNecessidadesEspeciais__sim.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__portadorNecessidadesEspeciais__sim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__portadorNecessidadesEspeciais__sim.setText("Sim");

        Button__Candidato__portadorNecessidadesEspeciais__nao.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__portadorNecessidadesEspeciais__nao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__portadorNecessidadesEspeciais__nao.setText("Nao");

        Label__Candidato__dispisponibilidadeViajar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__dispisponibilidadeViajar.setText("Disp. Viajar");

        Button__Candidato__disponibilidadeViajar__sim.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__disponibilidadeViajar__sim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__disponibilidadeViajar__sim.setText("Sim");

        Button__Candidato__disponibilidadeViajar__nao.setBackground(new java.awt.Color(255, 255, 255));
        Button__Candidato__disponibilidadeViajar__nao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button__Candidato__disponibilidadeViajar__nao.setText("Nao");

        Label__Candidato_cnhPossui.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato_cnhPossui.setText("CNH");

        ComboBox__Candidato__cnhPossui.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ComboBox__Candidato__cnhPossui.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "A", "B", "C", "D", "E", "Nao Possui" }));
        ComboBox__Candidato__cnhPossui.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboBox__Candidato__cnhPossui.setName("CNH"); // NOI18N
        ComboBox__Candidato__cnhPossui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__cnhPossuiActionPerformed(evt);
            }
        });

        Label__Candidato__veiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__veiculo.setText("Veiculo");

        ComboBox__Candidato__veiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ComboBox__Candidato__veiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Carro", "Moto", "Outro", "Não Possui" }));
        ComboBox__Candidato__veiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboBox__Candidato__veiculo.setName("Veículo"); // NOI18N
        ComboBox__Candidato__veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__veiculoActionPerformed(evt);
            }
        });

        jLabel__Mensagem__Field__Candidato__nome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__nome.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__nome.setText("Informe o prenome do candidato");
        jLabel__Mensagem__Field__Candidato__nome.setName("jLabel__Mensagem__Field__Candidato__nome"); // NOI18N

        jLabel__Mensagem__Field__Candidato__sobrenome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__sobrenome.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__sobrenome.setText("Informe o sobrenome do candidato");
        jLabel__Mensagem__Field__Candidato__sobrenome.setName("jLabel__Mensagem__Field__Candidato__sobrenome"); // NOI18N

        jLabel__Mensagem__Field__Candidato__RG.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__RG.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__RG.setText("Informe o RG");
        jLabel__Mensagem__Field__Candidato__RG.setName("jLabel__Mensagem__Field__Candidato__RG"); // NOI18N

        jLabel__Mensagem__Field__Candidato__CPF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__CPF.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__CPF.setText("Informe o CPF");
        jLabel__Mensagem__Field__Candidato__CPF.setName("jLabel__Mensagem__Field__Candidato__CPF"); // NOI18N

        jLabel__Mensagem__Field__Candidato__dataNascimento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__dataNascimento.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__dataNascimento.setText("Informe a data de nascimento");

        jLabel__Mensagem__ComboBox__Candidato__veiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__ComboBox__Candidato__veiculo.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__ComboBox__Candidato__veiculo.setText("Informe o tipo de veículo");

        jLabel__Mensagem__Field__Candidato__quantFilhos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__quantFilhos.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__quantFilhos.setText("Informe a quantidade de filhos");

        jLabel__Mensagem__ComboBox__Candidato__cnhPossui.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__ComboBox__Candidato__cnhPossui.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__ComboBox__Candidato__cnhPossui.setText("Informe o CNH");

        jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil.setText("Informe o estado civil do candidato");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel_Mensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel__Mensagem__Field__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel__Mensagem__Field__Candidato__sobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(Field__Candidato__sobrenome))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label__Candidato_cnhPossui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label__Candidato__dispisponibilidadeViajar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(Label__Candidato__veiculo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel__Mensagem__ComboBox__Candidato__veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(ComboBox__Candidato__veiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Label__Candidato__dataNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Label__Candidato__sexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Label__Candidato__CPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Field__Candidato__dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Label__Candidato__quantFilhos))
                                            .addComponent(jLabel__Mensagem__Field__Candidato__dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Field__Candidato__quantFilhos)
                                            .addComponent(jLabel__Mensagem__Field__Candidato__quantFilhos, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(Button__Candidato__masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button__Candidato__feminino))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel__Mensagem__Field__Candidato__CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Field__Candidato__CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Label__Candidato__RG)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Field__Candidato__RG)
                                            .addComponent(jLabel__Mensagem__Field__Candidato__RG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label__Candidato__portadorNecessidadesEspeciais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label__Candidato__estadoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__sim)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__nao)
                                        .addGap(20, 20, 20)
                                        .addComponent(Field__Candidato__portadorNecessidadesEspeciais))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel__Mensagem__ComboBox__Candidato__estadoCivil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Button__Candidato__disponibilidadeViajar__sim)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button__Candidato__disponibilidadeViajar__nao))
                                    .addComponent(ComboBox__Candidato__cnhPossui, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel__Mensagem__ComboBox__Candidato__cnhPossui, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel_Mensagens)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome)
                    .addComponent(Field__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field__Candidato__sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel__Mensagem__Field__Candidato__nome)
                    .addComponent(jLabel__Mensagem__Field__Candidato__sobrenome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__sexo)
                    .addComponent(Button__Candidato__masculino)
                    .addComponent(jLabel6)
                    .addComponent(Button__Candidato__feminino))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Field__Candidato__CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label__Candidato__RG)
                            .addComponent(Field__Candidato__RG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel__Mensagem__Field__Candidato__RG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label__Candidato__dataNascimento)
                            .addComponent(Field__Candidato__dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label__Candidato__quantFilhos)
                            .addComponent(Field__Candidato__quantFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel__Mensagem__Field__Candidato__dataNascimento)
                            .addComponent(jLabel__Mensagem__Field__Candidato__quantFilhos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label__Candidato__estadoCivil)
                            .addComponent(jLabel__Mensagem__ComboBox__Candidato__estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label__Candidato__portadorNecessidadesEspeciais)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Button__Candidato__portadorNecessidadesEspeciais__sim, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Field__Candidato__portadorNecessidadesEspeciais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button__Candidato__portadorNecessidadesEspeciais__nao))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label__Candidato__dispisponibilidadeViajar)
                            .addComponent(jLabel11)
                            .addComponent(Button__Candidato__disponibilidadeViajar__sim)
                            .addComponent(Button__Candidato__disponibilidadeViajar__nao))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label__Candidato_cnhPossui)
                            .addComponent(ComboBox__Candidato__cnhPossui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label__Candidato__veiculo)
                            .addComponent(ComboBox__Candidato__veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel__Mensagem__ComboBox__Candidato__veiculo)
                            .addComponent(jLabel__Mensagem__ComboBox__Candidato__cnhPossui)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label__Candidato__CPF)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel__Mensagem__Field__Candidato__CPF)))
                .addGap(64, 64, 64))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Field__Candidato__nome, Field__Candidato__sobrenome});

        Label__Candidato__nome.getAccessibleContext().setAccessibleName("Label__Candidato__prenome");
        Field__Candidato__nome.getAccessibleContext().setAccessibleName("TField__Candidato__prenome");
        Field__Candidato__sobrenome.getAccessibleContext().setAccessibleName("TField2__Candidato__sobrenome");
        Label__Candidato__sexo.getAccessibleContext().setAccessibleName("Label__Candidato__sexo");
        Button__Candidato__masculino.getAccessibleContext().setAccessibleName("Button__Candidato__sexoMasculino");
        Button__Candidato__feminino.getAccessibleContext().setAccessibleName("Button__Candidato__sexoFeminino");
        Button__Candidato__feminino.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__CPF.getAccessibleContext().setAccessibleName("Label__Candidato__CPF");
        Field__Candidato__CPF.getAccessibleContext().setAccessibleName("Field__Candidato__CPF");
        Label__Candidato__RG.getAccessibleContext().setAccessibleName("Label__Candidato__RG");
        Field__Candidato__RG.getAccessibleContext().setAccessibleName("Field__Candidato__RG");
        Label__Candidato__dataNascimento.getAccessibleContext().setAccessibleName("Label__Candidato__dataNascimento");
        Field__Candidato__dataNascimento.getAccessibleContext().setAccessibleName("Field__Candidato__dataNascimento");
        Label__Candidato__estadoCivil.getAccessibleContext().setAccessibleName("Label__Candidato__estadoCivil");
        jLabel__Mensagem__ComboBox__Candidato__estadoCivil.getAccessibleContext().setAccessibleName("ComboBox__Candidato__estadoCivil");
        Label__Candidato__quantFilhos.getAccessibleContext().setAccessibleName("Label__Candidato__quantFilhos");
        Field__Candidato__quantFilhos.getAccessibleContext().setAccessibleName("Field__Candidato__quantFilhos");
        Label__Candidato__portadorNecessidadesEspeciais.getAccessibleContext().setAccessibleName("Label__Candidato__portadorNecessidadesEspeciais");
        Field__Candidato__portadorNecessidadesEspeciais.getAccessibleContext().setAccessibleName("Field__Candidato__portadorNecessidadesEspeciais");
        Button__Candidato__portadorNecessidadesEspeciais__sim.getAccessibleContext().setAccessibleName("Button__Candidato__portadorNecessidadesEspeciais__sim");
        Button__Candidato__portadorNecessidadesEspeciais__nao.getAccessibleContext().setAccessibleName("Button__Candidato__portadorNecessidadesEspeciais__nao");
        Label__Candidato__dispisponibilidadeViajar.getAccessibleContext().setAccessibleName("Label__Candidato__disponibilidadeViajar");
        Label__Candidato__dispisponibilidadeViajar.getAccessibleContext().setAccessibleDescription("");
        Button__Candidato__disponibilidadeViajar__sim.getAccessibleContext().setAccessibleName("Button__Candidato__disponibilidadeViajar__sim");
        Button__Candidato__disponibilidadeViajar__nao.getAccessibleContext().setAccessibleName("Button__Candidato__disponibilidadeViajar__nao");
        Button__Candidato__disponibilidadeViajar__nao.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato_cnhPossui.getAccessibleContext().setAccessibleName("Label__Candidato_cnhPossui");
        Label__Candidato_cnhPossui.getAccessibleContext().setAccessibleDescription("");
        ComboBox__Candidato__cnhPossui.getAccessibleContext().setAccessibleName("ComboBox__Candidato__cnhPossui");
        ComboBox__Candidato__cnhPossui.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__veiculo.getAccessibleContext().setAccessibleName("Label__Candidato__veiculo");
        ComboBox__Candidato__veiculo.getAccessibleContext().setAccessibleName("ComboBox__Candidato__veiculo");
        ComboBox__Candidato__veiculo.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Dados Pessoais", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Label__Candidato__nome1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome1.setText("Telefone 1");

        Field__Telefone__telefone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__telefone1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__telefone1.setName("nome"); // NOI18N
        Field__Telefone__telefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__telefone1ActionPerformed(evt);
            }
        });

        Field__Telefone__tipoTelefone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__tipoTelefone1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Móvel", "Fixo" }));
        Field__Telefone__tipoTelefone1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__tipoTelefone1.setName("Estado Civil"); // NOI18N
        Field__Telefone__tipoTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__tipoTelefone1ActionPerformed(evt);
            }
        });

        Label__Candidato__nome2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome2.setText("Telefone 2");

        Field__Telefone__telefone2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__telefone2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__telefone2.setName("nome"); // NOI18N
        Field__Telefone__telefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__telefone2ActionPerformed(evt);
            }
        });

        Field__Telefone__tipoTelefone2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__tipoTelefone2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Móvel", "Fixo" }));
        Field__Telefone__tipoTelefone2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__tipoTelefone2.setName("Estado Civil"); // NOI18N
        Field__Telefone__tipoTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__tipoTelefone2ActionPerformed(evt);
            }
        });

        Label__Candidato__nome3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome3.setText("Telefone 3");

        Field__Telefone__telefone3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__telefone3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__telefone3.setName("nome"); // NOI18N
        Field__Telefone__telefone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__telefone3ActionPerformed(evt);
            }
        });

        Field__Telefone__tipoTelefone3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Telefone__tipoTelefone3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Móvel", "Fixo" }));
        Field__Telefone__tipoTelefone3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Telefone__tipoTelefone3.setName("Estado Civil"); // NOI18N
        Field__Telefone__tipoTelefone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Telefone__tipoTelefone3ActionPerformed(evt);
            }
        });

        Label__Candidato__nome4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome4.setText("Email");

        Field__Candidato_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Candidato_email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Candidato_email.setName("nome"); // NOI18N
        Field__Candidato_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Candidato_emailActionPerformed(evt);
            }
        });

        Label__Candidato__nome5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome5.setText("Rede social");

        Field__RedeSocial__redeSocial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__RedeSocial__redeSocial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__RedeSocial__redeSocial.setName("nome"); // NOI18N
        Field__RedeSocial__redeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__RedeSocial__redeSocialActionPerformed(evt);
            }
        });

        jLabel__Mensagem__Field__Telefone__telefone1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Telefone__telefone1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Telefone__telefone1.setText("Informe o telefone");

        jLabel__Mensagem__Field__Telefone__telefone2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Telefone__telefone2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Telefone__telefone2.setText("Informe o telefone");

        jLabel__Mensagem__Field__Telefone__telefone3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Telefone__telefone3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Telefone__telefone3.setText("Informe o telefone");

        jLabel__Mensagem__Field__Candidato__nome4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Candidato__nome4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Candidato__nome4.setText("Informe o email");

        jLabel__Mensagem__Field__RedeSocial__redeSocial.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__RedeSocial__redeSocial.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__RedeSocial__redeSocial.setText("Informe o link de rede social");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel__Mensagem__Field__Candidato__nome4, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                            .addComponent(Field__Candidato_email)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome5)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field__RedeSocial__redeSocial)
                            .addComponent(jLabel__Mensagem__Field__RedeSocial__redeSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel__Mensagem__Field__Telefone__telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Field__Telefone__telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Field__Telefone__tipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel__Mensagem__Field__Telefone__telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Field__Telefone__telefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Field__Telefone__tipoTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel__Mensagem__Field__Telefone__telefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__nome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(Field__Telefone__telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Field__Telefone__tipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome1)
                    .addComponent(Field__Telefone__telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field__Telefone__tipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel__Mensagem__Field__Telefone__telefone1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome2)
                    .addComponent(Field__Telefone__telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field__Telefone__tipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel__Mensagem__Field__Telefone__telefone2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome3)
                    .addComponent(Field__Telefone__telefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field__Telefone__tipoTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel__Mensagem__Field__Telefone__telefone3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome4)
                    .addComponent(Field__Candidato_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel__Mensagem__Field__Candidato__nome4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome5)
                    .addComponent(Field__RedeSocial__redeSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__RedeSocial__redeSocial)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contato", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Field__ComboBox__Estado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__ComboBox__Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)'", "Outros" }));
        Field__ComboBox__Estado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__ComboBox__Estado.setName("Estado Civil"); // NOI18N
        Field__ComboBox__Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__ComboBox__EstadoActionPerformed(evt);
            }
        });

        Label__Candidato__estadoCivil1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__estadoCivil1.setText("Estado");

        Label__Candidato__estadoCivil2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__estadoCivil2.setText("Cidade");

        Field__ComboBox__Cidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__ComboBox__Cidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)'", "Outros" }));
        Field__ComboBox__Cidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__ComboBox__Cidade.setName("Estado Civil"); // NOI18N
        Field__ComboBox__Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__ComboBox__CidadeActionPerformed(evt);
            }
        });

        Field__ComboBox__Bairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__ComboBox__Bairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)'", "Outros" }));
        Field__ComboBox__Bairro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__ComboBox__Bairro.setName("Estado Civil"); // NOI18N
        Field__ComboBox__Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__ComboBox__BairroActionPerformed(evt);
            }
        });

        Label__Candidato__estadoCivil3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__estadoCivil3.setText("Bairro");

        Field__ComboBox__Logradouro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__ComboBox__Logradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)'", "Outros" }));
        Field__ComboBox__Logradouro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__ComboBox__Logradouro.setName("Estado Civil"); // NOI18N
        Field__ComboBox__Logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__ComboBox__LogradouroActionPerformed(evt);
            }
        });

        Label__Candidato__estadoCivil4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label__Candidato__estadoCivil4.setText("Logradouro");

        Label__Candidato__nome6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome6.setText("Número");

        Field__Endereco__numero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Endereco__numero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Endereco__numero.setName("nome"); // NOI18N
        Field__Endereco__numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Endereco__numeroActionPerformed(evt);
            }
        });

        Field__Endereco__complemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Endereco__complemento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Endereco__complemento.setName("nome"); // NOI18N
        Field__Endereco__complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Endereco__complementoActionPerformed(evt);
            }
        });

        Label__Candidato__nome7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome7.setText("Complemento ");

        Field__Endereco_pontoReferencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Field__Endereco_pontoReferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field__Endereco_pontoReferencia.setName("nome"); // NOI18N
        Field__Endereco_pontoReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Endereco_pontoReferenciaActionPerformed(evt);
            }
        });

        Label__Candidato__nome8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__nome8.setText("Ponto de referencia");

        jLabel__Mensagem__Field__ComboBox__Estado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__ComboBox__Estado.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__ComboBox__Estado.setText("Informe o estado");

        jLabel__Mensagem__Field__ComboBox__Cidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__ComboBox__Cidade.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__ComboBox__Cidade.setText("Informe a cidade");

        jLabel__Mensagem__Field__ComboBox__Bairro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__ComboBox__Bairro.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__ComboBox__Bairro.setText("Informe o bairro");

        jLabel__Mensagem__Field__ComboBox__Logradouro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__ComboBox__Logradouro.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__ComboBox__Logradouro.setText("Informe o logradouro");

        jLabel__Mensagem__Field__Endereco__numero.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel__Mensagem__Field__Endereco__numero.setForeground(new java.awt.Color(255, 0, 51));
        jLabel__Mensagem__Field__Endereco__numero.setText("Informe o número do endereço");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label__Candidato__nome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label__Candidato__nome8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Label__Candidato__nome7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field__Endereco__numero)
                            .addComponent(Field__Endereco__complemento)
                            .addComponent(Field__Endereco_pontoReferencia)
                            .addComponent(jLabel__Mensagem__Field__Endereco__numero, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label__Candidato__estadoCivil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label__Candidato__estadoCivil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label__Candidato__estadoCivil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label__Candidato__estadoCivil4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field__ComboBox__Logradouro, javax.swing.GroupLayout.Alignment.TRAILING, 0, 796, Short.MAX_VALUE)
                            .addComponent(Field__ComboBox__Bairro, javax.swing.GroupLayout.Alignment.TRAILING, 0, 796, Short.MAX_VALUE)
                            .addComponent(Field__ComboBox__Cidade, javax.swing.GroupLayout.Alignment.TRAILING, 0, 796, Short.MAX_VALUE)
                            .addComponent(Field__ComboBox__Estado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel__Mensagem__Field__ComboBox__Estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel__Mensagem__Field__ComboBox__Cidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel__Mensagem__Field__ComboBox__Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel__Mensagem__Field__ComboBox__Logradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__estadoCivil1)
                    .addComponent(Field__ComboBox__Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__ComboBox__Estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__estadoCivil2)
                    .addComponent(Field__ComboBox__Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__ComboBox__Cidade)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__estadoCivil3)
                    .addComponent(Field__ComboBox__Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__ComboBox__Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__estadoCivil4)
                    .addComponent(Field__ComboBox__Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__ComboBox__Logradouro)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field__Endereco__numero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label__Candidato__nome6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel__Mensagem__Field__Endereco__numero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field__Endereco__complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label__Candidato__nome7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field__Endereco_pontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label__Candidato__nome8))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Label__Candidato__cursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label__Candidato__cursos.setText("Formação acadêmica");

        Label__Candidato__cursos_idioma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label__Candidato__cursos_idioma.setText("Idioma");

        Table__FormacaoAcademica.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__FormacaoAcademica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table__FormacaoAcademica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nível", "Curso", "Instituição", "Status"
            }
        ));
        Table__FormacaoAcademica.setRowHeight(25);
        Table__FormacaoAcademica.setRowSelectionAllowed(false);
        ScrollPane__Candidato__cursos.setViewportView(Table__FormacaoAcademica);
        Table__FormacaoAcademica.getAccessibleContext().setAccessibleName("Table__Candidato__cursos");

        Label__Candidato__cursos_informatica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label__Candidato__cursos_informatica.setText("Informatica");

        Table__Informatica.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__Informatica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habilidade", "Nivel"
            }
        ));
        Table__Informatica.setRowHeight(25);
        Table__Informatica.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(Table__Informatica);

        Table__Idioma.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__Idioma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table__Idioma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nivel Fala", "Nivel Escrita", "Nivel Leitura"
            }
        ));
        Table__Idioma.setRowHeight(25);
        Table__Idioma.setRowSelectionAllowed(false);
        ScrollPane__Candidato__cursos1.setViewportView(Table__Idioma);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joabe_000\\Documents\\NetBeansProjects\\sbt\\SBT\\src\\br\\com\\iomrh\\gui\\imagens\\Add.png")); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\joabe_000\\Documents\\NetBeansProjects\\sbt\\SBT\\src\\br\\com\\iomrh\\gui\\imagens\\Add.png")); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\joabe_000\\Documents\\NetBeansProjects\\sbt\\SBT\\src\\br\\com\\iomrh\\gui\\imagens\\Add.png")); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__cursos_informatica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ScrollPane__Candidato__cursos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                            .addComponent(ScrollPane__Candidato__cursos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Label__Candidato__cursos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Label__Candidato__cursos_idioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label__Candidato__cursos)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane__Candidato__cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(Label__Candidato__cursos_idioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane__Candidato__cursos1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(Label__Candidato__cursos_informatica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Label__Candidato__cursos.getAccessibleContext().setAccessibleName("Label__Candidato__cursos");
        Label__Candidato__cursos_idioma.getAccessibleContext().setAccessibleName("Label__Candidato__cursos_idioma");
        ScrollPane__Candidato__cursos.getAccessibleContext().setAccessibleName("ScrollPane__Candidato__cursos");
        ScrollPane__Candidato__cursos.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__cursos_informatica.getAccessibleContext().setAccessibleName("Label__Candidato__cursos_informatica");
        Label__Candidato__cursos_informatica.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Formação", jPanel5);

        Table__Candidato__experienciaProfissional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table__Candidato__experienciaProfissional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profissão / Cargo", "Descricão da Funcão", "Empresa", "Data de Admissão", "Data de Demissao", "Duracão"
            }
        ));
        Table__Candidato__experienciaProfissional.setRowHeight(25);
        Table__Candidato__experienciaProfissional.setRowSelectionAllowed(false);
        ScrollPane__Candidato__experienciaProfissional.setViewportView(Table__Candidato__experienciaProfissional);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane__Candidato__experienciaProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ScrollPane__Candidato__experienciaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ScrollPane__Candidato__experienciaProfissional.getAccessibleContext().setAccessibleName("ScrollPane__Candidato__experienciaProfissional");

        jTabbedPane1.addTab("Experiência profissional", jPanel6);

        Table__Candidato__indisponibilidadeCandidato.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__Candidato__indisponibilidadeCandidato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table__Candidato__indisponibilidadeCandidato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Manhã", null, null, "", null, null, null, null},
                {"Tarde", null, null, "", null, null, null, null},
                {"Noite", null, null, null, null, null, null, null}
            },
            new String [] {
                "Dia/Turno", "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table__Candidato__indisponibilidadeCandidato.setPreferredSize(new java.awt.Dimension(600, 180));
        Table__Candidato__indisponibilidadeCandidato.setRowHeight(60);
        Table__Candidato__indisponibilidadeCandidato.setRowSelectionAllowed(false);
        Table__Candidato__indisponibilidadeCandidato.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ScrollPane__Candidato__indisponibilidadeCandidato.setViewportView(Table__Candidato__indisponibilidadeCandidato);
        Table__Candidato__indisponibilidadeCandidato.getAccessibleContext().setAccessibleName("Table__Candidato__indisponibilidadeCandidato");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane__Candidato__indisponibilidadeCandidato)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ScrollPane__Candidato__indisponibilidadeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Disponibilidade", jPanel7);

        Label__Candidato__caracteristica1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__caracteristica1.setText("Caracteristica");

        Area__Candidato__caracteristica1.setColumns(20);
        Area__Candidato__caracteristica1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Area__Candidato__caracteristica1.setRows(5);
        Area__Candidato__caracteristica1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ScrollPane__Candidato__caracteristica1.setViewportView(Area__Candidato__caracteristica1);

        CheckBox__Candidato__gerencia.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox__Candidato__gerencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox__Candidato__gerencia.setText("Gerência");
        CheckBox__Candidato__gerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox__Candidato__gerenciaActionPerformed(evt);
            }
        });

        CheckBox__Candidato__primeiroEmprego.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox__Candidato__primeiroEmprego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox__Candidato__primeiroEmprego.setText("Primeiro Emprego");

        ComboBox__Candidato__profissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComboBox__Candidato__profissao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboBox__Candidato__profissao.setName("Profissão"); // NOI18N
        ComboBox__Candidato__profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__profissaoActionPerformed(evt);
            }
        });

        ComboBox__Candidato__pretencaoSalarial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboBox__Candidato__pretencaoSalarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__pretencaoSalarialActionPerformed(evt);
            }
        });

        Label__Candidato__pretencaoSalarial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__pretencaoSalarial.setText("Pretenção Salarial");

        Label__Candidato__profissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label__Candidato__profissao.setText("Profissão");

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Separe as caracteristicas do candidato por vírgula");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox__Candidato__gerencia)
                            .addComponent(CheckBox__Candidato__primeiroEmprego))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Label__Candidato__pretencaoSalarial)
                        .addGap(29, 29, 29)
                        .addComponent(ComboBox__Candidato__pretencaoSalarial))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label__Candidato__profissao)
                            .addComponent(Label__Candidato__caracteristica1))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPane__Candidato__caracteristica1)
                            .addComponent(ComboBox__Candidato__profissao, 0, 787, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__pretencaoSalarial)
                    .addComponent(ComboBox__Candidato__pretencaoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__profissao)
                    .addComponent(ComboBox__Candidato__profissao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Label__Candidato__caracteristica1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ScrollPane__Candidato__caracteristica1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(CheckBox__Candidato__primeiroEmprego)
                .addGap(18, 18, 18)
                .addComponent(CheckBox__Candidato__gerencia)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        CheckBox__Candidato__gerencia.getAccessibleContext().setAccessibleName("CheckBox__Candidato__gerencia");
        CheckBox__Candidato__gerencia.getAccessibleContext().setAccessibleDescription("");
        CheckBox__Candidato__primeiroEmprego.getAccessibleContext().setAccessibleName("CheckBox__Candidato__primeiroEmprego");
        CheckBox__Candidato__primeiroEmprego.getAccessibleContext().setAccessibleDescription("");
        ComboBox__Candidato__profissao.getAccessibleContext().setAccessibleName("ComboBox__Candidato__profissao");
        Label__Candidato__pretencaoSalarial.getAccessibleContext().setAccessibleName("Label__Candidato__pretencaoSalarial");
        Label__Candidato__pretencaoSalarial.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__profissao.getAccessibleContext().setAccessibleName("Label__Candidato__profissao");
        Label__Candidato__profissao.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Dados adicionais", jPanel8);

        Button__Candidato__cadastrar.setBackground(new java.awt.Color(0, 51, 102));
        Button__Candidato__cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button__Candidato__cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Button__Candidato__cadastrar.setText("Cadastrar");
        Button__Candidato__cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Button__Candidato__cadastrar.setBorderPainted(false);
        Button__Candidato__cadastrar.setFocusable(false);
        Button__Candidato__cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button__Candidato__cadastrarMouseClicked(evt);
            }
        });
        Button__Candidato__cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button__Candidato__cadastrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("fshhsshhsjssjsjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Alguns campos obrigatórios não foram preenchidos");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Button__Candidato__cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button__Candidato__cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(312, 312, 312)))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("CadastrarCandidato");
        Button__Candidato__cadastrar.getAccessibleContext().setAccessibleName("Button__Candidato__cadastrar");
        Button__Candidato__cadastrar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button__Candidato__cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button__Candidato__cadastrarActionPerformed
 
        Component[]  fieldsObrigatorios = {
            Field__Candidato__nome,
            Field__Candidato__sobrenome,
            Field__Candidato__CPF,
            Field__Candidato__RG,
            ComboBox__Candidato__veiculo,
            ComboBox__Candidato__cnhPossui,
            jLabel__Mensagem__ComboBox__Candidato__estadoCivil,
        };
        
        ArrayList<String> mensagens = Validadores.NotEmpty(fieldsObrigatorios);
        String string = "<html>";
        
        for (String mensagem : mensagens) {
            string += mensagem + "<br>" 
                    + jLabel_Mensagens.getText();
        }
        string += "</html>";
        
        jLabel_Mensagens.setForeground(Color.red);
        jLabel_Mensagens.setText(string);
        
       if(!mensagens.isEmpty()){
           return;
       }
     
        String prenome =  Field__Candidato__nome.getText();
        String sobrenome = Field__Candidato__sobrenome.getText();
        String cnhCategoria = ComboBox__Candidato__cnhPossui.getSelectedItem().toString();
        boolean sexoFeminino =  Button__Candidato__masculino.isSelected();
        boolean sexoMasculino =  Button__Candidato__feminino.isSelected(); 

        String sexo = sexoMasculino ? "Masculino" : "Feminino";

        String cpf = Field__Candidato__CPF.getText();
        String rg = Field__Candidato__RG.getText();
        
       //  Mudar date
//       Date dataNascimento = Date.from(Instant.EPOCH);
//       try {
//           dataNascimento = Validadores.formataData(Field__Candidato__dataNascimento.getText());
//       } catch (Exception ex) {
//           Logger.getLogger(CadastrarCandidato.class.getName()).log(Level.SEVERE, null, ex);
//       }
  
        Short quantidadeFilhos = (!Field__Candidato__quantFilhos.getText().isEmpty()) ? Short.parseShort(Field__Candidato__quantFilhos.getText()) : 0;

        String estadoCivil = jLabel__Mensagem__ComboBox__Candidato__estadoCivil.getSelectedItem().toString();

        boolean disponibilidadeViajar_sim = Button__Candidato__disponibilidadeViajar__sim.isSelected();
        boolean disponibilidadeViajar_nao = Button__Candidato__disponibilidadeViajar__nao.isSelected();

        String disponibilidadeViajar = (disponibilidadeViajar_sim) ? "Sim" : "Não";

        String tipoNecessidadeEspecial = Field__Candidato__portadorNecessidadesEspeciais.getText();

        boolean portadorNecessidadesEspeciais_sim = Button__Candidato__portadorNecessidadesEspeciais__sim.isSelected();
        boolean portadorNecessidadesEspeciais_nao = Button__Candidato__portadorNecessidadesEspeciais__nao.isSelected();

        String portadorNecessidadeEspecial = (portadorNecessidadesEspeciais_sim) ? "Sim" : "Não";
        JOptionPane.showMessageDialog(null, portadorNecessidadeEspecial);

        double pretensaoSalarial = (!ComboBox__Candidato__pretencaoSalarial.getText().isEmpty()) ? Double.parseDouble(ComboBox__Candidato__pretencaoSalarial.getText()) : 0;
        String veiculo = ComboBox__Candidato__veiculo.getSelectedItem().toString();
        String primeiroEmprego = (CheckBox__Candidato__primeiroEmprego.isSelected()) ? "Sim" : "Não";
        String gerencia = CheckBox__Candidato__gerencia.isSelected() ? "Sim" : "Não";
     
        
        Candidato candidato = new Candidato();
        
        candidato.setPrenome(prenome);
        candidato.setSobrenome(sobrenome);
        candidato.setCnhCategoria(cnhCategoria);
        candidato.setSexo(sexo);
        candidato.setCpf(cpf);
        candidato.setRg(rg);
        candidato.setDataNascimento(java.sql.Date.valueOf("1990-10-10"));
        candidato.setQuantidadeFilhos(quantidadeFilhos);
        candidato.setEstadoCivil(estadoCivil);
        candidato.setEstadoCivil(estadoCivil);
       // candidato.setEmail(email);
        candidato.setDisponibilidadeViajar(disponibilidadeViajar);
        candidato.setTipoNecessidadeEspecial(tipoNecessidadeEspecial);
        //candidato.setPortadorNecessidadeEspecial(portadorNecessidadeEspecial);
        candidato.setPretensaoSalarial(pretensaoSalarial);
        candidato.setVeiculo(veiculo);
        candidato.setPrimeiroEmprego(primeiroEmprego);
        candidato.setGerencia(gerencia);
         
        Profissao profissao = (Profissao) ComboBox__Candidato__profissao.getSelectedItem();
        candidato.setCodProfissao(profissao.getCodigoProfissao());
        
        CandidatoDAO candidatoDAO  = new CandidatoDAO();
        candidatoDAO.inserir(candidato);
        
        
    }//GEN-LAST:event_Button__Candidato__cadastrarActionPerformed

    private void Button__Candidato__cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button__Candidato__cadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button__Candidato__cadastrarMouseClicked

    private void ComboBox__Candidato__pretencaoSalarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__pretencaoSalarialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox__Candidato__pretencaoSalarialActionPerformed

    private void CheckBox__Candidato__gerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox__Candidato__gerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox__Candidato__gerenciaActionPerformed

    private void ComboBox__Candidato__profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__profissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox__Candidato__profissaoActionPerformed

    private void ComboBox__Candidato__veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__veiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox__Candidato__veiculoActionPerformed

    private void ComboBox__Candidato__cnhPossuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__cnhPossuiActionPerformed

    }//GEN-LAST:event_ComboBox__Candidato__cnhPossuiActionPerformed

    private void jLabel__Mensagem__ComboBox__Candidato__estadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel__Mensagem__ComboBox__Candidato__estadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel__Mensagem__ComboBox__Candidato__estadoCivilActionPerformed

    private void Field__Candidato__CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Candidato__CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Candidato__CPFActionPerformed

    private void Field__Candidato__nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Candidato__nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Candidato__nomeActionPerformed

    private void Field__Candidato__quantFilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Candidato__quantFilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Candidato__quantFilhosActionPerformed

    private void Field__Telefone__telefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__telefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__telefone1ActionPerformed

    private void Field__Telefone__tipoTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__tipoTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__tipoTelefone1ActionPerformed

    private void Field__Telefone__telefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__telefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__telefone2ActionPerformed

    private void Field__Telefone__tipoTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__tipoTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__tipoTelefone2ActionPerformed

    private void Field__Telefone__telefone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__telefone3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__telefone3ActionPerformed

    private void Field__Telefone__tipoTelefone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Telefone__tipoTelefone3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Telefone__tipoTelefone3ActionPerformed

    private void Field__Candidato_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Candidato_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Candidato_emailActionPerformed

    private void Field__RedeSocial__redeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__RedeSocial__redeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__RedeSocial__redeSocialActionPerformed

    private void Field__ComboBox__EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__ComboBox__EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__ComboBox__EstadoActionPerformed

    private void Field__ComboBox__CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__ComboBox__CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__ComboBox__CidadeActionPerformed

    private void Field__ComboBox__BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__ComboBox__BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__ComboBox__BairroActionPerformed

    private void Field__ComboBox__LogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__ComboBox__LogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__ComboBox__LogradouroActionPerformed

    private void Field__Endereco__numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Endereco__numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Endereco__numeroActionPerformed

    private void Field__Endereco__complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Endereco__complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Endereco__complementoActionPerformed

    private void Field__Endereco_pontoReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Endereco_pontoReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Endereco_pontoReferenciaActionPerformed

    private void Button__Candidato__femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button__Candidato__femininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button__Candidato__femininoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCandidato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area__Candidato__caracteristica1;
    private javax.swing.JButton Button__Candidato__cadastrar;
    private javax.swing.JRadioButton Button__Candidato__disponibilidadeViajar__nao;
    private javax.swing.JRadioButton Button__Candidato__disponibilidadeViajar__sim;
    private javax.swing.JRadioButton Button__Candidato__feminino;
    private javax.swing.JRadioButton Button__Candidato__masculino;
    private javax.swing.JRadioButton Button__Candidato__portadorNecessidadesEspeciais__nao;
    private javax.swing.JRadioButton Button__Candidato__portadorNecessidadesEspeciais__sim;
    private javax.swing.ButtonGroup Button__Candidato__sexo;
    private javax.swing.JCheckBox CheckBox__Candidato__gerencia;
    private javax.swing.JCheckBox CheckBox__Candidato__primeiroEmprego;
    private javax.swing.JComboBox ComboBox__Candidato__cnhPossui;
    private javax.swing.JTextField ComboBox__Candidato__pretencaoSalarial;
    private javax.swing.JComboBox ComboBox__Candidato__profissao;
    private javax.swing.JComboBox ComboBox__Candidato__veiculo;
    private javax.swing.JTextField Field__Candidato__CPF;
    private javax.swing.JTextField Field__Candidato__RG;
    private javax.swing.JTextField Field__Candidato__dataNascimento;
    private javax.swing.JTextField Field__Candidato__nome;
    private javax.swing.JTextField Field__Candidato__portadorNecessidadesEspeciais;
    private javax.swing.JTextField Field__Candidato__quantFilhos;
    private javax.swing.JTextField Field__Candidato__sobrenome;
    private javax.swing.JTextField Field__Candidato_email;
    private javax.swing.JComboBox Field__ComboBox__Bairro;
    private javax.swing.JComboBox Field__ComboBox__Estado;
    private javax.swing.JComboBox Field__ComboBox__Logradouro;
    private javax.swing.JTextField Field__Endereco__complemento;
    private javax.swing.JTextField Field__Endereco__numero;
    private javax.swing.JTextField Field__RedeSocial__redeSocial;
    private javax.swing.JTextField Field__Telefone__telefone1;
    private javax.swing.JTextField Field__Telefone__telefone2;
    private javax.swing.JTextField Field__Telefone__telefone3;
    private javax.swing.JComboBox Field__Telefone__tipoTelefone1;
    private javax.swing.JComboBox Field__Telefone__tipoTelefone2;
    private javax.swing.JComboBox Field__Telefone__tipoTelefone3;
    private javax.swing.JLabel Label__Candidato__CPF;
    private javax.swing.JLabel Label__Candidato__RG;
    private javax.swing.JLabel Label__Candidato__caracteristica1;
    private javax.swing.JLabel Label__Candidato__cursos;
    private javax.swing.JLabel Label__Candidato__cursos_idioma;
    private javax.swing.JLabel Label__Candidato__cursos_informatica;
    private javax.swing.JLabel Label__Candidato__dataNascimento;
    private javax.swing.JLabel Label__Candidato__dispisponibilidadeViajar;
    private javax.swing.JLabel Label__Candidato__estadoCivil;
    private javax.swing.JLabel Label__Candidato__estadoCivil1;
    private javax.swing.JLabel Label__Candidato__estadoCivil2;
    private javax.swing.JLabel Label__Candidato__estadoCivil3;
    private javax.swing.JLabel Label__Candidato__estadoCivil4;
    private javax.swing.JLabel Label__Candidato__nome;
    private javax.swing.JLabel Label__Candidato__nome1;
    private javax.swing.JLabel Label__Candidato__nome2;
    private javax.swing.JLabel Label__Candidato__nome3;
    private javax.swing.JLabel Label__Candidato__nome4;
    private javax.swing.JLabel Label__Candidato__nome5;
    private javax.swing.JLabel Label__Candidato__nome6;
    private javax.swing.JLabel Label__Candidato__nome7;
    private javax.swing.JLabel Label__Candidato__nome8;
    private javax.swing.JLabel Label__Candidato__portadorNecessidadesEspeciais;
    private javax.swing.JLabel Label__Candidato__pretencaoSalarial;
    private javax.swing.JLabel Label__Candidato__profissao;
    private javax.swing.JLabel Label__Candidato__quantFilhos;
    private javax.swing.JLabel Label__Candidato__sexo;
    private javax.swing.JLabel Label__Candidato__veiculo;
    private javax.swing.JLabel Label__Candidato_cnhPossui;
    private javax.swing.JScrollPane ScrollPane__Candidato__caracteristica1;
    private javax.swing.JScrollPane ScrollPane__Candidato__cursos;
    private javax.swing.JScrollPane ScrollPane__Candidato__cursos1;
    private javax.swing.JScrollPane ScrollPane__Candidato__experienciaProfissional;
    private javax.swing.JScrollPane ScrollPane__Candidato__indisponibilidadeCandidato;
    private javax.swing.JTable Table__Candidato__experienciaProfissional;
    private javax.swing.JTable Table__Candidato__indisponibilidadeCandidato;
    private javax.swing.JTable Table__FormacaoAcademica;
    private javax.swing.JTable Table__Idioma;
    private javax.swing.JTable Table__Informatica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Mensagens;
    private javax.swing.JLabel jLabel__Mensagem_Candidato__nome10;
    private javax.swing.JLabel jLabel__Mensagem_Candidato__nome3;
    private javax.swing.JLabel jLabel__Mensagem_Candidato__nome5;
    private javax.swing.JLabel jLabel__Mensagem__ComboBox__Candidato__cnhPossui;
    private javax.swing.JComboBox jLabel__Mensagem__ComboBox__Candidato__estadoCivil;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__CPF;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__RG;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__dataNascimento;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__nome4;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__quantFilhos;
    private javax.swing.JLabel jLabel__Mensagem__Field__Candidato__sobrenome;
    private javax.swing.JLabel jLabel__Mensagem__Field__ComboBox__Bairro;
    private javax.swing.JLabel jLabel__Mensagem__Field__ComboBox__Logradouro;
    private javax.swing.JLabel jLabel__Mensagem__Field__RedeSocial__redeSocial;
    private javax.swing.JLabel jLabel__Mensagem__Field__Telefone__telefone1;
    private javax.swing.JLabel jLabel__Mensagem__Field__Telefone__telefone2;
    private javax.swing.JLabel jLabel__Mensagem__jLabel__Mensagem__ComboBox__Candidato__estadoCivil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
