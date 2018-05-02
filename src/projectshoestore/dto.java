/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore;

import java.sql.Date;

/**
 *
 * @author saroj_000
 */
public class dto {
        private int prductId;
        private String productName;
        private String Brand;
        private float price;
        private int quantity;
        private int productclassid;
        private String productClass;
  
        private int userid;
     
        private String userName;
        private String uName;
        private String uPassword;
        private int uCatId;
        
        
        private int suppId;
        private String suppname;
        private String suppAddress;
        private String suppContact;
        private String suppBrand;
        
        private String address;
        private String contactNo;
     
        private Date datem;

    public Date getDatem() {
        return datem;
    }

    public void setDatem(Date datem) {
        this.datem = datem;
    }
        
    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public int getProductclassid() {
        return productclassid;
    }

    public void setProductclassid(int productclassid) {
        this.productclassid = productclassid;
    }
    public int getSuppId() {
        return suppId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public String getSuppname() {
        return suppname;
    }

    public void setSuppname(String suppname) {
        this.suppname = suppname;
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress;
    }

    public String getSuppContact() {
        return suppContact;
    }

    public void setSuppContact(String suppContact) {
        this.suppContact = suppContact;
    }

    public String getSuppBrand() {
        return suppBrand;
    }

    public void setSuppBrand(String suppBrand) {
        this.suppBrand = suppBrand;
    }

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
        
        

    public int getuCatId() {
        return uCatId;
    }

    public void setuCatId(int uCatId) {
        this.uCatId = uCatId;
    }

    public String getuCatName() {
        return uCatName;
    }

    public void setuCatName(String uCatName) {
        this.uCatName = uCatName;
    }
        private String uCatName;

    public String getUserName() {
        return userName;
    }
    
     public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getPrductId() {
        return prductId;
    }

    public void setPrductId(int prductId) {
        this.prductId = prductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    private String luser;

    public String getLuser() {
        return luser;
    }

    public void setLuser(String luser) {
        this.luser = luser;
    }
        
}

