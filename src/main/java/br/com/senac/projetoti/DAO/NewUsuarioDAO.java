
package br.com.senac.projetoti.DAO;

import br.com.senac.projetoti.Util.JPAUtil;
import br.com.senac.projetoti.persistencia.Usuario;
import jakarta.persistence.EntityManager;

public class NewUsuarioDAO {
    public void cadastrar(Usuario u){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(u);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
}
