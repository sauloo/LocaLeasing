/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author cliente
 */
@Entity
@Table(name="equipamentos")
public class Equipamento implements Serializable {
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
    
    
    @Column(name="serial",length=100)
    private String serial;
    
    @Column(name="tipo",length=50)
    private String tipo;
    
    @Column(name="marca",length=255)
    private String marca;
    
    @Column(name="status")
    private int status;
    
    @JoinColumn(name="fk_estoque",referencedColumnName="id")
    @OneToOne(cascade= CascadeType.PERSIST,targetEntity=Estoque.class)
    private Estoque fkEstoque;
    
    

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
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.localeasing.domainmodel.bean.EquipamentoBean[ id=" + id + " ]";
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
     * @return the fkEstoque
     */
    public Estoque getFkEstoque() {
        return fkEstoque;
    }

    /**
     * @param fkEstoque the fkEstoque to set
     */
    public void setFkEstoque(Estoque fkEstoque) {
        this.fkEstoque = fkEstoque;
    }
    
}
