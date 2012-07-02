/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Equipamento;
import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import br.com.edu.fasa.localleasing.domainmodel.repository.IClienteRepositorio;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEquipamento;
import br.com.edu.fasa.localleasing.domainmodel.repository.IFuncionario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author cliente
 */
@Named(value = "aluguelBean")
@SessionScoped
public class AluguelBean implements Serializable {
    
    
    @EJB
    private IClienteRepositorio clientRepo;
    
    @EJB
    private IFuncionario funcRepo;
    
    @EJB
    private IEquipamento equiRepo;
    
    private Equipamento equipamento;
    
    private Cliente cliente;
    
    private Funcionario funcionario;
    
    private double valor;
    
    private Date data;
    
    private String quantidade;
    
    private List<Cliente> listaCliente;
    

    /**
     * Creates a new instance of AluguelBean
     */
    public AluguelBean() {
         setListaCliente(clientRepo.listar("select c from Cliente c"));
    }
    
    public List<Cliente> retornaCliente(){
        for(Cliente cli:listaCliente){
            this.cliente =cli;
        }
        return getListaCliente();
    }

    /**
     * @return the clientRepo
     */
    public IClienteRepositorio getClientRepo() {
        return clientRepo;
    }

    /**
     * @param clientRepo the clientRepo to set
     */
    public void setClientRepo(IClienteRepositorio clientRepo) {
        this.clientRepo = clientRepo;
    }

    /**
     * @return the funcRepo
     */
    public IFuncionario getFuncRepo() {
        return funcRepo;
    }

    /**
     * @param funcRepo the funcRepo to set
     */
    public void setFuncRepo(IFuncionario funcRepo) {
        this.funcRepo = funcRepo;
    }

    /**
     * @return the equiRepo
     */
    public IEquipamento getEquiRepo() {
        return equiRepo;
    }

    /**
     * @param equiRepo the equiRepo to set
     */
    public void setEquiRepo(IEquipamento equiRepo) {
        this.equiRepo = equiRepo;
    }

    /**
     * @return the equipamento
     */
    public Equipamento getEquipamento() {
        return equipamento;
    }

    /**
     * @param equipamento the equipamento to set
     */
    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the listaCliente
     */
    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    /**
     * @param listaCliente the listaCliente to set
     */
    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
