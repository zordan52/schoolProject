/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.user;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByDeleted", query = "SELECT u FROM User u WHERE u.deleted = :deleted"),
    @NamedQuery(name = "User.findByLoggedin", query = "SELECT u FROM User u WHERE u.loggedin = :loggedin"),
    @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username and u.deleted=false"),
    @NamedQuery(name = "User.findByOfficeId", query = "SELECT u FROM User u WHERE u.officeId = :officeId"),
    @NamedQuery(name = "User.findByRoleId", query = "SELECT u FROM User u WHERE u.roleId = :roleId"),
    @NamedQuery(name = "User.findByCreatedBy", query = "SELECT u FROM User u WHERE u.createdBy = :createdBy"),
    @NamedQuery(name = "User.findByCommitteeId", query = "SELECT u FROM User u WHERE u.committeeId = :committeeId"),
    @NamedQuery(name = "User.findByMemberId", query = "SELECT u FROM User u WHERE u.memberId = :memberId"),
    @NamedQuery(name = "User.findByTxnLimitProfileId", query = "SELECT u FROM User u WHERE u.txnLimitProfileId = :txnLimitProfileId"),
    @NamedQuery(name = "User.findByCreatedDate", query = "SELECT u FROM User u WHERE u.createdDate = :createdDate"),
    @NamedQuery(name = "User.findByCreatedyBy", query = "SELECT u FROM User u WHERE u.createdyBy = :createdyBy")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "deleted")
    private Boolean deleted;
    @Column(name = "loggedin")
    private Boolean loggedin;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "password")
    private String password;
    @Size(max = 128)
    @Column(name = "username")
    private String username;
    @Column(name = "office_id")
    private Integer officeId;
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "committee_id")
    private Integer committeeId;
    @Column(name = "member_id")
    private BigInteger memberId;
    @Column(name = "txn_limit_profile_id")
    private Integer txnLimitProfileId;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "createdy_by")
    private Integer createdyBy;

    public User() {
    }

    public User(Integer id) {
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

    public Boolean getLoggedin() {
        return loggedin;
    }

    public void setLoggedin(Boolean loggedin) {
        this.loggedin = loggedin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(Integer committeeId) {
        this.committeeId = committeeId;
    }

    public BigInteger getMemberId() {
        return memberId;
    }

    public void setMemberId(BigInteger memberId) {
        this.memberId = memberId;
    }

    public Integer getTxnLimitProfileId() {
        return txnLimitProfileId;
    }

    public void setTxnLimitProfileId(Integer txnLimitProfileId) {
        this.txnLimitProfileId = txnLimitProfileId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedyBy() {
        return createdyBy;
    }

    public void setCreatedyBy(Integer createdyBy) {
        this.createdyBy = createdyBy;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.user.User[ id=" + id + " ]";
    }
    
}
