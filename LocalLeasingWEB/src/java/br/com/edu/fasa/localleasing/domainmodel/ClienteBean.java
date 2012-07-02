/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Contato;
import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import br.com.edu.fasa.localleasing.domainmodel.repository.IClienteRepositorio;
import br.com.edu.fasa.localleasing.domainmodel.repository.IContato;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEndereco;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author cliente
 */
@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean implements Serializable {
    
    @EJB
    private IClienteRepositorio repoCliente;
 
    @EJB
    private IEndereco repoEndereco;
    
    @EJB
    private IContato repoContato;
    
    private Cliente cli;
    
    private Endereco end;
    
    private Contato cont;
    
    private String codigoCliente;
    private String nome;
    private String cpf;
    private String cnpj;
    private String celular;
    private String email;
    private String telefone;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String numero;
    private String rua;
    private String codigoEnd;
    private String codigoCont;
    private String message;
    

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
        this.nome = "";
        this.cpf = "";
        this.cnpj = "";
        this.rua = "";
        this.numero = "";
        this.bairro = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.celular = "";
        this.telefone = "";
        this.email = "";
        this.message = "";
        
    }
    public void salvarEndereco(){
        try{
            if(end == null)
                end = new Endereco();
            end.setBairro(bairro);
            end.setCep(cep);
            end.setCidade(cidade);
            end.setEstado(estado);
            end.setNumero(numero);
            end.setRua(rua);
            repoEndereco.salvar(end);
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    public void salvarContato(){
        try{
            if(cont == null)
                cont = new Contato();
            cont.setCelular(celular);
            cont.setEmail(email);
            cont.setTelefone(telefone);
            repoContato.salvar(cont);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void salvarCliente(){
        try{
            if(cli == null)
                cli = new Cliente();
            cli.setNome(nome);
            cli.setCnpj(cnpj);
            cli.setCpf(cpf);
            cli.setEndereco(end);
            cli.setContato(cont);
            repoCliente.salvar(cli);
        }catch(Exception e){   
         e.printStackTrace();
            
        }
    }
    
    public void salvar(){
        try{
        this.salvarContato();
        this.salvarEndereco();
        this.salvarCliente();
        setMessage("Salvo com sucesso!!");
        }catch(Exception e){
            setMessage("Ocorreu um erro ao salvar registro!!");
            e.printStackTrace();
        }
        
    }
    
    public void actionError(){  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ocorreu um erro!",  "");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }
    
    
     public void actionSave(){  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso!","");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  

    /**
     * @return the repoCliente
     */
    public IClienteRepositorio getRepoCliente() {
        return repoCliente;
    }

    /**
     * @param repoCliente the repoCliente to set
     */
    public void setRepoCliente(IClienteRepositorio repoCliente) {
        this.repoCliente = repoCliente;
    }

    /**
     * @return the repoEndereco
     */
    public IEndereco getRepoEndereco() {
        return repoEndereco;
    }

    /**
     * @param repoEndereco the repoEndereco to set
     */
    public void setRepoEndereco(IEndereco repoEndereco) {
        this.repoEndereco = repoEndereco;
    }

    /**
     * @return the repoContato
     */
    public IContato getRepoContato() {
        return repoContato;
    }

    /**
     * @param repoContato the repoContato to set
     */
    public void setRepoContato(IContato repoContato) {
        this.repoContato = repoContato;
    }

    /**
     * @return the codigoCliente
     */
    public String getCodigo() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigo(String codigo) {
        this.codigoCliente = codigo;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
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
