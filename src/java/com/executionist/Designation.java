package com.executionist;
// Generated Feb 6, 2013 10:35:25 AM by Hibernate Tools 3.2.1.GA



/**
 * Designation generated by hbm2java
 */
public class Designation  implements java.io.Serializable {


     private Long MDesignationId;
     private String MDesignationName;
     private long MCompanyId;

    public Designation() {
    }

	
    public Designation(long MCompanyId) {
        this.MCompanyId = MCompanyId;
    }
    public Designation(String MDesignationName, long MCompanyId) {
       this.MDesignationName = MDesignationName;
       this.MCompanyId = MCompanyId;
    }
   
    public Long getMDesignationId() {
        return this.MDesignationId;
    }
    
    public void setMDesignationId(Long MDesignationId) {
        this.MDesignationId = MDesignationId;
    }
    public String getMDesignationName() {
        return this.MDesignationName;
    }
    
    public void setMDesignationName(String MDesignationName) {
        this.MDesignationName = MDesignationName;
    }
    public long getMCompanyId() {
        return this.MCompanyId;
    }
    
    public void setMCompanyId(long MCompanyId) {
        this.MCompanyId = MCompanyId;
    }




}


