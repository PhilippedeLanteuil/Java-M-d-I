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
    
    public void setNome(String sNome)
    {
        this.nome = sNome;
    }
     public void setEndereco(String sEndereco)
    {
        this.endereco = sEndereco;
    }
      public void setEmail(String sEmail)
    {
        this.email = sEmail;
    }
       public void setTelefone(String sTelefone)
    {
        this.telefone = sTelefone;
    }
                            
       public String retorna_nome(){return(nome);}
       public String retorna_endereco(){return(endereco);}
       public String retorna_email(){return(email);}
       public String retorna_telefone(){return(telefone);}
}
