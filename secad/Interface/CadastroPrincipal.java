package secad.Interface;

public class CadastroPrincipal extends javax.swing.JFrame {

    public CadastroPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Dpane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        MenuAluno = new javax.swing.JMenuItem();
        MenuInstrutor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SECad - Sistema Educacional de Cadastro");

        Dpane1.setBackground(new java.awt.Color(31, 77, 120));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SECad.jpg"))); // NOI18N
        jLabel1.setLabelFor(Dpane1);
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));

        Dpane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Dpane1Layout = new javax.swing.GroupLayout(Dpane1);
        Dpane1.setLayout(Dpane1Layout);
        Dpane1Layout.setHorizontalGroup(
            Dpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dpane1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
        );
        Dpane1Layout.setVerticalGroup(
            Dpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dpane1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        MenuAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        MenuAluno.setText("Aluno");
        MenuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlunoActionPerformed(evt);
            }
        });
        Cadastro.add(MenuAluno);

        MenuInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_gray.png"))); // NOI18N
        MenuInstrutor.setText("Instrutor");
        MenuInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInstrutorActionPerformed(evt);
            }
        });
        Cadastro.add(MenuInstrutor);

        jMenuBar1.add(Cadastro);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/information.png"))); // NOI18N
        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dpane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dpane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInstrutorActionPerformed
     CadastroInstrutor cinstrutor = new CadastroInstrutor();
     Dpane1.add(cinstrutor);
     cinstrutor.setVisible(true);
    }//GEN-LAST:event_MenuInstrutorActionPerformed

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroActionPerformed

    private void MenuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlunoActionPerformed
     CadastroAluno caluno = new CadastroAluno();
     Dpane1.add(caluno);
     caluno.setVisible(true);
    }//GEN-LAST:event_MenuAlunoActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JDesktopPane Dpane1;
    private javax.swing.JMenuItem MenuAluno;
    private javax.swing.JMenuItem MenuInstrutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
