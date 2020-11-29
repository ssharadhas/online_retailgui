/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retail_system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author sshar
 */
@Entity
@Table(name = "CART", catalog = "", schema = "A")
@NamedQueries({
    @NamedQuery(name = "Cart.findAll", query = "SELECT c FROM Cart c"),
    @NamedQuery(name = "Cart.findByItemidd", query = "SELECT c FROM Cart c WHERE c.itemidd = :itemidd"),
    @NamedQuery(name = "Cart.findByName", query = "SELECT c FROM Cart c WHERE c.name = :name"),
    @NamedQuery(name = "Cart.findByPrice", query = "SELECT c FROM Cart c WHERE c.price = :price"),
    @NamedQuery(name = "Cart.findByStatus", query = "SELECT c FROM Cart c WHERE c.status = :status"),
    @NamedQuery(name = "Cart.findByUsern", query = "SELECT c FROM Cart c WHERE c.usern = :usern")})
public class Cart implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEMIDD")
    private Integer itemidd;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "USERN")
    private String usern;
    @Lob
    @Column(name = "IMAGE")
    private Serializable image;

    public Cart() {
    }

    public Cart(Integer itemidd) {
        this.itemidd = itemidd;
    }

    public Integer getItemidd() {
        return itemidd;
    }

    public void setItemidd(Integer itemidd) {
        Integer oldItemidd = this.itemidd;
        this.itemidd = itemidd;
        changeSupport.firePropertyChange("itemidd", oldItemidd, itemidd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        String oldUsern = this.usern;
        this.usern = usern;
        changeSupport.firePropertyChange("usern", oldUsern, usern);
    }

    public Serializable getImage() {
        return image;
    }

    public void setImage(Serializable image) {
        Serializable oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemidd != null ? itemidd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if ((this.itemidd == null && other.itemidd != null) || (this.itemidd != null && !this.itemidd.equals(other.itemidd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "retail_system.Cart[ itemidd=" + itemidd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
