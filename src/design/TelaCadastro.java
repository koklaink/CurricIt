
package design;
import java.util.Random;
import classes.Nsa;
import classes.ParticipantesNsa;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JInternalFrame {

    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        point_Consult = new javax.swing.JLabel();
        AnoIngr_Consult = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        situation_Consult = new javax.swing.JLabel();
        id_Consult = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idade_Consult = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        habilidade_Consult = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cargo_Consult = new javax.swing.JLabel();
        btn_consulta = new javax.swing.JButton();
        nome_consult = new javax.swing.JLabel();
        EntradaText = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        salvar_Cadastral = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        password_cadastro = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        habilidade_cadastro = new javax.swing.JComboBox();
        cargo_cadastro = new javax.swing.JComboBox();
        email_Cadastro = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_cadastro = new javax.swing.JFormattedTextField();
        sexo_cadastro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        pass_obg = new javax.swing.JLabel();
        nome_obg = new javax.swing.JLabel();
        email_obg = new javax.swing.JLabel();
        idade_obg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idade_cadastro = new javax.swing.JFormattedTextField();
        jL_img = new javax.swing.JLabel();
        bnt_img = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formulário");

        point_Consult.setText("0");

        AnoIngr_Consult.setText("AnoInsc:");

        jLabel10.setText("AnoInsc:");

        jLabel11.setText("idade:");

        jLabel16.setText("situação:");

        label.setText("pontuação:");

        situation_Consult.setText("pendente");

        id_Consult.setText("ID:");

        jLabel1.setText("UserName");

        jLabel12.setText("cargo:");

        idade_Consult.setText("idade:");

        jLabel13.setText("habilidade:");

        habilidade_Consult.setText("habilidade:");

        jLabel14.setText("ID:");

        jLabel15.setText("nome:");

        cargo_Consult.setText("cargo:");

        btn_consulta.setText("Consultar");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        btn_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultaKeyPressed(evt);
            }
        });

        nome_consult.setText("nome:");

        EntradaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTextActionPerformed(evt);
            }
        });
        EntradaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaTextKeyPressed(evt);
            }
        });

        btn_remove.setText("remover");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        btn_remove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_removeKeyPressed(evt);
            }
        });

        salvar_Cadastral.setText("sair");
        salvar_Cadastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_CadastralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(salvar_Cadastral, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consulta)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(label))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnoIngr_Consult)
                    .addComponent(idade_Consult)
                    .addComponent(habilidade_Consult)
                    .addComponent(cargo_Consult)
                    .addComponent(nome_consult)
                    .addComponent(id_Consult)
                    .addComponent(point_Consult)
                    .addComponent(situation_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habilidade_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idade_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoIngr_Consult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(btn_consulta)
                                    .addComponent(btn_remove)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EntradaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(situation_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(point_Consult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(salvar_Cadastral)
                .addGap(69, 69, 69))
        );

        jLabel8.setText("Password");

        password_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_cadastroActionPerformed(evt);
            }
        });
        password_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_cadastroFocusLost(evt);
            }
        });
        password_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_cadastroKeyPressed(evt);
            }
        });

        jLabel6.setText("experiencia");

        jLabel4.setText("Cargo");

        habilidade_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "c", "delphi", "front", "php", "perl", "python", "sql" }));

        cargo_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "code", "analista", "DBA", "estudante", "front" }));

        email_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_CadastroActionPerformed(evt);
            }
        });
        email_Cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_CadastroFocusLost(evt);
            }
        });
        email_Cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_CadastroKeyPressed(evt);
            }
        });

        jLabel9.setText("email");

        jLabel2.setText("Name");

        nome_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadastroActionPerformed(evt);
            }
        });
        nome_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_cadastroFocusLost(evt);
            }
        });
        nome_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nome_cadastroKeyPressed(evt);
            }
        });

        sexo_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "masculino", "feminino" }));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        pass_obg.setForeground(new java.awt.Color(255, 51, 51));
        pass_obg.setText("√");
        pass_obg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_obgMouseClicked(evt);
            }
        });

        nome_obg.setForeground(new java.awt.Color(255, 51, 51));
        nome_obg.setText("√");

        email_obg.setForeground(new java.awt.Color(255, 51, 51));
        email_obg.setText("√");
        email_obg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_obgMouseClicked(evt);
            }
        });

        idade_obg.setForeground(new java.awt.Color(255, 51, 51));
        idade_obg.setText("√");

        jLabel5.setText("Idade");

        idade_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_cadastroActionPerformed(evt);
            }
        });
        idade_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idade_cadastroFocusLost(evt);
            }
        });
        idade_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idade_cadastroKeyPressed(evt);
            }
        });

        bnt_img.setText("escolher imagem");
        bnt_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_imgActionPerformed(evt);
            }
        });

        jButton2.setText("sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idade_cadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome_obg)
                                    .addComponent(email_obg)
                                    .addComponent(idade_obg)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(habilidade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sexo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(password_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pass_obg))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cargo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt_img)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jL_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_obg)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_obg)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_obg)
                            .addComponent(nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_obg)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(habilidade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jL_img, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(bnt_img)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int i;
public static int k; 
public static String nn;
public int emj;     
static File fi;   
 static ImageIcon[] imx=new ImageIcon[10] ;
 static ImageIcon[] imx2=new ImageIcon[10];
 static ImageIcon anon=new ImageIcon("alxsy.jog");
 static ImageIcon[] imx3=new ImageIcon[10];
 
 int z=0;
 static int xp=0;
 
/*
    Limpar campos de cadastro
    */
public void cls(){
nome_cadastro.setText(null);
//id_aleat.setText(null);
password_cadastro.setText(null);
idade_cadastro.setText(null);
email_Cadastro.setText(null);
Rand();
 }

void ftinha(){
if(TelaInicial.i==1)
    anon=new ImageIcon(getClass().getResource("/classes/anonn.png"));
jL_img.setIcon(anon);
// jL_img.setIcon(new ImageIcon(getClass().getResource("/classes/anonn.png")));   

}

//gerar aleatorio
public int Rand(){
//jL_img.setIcon(new ImageIcon(getClass().getResource("/classes/anonn.png")));
Random Rd = new Random();
int aleat = Rd.nextInt((100)+1);
return aleat;
}



//limpar entrada texto
public void clsEntrada(){
      EntradaText.setText(null);
     }
 
     
     
 //procurar nome    

public void SearchPrtc(String s){
    int ky=0;
                for(int n=0;n<Nsa.key;n++)
        if(Nsa.prtc[n].getNome().equals(s) )
       ky=1;
       
        
       switch(ky){
            case 1:{
                for(int m =0;m<Nsa.key;m++)
        if(Nsa.prtc[m].getNome().equals(s)){
             i=m;
pesq();
         }
break;

            }
            case 0:
                      JOptionPane.showMessageDialog(null,"usuário não encontrado.");

        }
        
    
    
    clsEntrada();
}
  
  
    

      
//valida obrigatorio
public void TurnOff(){
boolean a=true,b=true,c=true,d=true;
idade_obg.setVisible(a);
pass_obg.setVisible(b);
nome_obg.setVisible(c);
email_obg.setVisible(d);

  idade_obg.setForeground(Color.red);
pass_obg.setForeground(Color.red);
nome_obg.setForeground(Color.red);
email_obg.setForeground(Color.red);

}



public void TurnOn(){
boolean a,b,c,d;
a=idade_cadastro.getText().isEmpty()?true:false;
idade_obg.setVisible(a);

  b=new String(password_cadastro.getPassword()).isEmpty()?true:false;
pass_obg.setVisible(b); 
c=nome_cadastro.getText().isEmpty()?true:false;
nome_obg.setVisible(c);
d=email_Cadastro.getText().isEmpty()?true:false;
email_obg.setVisible(d);  
}




      
      //excluindo partc
public void xcluindoPrtc(String s){
   Nsa ns = new Nsa();
     ParticipantesNsa remove = new ParticipantesNsa();
        int ky=0;
                for(int n=0;n<Nsa.key;n++)
        if(Nsa.prtc[n].getNome().equals(s) )
       ky=1;
       
        
       switch(ky){
            case 1:{
              for(int m=0;m<Nsa.key;m++)
        if(Nsa.prtc[m].getNome().trim().equals(s)){
      i=m;
      remove.booble(i);
remove.ids();

lim();
for(int n=0;n<Nsa.Mb;n++)
        if(Nsa.member[n].getNome().equals(EntradaText.getText()))
         ns.booble(n);
           
         }
              
              
break;

            }
            case 0:
                      JOptionPane.showMessageDialog(null,"usuário não encontrado.");

        }
        
    
    
    clsEntrada();

    
    }
    
    






    
      //excluindo membro
public void xcluindoMember(String s){

    Nsa ns = new Nsa();
    for(int n=0;n<Nsa.Mb;n++)
        if(Nsa.member[n].getNome().equals(s))
           ns.booble(n);
    clsEntrada();

    
    }
  






      
//procurar nome no menbro
public void SearchMembro(String s){
Nsa ns = new Nsa();
          for(int m=0;m<Nsa.Mb;m++)
if(Nsa.member[m].getId().equals(s)){
ns.booble(m);
break;
}
}


public void xcluindoMembro(String s){
Nsa ns = new Nsa(); 
SearchMembro(s);
ns.booble(i);
clsEntrada();
}

      
      

      
      

//setar nome nos labels
public void pesq(){

          
           id_Consult.setText(Nsa.prtc[i].getId());
nome_consult.setText(Nsa.prtc[i].getNome());
cargo_Consult.setText(Nsa.prtc[i].getCargo());
habilidade_Consult.setText(Nsa.prtc[i].getHabilidade());
idade_Consult.setText(Integer.toString(Nsa.prtc[i].getIdade()));
AnoIngr_Consult.setText(Nsa.prtc[i].getAnoIns());
situation_Consult.setText(Nsa.prtc[i].getSituation());
point_Consult.setText(Integer.toString(Nsa.prtc[i].getPontos()));

       }
       
       

       
     //limpar label  
public void lim(){
id_Consult.setText(null);
nome_consult.setText(null);
cargo_Consult.setText(null);
habilidade_Consult.setText(null);
idade_Consult.setText(null);
AnoIngr_Consult.setText(null);
point_Consult.setText(null);      
situation_Consult.setText(null);       
       }
       
       
       //armazenar combobox numa string
public String item(){
String Sm=(String) habilidade_cadastro.getSelectedItem();
return Sm;
}      

//blocker campo se nome for igual
   public void NoRepeatName(String repeat){
 boolean blck=true;
       for(int i=0;i<Nsa.key;i++)
   if(Nsa.prtc[i].getNome().equals(repeat)){
         JOptionPane.showMessageDialog(null,"usuário em uso!");
blck=false;
nome_cadastro.setText(null);
break;  
   }
   
   }
   
   
   
   
   
   //blocker campo se nome for igual
   public void NoRepeatEmail(String repeat){
 boolean blck=true;
       for(int i=0;i<Nsa.key;i++)
   if(Nsa.prtc[i].getNome().equals(repeat)){
         JOptionPane.showMessageDialog(null,"email em uso!");
         emj=1;
blck=false;
email_Cadastro.setText(null);
break;  
   }
   
   }
   
   
   
   
public void MudarObg(){
email_obg.setVisible(true);
email_obg.setText("limpar");
}





//blocker idade
   public void IdadeChk(){
 //MudarPass();
   }
   
   
   
   
   
public void MudarPass(){
email_obg.setVisible(true);
email_obg.setText("limpar");

}
   

  


  
  
  
  
  
  
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty()){
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  

}

   

else{
            
ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
TelaInicial tl = new TelaInicial();
this.dispose();


     System.out.println(xp);
   if(imx3[xp]==null)
imx3[xp]=anon;

   ++xp;
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed





    private void password_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroActionPerformed

    private void email_CadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_CadastroKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
             JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 
            else{
ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
            }
    }//GEN-LAST:event_email_CadastroKeyPressed
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void email_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_CadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_CadastroActionPerformed

    private void salvar_CadastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_CadastralActionPerformed
        this.dispose();
    }//GEN-LAST:event_salvar_CadastralActionPerformed

    private void idade_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastroActionPerformed

    private void nome_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cadastroActionPerformed

    
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        SearchPrtc(EntradaText.getText());


    }//GEN-LAST:event_btn_consultaActionPerformed

    private void btn_consultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultaKeyPressed

    }//GEN-LAST:event_btn_consultaKeyPressed

    private void EntradaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTextActionPerformed

    private void EntradaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaTextKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
  SearchPrtc(EntradaText.getText());
        }
    }//GEN-LAST:event_EntradaTextKeyPressed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
Nsa ns = new Nsa();

xcluindoPrtc(EntradaText.getText());    
 
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_removeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_removeKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removeKeyPressed

    private void idade_cadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idade_cadastroKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
             JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 
            else{
ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
            }
    }                                         
     
        
    }//GEN-LAST:event_idade_cadastroKeyPressed

    private void idade_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idade_cadastroFocusLost
if(idade_cadastro.getText().isEmpty()){
 boolean c;
    c=idade_cadastro.getText().isEmpty()?true:false;
  if(c==false)
  {idade_obg.setForeground(Color.green); }
}
  else{
        String idad="\\d+";
boolean x=idade_cadastro.getText().matches(idad);
        if(x==false){
JOptionPane.showMessageDialog(null,"apenas números!");
idade_cadastro.setText(null);
  
        }
        
}

 boolean c;
    c=idade_cadastro.getText().isEmpty()?true:false;
  if(c==false){
    idade_obg.setForeground(Color.green);
  }else{
      idade_obg.setForeground(Color.red);
    }//GEN-LAST:event_idade_cadastroFocusLost

}

    private void password_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_cadastroFocusLost
   boolean c;
    c=new String(password_cadastro.getPassword()).isEmpty()?true:false;
  if(c==false){
    pass_obg.setForeground(Color.green);
  }else{
      pass_obg.setForeground(Color.red);      
// TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroFocusLost
    }
    private void nome_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_cadastroFocusLost
    
        boolean c;
    c=nome_cadastro.getText().isEmpty()?true:false;
  if(c==false){
    nome_obg.setForeground(Color.green);
  }else{
      nome_obg.setForeground(Color.red);

  }


        NoRepeatName(nome_cadastro.getText()); 
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroFocusLost
    
    private void email_CadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_CadastroFocusLost

        
        boolean d;
    d=email_Cadastro.getText().isEmpty()?true:false;
     
    if(d==false){
    email_obg.setForeground(Color.green);
  }else{
      email_obg.setForeground(Color.red);

  }
NoRepeatEmail(email_Cadastro.getText()); 
    }//GEN-LAST:event_email_CadastroFocusLost

    private void email_obgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_obgMouseClicked
    email_Cadastro.setEditable(true);
    email_obg.setVisible(false);
    email_obg.setText("Obrigatório");
    // TODO add your handling code here:
    }//GEN-LAST:event_email_obgMouseClicked

    private void pass_obgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_obgMouseClicked
boolean d;
    d=password_cadastro.getText().isEmpty()?true:false;
     
    if(d==false){
    pass_obg.setForeground(Color.green);
  }else{
      pass_obg.setForeground(Color.red);

  }     

    
    }//GEN-LAST:event_pass_obgMouseClicked

    private void password_cadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_cadastroKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty()){
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  

}

   

else{
            
ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
TelaInicial tl = new TelaInicial();
this.dispose();


     System.out.println("valor de xp="+xp);
     System.out.println("valor de imx="+imx[xp]);
     System.out.println("valor de imx2="+imx2[xp]);
++xp;
        }
            
    }                                         
        
        
        
        /*
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
 {
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 
 }
 

ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
++xp;
     System.out.println(xp);
    }      
 */
            // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroKeyPressed

    private void bnt_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_imgActionPerformed
        img();
        //imging();ñ está mais em uso!

    }//GEN-LAST:event_bnt_imgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    clr();
 // jL_img.setIcon(new ImageIcon(getClass().getResource("/classes/anonn.png")));   
  jL_img.setIcon(new ImageIcon(anon.getImage().getScaledInstance(jL_img.getWidth(), jL_img.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nome_cadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_cadastroKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
             JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 
            else{
ParticipantesNsa cad = new ParticipantesNsa();            
cad.Cad(nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
            }
    }                                         
        
// TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroKeyPressed
   public void clr(){
   dispose();
   }
 
   
    public void img(){
    JFileChooser arq = new JFileChooser();
arq.setDialogTitle("escolha uma imagem");
arq.setFileSelectionMode(JFileChooser.FILES_ONLY);

int opt =arq.showOpenDialog(this);
// TODO add your handling code here:
if(opt==JFileChooser.APPROVE_OPTION)
    {
    File file = new File("caminho");
    file=arq.getSelectedFile();
    String path=file.getAbsolutePath();
    this.nn=path;
    ImageIcon img = new ImageIcon(file.getPath());
    imx[xp]= new ImageIcon(file.getPath());
   imx2[xp]=imx[xp];
   //anon=new ImageIcon(file.getPath());
 fi=file;



//jL_img.setIcon(new ImageIcon(img.getImage().getScaledInstance(jL_img.getWidth(), jL_img.getHeight(), Image.SCALE_DEFAULT)));
       
            
       
       
       
       
       
       imx3[xp]=new ImageIcon(imx[xp].getImage().getScaledInstance(jL_img.getWidth(), jL_img.getHeight(), Image.SCALE_DEFAULT));
jL_img.setIcon(imx3[xp]);
    }
}
    
    
    
    void imging(){
//        imx3[xp]=new ImageIcon(imx[xp].getImage().getScaledInstance(jL_img.getWidth(), jL_img.getHeight(), Image.SCALE_DEFAULT));
//jL_img.setIcon(imx3[xp]);

//   jL_img.setIcon(new ImageIcon(imx[xp].getImage().getScaledInstance(jL_img.getWidth(), jL_img.getHeight(), Image.SCALE_DEFAULT)));    
    }
    
    
    
    
    
    
    int nom(){
       String x;
        System.out.println(fi);
    return 0;
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoIngr_Consult;
    private javax.swing.JTextField EntradaText;
    private javax.swing.JButton bnt_img;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel cargo_Consult;
    private javax.swing.JComboBox cargo_cadastro;
    private javax.swing.JFormattedTextField email_Cadastro;
    private javax.swing.JLabel email_obg;
    private javax.swing.JLabel habilidade_Consult;
    private javax.swing.JComboBox habilidade_cadastro;
    private javax.swing.JLabel id_Consult;
    private javax.swing.JLabel idade_Consult;
    private javax.swing.JFormattedTextField idade_cadastro;
    private javax.swing.JLabel idade_obg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jL_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JFormattedTextField nome_cadastro;
    private javax.swing.JLabel nome_consult;
    private javax.swing.JLabel nome_obg;
    private javax.swing.JLabel pass_obg;
    private javax.swing.JPasswordField password_cadastro;
    private javax.swing.JLabel point_Consult;
    private javax.swing.JButton salvar_Cadastral;
    private javax.swing.JComboBox sexo_cadastro;
    private javax.swing.JLabel situation_Consult;
    // End of variables declaration//GEN-END:variables

   
    }
