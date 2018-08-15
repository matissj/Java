/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentica2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Matiss-Study
 */
@Entity
@Table(name = "bikes", catalog = "sql7252049", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bikes.findAll", query = "SELECT b FROM Bikes b")
    , @NamedQuery(name = "Bikes.findById", query = "SELECT b FROM Bikes b WHERE b.id = :id")
    , @NamedQuery(name = "Bikes.findByManufacturer", query = "SELECT b FROM Bikes b WHERE b.manufacturer = :manufacturer")})
public class Bikes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "manufacturer")
    private String manufacturer;

    public Bikes() {
    }

    public Bikes(String id) {
        this.id = id;
    }

    public Bikes(String id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        String oldManufacturer = this.manufacturer;
        this.manufacturer = manufacturer;
        changeSupport.firePropertyChange("manufacturer", oldManufacturer, manufacturer);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bikes)) {
            return false;
        }
        Bikes other = (Bikes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autentica2.Bikes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
