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
@Table(name = "booking", catalog = "employeedb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Booking_1.findAll", query = "SELECT b FROM Booking_1 b")
    , @NamedQuery(name = "Booking_1.findById", query = "SELECT b FROM Booking_1 b WHERE b.id = :id")
    , @NamedQuery(name = "Booking_1.findByBikeId", query = "SELECT b FROM Booking_1 b WHERE b.bikeId = :bikeId")
    , @NamedQuery(name = "Booking_1.findByDate", query = "SELECT b FROM Booking_1 b WHERE b.date = :date")
    , @NamedQuery(name = "Booking_1.findByTimeStart", query = "SELECT b FROM Booking_1 b WHERE b.timeStart = :timeStart")
    , @NamedQuery(name = "Booking_1.findByTimeEnd", query = "SELECT b FROM Booking_1 b WHERE b.timeEnd = :timeEnd")})
public class Booking_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "bike_id")
    private String bikeId;
    @Column(name = "date")
    private String date;
    @Column(name = "time_start")
    private String timeStart;
    @Column(name = "time_end")
    private String timeEnd;

    public Booking_1() {
    }

    public Booking_1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        String oldBikeId = this.bikeId;
        this.bikeId = bikeId;
        changeSupport.firePropertyChange("bikeId", oldBikeId, bikeId);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        String oldTimeStart = this.timeStart;
        this.timeStart = timeStart;
        changeSupport.firePropertyChange("timeStart", oldTimeStart, timeStart);
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        String oldTimeEnd = this.timeEnd;
        this.timeEnd = timeEnd;
        changeSupport.firePropertyChange("timeEnd", oldTimeEnd, timeEnd);
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
        if (!(object instanceof Booking_1)) {
            return false;
        }
        Booking_1 other = (Booking_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autentica2.Booking_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
