/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senac.projetoti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author IdeaPad 320
 */
public class ProjetoTI {

    public static void main(String[] args) {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("GerenciadorTI");
        EntityManager manager = fabricaEntidade.createEntityManager(); 
    }
}
