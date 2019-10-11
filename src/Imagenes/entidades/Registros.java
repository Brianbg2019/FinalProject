/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vce
 */
@MappedSuperclass
@Table(catalog = "scc", schema = "public")
@XmlRootElement
public class Registros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idregistro;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String actividad;
    @JoinColumn(name = "idcodigopc", referencedColumnName = "idcodigopc", nullable = false)
    @ManyToOne(optional = false)
    private Codpc idcodigopc;
    @JoinColumn(name = "idestudiante", referencedColumnName = "idestudiante", nullable = false)
    @ManyToOne(optional = false)
    private Estudiantes idestudiante;
    @JoinColumn(name = "idotro", referencedColumnName = "idotro", nullable = false)
    @ManyToOne(optional = false)
    private Otros idotro;

    public Registros() {
    }

    public Registros(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Registros(Integer idregistro, Date fecha, String actividad) {
        this.idregistro = idregistro;
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Codpc getIdcodigopc() {
        return idcodigopc;
    }

    public void setIdcodigopc(Codpc idcodigopc) {
        this.idcodigopc = idcodigopc;
    }

    public Estudiantes getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Estudiantes idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Otros getIdotro() {
        return idotro;
    }

    public void setIdotro(Otros idotro) {
        this.idotro = idotro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistro != null ? idregistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registros)) {
            return false;
        }
        Registros other = (Registros) object;
        if ((this.idregistro == null && other.idregistro != null) || (this.idregistro != null && !this.idregistro.equals(other.idregistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imagenes.entidades.Registros[ idregistro=" + idregistro + " ]";
    }
    
}
