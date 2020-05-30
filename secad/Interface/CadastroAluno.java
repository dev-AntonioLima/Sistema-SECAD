package secad.Interface;

//Importações
import javax.swing.JOptionPane;
import secad.Aluno;
import secad.TipoCivil;
import secad.TipoTurno;
import secad.TipoSexo;

public class CadastroAluno extends javax.swing.JInternalFrame {

    public CadastroAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        txtNascimento = new javax.swing.JFormattedTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        labelMatricula = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelComplemento = new javax.swing.JLabel();
        labelEstadoCivil = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cmbTurno = new javax.swing.JComboBox<>();
        txtRg = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtCurso = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Aluno");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel2.setForeground(new java.awt.Color(31, 77, 120));

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        labelNome.setText("Nome");

        labelCpf.setText("CPF");

        labelNascimento.setText("Data de Nascimento");

        labelSexo.setText("Sexo");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelMatricula.setText("Matrícula");

        labelRg.setText("RG");

        labelCep.setText("CEP");

        labelEndereco.setText("Endereço");

        labelCidade.setText("Cidade");

        labelComplemento.setText("Complemento");

        labelEstadoCivil.setText("Estado Civil");

        labelCurso.setText("Curso");

        labelTurno.setText("Turno");

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo" }));

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTelefone.setText("Telefone");

        labelCelular.setText("Celular");

        labelEmail.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail)
                    .addComponent(labelTelefone)
                    .addComponent(labelCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(labelEmail)
                    .addComponent(txtTelefone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(labelCelular)
                .addGap(2, 2, 2)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelEndereco)
                                        .addGap(276, 276, 276)
                                        .addComponent(labelCidade))
                                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(labelCep))
                                    .addComponent(labelRg)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(labelComplemento))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(labelCurso)
                                            .addComponent(txtCurso)))
                                    .addComponent(labelTurno)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMatricula)
                                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNome)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCpf))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelSexo)
                                                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelNascimento)
                                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(labelEstadoCivil)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncluir)
                                .addGap(69, 69, 69)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addGap(68, 68, 68)
                                .addComponent(btnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(labelNome)
                    .addComponent(labelNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(labelSexo)
                    .addComponent(labelEstadoCivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRg)
                    .addComponent(labelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComplemento)
                    .addComponent(labelCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnCancelar))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtMatricula.setText("");
        txtMatricula.setEditable(false);
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtNascimento.setText("");
        txtCep.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtCurso.setText("");
        cmbSexo.setSelectedItem("Selecione");
        cmbEstadoCivil.setSelectedItem("Selecione");
        cmbTurno.setSelectedItem("Selecione");
       
        btnNovo.setEnabled(false);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed

    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       txtMatricula.setText("");
       txtMatricula.setEditable(true);      
       txtNome.setText("");
       txtCpf.setText("");
       txtRg.setText("");
       txtNascimento.setText("");
       txtCep.setText("");
       txtEndereco.setText("");
       txtCidade.setText("");
       txtComplemento.setText("");
       txtTelefone.setText("");
       txtCelular.setText("");
       txtEmail.setText("");
       txtCurso.setText("");
       cmbSexo.setSelectedItem("Selecione");
       cmbEstadoCivil.setSelectedItem("Selecione");
       cmbTurno.setSelectedItem("Selecione");
       
        btnNovo.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(true);
        btnCancelar.setEnabled(false);
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
 
       
Aluno a = new Aluno();
        
a.setNome(txtNome.getText());
a.setEndereco(txtEndereco.getText());
a.setComplemento(txtComplemento.getText());
a.setCidade(txtCidade.getText());
a.setCurso(txtCurso.getText());
a.setEmail(txtEmail.getText());
a.setCpf(Integer.valueOf(txtCpf.getText()));
a.setNascimento(Integer.valueOf(txtNascimento.getText()));
a.setRg(Integer.valueOf(txtRg.getText()));
a.setCep(Integer.valueOf(txtCep.getText()));
a.setTelefone(Integer.valueOf(txtTelefone.getText()));
a.setCelular(Integer.valueOf(txtCelular.getText()));

switch(cmbSexo.getSelectedItem().toString()) {
            case "Masculino":
                a.setSexo(TipoSexo.Masculino);
                break;
            case "Feminino":
                a.setSexo(TipoSexo.Feminino);
               break;
}
switch(cmbTurno.getSelectedItem().toString()) {
            case "Manhã":
                a.setTurno(TipoTurno.Manhã);
                break;
            case "Tarde":
                a.setTurno(TipoTurno.Tarde);
                break;
                 case "Noite":
                a.setTurno(TipoTurno.Noite);
               break;
}
switch(cmbEstadoCivil.getSelectedItem().toString()) {
            case "Solteiro":
                a.setEstadocivil(TipoCivil.Solteiro);
                break;
            case "Casado":
                a.setEstadocivil(TipoCivil.Casado);
                break;
            case "Divorciado":
                a.setEstadocivil(TipoCivil.Divorciado);
                break;
            case "Separado":
                a.setEstadocivil(TipoCivil.Separado);
                break;
            case "Viúvo":
                a.setEstadocivil(TipoCivil.Viúvo);
                break;
}
                a.inserir();
        JOptionPane.showMessageDialog(this, "Registro incluido com sucesso!");
                                          
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         Aluno a = new Aluno();
         if (!txtMatricula.getText().equals("")){
             a.setMatriculaaluno(Integer.parseInt(txtMatricula.getText()));
             a.consultar();
             txtMatricula.setText(String.valueOf(a.getMatriculaaluno()));
             txtCpf.setText(String.valueOf(a.getCpf()));
             txtRg.setText(String.valueOf(a.getRg()));
             txtCep.setText(String.valueOf(a.getCep()));
             txtNascimento.setText(String.valueOf(a.getNascimento()));
             txtTelefone.setText(String.valueOf(a.getTelefone()));
             txtCelular.setText(String.valueOf(a.getCelular())); 
             txtEndereco.setText(a.getEndereco());
             txtComplemento.setText(a.getComplemento());
             txtCidade.setText(a.getCidade());
             txtCurso.setText(a.getCurso());
             txtEmail.setText(a.getEmail());
             txtNome.setText(a.getNome());
             cmbSexo.setSelectedItem(String.valueOf(a.getSexo()));
             cmbEstadoCivil.setSelectedItem(String.valueOf(a.getEstadocivil()));
             cmbTurno.setSelectedItem(String.valueOf(a.getTurno()));
         }
             else {
            JOptionPane.showMessageDialog(this, "O ID procurado não existe!");
         }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
      Aluno a = new Aluno();
      a.setMatriculaaluno(Integer.valueOf(txtMatricula.getText()));
      a.setNome(txtNome.getText());
      a.setEndereco(txtEndereco.getText());
      a.setCidade(txtCidade.getText());
      a.setComplemento(txtComplemento.getText());
      a.setCurso(txtCurso.getText());
      a.setEmail(txtEmail.getText());
      a.setCpf(Integer.valueOf(txtCpf.getText()));
      a.setRg(Integer.valueOf(txtRg.getText()));
      a.setCep(Integer.valueOf(txtCep.getText()));
      a.setNascimento(Integer.valueOf(txtNascimento.getText()));
      a.setTelefone(Integer.valueOf(txtTelefone.getText()));
      a.setCelular(Integer.valueOf(txtCelular.getText()));
      
      switch(cmbSexo.getSelectedItem().toString()) {
            case "Masculino":
                a.setSexo(TipoSexo.Masculino);
                break;
            case "Feminino":
                a.setSexo(TipoSexo.Feminino);
                break;
      }
      switch(cmbEstadoCivil.getSelectedItem().toString()) {
            case "Casado":
                a.setEstadocivil(TipoCivil.Casado);
                break;
            case "Divorciado":
                a.setEstadocivil(TipoCivil.Divorciado);
                break;
            case "Separado":
                a.setEstadocivil(TipoCivil.Separado);
                break;
            case "Solteiro":
                a.setEstadocivil(TipoCivil.Solteiro);
                break;
            case "Viúvo":
                a.setEstadocivil(TipoCivil.Viúvo);
                break;
                
        }
      switch(cmbTurno.getSelectedItem().toString()) {
            case "Manhã":
                a.setTurno(TipoTurno.Manhã);
                break;
            case "Tarde":
                a.setTurno(TipoTurno.Tarde);
                break;
            case "Noite":
                a.setTurno(TipoTurno.Noite);
                break;
      }
                a.alterar();
        JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");
        btnCancelarActionPerformed(evt);
      
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstadoCivil;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
