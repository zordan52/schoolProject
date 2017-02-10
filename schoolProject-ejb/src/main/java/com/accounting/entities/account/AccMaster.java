/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.entities.account;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author faisal
 */
@Entity
@Table(name = "acc_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccMaster.findAll", query = "SELECT a FROM AccMaster a"),
    @NamedQuery(name = "AccMaster.findById", query = "SELECT a FROM AccMaster a WHERE a.id = :id"),
    @NamedQuery(name = "AccMaster.findByAccCloseDate", query = "SELECT a FROM AccMaster a WHERE a.accCloseDate = :accCloseDate"),
    @NamedQuery(name = "AccMaster.findByAccName", query = "SELECT a FROM AccMaster a WHERE a.accName = :accName"),
    @NamedQuery(name = "AccMaster.findByAccNumber", query = "SELECT a FROM AccMaster a WHERE a.accNumber = :accNumber"),
    @NamedQuery(name = "AccMaster.findByAccOpenDate", query = "SELECT a FROM AccMaster a WHERE a.accOpenDate = :accOpenDate"),
    @NamedQuery(name = "AccMaster.findByAccStatus", query = "SELECT a FROM AccMaster a WHERE a.accStatus = :accStatus"),
    @NamedQuery(name = "AccMaster.findByBalance", query = "SELECT a FROM AccMaster a WHERE a.balance = :balance"),
    @NamedQuery(name = "AccMaster.findByCreatedBy", query = "SELECT a FROM AccMaster a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "AccMaster.findByCreatedDate", query = "SELECT a FROM AccMaster a WHERE a.createdDate = :createdDate"),
    @NamedQuery(name = "AccMaster.findByDeleted", query = "SELECT a FROM AccMaster a WHERE a.deleted = :deleted"),
    @NamedQuery(name = "AccMaster.findByIsCashAcct", query = "SELECT a FROM AccMaster a WHERE a.isCashAcct = :isCashAcct"),
    @NamedQuery(name = "AccMaster.findByPartitionFlag", query = "SELECT a FROM AccMaster a WHERE a.partitionFlag = :partitionFlag"),
    @NamedQuery(name = "AccMaster.findByVerifiedBy", query = "SELECT a FROM AccMaster a WHERE a.verifiedBy = :verifiedBy"),
    @NamedQuery(name = "AccMaster.findByVerifiedDate", query = "SELECT a FROM AccMaster a WHERE a.verifiedDate = :verifiedDate"),
    @NamedQuery(name = "AccMaster.findByAccCashflowNatureId", query = "SELECT a FROM AccMaster a WHERE a.accCashflowNatureId = :accCashflowNatureId"),
    @NamedQuery(name = "AccMaster.findByAccOwner", query = "SELECT a FROM AccMaster a WHERE a.accOwner = :accOwner"),
    @NamedQuery(name = "AccMaster.findByGlSubheadId", query = "SELECT a FROM AccMaster a WHERE a.glSubheadId = :glSubheadId"),
    @NamedQuery(name = "AccMaster.findByOfficeId", query = "SELECT a FROM AccMaster a WHERE a.officeId = :officeId"),
    @NamedQuery(name = "AccMaster.findByAccCloseReason", query = "SELECT a FROM AccMaster a WHERE a.accCloseReason = :accCloseReason"),
    @NamedQuery(name = "AccMaster.findByAccClosedBy", query = "SELECT a FROM AccMaster a WHERE a.accClosedBy = :accClosedBy"),
    @NamedQuery(name = "AccMaster.findByVersion", query = "SELECT a FROM AccMaster a WHERE a.version = :version"),
    @NamedQuery(name = "AccMaster.findByAssociatedOfficeId", query = "SELECT a FROM AccMaster a WHERE a.associatedOfficeId = :associatedOfficeId"),
    @NamedQuery(name = "AccMaster.findByCreditAction", query = "SELECT a FROM AccMaster a WHERE a.creditAction = :creditAction"),
    @NamedQuery(name = "AccMaster.findByCreditLimit", query = "SELECT a FROM AccMaster a WHERE a.creditLimit = :creditLimit"),
    @NamedQuery(name = "AccMaster.findByUseCostCenter", query = "SELECT a FROM AccMaster a WHERE a.useCostCenter = :useCostCenter"),
    @NamedQuery(name = "AccMaster.findByPersonalInfo", query = "SELECT a FROM AccMaster a WHERE a.personalInfo = :personalInfo")})
public class AccMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "acc_close_date")
    @Temporal(TemporalType.DATE)
    private Date accCloseDate;
    @Size(max = 255)
    @Column(name = "acc_name")
    private String accName;
    @Size(max = 255)
    @Column(name = "acc_number")
    private String accNumber;
    @Column(name = "acc_open_date")
    @Temporal(TemporalType.DATE)
    private Date accOpenDate;
    @Column(name = "acc_status")
    private Character accStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "balance")
    private Double balance;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "deleted")
    private Boolean deleted;
    @Column(name = "is_cash_acct")
    private Boolean isCashAcct;
    @Column(name = "partition_flag")
    private Boolean partitionFlag;
    @Size(max = 255)
    @Column(name = "verified_by")
    private String verifiedBy;
    @Column(name = "verified_date")
    @Temporal(TemporalType.DATE)
    private Date verifiedDate;
    @Column(name = "acc_cashflow_nature_id")
    private Integer accCashflowNatureId;
    @Column(name = "acc_owner")
    private Integer accOwner;
    @Column(name = "gl_subhead_id")
    private Integer glSubheadId;
    @Column(name = "office_id")
    private Integer officeId;
    @Size(max = 255)
    @Column(name = "acc_close_reason")
    private String accCloseReason;
    @Column(name = "acc_closed_by")
    private Integer accClosedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Column(name = "associated_office_id")
    private Integer associatedOfficeId;
    @Size(max = 255)
    @Column(name = "credit_action")
    private String creditAction;
    @Column(name = "credit_limit")
    private Double creditLimit;
    @Column(name = "use_cost_center")
    private Boolean useCostCenter;
    @Column(name = "personal_info")
    private Integer personalInfo;

    public AccMaster() {
    }

    public AccMaster(Long id) {
        this.id = id;
    }

    public AccMaster(Long id, int version) {
        this.id = id;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAccCloseDate() {
        return accCloseDate;
    }

    public void setAccCloseDate(Date accCloseDate) {
        this.accCloseDate = accCloseDate;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public Date getAccOpenDate() {
        return accOpenDate;
    }

    public void setAccOpenDate(Date accOpenDate) {
        this.accOpenDate = accOpenDate;
    }

    public Character getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(Character accStatus) {
        this.accStatus = accStatus;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getIsCashAcct() {
        return isCashAcct;
    }

    public void setIsCashAcct(Boolean isCashAcct) {
        this.isCashAcct = isCashAcct;
    }

    public Boolean getPartitionFlag() {
        return partitionFlag;
    }

    public void setPartitionFlag(Boolean partitionFlag) {
        this.partitionFlag = partitionFlag;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public Date getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(Date verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public Integer getAccCashflowNatureId() {
        return accCashflowNatureId;
    }

    public void setAccCashflowNatureId(Integer accCashflowNatureId) {
        this.accCashflowNatureId = accCashflowNatureId;
    }

    public Integer getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(Integer accOwner) {
        this.accOwner = accOwner;
    }

    public Integer getGlSubheadId() {
        return glSubheadId;
    }

    public void setGlSubheadId(Integer glSubheadId) {
        this.glSubheadId = glSubheadId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getAccCloseReason() {
        return accCloseReason;
    }

    public void setAccCloseReason(String accCloseReason) {
        this.accCloseReason = accCloseReason;
    }

    public Integer getAccClosedBy() {
        return accClosedBy;
    }

    public void setAccClosedBy(Integer accClosedBy) {
        this.accClosedBy = accClosedBy;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Integer getAssociatedOfficeId() {
        return associatedOfficeId;
    }

    public void setAssociatedOfficeId(Integer associatedOfficeId) {
        this.associatedOfficeId = associatedOfficeId;
    }

    public String getCreditAction() {
        return creditAction;
    }

    public void setCreditAction(String creditAction) {
        this.creditAction = creditAction;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Boolean getUseCostCenter() {
        return useCostCenter;
    }

    public void setUseCostCenter(Boolean useCostCenter) {
        this.useCostCenter = useCostCenter;
    }

    public Integer getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(Integer personalInfo) {
        this.personalInfo = personalInfo;
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
        if (!(object instanceof AccMaster)) {
            return false;
        }
        AccMaster other = (AccMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.accounting.entities.account.AccMaster[ id=" + id + " ]";
    }
    
}
