package com.executionist;
// Generated Feb 6, 2013 10:35:25 AM by Hibernate Tools 3.2.1.GA



/**
 * Checklistcategory generated by hbm2java
 */
public class Checklistcategory  implements java.io.Serializable {


     private Long MCategoryId;
     private String MCategoryName;

    public Checklistcategory() {
    }

    public Checklistcategory(String MCategoryName) {
       this.MCategoryName = MCategoryName;
    }
   
    public Long getMCategoryId() {
        return this.MCategoryId;
    }
    
    public void setMCategoryId(Long MCategoryId) {
        this.MCategoryId = MCategoryId;
    }
    public String getMCategoryName() {
        return this.MCategoryName;
    }
    
    public void setMCategoryName(String MCategoryName) {
        this.MCategoryName = MCategoryName;
    }




}


