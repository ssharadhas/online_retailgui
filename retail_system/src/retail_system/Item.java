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
import javax.swing.ImageIcon;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sshar
 */
@Entity
@Table(name = "ITEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i"),
    @NamedQuery(name = "Item.findByItemid", query = "SELECT i FROM Item i WHERE i.itemid = :itemid"),
    @NamedQuery(name = "Item.findByItemname", query = "SELECT i FROM Item i WHERE i.itemname = :itemname"),
    @NamedQuery(name = "Item.findByItemprice", query = "SELECT i FROM Item i WHERE i.itemprice = :itemprice"),
    @NamedQuery(name = "Item.findByItemunits", query = "SELECT i FROM Item i WHERE i.itemunits = :itemunits"),
    @NamedQuery(name = "Item.findByCategory", query = "SELECT i FROM Item i WHERE i.category = :category")})
public class Item implements Serializable{
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEMID")
    private Integer itemid;
    @Column(name = "ITEMNAME")
    private String itemname;
    @Column(name = "ITEMPRICE")
    private Integer itemprice;
    @Column(name = "ITEMUNITS")
    private Integer itemunits;
    @Lob
    @Column(name = "IMAGE")
    private byte[] image;
    @Column(name = "CATEGORY")
    private String category;

    public Item() {
    }
    public Item(int Itemid,String Itemname,int Itemprice,int Itemunits,String Category,byte[] Image)
    {this.itemid=Itemid;
    this.itemname=Itemname;
    this.itemprice=Itemprice;
    this.itemunits=Itemunits;
    this.category=Category;
    //this.itemunits=Itemunits;
    //this.category=Category;
    this.image=Image;
    }
    public Item(int Itemid,String Itemname,int Itemprice,byte[] Image)
    {this.itemid=Itemid;
    this.itemname=Itemname;
    this.itemprice=Itemprice;
   // this.itemunits=Itemunits;
    //this.category=Category;
    //this.itemunits=Itemunits;
    //this.category=Category;
    this.image=Image;
    }
    public Item(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        Integer oldItemid = this.itemid;
        this.itemid = itemid;
        changeSupport.firePropertyChange("itemid", oldItemid, itemid);
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        String oldItemname = this.itemname;
        this.itemname = itemname;
        changeSupport.firePropertyChange("itemname", oldItemname, itemname);
    }

    public Integer getItemprice() {
        return itemprice;
    }

    public void setItemprice(Integer itemprice) {
        Integer oldItemprice = this.itemprice;
        this.itemprice = itemprice;
        changeSupport.firePropertyChange("itemprice", oldItemprice, itemprice);
    }

    public Integer getItemunits() {
        return itemunits;
    }

   public void setItemunits(Integer itemunits) {
        Integer oldItemunits = this.itemunits;
        this.itemunits = itemunits;
        changeSupport.firePropertyChange("itemunits", oldItemunits, itemunits);
    }
  


    public byte[] getmyImage() {
        return image;
    }
    
    
   //public ImageIcon getImage()
   // {return new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH));
   // }
    public void setImage(byte[] image) {
        byte[] oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "retail_system.Item[ itemid=" + itemid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
