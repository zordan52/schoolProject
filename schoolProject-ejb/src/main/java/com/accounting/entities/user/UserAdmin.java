/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.user;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author faisal
 */
@Entity
@Table(name = "user_admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAdmin.findAll", query = "SELECT u FROM UserAdmin u"),
    @NamedQuery(name = "UserAdmin.findById", query = "SELECT u FROM UserAdmin u WHERE u.id = :id"),
    @NamedQuery(name = "UserAdmin.findByName", query = "SELECT u FROM UserAdmin u WHERE u.name = :name"),
    @NamedQuery(name = "UserAdmin.findByUsername", query = "SELECT u FROM UserAdmin u WHERE u.username = :username"),
    @NamedQuery(name = "UserAdmin.findByPassword", query = "SELECT u FROM UserAdmin u WHERE u.password = :password"),
    @NamedQuery(name = "UserAdmin.findByDelFlg", query = "SELECT u FROM UserAdmin u WHERE u.delFlg = :delFlg"),
    @NamedQuery(name = "UserAdmin.findByRoleId", query = "SELECT u FROM UserAdmin u WHERE u.roleId = :roleId"),
    @NamedQuery(name = "UserAdmin.findByLoggedin", query = "SELECT u FROM UserAdmin u WHERE u.loggedin = :loggedin"),
    @NamedQuery(name = "UserAdmin.findByCreatedyBy", query = "SELECT u FROM UserAdmin u WHERE u.createdyBy = :createdyBy"),
    @NamedQuery(name = "UserAdmin.findByCreatedDate", query = "SELECT u FROM UserAdmin u WHERE u.createdDate = :createdDate"),
    @NamedQuery(name = "UserAdmin.findByIsSuperAdmin", query = "SELECT u FROM UserAdmin u WHERE u.isSuperAdmin = :isSuperAdmin")})
public class UserAdmin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "username")
    private String username;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    @Column(name = "del_flg")
    private Boolean delFlg;
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "loggedin")
    private Short loggedin;
    @Column(name = "createdy_by")
    private Integer createdyBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "is_super_admin")
    private Boolean isSuperAdmin;

    public UserAdmin() {
    }

    public UserAdmin(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Short getLoggedin() {
        return loggedin;
    }

    public void setLoggedin(Short loggedin) {
        this.loggedin = loggedin;
    }

    public Integer getCreatedyBy() {
        return createdyBy;
    }

    public void setCreatedyBy(Integer createdyBy) {
        this.createdyBy = createdyBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(Boolean isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
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
        if (!(object instanceof UserAdmin)) {
            return false;
        }
        UserAdmin other = (UserAdmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.user.UserAdmin[ id=" + id + " ]";
    }
    
}
