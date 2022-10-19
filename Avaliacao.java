/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Avaliacao {
    String nome, numerodematricula;
    
    public void setnome(String snome){
        this.nome = snome;
    }
     public void setnumerodematricula(String snumerodematricula){
        this.numerodematricula = snumerodematricula;
    }
    public String retorna_nome(){
        return nome;
    }
    public String retorna_numerodematricula(){
        return numerodematricula;
    }
}
