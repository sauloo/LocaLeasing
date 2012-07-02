/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package local_leasing_cliente;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Contato;
import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author cliente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("Local_Leasing-ejbPU");
        EntityManager manager = factory.createEntityManager();
        Cliente cli = new Cliente();
        Endereco end = new Endereco();
        Contato cont = new Contato();
        cli.setNome("alex2");
        cont.setCelular("9999988");
        end.setCidade("moc");
        EntityTransaction tran = manager.getTransaction();
        tran.begin();
        manager.persist(cont);
        manager.persist(end);
        cli.setEndereco(end);
        cli.setContato(cont);
        manager.persist(cli);
        tran.commit();
        
    }
}
