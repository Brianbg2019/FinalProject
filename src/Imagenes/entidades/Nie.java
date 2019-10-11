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
public class Nie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idnie;
    @Basic(optional = false)
    @Column(nullable = false)
    private int nie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnie")
    private Collection<Estudiantes> estudiantesCollection;

    public Nie() {
    }

    public Nie(Integer idnie) {
        this.idnie = idnie;
    }

    public Nie(Integer idnie, int nie) {
        this.idnie = idnie;
        this.nie = nie;
    }

    public Integer getIdnie() {
        return idnie;
    }

    public void setIdnie(Integer idnie) {
        this.idnie = idnie;
    }

    public int getNie() {
        return nie;
    }

    public void setNie(int nie) {
        this.nie = nie;
    }

    @XmlTransient
    public Collection<Estudiantes> getEstudiantesCollection() {
        return estudiantesCollection;
    }

    public void setEstudiantesCollection(Collection<Estudiantes> estudiantesCollection) {
        this.estudiantesCollection = estudiantesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnie != null ? idnie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nie)) {
            return false;
        }
        Nie other = (Nie) object;
        if ((this.idnie == null && other.idnie != null) || (this.idnie != null && !this.idnie.equals(other.idnie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imagenes.entidades.Nie[ idnie=" + idnie + " ]";
    }
    
}
