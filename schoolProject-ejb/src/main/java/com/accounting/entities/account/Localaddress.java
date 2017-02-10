/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.account;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author faisal
 */
@Entity
@Table(name = "localaddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localaddress.findAll", query = "SELECT l FROM Localaddress l"),
    @NamedQuery(name = "Localaddress.findById", query = "SELECT l FROM Localaddress l WHERE l.id = :id"),
    @NamedQuery(name = "Localaddress.findByAddressType", query = "SELECT l FROM Localaddress l WHERE l.addressType = :addressType"),
    @NamedQuery(name = "Localaddress.findByAddressValue", query = "SELECT l FROM Localaddress l WHERE l.addressValue = :addressValue"),
    @NamedQuery(name = "Localaddress.findByDisplayName", query = "SELECT l FROM Localaddress l WHERE l.displayName = :displayName"),
    @NamedQuery(name = "Localaddress.findByParentId", query = "SELECT l FROM Localaddress l WHERE l.parentId = :parentId"),
    @NamedQuery(name = "Localaddress.findByValueNp", query = "SELECT l FROM Localaddress l WHERE l.valueNp = :valueNp")})
public class Localaddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "addressType")
    private Integer addressType;
    @Size(max = 255)
    @Column(name = "address_value")
    private String addressValue;
    @Size(max = 255)
    @Column(name = "displayName")
    private String displayName;
    @Column(name = "parent_id")
    private BigInteger parentId;
    @Size(max = 512)
    @Column(name = "value_np")
    private String valueNp;

    public Localaddress() {
    }

    public Localaddress(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BigInteger getParentId() {
        return parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public String getValueNp() {
        return valueNp;
    }

    public void setValueNp(String valueNp) {
        this.valueNp = valueNp;
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
        if (!(object instanceof Localaddress)) {
            return false;
        }
        Localaddress other = (Localaddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.account.Localaddress[ id=" + id + " ]";
    }
    
}
