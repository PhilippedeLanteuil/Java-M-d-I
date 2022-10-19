/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Clientes_PessoaJuridica extends Clientes {
    String cnpj, ie;
    
    public void setcnpj(String scnpj){
        this.cnpj = scnpj;
    }
    public void setie(String sie){
        this.ie = sie;
    }
    public String retorna_cnpj(){
        return cnpj;
    }
    public String retorna_ie(){
        return ie;
    }
    
}
