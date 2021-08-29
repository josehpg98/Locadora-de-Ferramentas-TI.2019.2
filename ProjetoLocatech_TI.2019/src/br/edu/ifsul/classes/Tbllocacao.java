/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tbllocacao")
@NamedQueries({
    @NamedQuery(name = "Tbllocacao.findAll", query = "SELECT t FROM Tbllocacao t")})
public class Tbllocacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loc_codigo")
    private Integer locCodigo;
    @Column(name = "data_loc")
    @Temporal(TemporalType.DATE)
    private Date dataLoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_total")
    private double valorTotal;
    @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")
    @ManyToOne
    private Tblcliente cliCodigo;
    @JoinColumn(name = "fun_codigo", referencedColumnName = "fun_codigo")
    @ManyToOne
    private Tblfuncionario funCodigo;
    @OneToMany(mappedBy = "locCodigo")
    private Collection<Itemlocado> itemlocadoCollection;

    public Tbllocacao() {
    }

    public Tbllocacao(Integer locCodigo) {
        this.locCodigo = locCodigo;
    }

    public Integer getLocCodigo() {
        return locCodigo;
    }

    public void setLocCodigo(Integer locCodigo) {
        Integer oldLocCodigo = this.locCodigo;
        this.locCodigo = locCodigo;
        changeSupport.firePropertyChange("locCodigo", oldLocCodigo, locCodigo);
    }

    public Date getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(Date dataLoc) {
        Date oldDataLoc = this.dataLoc;
        this.dataLoc = dataLoc;
        changeSupport.firePropertyChange("dataLoc", oldDataLoc, dataLoc);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        double oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    public Tblcliente getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Tblcliente cliCodigo) {
        Tblcliente oldCliCodigo = this.cliCodigo;
        this.cliCodigo = cliCodigo;
        changeSupport.firePropertyChange("cliCodigo", oldCliCodigo, cliCodigo);
    }

    public Tblfuncionario getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(Tblfuncionario funCodigo) {
        Tblfuncionario oldFunCodigo = this.funCodigo;
        this.funCodigo = funCodigo;
        changeSupport.firePropertyChange("funCodigo", oldFunCodigo, funCodigo);
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
        hash += (locCodigo != null ? locCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbllocacao)) {
            return false;
        }
        Tbllocacao other = (Tbllocacao) object;
        if ((this.locCodigo == null && other.locCodigo != null) || (this.locCodigo != null && !this.locCodigo.equals(other.locCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + locCodigo + " - "+ cliCodigo;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
