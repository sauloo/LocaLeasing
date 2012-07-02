/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel;

import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import br.com.edu.fasa.localleasing.domainmodel.repository.IFuncionario;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputText;
import javax.inject.Named;
import javax.faces.context.FacesContext;

/**
 *
 * @author cliente
 */
@Named(value = "funcionarioBean")
@SessionScoped
public class FuncionarioBean implements Serializable {

    @EJB
    private IFuncionario repo;
    
    private Funcionario funcionario;
    
    private String codigo;
    private String nome;
    private String login;
    private String senha;
    private String message;
    
    /**
     * Creates a new instance of FuncionarioBean
     */
    
    public String logar(){
        //verifica se existe usuário ou senha 
       if(repo.getUserLogin(login, senha)){
           
         return "principal";
        //if(repo.getUserLogin(getLogin(), getSenha())){  
          
         }
         else {
           FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
      /* Obtém a instancia atual do FacesContext e adiciona a mensagem de erro nele. */
      FacesContext.getCurrentInstance().addMessage("erro", msg);
             return null;  
        
         }   
    }
    
    public void salvar(){
        try{
           
            if(funcionario == null)
            funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setLogin(login);
            funcionario.setSenha(senha);
            repo.salvar(funcionario);
            setMessage("Salvo com sucesso!!");
        }catch(Exception e){
            setMessage("Ocorreu um erro ao salvar registro!");
            e.printStackTrace();
            
        }
    }
    
    public FuncionarioBean() {
    this.codigo = "";
    this.login = "";
    this.nome = "";
    this.senha = "";
    this.message = "";
    }

    /**
     * @return the repo
     */
    public IFuncionario getRepo() {
        return repo;
    }

    /**
     * @param repo the repo to set
     */
    public void setRepo(IFuncionario repo) {
        this.repo = repo;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
