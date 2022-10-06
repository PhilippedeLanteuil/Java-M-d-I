/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Clientes {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    
    public void setnome(String sNome)
    {
        this.nome = sNome;
    }
     public void setendereco(String sEndereco)
    {
        this.endereco = sEndereco;
    }
      public void setemail(String sEmail)
    {
        this.email = sEmail;
    }
       public void settelefone(String sTelefone)
    {
        this.telefone = sTelefone;
    }
                            
       public String retorna_nome(){return(nome);}
       public String retorna_endereco(){return(endereco);}
       public String retorna_email(){return(email);}
       public String retorna_telefone(){return(telefone);}
}
