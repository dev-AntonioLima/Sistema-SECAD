package secad.Interface;

public class CadastroInstrutor extends javax.swing.JInternalFrame {

    public CadastroInstrutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        dateNascimento5 = new javax.swing.JFormattedTextField();
        cmbSexo5 = new javax.swing.JComboBox<>();
        labelNome5 = new javax.swing.JLabel();
        labelCpf5 = new javax.swing.JLabel();
        labelNascimento5 = new javax.swing.JLabel();
        labelSexo5 = new javax.swing.JLabel();
        txtCpf5 = new javax.swing.JFormattedTextField();
        labelMatricula5 = new javax.swing.JLabel();
        labelRg5 = new javax.swing.JLabel();
        labelCep5 = new javax.swing.JLabel();
        labelEndereco5 = new javax.swing.JLabel();
        labelCidade5 = new javax.swing.JLabel();
        labelComplemento5 = new javax.swing.JLabel();
        labelEstadoCivil5 = new javax.swing.JLabel();
        labelHabilitacao5 = new javax.swing.JLabel();
        labelTurno5 = new javax.swing.JLabel();
        txtEndereco5 = new javax.swing.JTextField();
        txtCidade5 = new javax.swing.JTextField();
        txtComplemento5 = new javax.swing.JTextField();
        cmbEstadoCivil5 = new javax.swing.JComboBox<>();
        cmbHabilitacao5 = new javax.swing.JComboBox<>();
        txtMatricula5 = new javax.swing.JTextField();
        txtNome5 = new javax.swing.JTextField();
        cmbTurno5 = new javax.swing.JComboBox<>();
        txtCep5 = new javax.swing.JFormattedTextField();
        txtRg5 = new javax.swing.JFormattedTextField();
        jPanel11 = new javax.swing.JPanel();
        txtTelefone5 = new javax.swing.JFormattedTextField();
        txtCelular5 = new javax.swing.JFormattedTextField();
        txtEmail5 = new javax.swing.JTextField();
        labelTelefone5 = new javax.swing.JLabel();
        labelCelular5 = new javax.swing.JLabel();
        labelEmail5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Instrutor");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel12.setForeground(new java.awt.Color(31, 77, 120));

        try {
            dateNascimento5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbSexo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        cmbSexo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        labelNome5.setText("Nome");

        labelCpf5.setText("CPF");

        labelNascimento5.setText("Data de Nascimento");

        labelSexo5.setText("Sexo");

        try {
            txtCpf5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelMatricula5.setText("Matrícula");

        labelRg5.setText("RG");

        labelCep5.setText("CEP");

        labelEndereco5.setText("Endereço");

        labelCidade5.setText("Cidade");

        labelComplemento5.setText("Complemento");

        labelEstadoCivil5.setText("Estado Civil");

        labelHabilitacao5.setText("Habilitação");

        labelTurno5.setText("Turno");

        cmbEstadoCivil5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo" }));

        cmbHabilitacao5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Barbearia", "Cabeleleiro", "Enfermagem", "Estética", "Farmácia", "Informática", "Logística", "Odontologia" }));

        cmbTurno5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

        try {
            txtCep5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRg5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        try {
            txtTelefone5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTelefone5.setText("Telefone");

        labelCelular5.setText("Celular");

        labelEmail5.setText("E-mail");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail5)
                        .addComponent(labelCelular5)
                        .addComponent(txtCelular5, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addComponent(labelEmail5)
                        .addComponent(txtTelefone5))
                    .addComponent(labelTelefone5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTelefone5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(labelCelular5)
                .addGap(2, 2, 2)
                .addComponent(txtCelular5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");

        btnPesquisar.setText("Pesquisar");

        btnExcluir.setText("Excluir");

        btnAlterar.setText("Alterar");

        btnIncluir.setText("Incluir");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMatricula5)
                                    .addComponent(txtMatricula5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome5)
                                    .addComponent(txtNome5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(labelEndereco5)
                                .addGap(276, 276, 276)
                                .addComponent(labelCidade5))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtRg5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCep5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTurno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSexo5)
                                    .addComponent(cmbSexo5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNascimento5)
                                    .addComponent(dateNascimento5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCpf5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEstadoCivil5)
                                    .addComponent(cmbEstadoCivil5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(labelCep5))
                            .addComponent(labelRg5)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtComplemento5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelComplemento5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCidade5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(labelHabilitacao5)
                                    .addComponent(cmbHabilitacao5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(labelTurno5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir)
                        .addGap(66, 66, 66)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula5)
                    .addComponent(labelNome5)
                    .addComponent(labelNascimento5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateNascimento5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf5)
                    .addComponent(labelSexo5)
                    .addComponent(labelEstadoCivil5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSexo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstadoCivil5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRg5)
                    .addComponent(labelCep5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco5)
                    .addComponent(labelCidade5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComplemento5)
                    .addComponent(labelHabilitacao5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHabilitacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTurno5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTurno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        btnNovo.setEnabled(false);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JComboBox<String> cmbEstadoCivil1;
    private javax.swing.JComboBox<String> cmbEstadoCivil2;
    private javax.swing.JComboBox<String> cmbEstadoCivil3;
    private javax.swing.JComboBox<String> cmbEstadoCivil4;
    private javax.swing.JComboBox<String> cmbEstadoCivil5;
    private javax.swing.JComboBox<String> cmbHabilitacao;
    private javax.swing.JComboBox<String> cmbHabilitacao1;
    private javax.swing.JComboBox<String> cmbHabilitacao2;
    private javax.swing.JComboBox<String> cmbHabilitacao3;
    private javax.swing.JComboBox<String> cmbHabilitacao4;
    private javax.swing.JComboBox<String> cmbHabilitacao5;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbSexo1;
    private javax.swing.JComboBox<String> cmbSexo2;
    private javax.swing.JComboBox<String> cmbSexo3;
    private javax.swing.JComboBox<String> cmbSexo4;
    private javax.swing.JComboBox<String> cmbSexo5;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JComboBox<String> cmbTurno1;
    private javax.swing.JComboBox<String> cmbTurno2;
    private javax.swing.JComboBox<String> cmbTurno3;
    private javax.swing.JComboBox<String> cmbTurno4;
    private javax.swing.JComboBox<String> cmbTurno5;
    private javax.swing.JFormattedTextField dateNascimento;
    private javax.swing.JFormattedTextField dateNascimento1;
    private javax.swing.JFormattedTextField dateNascimento2;
    private javax.swing.JFormattedTextField dateNascimento3;
    private javax.swing.JFormattedTextField dateNascimento4;
    private javax.swing.JFormattedTextField dateNascimento5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCelular1;
    private javax.swing.JLabel labelCelular2;
    private javax.swing.JLabel labelCelular3;
    private javax.swing.JLabel labelCelular4;
    private javax.swing.JLabel labelCelular5;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCep1;
    private javax.swing.JLabel labelCep2;
    private javax.swing.JLabel labelCep3;
    private javax.swing.JLabel labelCep4;
    private javax.swing.JLabel labelCep5;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCidade1;
    private javax.swing.JLabel labelCidade2;
    private javax.swing.JLabel labelCidade3;
    private javax.swing.JLabel labelCidade4;
    private javax.swing.JLabel labelCidade5;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelComplemento1;
    private javax.swing.JLabel labelComplemento2;
    private javax.swing.JLabel labelComplemento3;
    private javax.swing.JLabel labelComplemento4;
    private javax.swing.JLabel labelComplemento5;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelCpf1;
    private javax.swing.JLabel labelCpf2;
    private javax.swing.JLabel labelCpf3;
    private javax.swing.JLabel labelCpf4;
    private javax.swing.JLabel labelCpf5;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelEmail3;
    private javax.swing.JLabel labelEmail4;
    private javax.swing.JLabel labelEmail5;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEndereco1;
    private javax.swing.JLabel labelEndereco2;
    private javax.swing.JLabel labelEndereco3;
    private javax.swing.JLabel labelEndereco4;
    private javax.swing.JLabel labelEndereco5;
    private javax.swing.JLabel labelEstadoCivil;
    private javax.swing.JLabel labelEstadoCivil1;
    private javax.swing.JLabel labelEstadoCivil2;
    private javax.swing.JLabel labelEstadoCivil3;
    private javax.swing.JLabel labelEstadoCivil4;
    private javax.swing.JLabel labelEstadoCivil5;
    private javax.swing.JLabel labelHabilitacao;
    private javax.swing.JLabel labelHabilitacao1;
    private javax.swing.JLabel labelHabilitacao2;
    private javax.swing.JLabel labelHabilitacao3;
    private javax.swing.JLabel labelHabilitacao4;
    private javax.swing.JLabel labelHabilitacao5;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelMatricula1;
    private javax.swing.JLabel labelMatricula2;
    private javax.swing.JLabel labelMatricula3;
    private javax.swing.JLabel labelMatricula4;
    private javax.swing.JLabel labelMatricula5;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNascimento1;
    private javax.swing.JLabel labelNascimento2;
    private javax.swing.JLabel labelNascimento3;
    private javax.swing.JLabel labelNascimento4;
    private javax.swing.JLabel labelNascimento5;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelNome2;
    private javax.swing.JLabel labelNome3;
    private javax.swing.JLabel labelNome4;
    private javax.swing.JLabel labelNome5;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelRg1;
    private javax.swing.JLabel labelRg2;
    private javax.swing.JLabel labelRg3;
    private javax.swing.JLabel labelRg4;
    private javax.swing.JLabel labelRg5;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSexo1;
    private javax.swing.JLabel labelSexo2;
    private javax.swing.JLabel labelSexo3;
    private javax.swing.JLabel labelSexo4;
    private javax.swing.JLabel labelSexo5;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JLabel labelTelefone2;
    private javax.swing.JLabel labelTelefone3;
    private javax.swing.JLabel labelTelefone4;
    private javax.swing.JLabel labelTelefone5;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JLabel labelTurno1;
    private javax.swing.JLabel labelTurno2;
    private javax.swing.JLabel labelTurno3;
    private javax.swing.JLabel labelTurno4;
    private javax.swing.JLabel labelTurno5;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCelular1;
    private javax.swing.JFormattedTextField txtCelular2;
    private javax.swing.JFormattedTextField txtCelular3;
    private javax.swing.JFormattedTextField txtCelular4;
    private javax.swing.JFormattedTextField txtCelular5;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCep1;
    private javax.swing.JFormattedTextField txtCep2;
    private javax.swing.JFormattedTextField txtCep3;
    private javax.swing.JFormattedTextField txtCep4;
    private javax.swing.JFormattedTextField txtCep5;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade1;
    private javax.swing.JTextField txtCidade2;
    private javax.swing.JTextField txtCidade3;
    private javax.swing.JTextField txtCidade4;
    private javax.swing.JTextField txtCidade5;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtComplemento1;
    private javax.swing.JTextField txtComplemento2;
    private javax.swing.JTextField txtComplemento3;
    private javax.swing.JTextField txtComplemento4;
    private javax.swing.JTextField txtComplemento5;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtCpf1;
    private javax.swing.JFormattedTextField txtCpf2;
    private javax.swing.JFormattedTextField txtCpf3;
    private javax.swing.JFormattedTextField txtCpf4;
    private javax.swing.JFormattedTextField txtCpf5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtEmail3;
    private javax.swing.JTextField txtEmail4;
    private javax.swing.JTextField txtEmail5;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtEndereco2;
    private javax.swing.JTextField txtEndereco3;
    private javax.swing.JTextField txtEndereco4;
    private javax.swing.JTextField txtEndereco5;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatricula1;
    private javax.swing.JTextField txtMatricula2;
    private javax.swing.JTextField txtMatricula3;
    private javax.swing.JTextField txtMatricula4;
    private javax.swing.JTextField txtMatricula5;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNome5;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtRg1;
    private javax.swing.JFormattedTextField txtRg2;
    private javax.swing.JFormattedTextField txtRg3;
    private javax.swing.JFormattedTextField txtRg4;
    private javax.swing.JFormattedTextField txtRg5;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JFormattedTextField txtTelefone2;
    private javax.swing.JFormattedTextField txtTelefone3;
    private javax.swing.JFormattedTextField txtTelefone4;
    private javax.swing.JFormattedTextField txtTelefone5;
    // End of variables declaration//GEN-END:variables
}
