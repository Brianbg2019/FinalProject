/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vce
 */
@MappedSuperclass
@Table(catalog = "scc", schema = "public")
@XmlRootElement
public class Codpc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idcodigopc;
    @Basic(optional = false)
    @Column(nullable = false, length = 16)
    private String codigopc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcodigopc")
    private Collection<Registros> registrosCollection;

    public Codpc() {
    }

    public Codpc(Integer idcodigopc) {
        this.idcodigopc = idcodigopc;
    }

    public Codpc(Integer idcodigopc, String codigopc) {
        this.idcodigopc = idcodigopc;
        this.codigopc = codigopc;
    }

    public Integer getIdcodigopc() {
        return idcodigopc;
    }

    public void setIdcodigopc(Integer idcodigopc) {
        this.idcodigopc = idcodigopc;
    }

    public String getCodigopc() {
        return codigopc;
    }

    public void setCodigopc(String codigopc) {
        this.codigopc = codigopc;
    }

    @XmlTransient
    public Collection<Registros> getRegistrosCollection() {
        return registrosCollection;
    }

    public void setRegistrosCollection(Collection<Registros> registrosCollection) {
        this.registrosCollection = registrosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcodigopc != null ? idcodigopc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Codpc)) {
            return false;
        }
        Codpc other = (Codpc) object;
        if ((this.idcodigopc == null && other.idcodigopc != null) || (this.idcodigopc != null && !this.idcodigopc.equals(other.idcodigopc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imagenes.entidades.Codpc[ idcodigopc=" + idcodigopc + " ]";
    }
    
}
