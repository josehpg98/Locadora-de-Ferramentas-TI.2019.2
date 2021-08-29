/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author José Henrique
 */
@Entity
@Table(name = "itemlocado")
@NamedQueries({
    @NamedQuery(name = "Itemlocado.findAll", query = "SELECT i FROM Itemlocado i")})
public class Itemlocado implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ite_codigo")
    private Integer iteCodigo;
    @Column(name = "qtde_equipamento")
    private Integer qtdeEquipamento;
    @JoinColumn(name = "equ_codigo", referencedColumnName = "equ_codigo")
    @ManyToOne
    private Tblequipamento equCodigo;
    @JoinColumn(name = "loc_codigo", referencedColumnName = "loc_codigo")
    @ManyToOne
    private Tbllocacao locCodigo;

    public Itemlocado() {
    }

    public Itemlocado(Integer iteCodigo) {
        this.iteCodigo = iteCodigo;
    }

    public Integer getIteCodigo() {
        return iteCodigo;
    }

    public void setIteCodigo(Integer iteCodigo) {
        Integer oldIteCodigo = this.iteCodigo;
        this.iteCodigo = iteCodigo;
        changeSupport.firePropertyChange("iteCodigo", oldIteCodigo, iteCodigo);
    }

    public Integer getQtdeEquipamento() {
        return qtdeEquipamento;
    }

    public void setQtdeEquipamento(Integer qtdeEquipamento) {
        Integer oldQtdeEquipamento = this.qtdeEquipamento;
        this.qtdeEquipamento = qtdeEquipamento;
        changeSupport.firePropertyChange("qtdeEquipamento", oldQtdeEquipamento, qtdeEquipamento);
    }

    public Tblequipamento getEquCodigo() {
        return equCodigo;
    }

    public void setEquCodigo(Tblequipamento equCodigo) {
        Tblequipamento oldEquCodigo = this.equCodigo;
        this.equCodigo = equCodigo;
        changeSupport.firePropertyChange("equCodigo", oldEquCodigo, equCodigo);
    }

    public Tbllocacao getLocCodigo() {
        return locCodigo;
    }

    public void setLocCodigo(Tbllocacao locCodigo) {
        Tbllocacao oldLocCodigo = this.locCodigo;
        this.locCodigo = locCodigo;
        changeSupport.firePropertyChange("locCodigo", oldLocCodigo, locCodigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iteCodigo != null ? iteCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemlocado)) {
            return false;
        }
        Itemlocado other = (Itemlocado) object;
        if ((this.iteCodigo == null && other.iteCodigo != null) || (this.iteCodigo != null && !this.iteCodigo.equals(other.iteCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsul.classes.Itemlocado[ iteCodigo=" + iteCodigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
