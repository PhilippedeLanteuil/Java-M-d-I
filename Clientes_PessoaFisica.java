/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Clientes_PessoaFisica extends Clientes {
    
        String cpf, rg;
        
        public void setcpf(String scpf){
            this.cpf = scpf;
        }
        public void setrg(String srg){
            this.rg = srg;
        }
        public String retorna_cpf(){
            return cpf;
        }
        public String retorna_rg(){
            return rg;
        }
    }
    

