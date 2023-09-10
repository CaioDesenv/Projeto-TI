/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetoti.DAO;
import br.com.senac.projetoti.persistencia.Chamado;
import br.com.senac.projetoti.Util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author IdeaPad 320
 */
public class ChamadoDAO {
    
    public void cadastrar(Chamado c){
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
    
     public List<Chamado> listar(String filtroNome) {
       EntityManager em = JPAUtil.getEntityManager();
       List<Chamado> chamadoList = null;
       try {
           String jpqlQuery = "SELECT p FROM Chamado p " +
                   "WHERE (:nomeSolicitante is null OR p.nomeSolicitante LIKE :nomeSolicitante)";

           Query consulta = em.createQuery(jpqlQuery);

           consulta.setParameter("nomeSolicitante", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");

           chamadoList = consulta.getResultList();
       } finally {
           em.close();
       }
       return chamadoList;
    }
     
      public void excluir(int id){
          
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Chamado p = em.find(Chamado.class, id);
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
        
    public void atualizar(Chamado d){
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
