/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author José Henrique
 */
@Entity
@Table(name = "tblfuncionario")
@NamedQueries({
    @NamedQuery(name = "Tblfuncionario.findAll", query = "SELECT t FROM Tblfuncionario t")})
public class Tblfuncionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fun_codigo")
    private Integer funCodigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "cargo_func")
    private String cargoFunc;
    @Column(name = "num_tel")
    private String numTel;
    @Column(name = "senha")
    private String senha;
    @JoinColumn(name = "cid_codigo", referencedColumnName = "cid_codigo")
    @ManyToOne
    private Tblcidade cidCodigo;
    @OneToMany(mappedBy = "funCodigo")
    private Collection<Tbllocacao> tbllocacaoCollection;

    public Tblfuncionario() {
    }

    public Tblfuncionario(Integer funCodigo) {
        this.funCodigo = funCodigo;
    }

    public Integer getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(Integer funCodigo) {
        Integer oldFunCodigo = this.funCodigo;
        this.funCodigo = funCodigo;
        changeSupport.firePropertyChange("funCodigo", oldFunCodigo, funCodigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

    public void setCargoFunc(String cargoFunc) {
        String oldCargoFunc = this.cargoFunc;
        this.cargoFunc = cargoFunc;
        changeSupport.firePropertyChange("cargoFunc", oldCargoFunc, cargoFunc);
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        String oldNumTel = this.numTel;
        this.numTel = numTel;
        changeSupport.firePropertyChange("numTel", oldNumTel, numTel);
    }

    public Tblcidade getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(Tblcidade cidCodigo) {
        Tblcidade oldCidCodigo = this.cidCodigo;
        this.cidCodigo = cidCodigo;
        changeSupport.firePropertyChange("cidCodigo", oldCidCodigo, cidCodigo);
    }

    public Collection<Tbllocacao> getTbllocacaoCollection() {
        return tbllocacaoCollection;
    }

    public void setTbllocacaoCollection(Collection<Tbllocacao> tbllocacaoCollection) {
        this.tbllocacaoCollection = tbllocacaoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funCodigo != null ? funCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblfuncionario)) {
            return false;
        }
        Tblfuncionario other = (Tblfuncionario) object;
        if ((this.funCodigo == null && other.funCodigo != null) || (this.funCodigo != null && !this.funCodigo.equals(other.funCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
