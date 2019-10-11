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
public class Otros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idotro;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nombre;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String dui;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String empleadoen;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idotro")
    private Collection<Registros> registrosCollection;

    public Otros() {
    }

    public Otros(Integer idotro) {
        this.idotro = idotro;
    }

    public Otros(Integer idotro, String nombre, String dui, String empleadoen, String telefono) {
        this.idotro = idotro;
        this.nombre = nombre;
        this.dui = dui;
        this.empleadoen = empleadoen;
        this.telefono = telefono;
    }

    public Integer getIdotro() {
        return idotro;
    }

    public void setIdotro(Integer idotro) {
        this.idotro = idotro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getEmpleadoen() {
        return empleadoen;
    }

    public void setEmpleadoen(String empleadoen) {
        this.empleadoen = empleadoen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idotro != null ? idotro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Otros)) {
            return false;
        }
        Otros other = (Otros) object;
        if ((this.idotro == null && other.idotro != null) || (this.idotro != null && !this.idotro.equals(other.idotro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imagenes.entidades.Otros[ idotro=" + idotro + " ]";
    }
    
}
