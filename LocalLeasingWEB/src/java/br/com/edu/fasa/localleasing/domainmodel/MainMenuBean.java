/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author cliente
 */
@Named(value = "mainMenuBean")
@SessionScoped
public class MainMenuBean implements Serializable {

    /**
     * Creates a new instance of MainMenuBean
     */
    public MainMenuBean() {
    }
    
    public String telaCliente(){
        return "cadastrocliente";
    }
}
