package com.executionist;
// Generated Feb 6, 2013 10:35:25 AM by Hibernate Tools 3.2.1.GA



/**
 * Company generated by hbm2java
 */
public class Company  implements java.io.Serializable {


     private Long MCompanyId;
     private String MCompanyName;
     private String MCompanyTagLine;
     private byte[] MCompanyLogo;


    public Company() {
    }

	
    public Company(String MCompanyName) {
        this.MCompanyName = MCompanyName;
    }
    public Company(String MCompanyName, String MCompanyTagLine, byte[] MCompanyLogo) {
       this.MCompanyName = MCompanyName;
       this.MCompanyTagLine = MCompanyTagLine;
       this.MCompanyLogo = MCompanyLogo;
    }
   
    public Long getMCompanyId() {
        return this.MCompanyId;
    }
    
    public void setMCompanyId(Long MCompanyId) {
        this.MCompanyId = MCompanyId;
    }
    public String getMCompanyName() {
        return this.MCompanyName;
    }
    
    public void setMCompanyName(String MCompanyName) {
        this.MCompanyName = MCompanyName;
    }
    public String getMCompanyTagLine() {
        return this.MCompanyTagLine;
    }
    
    public void setMCompanyTagLine(String MCompanyTagLine) {
        this.MCompanyTagLine = MCompanyTagLine;
    }
    public byte[] getMCompanyLogo() {
        return this.MCompanyLogo;
    }
    
    public void setMCompanyLogo(byte[] MCompanyLogo) {
        this.MCompanyLogo = MCompanyLogo;
    }





}


