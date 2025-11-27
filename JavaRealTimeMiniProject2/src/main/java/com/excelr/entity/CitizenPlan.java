package com.excelr.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITIZEN_PLANS_INFO_NEW")
public class CitizenPlan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private Double benefitAmt;
    private String denialReason;
    private LocalDate terminatedDate;
    private String terminationRsn;

    // ✅ MANUAL SETTERS (Lombok replacement)
    public void setCitizenName(String citizenName) { this.citizenName = citizenName; }
    public void setGender(String gender) { this.gender = gender; }
    public void setPlanName(String planName) { this.planName = planName; }
    public void setPlanStatus(String planStatus) { this.planStatus = planStatus; }
    public void setPlanStartDate(LocalDate planStartDate) { this.planStartDate = planStartDate; }
    public void setPlanEndDate(LocalDate planEndDate) { this.planEndDate = planEndDate; }
    public void setBenefitAmt(Double benefitAmt) { this.benefitAmt = benefitAmt; }
    public void setDenialReason(String denialReason) { this.denialReason = denialReason; }
    public void setTerminatedDate(LocalDate terminatedDate) { this.terminatedDate = terminatedDate; }
    public void setTerminationRsn(String terminationRsn) { this.terminationRsn = terminationRsn; }

    // Getters (for JPA/JSON)
    public Integer getCitizenId() { return citizenId; }
    public String getCitizenName() { return citizenName; }
    public String getGender() { return gender; }
    public String getPlanName() { return planName; }
    public String getPlanStatus() { return planStatus; }
    public LocalDate getPlanStartDate() { return planStartDate; }
    public LocalDate getPlanEndDate() { return planEndDate; }
    public Double getBenefitAmt() { return benefitAmt; }
    public String getDenialReason() { return denialReason; }
    public LocalDate getTerminatedDate() { return terminatedDate; }
    public String getTerminationRsn() { return terminationRsn; }
}


