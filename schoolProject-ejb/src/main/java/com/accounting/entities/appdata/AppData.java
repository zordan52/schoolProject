/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.appdata;

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
@Table(name = "app_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AppData.findAll", query = "SELECT a FROM AppData a"),
    @NamedQuery(name = "AppData.findById", query = "SELECT a FROM AppData a WHERE a.id = :id"),
    @NamedQuery(name = "AppData.findByAppDataCode", query = "SELECT a FROM AppData a WHERE a.appDataCode = :appDataCode"),
    @NamedQuery(name = "AppData.findByAppDataType", query = "SELECT a FROM AppData a WHERE a.appDataType = :appDataType"),
    @NamedQuery(name = "AppData.findByDelFlag", query = "SELECT a FROM AppData a WHERE a.delFlag = :delFlag"),
    @NamedQuery(name = "AppData.findByOfficeId", query = "SELECT a FROM AppData a WHERE a.officeId = :officeId")})
public class AppData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 765)
    @Column(name = "app_data_code")
    private String appDataCode;
    @Lob
    @Size(max = 65535)
    @Column(name = "app_data_desc")
    private String appDataDesc;
    @Size(max = 765)
    @Column(name = "app_data_type")
    private String appDataType;
    @Column(name = "del_flag")
    private Boolean delFlag;
    @Column(name = "office_id")
    private Integer officeId;

    public AppData() {
    }

    public AppData(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppDataCode() {
        return appDataCode;
    }

    public void setAppDataCode(String appDataCode) {
        this.appDataCode = appDataCode;
    }

    public String getAppDataDesc() {
        return appDataDesc;
    }

    public void setAppDataDesc(String appDataDesc) {
        this.appDataDesc = appDataDesc;
    }

    public String getAppDataType() {
        return appDataType;
    }

    public void setAppDataType(String appDataType) {
        this.appDataType = appDataType;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
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
        if (!(object instanceof AppData)) {
            return false;
        }
        AppData other = (AppData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.appdata.AppData[ id=" + id + " ]";
    }
    
}
