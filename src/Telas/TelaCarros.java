package Telas;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class TelaCarros extends javax.swing.JFrame {
    public TelaCarros() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        Exit = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        voltar1 = new javax.swing.JButton();
        lblTeste = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        voltar2 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        Panel_2 = new javax.swing.JPanel();
        TextoMenu = new javax.swing.JLabel();
        Underline = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
        ButConfig = new javax.swing.JLabel();
        ButTxtConfig = new javax.swing.JLabel();
        ButCarro = new javax.swing.JLabel();
        ButCasa = new javax.swing.JLabel();
        ButCar = new javax.swing.JLabel();
        ButClientes = new javax.swing.JLabel();
        ButClient = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TXT_Inicio = new javax.swing.JLabel();
        marcad = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ano:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cor:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-48.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, -1));

        jTabbedPane1.setBackground(new java.awt.Color(64, 10, 90));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 0, 60));
        jLabel1.setText("Modelo");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setForeground(new java.awt.Color(50, 0, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 0, 60));
        jLabel2.setText("Ano");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 0, 60));
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 0, 60));
        jLabel4.setText("Cor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 0, 60));
        jLabel5.setText("Classe");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(50, 0, 60));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe A", "Classe B", "Classe C", "Classe D" }));

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setForeground(new java.awt.Color(50, 0, 60));

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        jTextField6.setForeground(new java.awt.Color(50, 0, 60));

        jTextField7.setBackground(new java.awt.Color(204, 204, 204));
        jTextField7.setForeground(new java.awt.Color(50, 0, 60));

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        jTextField8.setForeground(new java.awt.Color(50, 0, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 0, 60));
        jLabel6.setText("Placa");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(50, 0, 60));
        jButton1.setText("Cadastrar");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(50, 0, 60));
        jButton2.setText("Limpar");

        jLabel7.setBackground(new java.awt.Color(50, 0, 60));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 0, 60));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro de Carros");

        voltar1.setBackground(new java.awt.Color(204, 204, 204));
        voltar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar1.setForeground(new java.awt.Color(50, 0, 60));
        voltar1.setText("Voltar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(voltar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 0, 60));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Consulta de Carros");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 0, 60));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Placa:");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setForeground(new java.awt.Color(50, 0, 60));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(50, 0, 60));
        jButton4.setText("Consultar");

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setForeground(new java.awt.Color(50, 0, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 0, 60));
        jLabel10.setText("Modelo:");

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setForeground(new java.awt.Color(50, 0, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 0, 60));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Marca:");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setForeground(new java.awt.Color(50, 0, 60));

        jTextField10.setBackground(new java.awt.Color(204, 204, 204));
        jTextField10.setForeground(new java.awt.Color(50, 0, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 0, 60));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ano:");

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.setForeground(new java.awt.Color(50, 0, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 0, 60));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Cor:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 0, 60));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Classe:");

        jTextField14.setBackground(new java.awt.Color(204, 204, 204));
        jTextField14.setForeground(new java.awt.Color(50, 0, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(50, 0, 60));
        jLabel17.setText("Disponivel:");

        jTextField15.setBackground(new java.awt.Color(204, 204, 204));
        jTextField15.setForeground(new java.awt.Color(50, 0, 60));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(50, 0, 60));
        jButton6.setText("Atualizar");

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(50, 0, 60));
        jButton7.setText("Excluir");

        voltar2.setBackground(new java.awt.Color(204, 204, 204));
        voltar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar2.setForeground(new java.awt.Color(50, 0, 60));
        voltar2.setText("Voltar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11))
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 128, 430, 430));

        Panel_2.setBackground(new java.awt.Color(50, 0, 60));
        Panel_2.setPreferredSize(new java.awt.Dimension(200, 550));
        Panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoMenu.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TextoMenu.setForeground(new java.awt.Color(255, 255, 255));
        TextoMenu.setText("Menu");
        Panel_2.add(TextoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 130, 40));

        Underline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Underline.setForeground(new java.awt.Color(255, 255, 255));
        Underline.setText("______________________");
        Panel_2.add(Underline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        ButInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButInicio.setForeground(new java.awt.Color(255, 255, 255));
        ButInicio.setText("- Início");
        ButInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButInicioMouseClicked(evt);
            }
        });
        Panel_2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 108, 110, 60));

        ButConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Config.png"))); // NOI18N
        ButConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 60, 50));

        ButTxtConfig.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        ButTxtConfig.setForeground(new java.awt.Color(255, 255, 255));
        ButTxtConfig.setText("- Configurações");
        ButTxtConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButTxtConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButTxtConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, 110, 60));

        ButCarro.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButCarro.setForeground(new java.awt.Color(255, 255, 255));
        ButCarro.setText("- Carros");
        ButCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarroMouseClicked(evt);
            }
        });
        Panel_2.add(ButCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, 110, 60));

        ButCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Início.png"))); // NOI18N
        ButCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCasaMouseClicked(evt);
            }
        });
        Panel_2.add(ButCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 50));

        ButCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sedan.png"))); // NOI18N
        ButCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarMouseClicked(evt);
            }
        });
        Panel_2.add(ButCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 50));

        ButClientes.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButClientes.setForeground(new java.awt.Color(255, 255, 255));
        ButClientes.setText("- Clientes");
        ButClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientesMouseClicked(evt);
            }
        });
        Panel_2.add(ButClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 305, 110, 60));

        ButClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        ButClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientMouseClicked(evt);
            }
        });
        Panel_2.add(ButClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 50));

        getContentPane().add(Panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanel3.setBackground(new java.awt.Color(64, 10, 90));
        jPanel3.setForeground(new java.awt.Color(64, 10, 90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_Inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TXT_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        TXT_Inicio.setText("Carros.");
        jPanel3.add(TXT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 710, 150));

        marcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MarcaDagua.png"))); // NOI18N
        getContentPane().add(marcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 630, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicioMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicioMouseClicked

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void ButTxtConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButTxtConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButTxtConfigMouseClicked

    private void ButCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarroMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarroMouseClicked

    private void ButCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCasaMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCasaMouseClicked

    private void ButCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarMouseClicked

    private void ButClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientesMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientesMouseClicked

    private void ButClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        JOptionPane.showMessageDialog(null,"Locadora Midnight Winx Club agradece a sua visita", "Clube das Winx", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButCar;
    private javax.swing.JLabel ButCarro;
    private javax.swing.JLabel ButCasa;
    private javax.swing.JLabel ButClient;
    private javax.swing.JLabel ButClientes;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButTxtConfig;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXT_Inicio;
    private javax.swing.JLabel TextoMenu;
    private javax.swing.JLabel Underline;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTeste;
    private javax.swing.JLabel marcad;
    private javax.swing.JButton voltar1;
    private javax.swing.JButton voltar2;
    // End of variables declaration//GEN-END:variables
}
