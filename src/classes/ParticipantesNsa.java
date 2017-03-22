/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import static classes.Nsa.prtc;
import design.DadosCadastrais;
import design.TelaCadastro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ParticipantesNsa {

 /*
 variaveis usadas p/ construção do participante   
    */
 
 private String id;
 private String nome;
 private String  password;
 private String  habilidade;
 private String  cargo;   
 private String email;   
 private String sexo;   
 private String AnoIns;   
 private String AnoTerm;  
 private String situation="pendente";
 private Integer idade=0;
 public int ano;
static ImageIcon ft;
static ImageIcon ft2;

    public static ImageIcon getFt2() {
        return ft2;
    }

    public static void setFt2(ImageIcon ft2) {
        ParticipantesNsa.ft2 = ft2;
    }

    public static ImageIcon getFt() {
        return ft;
    }

    public static void setFt(ImageIcon ft) {
        ParticipantesNsa.ft = ft;
    }
    public int getAno() {
        return ano;
    }
    
    public int AnoAtual(){
    int aninho = 2017 - this.getIdade();
        return aninho;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
 
private Integer pontos=0;

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }


 
   

   
    
public void ParticipantesNsa(String nome,String  password,String  habilidade,String  cargo,String email,String sexo,String id,int idade){
this.nome=nome;
this.password=password;
this.habilidade=habilidade;
this.cargo=cargo;        
this.email=email;
this.sexo=sexo;
this.id=id;
this.idade=idade;       
}
 
 public  ParticipantesNsa(){
 
 }
 
 public  ParticipantesNsa(String id){
 this.id=id;
 }
 
 

  public Integer getIdade() {
      int ano=2017 - idade;  
      return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getAnoIns() {
        return AnoIns;
    }

    public void setAnoIns(String AnoIns) {
        this.AnoIns = AnoIns;
    }

   

    
    

 

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 
    public int getAnoTerm() {
        int x = 2;
        return x;
    }

    public void setAnoTerm(String AnoTerm) {
        this.AnoTerm = AnoTerm;
    }
 
    public ParticipantesNsa[] getA() {
        return a;
    }

    public void setA(ParticipantesNsa[] a) {
        this.a = a;
    }
ParticipantesNsa[] a = new ParticipantesNsa[5];
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    *
    *métodos
    *
    */
    
    
    
    public int nasc(){
    int nasc=this.getIdade();
    return nasc;
    }
  
//cadastrando
  
    public void Cad(String nome,String pass,int idade,String habilidade,String cargo,String email,String sexo){
   
   ParticipantesNsa prt=new ParticipantesNsa();

DateFormat data = new SimpleDateFormat("dd/MM/yy");
Date cad = new Date();
Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, +1);
   prt.setAnoTerm(data.format(cal.getTime()));

   
   do{
       
       
    prt.setId(id);
    prt.setNome(nome);
    prt.setPassword(pass);
    prt.setIdade(idade);
    prt.setHabilidade(habilidade);
    prt.setCargo(cargo);
    prt.setEmail(email);
    prt.setSexo(sexo);
    prt.setAnoIns(data.format(cad));
    Nsa.prtc[Nsa.key]=prt;
    JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
   ++Nsa.key;
   // JOptionPane.showMessageDialog(null,Nsa.prtc[Nsa.key-1].getNome());
   
    break;
   
   }
   while(Nsa.prtc[Nsa.key].equals(null));
   
        }



 
      
      
      
      
      
      
      
      
    
//remove prtc
public void booble(int i){

    for(;i<Nsa.key-1;++i){
    int j=i+1;
Nsa.prtc[i].setNome(Nsa.prtc[j].getNome());
 Nsa.prtc[i].setIdade(Nsa.prtc[j].getIdade());
        Nsa.prtc[i].setId(Nsa.prtc[j].getId());
        Nsa.prtc[i].setHabilidade(Nsa.prtc[j].getHabilidade());
        Nsa.prtc[i].setPassword(Nsa.prtc[j].getPassword());
        Nsa.prtc[i].setCargo(Nsa.prtc[j].getCargo());
        Nsa.prtc[i].setEmail(Nsa.prtc[j].getEmail());
        Nsa.prtc[i].setSexo(Nsa.prtc[j].getSexo());
        Nsa.prtc[i].setAnoIns(Nsa.prtc[j].getAnoIns());
        //Nsa.prtc[i].setAnoTerm(Nsa.prtc[j].getAnoTerm());
        Nsa.prtc[i].setPontos(Nsa.prtc[j].getPontos());
        Nsa.prtc[i].setSituation(Nsa.prtc[j].getSituation());
 }
Nsa.key--;
JOptionPane.showMessageDialog(null,"exclusão com sucesso!");



}
 




//imprimir prtc p/ teste    
    public void ids(){
    int i = 0;
   System.out.println("\n");
for(;i<Nsa.key;i++)
   System.out.println("PARTICIPANTE:"+Nsa.prtc[i].getNome());
    }
    
    //imprimir
 public void imp(){

    System.out.println("ID:"+Nsa.prtc[Nsa.key-1].getId());
    System.out.println("NOME:"+Nsa.prtc[Nsa.key-1].getNome());
    System.out.println("PASSWORD:"+Nsa.prtc[Nsa.key-1].getPassword());
    System.out.println("IDADE:"+Nsa.prtc[Nsa.key-1].getIdade());
    System.out.println("HABILIDADE:"+Nsa.prtc[Nsa.key-1].getHabilidade());
    System.out.println("CARGO:"+Nsa.prtc[Nsa.key-1].getCargo());
    System.out.println("EMAIL:"+Nsa.prtc[Nsa.key-1].getEmail());
    System.out.println("SEXO:"+Nsa.prtc[Nsa.key-1].getSexo());
    System.out.println("AnoInsc:"+Nsa.prtc[Nsa.key-1].getAnoIns()+"\n");
    
     }
       
   

    //chk prtc p/ login
 public void chk(String id,String pass){
        DadosCadastrais Dads=new DadosCadastrais();
 
        for(int i =0;i<Nsa.key;i++){
        if(Nsa.prtc[i].getId().equals(id) && Nsa.prtc[i].getPassword().equals(pass)){
      Dads.setVisible(true);
     Dads.setLabel(i);
      JOptionPane.showMessageDialog(null,"Bem-vindo "+Nsa.prtc[i].getNome());

break;
        }
       
        }

         }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String AnoTerm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}



    
