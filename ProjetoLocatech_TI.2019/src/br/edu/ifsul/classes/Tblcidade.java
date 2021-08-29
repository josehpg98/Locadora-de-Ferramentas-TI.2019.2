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
@Table(name = "tblcidade")
@NamedQueries({
    @NamedQuery(name = "Tblcidade.findAll", query = "SELECT t FROM Tblcidade t")})
public class Tblcidade implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid_codigo")
    private Integer cidCodigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "uf")
    private String uf;
    @OneToMany(mappedBy = "cidCodigo")
    private Collection<Tblfuncionario> tblfuncionarioCollection;
    @OneToMany(mappedBy = "cidCodigo")
    private Collection<Tblcliente> tblclienteCollection;

    public Tblcidade() {
    }

    public Tblcidade(Integer cidCodigo) {
        this.cidCodigo = cidCodigo;
    }

    public Integer getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(Integer cidCodigo) {
        Integer oldCidCodigo = this.cidCodigo;
        this.cidCodigo = cidCodigo;
        changeSupport.firePropertyChange("cidCodigo", oldCidCodigo, cidCodigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public Collection<Tblfuncionario> getTblfuncionarioCollection() {
        return tblfuncionarioCollection;
    }

    public void setTblfuncionarioCollection(Collection<Tblfuncionario> tblfuncionarioCollection) {
        this.tblfuncionarioCollection = tblfuncionarioCollection;
    }

    public Collection<Tblcliente> getTblclienteCollection() {
        return tblclienteCollection;
    }

    public void setTblclienteCollection(Collection<Tblcliente> tblclienteCollection) {
        this.tblclienteCollection = tblclienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cidCodigo != null ? cidCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcidade)) {
            return false;
        }
        Tblcidade other = (Tblcidade) object;
        if ((this.cidCodigo == null && other.cidCodigo != null) || (this.cidCodigo != null && !this.cidCodigo.equals(other.cidCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
