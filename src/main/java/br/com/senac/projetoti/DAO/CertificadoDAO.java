
package br.com.senac.projetoti.DAO;

import br.com.senac.projetoti.Util.JPAUtil;
import br.com.senac.projetoti.persistencia.Certificado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;


public class CertificadoDAO {
    
    public void cadastrar(Certificado c){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(c);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
    
     public List<Certificado> listar(String filtroNome) {
       EntityManager em = JPAUtil.getEntityManager();
       List<Certificado> certificadoList = null;
       try {
           String jpqlQuery = "SELECT p FROM Certificado p " +
                   "WHERE (:nome is null OR p.nome LIKE :nome)";

           Query consulta = em.createQuery(jpqlQuery);

           consulta.setParameter("nome", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");

           certificadoList = consulta.getResultList();
       } finally {
           em.close();
       }
       return certificadoList;
    }
     
      public void excluir(int id){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Certificado p = em.find(Certificado.class, id);
          if(p != null){
              em.getTransaction().begin();
              em.remove(p);
              em.getTransaction().commit();
          }
      }catch(Exception e){
          em.getTransaction().rollback();
          throw e;
      }
      finally{
          JPAUtil.closeEtityManager();
      }
    }
        
    public void atualizar(Certificado d){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(d);
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
