/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.account;

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
@Table(name = "personal_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonalInfo.findAll", query = "SELECT p FROM PersonalInfo p"),
    @NamedQuery(name = "PersonalInfo.findById", query = "SELECT p FROM PersonalInfo p WHERE p.id = :id"),
    @NamedQuery(name = "PersonalInfo.findByAccId", query = "SELECT p FROM PersonalInfo p WHERE p.accId = :accId"),
    @NamedQuery(name = "PersonalInfo.findByAddress", query = "SELECT p FROM PersonalInfo p WHERE p.address = :address"),
    @NamedQuery(name = "PersonalInfo.findByDob", query = "SELECT p FROM PersonalInfo p WHERE p.dob = :dob"),
    @NamedQuery(name = "PersonalInfo.findByFathername", query = "SELECT p FROM PersonalInfo p WHERE p.fathername = :fathername"),
    @NamedQuery(name = "PersonalInfo.findByMobile", query = "SELECT p FROM PersonalInfo p WHERE p.mobile = :mobile"),
    @NamedQuery(name = "PersonalInfo.findByName", query = "SELECT p FROM PersonalInfo p WHERE p.name = :name"),
    @NamedQuery(name = "PersonalInfo.findByPanNo", query = "SELECT p FROM PersonalInfo p WHERE p.panNo = :panNo"),
    @NamedQuery(name = "PersonalInfo.findByTelephone", query = "SELECT p FROM PersonalInfo p WHERE p.telephone = :telephone"),
    @NamedQuery(name = "PersonalInfo.findByDistrictId", query = "SELECT p FROM PersonalInfo p WHERE p.districtId = :districtId"),
    @NamedQuery(name = "PersonalInfo.findByVdcId", query = "SELECT p FROM PersonalInfo p WHERE p.vdcId = :vdcId"),
    @NamedQuery(name = "PersonalInfo.findByZoneId", query = "SELECT p FROM PersonalInfo p WHERE p.zoneId = :zoneId"),
    @NamedQuery(name = "PersonalInfo.findByEmail", query = "SELECT p FROM PersonalInfo p WHERE p.email = :email"),
    @NamedQuery(name = "PersonalInfo.findByFax", query = "SELECT p FROM PersonalInfo p WHERE p.fax = :fax"),
    @NamedQuery(name = "PersonalInfo.findByMobile1", query = "SELECT p FROM PersonalInfo p WHERE p.mobile1 = :mobile1"),
    @NamedQuery(name = "PersonalInfo.findByMobile2", query = "SELECT p FROM PersonalInfo p WHERE p.mobile2 = :mobile2"),
    @NamedQuery(name = "PersonalInfo.findByTelephoneO", query = "SELECT p FROM PersonalInfo p WHERE p.telephoneO = :telephoneO"),
    @NamedQuery(name = "PersonalInfo.findByTelephoneR", query = "SELECT p FROM PersonalInfo p WHERE p.telephoneR = :telephoneR"),
    @NamedQuery(name = "PersonalInfo.findByAgentId", query = "SELECT p FROM PersonalInfo p WHERE p.agentId = :agentId")})
public class PersonalInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "acc_id")
    private BigInteger accId;
    @Size(max = 255)
    @Column(name = "address")
    private String address;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Size(max = 255)
    @Column(name = "fathername")
    private String fathername;
    @Size(max = 255)
    @Column(name = "mobile")
    private String mobile;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pan_no")
    private Double panNo;
    @Size(max = 255)
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "district_id")
    private BigInteger districtId;
    @Column(name = "vdc_id")
    private BigInteger vdcId;
    @Column(name = "zone_id")
    private BigInteger zoneId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "fax")
    private String fax;
    @Size(max = 255)
    @Column(name = "mobile1")
    private String mobile1;
    @Size(max = 255)
    @Column(name = "mobile2")
    private String mobile2;
    @Size(max = 255)
    @Column(name = "telephoneO")
    private String telephoneO;
    @Size(max = 255)
    @Column(name = "telephoneR")
    private String telephoneR;
    @Column(name = "agent_id")
    private Integer agentId;

    public PersonalInfo() {
    }

    public PersonalInfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getAccId() {
        return accId;
    }

    public void setAccId(BigInteger accId) {
        this.accId = accId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPanNo() {
        return panNo;
    }

    public void setPanNo(Double panNo) {
        this.panNo = panNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigInteger getDistrictId() {
        return districtId;
    }

    public void setDistrictId(BigInteger districtId) {
        this.districtId = districtId;
    }

    public BigInteger getVdcId() {
        return vdcId;
    }

    public void setVdcId(BigInteger vdcId) {
        this.vdcId = vdcId;
    }

    public BigInteger getZoneId() {
        return zoneId;
    }

    public void setZoneId(BigInteger zoneId) {
        this.zoneId = zoneId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getTelephoneO() {
        return telephoneO;
    }

    public void setTelephoneO(String telephoneO) {
        this.telephoneO = telephoneO;
    }

    public String getTelephoneR() {
        return telephoneR;
    }

    public void setTelephoneR(String telephoneR) {
        this.telephoneR = telephoneR;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
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
        if (!(object instanceof PersonalInfo)) {
            return false;
        }
        PersonalInfo other = (PersonalInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.account.PersonalInfo[ id=" + id + " ]";
    }
    
}
