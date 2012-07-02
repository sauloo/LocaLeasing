/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel;

import br.com.edu.fasa.localleasing.domainmodel.bean.Equipamento;
import br.com.edu.fasa.localleasing.domainmodel.bean.Estoque;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEquipamento;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEstoque;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Alexsander Duarte
 */
@Named(value = "equipamentoBean")
@SessionScoped
public class EquipamentoBean implements Serializable {

   
    
    private String equiDescricao;
    
    private String marca;
    
    private String serial;
    
    private int status;
    
    private String tipo;
    
    private String equiQtd;
    
    private String message;
    
    @EJB
    IEquipamento repoEquip;
    
    @EJB
    IEstoque repoEstoq;
    
    private Estoque estoque;
    
    private Equipamento equipamento;
    
     /**
     * Creates a new instance of EquipamentoBean
     */
    public EquipamentoBean() {
    this.equiDescricao = "";
    this.marca = "";
    this.tipo = "";
    this.serial = "";
    this.message = "";
    this.status = 0;
    this.equiQtd = "";
    
    }
    
    

    public void salvarEstoque(){
        try{
            if(estoque == null)
                estoque = new Estoque();
                estoque.setDescricao(equiDescricao);
                estoque.setQuantidade(Integer.parseInt(equiQtd));
                repoEstoq.salvar(estoque);        
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
    public void salvarEquipamento(){
        try{
            if(equipamento == null)
                equipamento = new Equipamento();
                //equipamento.setDescricao(equiDescricao);
                equipamento.setSerial(serial);
                equipamento.setMarca(marca);
                equipamento.setTipo(tipo);
                equipamento.setStatus(status);
                equipamento.setFkEstoque(estoque);
                repoEquip.salvar(equipamento);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void salvarTudo(){
        try{
            this.salvarEstoque();
            this.salvarEquipamento();
            setMessage("Salvo com sucesso!!");
        }catch(Exception e){
            setMessage("Erro ao salvar!!");
            e.printStackTrace();
        }
    }
    
    public String retornar(){
        return "faces/principal.xhtml";
    }
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return getEquiDescricao();
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String equiDescricao) {
        this.setEquiDescricao(equiDescricao);
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the equiDescricao
     */
    public String getEquiDescricao() {
        return equiDescricao;
    }

    /**
     * @param equiDescricao the equiDescricao to set
     */
    public void setEquiDescricao(String equiDescricao) {
        this.equiDescricao = equiDescricao;
    }

    /**
     * @return the equiQtd
     */
    public String getEquiQtd() {
        return equiQtd;
    }

    /**
     * @param equiQtd the equiQtd to set
     */
    public void setEquiQtd(String equiQtd) {
        this.equiQtd = equiQtd;
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
