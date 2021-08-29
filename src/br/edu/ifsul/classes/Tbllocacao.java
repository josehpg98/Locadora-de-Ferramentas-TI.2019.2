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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author José Henrique
 */
@Entity
@Table(name = "tbllocacao")
@NamedQueries({
    @NamedQuery(name = "Tbllocacao.findAll", query = "SELECT t FROM Tbllocacao t")})
public class Tbllocacao implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_total")
    private double valorTotal;
    //@OneToMany(mappedBy = "devCodloc")
    //private Collection<Tbldevolucao> tbldevolucaoCollection;

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
    
    @Column(name = "data_dev")
    @Temporal(TemporalType.DATE)
    private Date dataDev;
    
    @Column(name = "data_dev_prevista")
    @Temporal(TemporalType.DATE)
    private Date datadevprev;
    
    @Column(name = "multa")
    private double multa;
    @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")
    @ManyToOne
    private Tblcliente cliCodigo;
    @JoinColumn(name = "fun_codigo", referencedColumnName = "fun_codigo")
    //@Column(name = "valorTotal")
    //private double vakotTotal;
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
        //double oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        //changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
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

    /**
     * @return the datadev
     */
    public Date getDatadev() {
        return dataDev;
    }

    /**
     * @param datadev the datadev to set
     */
    public void setDatadev(Date datadev) {
        Date oldDatadev = this.dataDev;
        this.dataDev = datadev;
        changeSupport.firePropertyChange("datadev", oldDatadev, datadev);
    }

    /**
     * @return the datadevprev
     */
    public Date getDatadevprev() {
        return datadevprev;
    }

    /**
     * @param datadevprev the datadevprev to set
     */
    public void setDatadevprev(Date datadevprev) {
        Date oldDatadevprev = this.datadevprev;
        this.datadevprev = datadevprev;
        changeSupport.firePropertyChange("datadevprev", oldDatadevprev, datadevprev);
    }

    /**
     * @return the multa
     */
    public double getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(double multa) {
        double oldMulta = this.multa;
        this.multa = multa;
        changeSupport.firePropertyChange("multa", oldMulta, multa);
    }

    //public double getValorTotal() {
        //return valorTotal;
    //}

    /**
     *
     * @param valorTotal
     */
    //public void setValorTotal(double valorTotal) {
        //this.valorTotal = valorTotal;
    //}

    //@XmlTransient
    //public Collection<Tbldevolucao> getTbldevolucaoCollection() {
        //return tbldevolucaoCollection;
    //}

    //public void setTbldevolucaoCollection(Collection<Tbldevolucao> tbldevolucaoCollection) {
        //this.tbldevolucaoCollection = tbldevolucaoCollection;
    //}
    
}
