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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idestudiante;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nombre;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String apellido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestudiante")
    private Collection<Registros> registrosCollection;
    @JoinColumn(name = "idnie", referencedColumnName = "idnie", nullable = false)
    @ManyToOne(optional = false)
    private Nie idnie;
    @JoinColumn(name = "idseccion", referencedColumnName = "idseccion", nullable = false)
    @ManyToOne(optional = false)
    private Secciones idseccion;

    public Estudiantes() {
    }

    public Estudiantes(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Estudiantes(Integer idestudiante, String nombre, String apellido) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @XmlTransient
    public Collection<Registros> getRegistrosCollection() {
        return registrosCollection;
    }

    public void setRegistrosCollection(Collection<Registros> registrosCollection) {
        this.registrosCollection = registrosCollection;
    }

    public Nie getIdnie() {
        return idnie;
    }

    public void setIdnie(Nie idnie) {
        this.idnie = idnie;
    }

    public Secciones getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Secciones idseccion) {
        this.idseccion = idseccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestudiante != null ? idestudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.idestudiante == null && other.idestudiante != null) || (this.idestudiante != null && !this.idestudiante.equals(other.idestudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imagenes.entidades.Estudiantes[ idestudiante=" + idestudiante + " ]";
    }
    
}
