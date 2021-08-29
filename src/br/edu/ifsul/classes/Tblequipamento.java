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
@Table(name = "tblequipamento")//NOME DA TBL/CLASSE
@NamedQueries({
    @NamedQuery(name = "Tblequipamento.findAll", query = "SELECT t FROM Tblequipamento t ")})
public class Tblequipamento implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "equ_codigo")
    private Integer equCodigo;
    @Column(name = "nome")// NOME DA COLUNA
    private String nome;
    @Column(name = "marca")
    private String marca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private double valor;
    @Column(name = "estoque")
    private Integer estoque;
    @OneToMany(mappedBy = "equCodigo")
    private Collection<Itemlocado> itemlocadoCollection;

    public Tblequipamento() {
    }

    public Tblequipamento(Integer equCodigo) {
        this.equCodigo = equCodigo;
    }

    public Integer getEquCodigo() {
        return equCodigo;
    }

    public void setEquCodigo(Integer equCodigo) {
        Integer oldEquCodigo = this.equCodigo;
        this.equCodigo = equCodigo;
        changeSupport.firePropertyChange("equCodigo", oldEquCodigo, equCodigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public Collection<Itemlocado> getItemlocadoCollection() {
        return itemlocadoCollection;
    }

    public void setItemlocadoCollection(Collection<Itemlocado> itemlocadoCollection) {
        this.itemlocadoCollection = itemlocadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equCodigo != null ? equCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblequipamento)) {
            return false;
        }
        Tblequipamento other = (Tblequipamento) object;
        if ((this.equCodigo == null && other.equCodigo != null) || (this.equCodigo != null && !this.equCodigo.equals(other.equCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome +" - " + marca;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    /**
     * @return the estoque
     */
    public Integer getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(Integer estoque) {
        Integer oldEstoque = this.estoque;
        this.estoque = estoque;
        changeSupport.firePropertyChange("estoque", oldEstoque, estoque);
    }
    
}
