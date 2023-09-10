
package br.com.senac.projetoti.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getStatusCertificado() {
        return statusCertificado;
    }

    public void setStatusCertificado(String statusCertificado) {
        this.statusCertificado = statusCertificado;
    }

    public String getParametrizacao() {
        return parametrizacao;
    }

    public void setParametrizacao(String parametrizacao) {
        this.parametrizacao = parametrizacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String cnpj;
    private String uf;
    private String statusCertificado;
    private String parametrizacao;
    private LocalDate data;
    

    

}
