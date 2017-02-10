/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.user;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r"),
    @NamedQuery(name = "Role.findById", query = "SELECT r FROM Role r WHERE r.id = :id"),
    @NamedQuery(name = "Role.findByDeleted", query = "SELECT r FROM Role r WHERE r.deleted = :deleted"),
    @NamedQuery(name = "Role.findByModules", query = "SELECT r FROM Role r WHERE r.modules = :modules"),
    @NamedQuery(name = "Role.findByAccountOwnerships", query = "SELECT r FROM Role r WHERE r.accountOwnerships = :accountOwnerships"),
    @NamedQuery(name = "Role.findByOfficeId", query = "SELECT r FROM Role r WHERE r.officeId = :officeId")})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "deleted")
    private Boolean deleted;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "display_name")
    private String displayName;
    @Size(max = 512)
    @Column(name = "modules")
    private String modules;
    @Size(max = 255)
    @Column(name = "account_ownerships")
    private String accountOwnerships;
    @Column(name = "office_id")
    private Integer officeId;

    public Role() {
    }

    public Role(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public String getAccountOwnerships() {
        return accountOwnerships;
    }

    public void setAccountOwnerships(String accountOwnerships) {
        this.accountOwnerships = accountOwnerships;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
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
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.user.Role[ id=" + id + " ]";
    }
    
}
