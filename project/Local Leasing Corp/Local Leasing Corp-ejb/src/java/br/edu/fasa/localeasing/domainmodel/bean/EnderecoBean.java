/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cliente
 */
@Entity
@Table(name="enderecos")
public class EnderecoBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="end_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="rua",length=255)
    private String rua;
    
    @Column(name="numero",length=10)
    private String numero;
    
    @Column(name="bairro",length=255)
    private String bairro;
    
    @Column(name="cep",length=50)
    private String cep;
    
    @Column(name="cidade",length=255)
    private String cidade;
    
    @Column(name="estado",length=255)
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "br.edu.fasa.localeasing.domainmodel.bean.EnderecoBean[ id=" + id + " ]";
    }
    
}
