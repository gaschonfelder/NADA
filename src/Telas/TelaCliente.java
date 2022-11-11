/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Conexões.MySQL;
import Objetos.Cliente;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaCliente extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    Cliente novoCliente = new Cliente();
    Cliente cliente = new Cliente();
    public TelaCliente() {
        initComponents();
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagens//1234.png"));
        ImageIcon image2 = new ImageIcon(getClass().getResource("/locadoradecarroswinx//Início.png"));
        teste.setIcon(new ImageIcon(image.getImage().getScaledInstance(teste.getWidth(),teste.getHeight(), Image.SCALE_DEFAULT)));
        lblVoltar.setIcon(new ImageIcon(image2.getImage().getScaledInstance(lblVoltar.getWidth(),lblVoltar.getHeight(), Image.SCALE_DEFAULT)));
    }
    private void CadastrarCliente(Cliente novo){
            this.conectar.conectaBanco(); // Estabelecendo conexao com o BD
            
            novo.setNome(txtNomeCad.getText());
            novo.setCPF(txtCPFCad.getText());
            novo.setSexo(String.valueOf(ComboSex.getSelectedItem()));
            novo.setEndereço(txtEndCad.getText());
            novo.setCidade(txtCidadeCad.getText());
            novo.setEstado(String.valueOf(ComboEstado.getSelectedItem()));
            novo.setEmail(txtEmailCad.getText());
            novo.setTelefone(txtTelCad.getText());
            
            
            try{
                this.conectar.insertSQL("INSERT INTO cadastroclientes("
                +"nome,"
                +"cpf,"
                +"sexo,"
                +"endereco,"
                +"cidade,"
                +"estado,"
                +"email,"
                +"telefone"        
                +") VALUES ("
                +"'"+novo.getNome()+"',"
                +"'"+novo.getCPF()+"',"
                +"'"+novo.getSexo()+"',"
                +"'"+novo.getEndereço()+"',"
                +"'"+novo.getCidade()+"',"
                +"'"+novo.getEstado()+"',"
                +"'"+novo.getEmail()+"',"
                +"'"+novo.getTelefone()+"'"
                +")");
            }catch(Exception e){
                System.out.println("Erro ao cadastrar cliente"+e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!");
            }finally{
                this.conectar.fechaBanco();
                JOptionPane.showConfirmDialog(null, "Cliente Cadastrado com Sucesso");
                System.out.println("Teste");
            }
                    
        }
    public void buscarCliente (Cliente novo){
            this.conectar.conectaBanco();
            
            String consultaCpf = this.txtCPFConsult.getText();
            
            try {
                this.conectar.executarSQL(
                "SELECT "
                + "nome,"
                + "sexo,"
                + "endereco,"
                + "cidade,"
                + "estado,"
                + "email,"
                + "telefone"
              + " FROM "
                + "cadastroclientes"
              + " WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"
            );
            
            while (this.conectar.getResultSet().next()){
                novo.setNome(this.conectar.getResultSet().getString(1));
                novo.setSexo(this.conectar.getResultSet().getString(2));
                novo.setEndereço(this.conectar.getResultSet().getString(3));
                novo.setCidade(this.conectar.getResultSet().getString(4));
                novo.setEstado(this.conectar.getResultSet().getString(5));
                novo.setEmail(this.conectar.getResultSet().getString(6));
                novo.setTelefone(this.conectar.getResultSet().getString(7));
                
            }
            if(novo.getNome()==""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                System.out.println("Cliente não encontrado! ");
            }
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            }finally{
                txtNomeConsult.setText(novo.getNome());
                txtSexoConsult.setText(novo.getSexo());
                txtEndConsult.setText(novo.getEndereço());
                txtCidadeConsult.setText(novo.getCidade());
                txtEstadoConsult.setText(novo.getEstado());
                txtEmailConsult.setText(novo.getEmail());
                txtTelefoneConsult.setText(novo.getTelefone());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cliente Localizado!");
            }
        }
    public void atualizarCliente(Cliente novoCliente){
            this.conectar.conectaBanco();
            String consultaCpf  = this.txtCPFConsult.getText();
            
            try {
                this.conectar.updateSQL(
                "UPDATE cadastroclientes SET "
                + "nome = '" + txtNomeConsult.getText()+ "', "
                + "sexo = '" + txtSexoConsult.getText()+ "', "
                + "endereco = '"+ txtEndConsult.getText()+ "', "
                + "cidade = '"+ txtCidadeConsult.getText()+"', "
                + "estado = '"+ txtEstadoConsult.getText()+"',"
                + "email = '"+ txtEmailConsult.getText()+"', "
                + "telefone = '"+ txtTelefoneConsult.getText()+"'"
              //+ " FROM "
                //+ "cadastroclientes"
              + " WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"
            );
                
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            }finally{
                txtNomeConsult.setText(novoCliente.getNome());
                txtSexoConsult.setText(novoCliente.getSexo());
                txtEndConsult.setText(novoCliente.getEndereço());
                txtCidadeConsult.setText(novoCliente.getCidade());
                txtEstadoConsult.setText(novoCliente.getEstado());
                txtEmailConsult.setText(novoCliente.getEmail());
                txtTelefoneConsult.setText(novoCliente.getTelefone());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            }            
        }
    public void excluirCliente(Cliente novoCliente){
            this.conectar.conectaBanco();
            String consultaCpf  = this.txtCPFConsult.getText();
            
            try {
                this.conectar.updateSQL(
                "DELETE FROM cadastroclientes WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"        
                );
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente!");
            }finally{
                
                this.conectar.fechaBanco();
                System.out.println("Cliente deletado!");
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
            }
        }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCPFConsult = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNomeConsult = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEndConsult = new javax.swing.JTextArea();
        BtnConsultar = new javax.swing.JButton();
        BtnLimparConsulta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtSexoConsult = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEstadoConsult = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCidadeConsult = new javax.swing.JTextField();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtEmailConsult = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTelefoneConsult = new javax.swing.JTextField();
        lblVoltar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCPFCad = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboSex = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEndCad = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtCidadeCad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        BtnCad = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        teste = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmailCad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelCad = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(715, 527));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel8.setBackground(new java.awt.Color(102, 0, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Consulta Cliente");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF:");

        txtCPFConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtCPFConsult.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCPFConsult.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFConsult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Endereço:");

        txtNomeConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtNomeConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNomeConsult.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome:");

        txtEndConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtEndConsult.setColumns(20);
        txtEndConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEndConsult.setForeground(new java.awt.Color(255, 255, 255));
        txtEndConsult.setRows(5);
        jScrollPane2.setViewportView(txtEndConsult);

        BtnConsultar.setBackground(new java.awt.Color(102, 0, 102));
        BtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/binoculars.png"))); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnLimparConsulta.setBackground(new java.awt.Color(102, 0, 102));
        BtnLimparConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar-limpo.png"))); // NOI18N
        BtnLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparConsultaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo:");

        txtSexoConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtSexoConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSexoConsult.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Estado:");

        txtEstadoConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtEstadoConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEstadoConsult.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cidade:");

        txtCidadeConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtCidadeConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCidadeConsult.setForeground(new java.awt.Color(255, 255, 255));

        BtnAtualizar.setBackground(new java.awt.Color(102, 0, 102));
        BtnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mole.png"))); // NOI18N
        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnExcluir.setBackground(new java.awt.Color(102, 0, 102));
        BtnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email:");

        txtEmailConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtEmailConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmailConsult.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Telefone: ");

        txtTelefoneConsult.setBackground(new java.awt.Color(102, 0, 102));
        txtTelefoneConsult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTelefoneConsult.setForeground(new java.awt.Color(255, 255, 255));

        lblVoltar.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeConsult))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSexoConsult))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmailConsult))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefoneConsult))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidadeConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstadoConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCPFConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPFConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeConsult)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 0, 350, 490);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(350, 405));

        jLabel3.setBackground(new java.awt.Color(51, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoradecarroswinx/Clientes.png"))); // NOI18N
        jLabel3.setText("Cadastro Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome: ");

        txtNomeCad.setBackground(new java.awt.Color(102, 0, 102));
        txtNomeCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeCad.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF: ");

        txtCPFCad.setBackground(new java.awt.Color(102, 0, 102));
        txtCPFCad.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCPFCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo:");
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 16));

        ComboSex.setBackground(new java.awt.Color(102, 0, 102));
        ComboSex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboSex.setForeground(new java.awt.Color(255, 255, 255));
        ComboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço:");

        txtEndCad.setBackground(new java.awt.Color(102, 0, 102));
        txtEndCad.setColumns(20);
        txtEndCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEndCad.setForeground(new java.awt.Color(255, 255, 255));
        txtEndCad.setRows(5);
        jScrollPane1.setViewportView(txtEndCad);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cidade:");

        txtCidadeCad.setBackground(new java.awt.Color(102, 0, 102));
        txtCidadeCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCidadeCad.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");

        ComboEstado.setBackground(new java.awt.Color(102, 0, 102));
        ComboEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboEstado.setForeground(new java.awt.Color(255, 255, 255));
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        BtnCad.setBackground(new java.awt.Color(102, 0, 102));
        BtnCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCad.setForeground(new java.awt.Color(255, 255, 255));
        BtnCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar-usuario (1).png"))); // NOI18N
        BtnCad.setText("Cadastrar");
        BtnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(102, 0, 102));
        BtnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email: ");

        txtEmailCad.setBackground(new java.awt.Color(102, 0, 102));
        txtEmailCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmailCad.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone: ");

        txtTelCad.setBackground(new java.awt.Color(102, 0, 102));
        txtTelCad.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTelCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboEstado, 0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPFCad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboSex, 0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(teste, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmailCad)))))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeCad, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCPFCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtEmailCad, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboEstado)
                    .addComponent(txtCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 350, 490);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 0, 10, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadActionPerformed
        Cliente cliente = new Cliente();
        cliente.IncluirCliente(txtNomeCad.getText(),txtCPFCad.getText(), (String) ComboSex.getSelectedItem(), txtEndCad.getText(), txtCidadeCad.getText(), (String) ComboEstado.getSelectedItem(), txtEmailCad.getText(), txtTelCad.getText());
        //cliente.IncluirCliente(txtCPFCliente.getText(), TxtNomeCliente.getText(), (String) CmbSexoCliente.getSelectedItem(), txtEnderecoCliente.getText(), txtCidadeCliente.getText(), (String) CbmEstadoCliente.getSelectedItem());
        CadastrarCliente(novoCliente);
    }//GEN-LAST:event_BtnCadActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        txtCPFCad.setText("");
        txtCidadeCad.setText("");
        txtNomeCad.setText("");
        txtEmailCad.setText("");
        txtTelCad.setText("");
        txtEndCad.setText("");
        
        
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        buscarCliente(cliente);
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void BtnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparConsultaActionPerformed
        txtNomeConsult.setText("");
        txtCPFConsult.setText("");
        txtEndConsult.setText("");
        txtCidadeConsult.setText("");
        txtEmailConsult.setText("");
        txtEstadoConsult.setText("");
        txtTelefoneConsult.setText("");
        txtSexoConsult.setText("");
        
        
    }//GEN-LAST:event_BtnLimparConsultaActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        atualizarCliente(cliente);
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        excluirCliente(cliente);
    }//GEN-LAST:event_BtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnCad;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnLimparConsulta;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JLabel teste;
    private javax.swing.JFormattedTextField txtCPFCad;
    private javax.swing.JFormattedTextField txtCPFConsult;
    private javax.swing.JTextField txtCidadeCad;
    private javax.swing.JTextField txtCidadeConsult;
    private javax.swing.JTextField txtEmailCad;
    private javax.swing.JTextField txtEmailConsult;
    private javax.swing.JTextArea txtEndCad;
    private javax.swing.JTextArea txtEndConsult;
    private javax.swing.JTextField txtEstadoConsult;
    private javax.swing.JTextField txtNomeCad;
    private javax.swing.JTextField txtNomeConsult;
    private javax.swing.JTextField txtSexoConsult;
    private javax.swing.JFormattedTextField txtTelCad;
    private javax.swing.JTextField txtTelefoneConsult;
    // End of variables declaration//GEN-END:variables
}
