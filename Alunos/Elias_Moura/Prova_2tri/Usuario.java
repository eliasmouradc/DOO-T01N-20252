package com.exemplo;
public class Usuario {
   private String nome;
   private String cpf;
   private int idade;
   private String email;
   private String senha;
   
   
   public Usuario(String nome, String cpf, int idade, String email, String senha){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.email = email;
    this.senha = senha;

   }
   public Usuario(String nome, String email, String senha){
      this.nome = nome;
      this.email = email;
      this.senha = senha;
   }

 public String getNome(){
    return nome;

 }

 public String getCpf(){
    return cpf;

 }

 public int getIdade(){
    return idade;

 }

 public String getEmail(){
    return email;

 }
 public String getSenha(){
    return senha;
 }


 @Override
   public String toString(){
      return nome + "("+ email+")";    
   }

}
