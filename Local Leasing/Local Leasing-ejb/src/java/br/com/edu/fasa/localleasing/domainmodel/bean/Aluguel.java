/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cliente
 */
@Entity
@Table(name="alugueis")
public class Aluguel implements Serializable {
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="quantidade")
    private int quantidade;
    
    
    @Column(name="data_locacao")
    @Temporal(TemporalType.DATE)
    private Date dataLocao;
    
    @Column(name="valor")
    private Double valor;
    
    @JoinColumn(name="fk_funcionario",referencedColumnName="id")
    @ManyToOne(cascade= CascadeType.PERSIST,targetEntity=Funcionario.class)
    private Funcionario fkFuncionario;
    
    @JoinColumn(name="fk_fliente",referencedColumnName="id")
    @ManyToOne(cascade= CascadeType.PERSIST,targetEntity=Cliente.class)
    private Cliente fkCliente;
    
    @JoinColumn(name="fk_equipamento",referencedColumnName="id")
    @ManyToOne(cascade= CascadeType.PERSIST,targetEntity=Equipamento.class)
    private Equipamento fkEquipamento;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluguel)) {
            return false;
        }
        Aluguel other = (Aluguel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.localeasing.domainmodel.bean.AluguelBean[ id=" + id + " ]";
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the dataLocao
     */
    public Date getDataLocao() {
        return dataLocao;
    }

    /**
     * @param dataLocao the dataLocao to set
     */
    public void setDataLocao(Date dataLocao) {
        this.dataLocao = dataLocao;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the fkFuncionario
     */
    public Funcionario getFkFuncionario() {
        return fkFuncionario;
    }

    /**
     * @param fkFuncionario the fkFuncionario to set
     */
    public void setFkFuncionario(Funcionario fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }

    /**
     * @return the fkCliente
     */
    public Cliente getFkCliente() {
        return fkCliente;
    }

    /**
     * @param fkCliente the fkCliente to set
     */
    public void setFkCliente(Cliente fkCliente) {
        this.fkCliente = fkCliente;
    }

    /**
     * @return the fkEquipamento
     */
    public Equipamento getFkEquipamento() {
        return fkEquipamento;
    }

    /**
     * @param fkEquipamento the fkEquipamento to set
     */
    public void setFkEquipamento(Equipamento fkEquipamento) {
        this.fkEquipamento = fkEquipamento;
    }
    
}
