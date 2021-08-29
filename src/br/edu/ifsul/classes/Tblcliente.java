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
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author José Henrique
 */
@Entity
@Table(name = "tblcliente")
@NamedQueries({
    @NamedQuery(name = "Tblcliente.findAll", query = "SELECT t FROM Tblcliente t")})
public class Tblcliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cli_codigo")
    private Integer cliCodigo;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "rg")
    private String rg;
    @Column(name = "data_nasc")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "num_tel")
    private String numTel;
    @Column(name = "email")
    private String email;
    @Column(name = "endere\u00e7o")
    private String endereço;
    @Column(name = "cep")
    private String cep;
    @Column(name = "n\u00famero")
    private String número;
    @Column(name = "complemento")
    private String complemento;
    @OneToMany(mappedBy = "cliCodigo")
    private Collection<Tbllocacao> tbllocacaoCollection;
    @JoinColumn(name = "cid_codigo", referencedColumnName = "cid_codigo")
    @ManyToOne
    private Tblcidade cidCodigo;

    public Tblcliente() {
    }

    public Tblcliente(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        Integer oldCliCodigo = this.cliCodigo;
        this.cliCodigo = cliCodigo;
        changeSupport.firePropertyChange("cliCodigo", oldCliCodigo, cliCodigo);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        Date oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        changeSupport.firePropertyChange("dataNasc", oldDataNasc, dataNasc);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        String oldNumTel = this.numTel;
        this.numTel = numTel;
        changeSupport.firePropertyChange("numTel", oldNumTel, numTel);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        String oldEndereço = this.endereço;
        this.endereço = endereço;
        changeSupport.firePropertyChange("endere\u00e7o", oldEndereço, endereço);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        String oldNúmero = this.número;
        this.número = número;
        changeSupport.firePropertyChange("n\u00famero", oldNúmero, número);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public Collection<Tbllocacao> getTbllocacaoCollection() {
        return tbllocacaoCollection;
    }

    public void setTbllocacaoCollection(Collection<Tbllocacao> tbllocacaoCollection) {
        this.tbllocacaoCollection = tbllocacaoCollection;
    }

    public Tblcidade getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(Tblcidade cidCodigo) {
        Tblcidade oldCidCodigo = this.cidCodigo;
        this.cidCodigo = cidCodigo;
        changeSupport.firePropertyChange("cidCodigo", oldCidCodigo, cidCodigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcliente)) {
            return false;
        }
        Tblcliente other = (Tblcliente) object;
        if ((this.cliCodigo == null && other.cliCodigo != null) || (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
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
