
package design;

import classes.Nsa;
import classes.ParticipantesNsa;
import static design.TelaCadastro.imx;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class DadosCadastrais extends javax.swing.JFrame {
TelaLogin tl = new TelaLogin();
    private Object idade;
    public DadosCadastrais() {
        initComponents();
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvar_Cadastral = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        senha_chng = new javax.swing.JLabel();
        idade_chng = new javax.swing.JLabel();
        habilidade_chng = new javax.swing.JLabel();
        cargo_chng = new javax.swing.JLabel();
        se_chng = new javax.swing.JLabel();
        email_chng = new javax.swing.JLabel();
        salvar_Cadastral1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nome_chng = new javax.swing.JLabel();
        jb3 = new javax.swing.JLabel();
        AnoTerm_chng = new javax.swing.JLabel();
        jL_img2 = new javax.swing.JLabel();
        sex_chng = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DadosCadastro"));

        jLabel1.setText("Idade");

        jLabel3.setText("email");

        jLabel4.setText("experiencia");

        jLabel5.setText("cargo");

        salvar_Cadastral.setText("sair");
        salvar_Cadastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_CadastralActionPerformed(evt);
            }
        });

        jLabel8.setText("nome");

        senha_chng.setText("******");

        idade_chng.setText("idade");

        habilidade_chng.setText("exp");

        cargo_chng.setText("code");

        se_chng.setText("sexo");

        email_chng.setText("email");

        salvar_Cadastral1.setText("editar");
        salvar_Cadastral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_Cadastral1ActionPerformed(evt);
            }
        });

        jLabel12.setText("senha");

        nome_chng.setText("nome");
        nome_chng.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nome_chngAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jb3.setText("AnoNasc");

        AnoTerm_chng.setText("AnoNasc");

        jL_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/anonn.png"))); // NOI18N

        sex_chng.setText("sexo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(salvar_Cadastral1)
                        .addGap(36, 36, 36)
                        .addComponent(salvar_Cadastral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jL_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargo_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sex_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnoTerm_chng)
                            .addComponent(senha_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12))
                                    .addComponent(jb3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(se_chng, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(63, 63, 63)
                                                .addComponent(nome_chng))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nome_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idade_chng)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(email_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cargo_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(se_chng)
                            .addComponent(sex_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(habilidade_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb3)
                            .addComponent(AnoTerm_chng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(senha_chng)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jL_img2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar_Cadastral)
                            .addComponent(salvar_Cadastral1))))
                .addContainerGap(650, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 ParticipantesNsa prt = new ParticipantesNsa();
 static int k=0;
 static int p; 
 
 
   
//limpar label  
    void LimparLabel(){
 //id_chng.setText(null);
senha_chng.setText(null);
idade_chng.setText(null);
habilidade_chng.setText(null);
cargo_chng.setText(null);
email_chng.setText(null);
cargo_chng.setText(null);
sex_chng.setText(null);
 
    }
    
    
    //setando label
public void setLabel(int i){
    this.k=i;
    //TelaCadastro.xp=i;
    DateFormat data = new SimpleDateFormat("dd/MM/yy");
Date cad = new Date();
Calendar cal = Calendar.getInstance();
 Integer x = Nsa.prtc[i].getIdade();
Integer y = new Integer(2017);
 Integer z = new Integer(y-x);
TelaCadastro tlc=new TelaCadastro();
 
jL_img2.setIcon(new ImageIcon(TelaCadastro.imx[i].getImage().getScaledInstance(jL_img2.getWidth(), jL_img2.getHeight(), Image.SCALE_DEFAULT)));    


nome_chng.setText(Nsa.prtc[i].getNome());
  idade_chng.setText(x.toString());
  habilidade_chng.setText(Nsa.prtc[i].getHabilidade());
  cargo_chng.setText(Nsa.prtc[i].getCargo());
  email_chng.setText(Nsa.prtc[i].getEmail());
sex_chng.setText(Nsa.prtc[i].getSexo());
 AnoTerm_chng.setText(z.toString());
    System.out.println("vaor de i ="+i);

//imm();
}
  
public void imm(){   
  TelaCadastro tlc = new TelaCadastro();
  
    System.out.println(tlc.nom());
ImageIcon img = new ImageIcon(getClass().getResource("/img/alxsy.jpg"));
Image img2=img.getImage().getScaledInstance(jL_img2.getWidth(),jL_img2.getHeight(),Image.SCALE_SMOOTH);
jL_img2.setIcon(new ImageIcon(img2));

}





    
/*  editar e atualizar os valores no vetor,
/*  ex:
/*  x[0]=1,x.setId(2)
/*  x[0]=2;
*/
//String id,
void Edit(String pass,String nome,String idade,String email,String cargo,String habilidade){
//if(!id.equals("")){Nsa.member[k].setId(id);Nsa.prtc[p].setId(id);}
if(!pass.equals("")){Nsa.prtc[k].setPassword(pass);Nsa.prtc[p].setPassword(pass);}
if(!nome.equals("")){nome_chng.setText(nome);Nsa.prtc[k].setNome(nome);Nsa.prtc[p].setNome(nome);} 
if(!idade.equals("")){idade_chng.setText(idade);Nsa.prtc[k].setIdade(Integer.parseInt(idade));Nsa.prtc[p].setIdade(Integer.parseInt(idade));}
if(!email.equals("")){email_chng.setText(email);Nsa.prtc[k].setEmail(email);Nsa.prtc[p].setEmail(email);}
if(!cargo.equals(cargo_chng.getText())){cargo_chng.setText(cargo);Nsa.prtc[k].setCargo(cargo);Nsa.prtc[p].setCargo(cargo);}
if(!habilidade.equals(habilidade_chng.getText())){habilidade_chng.setText(habilidade);Nsa.prtc[k].setHabilidade(habilidade);Nsa.prtc[p].setHabilidade(habilidade);}
JOptionPane.showMessageDialog(null,"atualizado com sucesso");

} 
  








//prtc,definindo para atualizar
void SetPrct(){
//for(int i=0;i<Nsa.key;i++)
//if(Nsa.member[i].getId().equals(id_chng.getText()))
//k=i;
}


//membr,definindo para atualizar
void SetMbr(){
for(int i=0;i<Nsa.key;i++)
//if(Nsa.prtc[i].getId().equals(id_chng.getText()))
p=i;
}



    
    private void salvar_CadastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_CadastralActionPerformed
this.dispose();

    }//GEN-LAST:event_salvar_CadastralActionPerformed

    

 
 

    
    private void salvar_Cadastral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_Cadastral1ActionPerformed
TelaCadastro tlcd = new TelaCadastro();


        AtualizarCad AtuaCad = new AtualizarCad();
AtuaCad.setVisible(true);
AtuaCad.item();
this.dispose();
    }//GEN-LAST:event_salvar_Cadastral1ActionPerformed

    private void nome_chngAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nome_chngAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_chngAncestorAdded

    
    
    

           
    
    public static void main(String args[]) {
      
        DadosCadastrais lmp=new DadosCadastrais();
        lmp.LimparLabel();
  
     
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
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosCadastrais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     
                new DadosCadastrais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoTerm_chng;
    private javax.swing.JLabel cargo_chng;
    private javax.swing.JLabel email_chng;
    private javax.swing.JLabel habilidade_chng;
    private javax.swing.JLabel idade_chng;
    private javax.swing.JLabel jL_img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel nome_chng;
    private javax.swing.JButton salvar_Cadastral;
    private javax.swing.JButton salvar_Cadastral1;
    private javax.swing.JLabel se_chng;
    private javax.swing.JLabel senha_chng;
    private javax.swing.JLabel sex_chng;
    // End of variables declaration//GEN-END:variables

 
}
