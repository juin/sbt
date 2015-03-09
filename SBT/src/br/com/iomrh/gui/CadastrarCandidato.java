/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.gui;

/**
 *
 * @author rpa
 */
public class CadastrarCandidato extends javax.swing.JFrame {
  
    public CadastrarCandidato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        ComboBox__Candidato__estadoCivil = new javax.swing.JComboBox();
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
        Label__Candidato__caracteristica = new javax.swing.JLabel();
        ScrollPane__Candidato__caracteristica = new javax.swing.JScrollPane();
        Area__Candidato__caracteristica = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        ScrollPane__Candidato__indisponibilidadeCandidato = new javax.swing.JScrollPane();
        Table__Candidato__indisponibilidadeCandidato = new javax.swing.JTable();
        Label__Candidato__indisponibilidadeCandidato = new javax.swing.JLabel();
        Label__Candidato__cursos = new javax.swing.JLabel();
        ScrollPane__Candidato__cursos = new javax.swing.JScrollPane();
        Table__Candidato__cursos = new javax.swing.JTable();
        Label__Candidato__cursos_idioma = new javax.swing.JLabel();
        Label__Candidato__cursos_informatica = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Label__Candidato__experiênciaProfissional = new javax.swing.JLabel();
        ScrollPane__Candidato__experienciaProfissional = new javax.swing.JScrollPane();
        Table__Candidato__experienciaProfissional = new javax.swing.JTable();
        Label__Candidato__pretencaoSalarial = new javax.swing.JLabel();
        ComboBox__Candidato__pretencaoSalarial = new javax.swing.JComboBox();
        Label__Candidato__profissao = new javax.swing.JLabel();
        ComboBox__Candidato__profissao = new javax.swing.JComboBox();
        CheckBox__Candidato__primeiroEmprego = new javax.swing.JCheckBox();
        CheckBox__Candidato__gerencia = new javax.swing.JCheckBox();
        Button__Candidato__cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Label__Candidato__nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__nome.setText("Nome");

        Field__Candidato__nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__nome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Field__Candidato__sobrenome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__sobrenome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__sexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__sexo.setText("Sexo");

        Button__Candidato__masculino.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Button__Candidato__masculino.setText("Masculino");

        Button__Candidato__feminino.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Button__Candidato__feminino.setText("Feminino");

        Label__Candidato__CPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__CPF.setText("CPF");

        Field__Candidato__CPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__CPF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Field__Candidato__CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field__Candidato__CPFActionPerformed(evt);
            }
        });

        Label__Candidato__RG.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__RG.setText("RG");

        Field__Candidato__RG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__RG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__dataNascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__dataNascimento.setText("Data de Nascimento");

        Field__Candidato__dataNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__dataNascimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__estadoCivil.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__estadoCivil.setText("Estado Civil");

        ComboBox__Candidato__estadoCivil.setEditable(true);
        ComboBox__Candidato__estadoCivil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboBox__Candidato__estadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "Outros" }));
        ComboBox__Candidato__estadoCivil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__quantFilhos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__quantFilhos.setText("Quant. de Filhos");

        Field__Candidato__quantFilhos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__quantFilhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__portadorNecessidadesEspeciais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__portadorNecessidadesEspeciais.setText("PNE");

        Field__Candidato__portadorNecessidadesEspeciais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Field__Candidato__portadorNecessidadesEspeciais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Button__Candidato__portadorNecessidadesEspeciais__sim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button__Candidato__portadorNecessidadesEspeciais__sim.setText("Sim");

        Button__Candidato__portadorNecessidadesEspeciais__nao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button__Candidato__portadorNecessidadesEspeciais__nao.setText("Nao");

        Label__Candidato__dispisponibilidadeViajar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__dispisponibilidadeViajar.setText("Disp. Viajar");

        Button__Candidato__disponibilidadeViajar__sim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button__Candidato__disponibilidadeViajar__sim.setText("Sim");

        Button__Candidato__disponibilidadeViajar__nao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button__Candidato__disponibilidadeViajar__nao.setText("Nao");

        Label__Candidato_cnhPossui.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato_cnhPossui.setText("CNH");

        ComboBox__Candidato__cnhPossui.setEditable(true);
        ComboBox__Candidato__cnhPossui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboBox__Candidato__cnhPossui.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Possuo", "Nao Possuo" }));
        ComboBox__Candidato__cnhPossui.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ComboBox__Candidato__cnhPossui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__cnhPossuiActionPerformed(evt);
            }
        });

        Label__Candidato__veiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__veiculo.setText("Veiculo");

        ComboBox__Candidato__veiculo.setEditable(true);
        ComboBox__Candidato__veiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboBox__Candidato__veiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Possuo", "Nao Possuo" }));
        ComboBox__Candidato__veiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label__Candidato__caracteristica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label__Candidato__caracteristica.setText("Caracteristica");

        Area__Candidato__caracteristica.setColumns(20);
        Area__Candidato__caracteristica.setRows(5);
        Area__Candidato__caracteristica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ScrollPane__Candidato__caracteristica.setViewportView(Area__Candidato__caracteristica);
        Area__Candidato__caracteristica.getAccessibleContext().setAccessibleName("Area__Candidato__caracteristica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label__Candidato__nome)
                    .addComponent(Label__Candidato__sexo)
                    .addComponent(Label__Candidato__CPF)
                    .addComponent(Label__Candidato__RG)
                    .addComponent(Label__Candidato__dataNascimento)
                    .addComponent(Label__Candidato__estadoCivil)
                    .addComponent(Label__Candidato__quantFilhos)
                    .addComponent(Label__Candidato__portadorNecessidadesEspeciais)
                    .addComponent(Label__Candidato__dispisponibilidadeViajar)
                    .addComponent(Label__Candidato_cnhPossui)
                    .addComponent(Label__Candidato__veiculo)
                    .addComponent(Label__Candidato__caracteristica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Field__Candidato__dataNascimento)
                    .addComponent(Field__Candidato__CPF)
                    .addComponent(Field__Candidato__RG)
                    .addComponent(ComboBox__Candidato__estadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Field__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Field__Candidato__sobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__sim)
                        .addGap(18, 18, 18)
                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__nao)
                        .addGap(18, 18, 18)
                        .addComponent(Field__Candidato__portadorNecessidadesEspeciais))
                    .addComponent(Field__Candidato__quantFilhos)
                    .addComponent(ComboBox__Candidato__cnhPossui, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBox__Candidato__veiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button__Candidato__masculino)
                                .addGap(18, 18, 18)
                                .addComponent(Button__Candidato__feminino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Button__Candidato__disponibilidadeViajar__sim)
                                .addGap(18, 18, 18)
                                .addComponent(Button__Candidato__disponibilidadeViajar__nao)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ScrollPane__Candidato__caracteristica))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__nome)
                    .addComponent(Field__Candidato__nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field__Candidato__sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__sexo)
                    .addComponent(Button__Candidato__masculino)
                    .addComponent(Button__Candidato__feminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label__Candidato__CPF)
                    .addComponent(Field__Candidato__CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__RG)
                    .addComponent(Field__Candidato__RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__dataNascimento)
                    .addComponent(Field__Candidato__dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__estadoCivil)
                    .addComponent(ComboBox__Candidato__estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__quantFilhos)
                    .addComponent(Field__Candidato__quantFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label__Candidato__portadorNecessidadesEspeciais)
                        .addComponent(Field__Candidato__portadorNecessidadesEspeciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__sim)
                        .addComponent(Button__Candidato__portadorNecessidadesEspeciais__nao)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label__Candidato__dispisponibilidadeViajar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button__Candidato__disponibilidadeViajar__sim)
                        .addComponent(Button__Candidato__disponibilidadeViajar__nao)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato_cnhPossui)
                    .addComponent(ComboBox__Candidato__cnhPossui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__veiculo)
                    .addComponent(ComboBox__Candidato__veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label__Candidato__caracteristica)
                    .addComponent(ScrollPane__Candidato__caracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        ComboBox__Candidato__estadoCivil.getAccessibleContext().setAccessibleName("ComboBox__Candidato__estadoCivil");
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
        Label__Candidato__caracteristica.getAccessibleContext().setAccessibleName("Label__Candidato__caracteristica");
        ScrollPane__Candidato__caracteristica.getAccessibleContext().setAccessibleName("ScrollPane__Candidato__caracteristica");
        ScrollPane__Candidato__caracteristica.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Dados Pessoais", jPanel1);

        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Table__Candidato__indisponibilidadeCandidato.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__Candidato__indisponibilidadeCandidato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table__Candidato__indisponibilidadeCandidato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "", null, null, null, null},
                {null, null, null, "", null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dia/Turno", "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"
            }
        ));
        Table__Candidato__indisponibilidadeCandidato.setPreferredSize(new java.awt.Dimension(600, 64));
        Table__Candidato__indisponibilidadeCandidato.setRowHeight(23);
        Table__Candidato__indisponibilidadeCandidato.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ScrollPane__Candidato__indisponibilidadeCandidato.setViewportView(Table__Candidato__indisponibilidadeCandidato);
        Table__Candidato__indisponibilidadeCandidato.getAccessibleContext().setAccessibleName("Table__Candidato__indisponibilidadeCandidato");

        Label__Candidato__indisponibilidadeCandidato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label__Candidato__indisponibilidadeCandidato.setText("Indisponibilidade do Candidato");

        Label__Candidato__cursos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label__Candidato__cursos.setText("Cursos");

        Table__Candidato__cursos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Table__Candidato__cursos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table__Candidato__cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Nivel Fala", "Nivel Escrita", "Nivel Leitura"
            }
        ));
        ScrollPane__Candidato__cursos.setViewportView(Table__Candidato__cursos);
        Table__Candidato__cursos.getAccessibleContext().setAccessibleName("Table__Candidato__cursos");

        Label__Candidato__cursos_idioma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label__Candidato__cursos_idioma.setText("Idioma");

        Label__Candidato__cursos_informatica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label__Candidato__cursos_informatica.setText("Informatica");

        jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Habilidade", "Nivel"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane__Candidato__cursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                    .addComponent(ScrollPane__Candidato__indisponibilidadeCandidato)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label__Candidato__cursos)
                            .addComponent(Label__Candidato__indisponibilidadeCandidato)
                            .addComponent(Label__Candidato__cursos_idioma)
                            .addComponent(Label__Candidato__cursos_informatica))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Label__Candidato__indisponibilidadeCandidato)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane__Candidato__indisponibilidadeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(Label__Candidato__cursos)
                .addGap(31, 31, 31)
                .addComponent(Label__Candidato__cursos_idioma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane__Candidato__cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label__Candidato__cursos_informatica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Label__Candidato__indisponibilidadeCandidato.getAccessibleContext().setAccessibleName("Label__Candidato__indisponibilidadeCandidato");
        Label__Candidato__indisponibilidadeCandidato.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__cursos.getAccessibleContext().setAccessibleName("Label__Candidato__cursos");
        ScrollPane__Candidato__cursos.getAccessibleContext().setAccessibleName("ScrollPane__Candidato__cursos");
        ScrollPane__Candidato__cursos.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__cursos_idioma.getAccessibleContext().setAccessibleName("Label__Candidato__cursos_idioma");
        Label__Candidato__cursos_informatica.getAccessibleContext().setAccessibleName("Label__Candidato__cursos_informatica");
        Label__Candidato__cursos_informatica.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Dados Adicionais", jPanel2);

        Label__Candidato__experiênciaProfissional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label__Candidato__experiênciaProfissional.setText("Experiência Profissional");

        Table__Candidato__experienciaProfissional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table__Candidato__experienciaProfissional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Profissão / Cargo", "Descricão da Funcão", "Empresa", "Data de Admissão", "Data de Demissao", "Duracão"
            }
        ));
        ScrollPane__Candidato__experienciaProfissional.setViewportView(Table__Candidato__experienciaProfissional);

        Label__Candidato__pretencaoSalarial.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Label__Candidato__pretencaoSalarial.setText("Pretenção Salarial");

        ComboBox__Candidato__pretencaoSalarial.setEditable(true);
        ComboBox__Candidato__pretencaoSalarial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox__Candidato__pretencaoSalarial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Á Combinar", "Até Um salário Mínimo", "Entre Um e Dois salários", "Acima de 3", "" }));
        ComboBox__Candidato__pretencaoSalarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__pretencaoSalarialActionPerformed(evt);
            }
        });

        Label__Candidato__profissao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Label__Candidato__profissao.setText("Profissão");

        ComboBox__Candidato__profissao.setEditable(true);
        ComboBox__Candidato__profissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox__Candidato__profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox__Candidato__profissaoActionPerformed(evt);
            }
        });

        CheckBox__Candidato__primeiroEmprego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox__Candidato__primeiroEmprego.setText("Primeiro Emprego");

        CheckBox__Candidato__gerencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox__Candidato__gerencia.setText("Gerência");

        Button__Candidato__cadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button__Candidato__cadastrar.setText("Cadastrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane__Candidato__experienciaProfissional)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label__Candidato__experiênciaProfissional)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label__Candidato__pretencaoSalarial)
                                    .addComponent(Label__Candidato__profissao))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(CheckBox__Candidato__primeiroEmprego)
                                        .addGap(73, 73, 73)
                                        .addComponent(CheckBox__Candidato__gerencia))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboBox__Candidato__pretencaoSalarial, 0, 550, Short.MAX_VALUE)
                                        .addComponent(ComboBox__Candidato__profissao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button__Candidato__cadastrar)
                .addGap(70, 70, 70))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Label__Candidato__experiênciaProfissional)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane__Candidato__experienciaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__pretencaoSalarial)
                    .addComponent(ComboBox__Candidato__pretencaoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label__Candidato__profissao)
                    .addComponent(ComboBox__Candidato__profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox__Candidato__primeiroEmprego)
                    .addComponent(CheckBox__Candidato__gerencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(Button__Candidato__cadastrar)
                .addGap(77, 77, 77))
        );

        Label__Candidato__experiênciaProfissional.getAccessibleContext().setAccessibleName("Label__Candidato__experiênciaProfissional");
        ScrollPane__Candidato__experienciaProfissional.getAccessibleContext().setAccessibleName("ScrollPane__Candidato__experienciaProfissional");
        Label__Candidato__pretencaoSalarial.getAccessibleContext().setAccessibleName("Label__Candidato__pretencaoSalarial");
        Label__Candidato__pretencaoSalarial.getAccessibleContext().setAccessibleDescription("");
        Label__Candidato__profissao.getAccessibleContext().setAccessibleName("Label__Candidato__profissao");
        Label__Candidato__profissao.getAccessibleContext().setAccessibleDescription("");
        ComboBox__Candidato__profissao.getAccessibleContext().setAccessibleName("ComboBox__Candidato__profissao");
        CheckBox__Candidato__primeiroEmprego.getAccessibleContext().setAccessibleName("CheckBox__Candidato__primeiroEmprego");
        CheckBox__Candidato__primeiroEmprego.getAccessibleContext().setAccessibleDescription("");
        CheckBox__Candidato__gerencia.getAccessibleContext().setAccessibleName("CheckBox__Candidato__gerencia");
        CheckBox__Candidato__gerencia.getAccessibleContext().setAccessibleDescription("");
        Button__Candidato__cadastrar.getAccessibleContext().setAccessibleName("Button__Candidato__cadastrar");
        Button__Candidato__cadastrar.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Dados Profissionais", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("CadastrarCandidato");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox__Candidato__cnhPossuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__cnhPossuiActionPerformed
      
        
    }//GEN-LAST:event_ComboBox__Candidato__cnhPossuiActionPerformed

    private void Field__Candidato__CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field__Candidato__CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field__Candidato__CPFActionPerformed

    private void ComboBox__Candidato__pretencaoSalarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__pretencaoSalarialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox__Candidato__pretencaoSalarialActionPerformed

    private void ComboBox__Candidato__profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox__Candidato__profissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox__Candidato__profissaoActionPerformed

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
    private javax.swing.JTextArea Area__Candidato__caracteristica;
    private javax.swing.JButton Button__Candidato__cadastrar;
    private javax.swing.JRadioButton Button__Candidato__disponibilidadeViajar__nao;
    private javax.swing.JRadioButton Button__Candidato__disponibilidadeViajar__sim;
    private javax.swing.JRadioButton Button__Candidato__feminino;
    private javax.swing.JRadioButton Button__Candidato__masculino;
    private javax.swing.JRadioButton Button__Candidato__portadorNecessidadesEspeciais__nao;
    private javax.swing.JRadioButton Button__Candidato__portadorNecessidadesEspeciais__sim;
    private javax.swing.JCheckBox CheckBox__Candidato__gerencia;
    private javax.swing.JCheckBox CheckBox__Candidato__primeiroEmprego;
    private javax.swing.JComboBox ComboBox__Candidato__cnhPossui;
    private javax.swing.JComboBox ComboBox__Candidato__estadoCivil;
    private javax.swing.JComboBox ComboBox__Candidato__pretencaoSalarial;
    private javax.swing.JComboBox ComboBox__Candidato__profissao;
    private javax.swing.JComboBox ComboBox__Candidato__veiculo;
    private javax.swing.JTextField Field__Candidato__CPF;
    private javax.swing.JTextField Field__Candidato__RG;
    private javax.swing.JTextField Field__Candidato__dataNascimento;
    private javax.swing.JTextField Field__Candidato__nome;
    private javax.swing.JTextField Field__Candidato__portadorNecessidadesEspeciais;
    private javax.swing.JTextField Field__Candidato__quantFilhos;
    private javax.swing.JTextField Field__Candidato__sobrenome;
    private javax.swing.JLabel Label__Candidato__CPF;
    private javax.swing.JLabel Label__Candidato__RG;
    private javax.swing.JLabel Label__Candidato__caracteristica;
    private javax.swing.JLabel Label__Candidato__cursos;
    private javax.swing.JLabel Label__Candidato__cursos_idioma;
    private javax.swing.JLabel Label__Candidato__cursos_informatica;
    private javax.swing.JLabel Label__Candidato__dataNascimento;
    private javax.swing.JLabel Label__Candidato__dispisponibilidadeViajar;
    private javax.swing.JLabel Label__Candidato__estadoCivil;
    private javax.swing.JLabel Label__Candidato__experiênciaProfissional;
    private javax.swing.JLabel Label__Candidato__indisponibilidadeCandidato;
    private javax.swing.JLabel Label__Candidato__nome;
    private javax.swing.JLabel Label__Candidato__portadorNecessidadesEspeciais;
    private javax.swing.JLabel Label__Candidato__pretencaoSalarial;
    private javax.swing.JLabel Label__Candidato__profissao;
    private javax.swing.JLabel Label__Candidato__quantFilhos;
    private javax.swing.JLabel Label__Candidato__sexo;
    private javax.swing.JLabel Label__Candidato__veiculo;
    private javax.swing.JLabel Label__Candidato_cnhPossui;
    private javax.swing.JScrollPane ScrollPane__Candidato__caracteristica;
    private javax.swing.JScrollPane ScrollPane__Candidato__cursos;
    private javax.swing.JScrollPane ScrollPane__Candidato__experienciaProfissional;
    private javax.swing.JScrollPane ScrollPane__Candidato__indisponibilidadeCandidato;
    private javax.swing.JTable Table__Candidato__cursos;
    private javax.swing.JTable Table__Candidato__experienciaProfissional;
    private javax.swing.JTable Table__Candidato__indisponibilidadeCandidato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
