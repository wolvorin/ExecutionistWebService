package com.executionist;
// Generated Feb 6, 2013 10:35:25 AM by Hibernate Tools 3.2.1.GA



/**
 * Projectrelations generated by hbm2java
 */
public class Projectrelations  implements java.io.Serializable {


     private Long MProjectrelations;
     private long MEmpId;
     private long MProjectId;

    public Projectrelations() {
    }

    public Projectrelations(long MEmpId, long MProjectId) {
       this.MEmpId = MEmpId;
       this.MProjectId = MProjectId;
    }
   
    public Long getMProjectrelations() {
        return this.MProjectrelations;
    }
    
    public void setMProjectrelations(Long MProjectrelations) {
        this.MProjectrelations = MProjectrelations;
    }
    public long getMEmpId() {
        return this.MEmpId;
    }
    
    public void setMEmpId(long MEmpId) {
        this.MEmpId = MEmpId;
    }
    public long getMProjectId() {
        return this.MProjectId;
    }
    
    public void setMProjectId(long MProjectId) {
        this.MProjectId = MProjectId;
    }




}


