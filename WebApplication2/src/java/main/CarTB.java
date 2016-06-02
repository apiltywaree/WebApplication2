/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apiltiwari
 */
@Entity
@Table(name = "CarTB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarTB.findAll", query = "SELECT c FROM CarTB c"),
    @NamedQuery(name = "CarTB.findById", query = "SELECT c FROM CarTB c WHERE c.id = :id"),
    @NamedQuery(name = "CarTB.findByColor", query = "SELECT c FROM CarTB c WHERE c.color = :color"),
    @NamedQuery(name = "CarTB.findByMake", query = "SELECT c FROM CarTB c WHERE c.make = :make"),
    @NamedQuery(name = "CarTB.findByMiles", query = "SELECT c FROM CarTB c WHERE c.miles = :miles"),
    @NamedQuery(name = "CarTB.findByModel", query = "SELECT c FROM CarTB c WHERE c.model = :model"),
    @NamedQuery(name = "CarTB.findByManufacturingYear", query = "SELECT c FROM CarTB c WHERE c.manufacturingYear = :manufacturingYear")})
public class CarTB implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COLOR")
    private Integer color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MAKE")
    private String make;
    //Requirement 1
    @Column(name = "VERSION")
    private int version;
    @Column(name = "MILES")
    private Integer miles;
    @Size(max = 255)
    @Column(name = "MODEL")
    private String model;
    @Column(name = "ManufacturingYear")
    private Integer manufacturingYear;

    public CarTB() {
    }

    public CarTB(Integer id) {
        this.id = id;
    }

    public CarTB(Integer id, String make) {
        this.id = id;
        this.make = make;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
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
        if (!(object instanceof CarTB)) {
            return false;
        }
        CarTB other = (CarTB) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.CarTB[ id=" + id + " ]";
    }
    
}
