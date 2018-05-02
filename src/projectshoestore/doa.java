/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saroj_000q
 */
public class doa {
    public List<dto> showlist() {
        List<dto> list = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.productinfo;";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto productdto = new dto();
          
            
            
            productdto.setPrductId(rs.getInt("ProductID"));
            productdto.setProductName(rs.getString("Productname"));
            productdto.setBrand(rs.getString("Brand"));
            productdto.setPrice(rs.getInt("Price"));
            productdto.setQuantity(rs.getInt("Stock"));
            productdto.setProductclassid(rs.getInt("productclassid"));
            
            list.add(productdto);
           
        }
   
   }
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    
    }   
    
    
    
    
public List<dto> showlist1(String name) {
        List<dto> list = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.productinfo where Productname ='"+name+"';";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto productdto = new dto();
          
            
            
            productdto.setPrductId(rs.getInt("ProductID"));
            productdto.setProductName(rs.getString("Productname"));
            productdto.setBrand(rs.getString("Brand"));
            productdto.setPrice(rs.getInt("Price"));
            productdto.setQuantity(rs.getInt("Stock"));
            
            
            
            list.add(productdto);
           
        }
   
   }
   
   
   
   
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    
    }      
    
    
public List<dto> showlist2(String brand) {
        List<dto> list = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.productinfo where Brand ='"+brand+"';";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto productdto = new dto();
          
            
            
            productdto.setPrductId(rs.getInt("ProductID"));
            productdto.setProductName(rs.getString("Productname"));
            productdto.setBrand(rs.getString("Brand"));
            productdto.setPrice(rs.getInt("Price"));
            productdto.setQuantity(rs.getInt("Stock"));
            
            
            list.add(productdto);
           
        }
   
   }
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    
    }  

//all ok
public List<dto> loginlist(String name) {
        List<dto> list = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.userinfo;+";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto userdto = new dto();
           
           
                userdto.setUserName(rs.getString("name"));
                userdto.setuName(rs.getString("username"));
                userdto.setuPassword(rs.getString("password"));
                userdto.setUserid(rs.getInt("id"));
                userdto.setuCatId(rs.getInt("catagory"));
                
                
            
            
//            productdto.setPrductId(rs.getInt("ProductID"));
//            productdto.setProductName(rs.getString("Productname"));
//            productdto.setBrand(rs.getString("Brand"));
//            productdto.setPrice(rs.getInt("Price"));
//            productdto.setQuantity(rs.getInt("Stock"));
            
            
            list.add(userdto);
           
        }
   
   }
  
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    
    }
//all ok
public List<dto> usershowlist2(String brand) {
        List<dto> list1 = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.usercat;";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto catagorydto = new dto();
          
            
            
         //   catagorydto.setPrductId(rs.getInt("ProductID"));
           
            
            list1.add(catagorydto);
           
        }
   
   }
    catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    return list1;

}
//contact error done!!
public List<dto> supplierInfoList(){
    List<dto> supplist = new ArrayList();
    try  {
        String sql = "SELECT * FROM hamroshoestore.supplierinfo;";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto suppdto = new dto();
                    suppdto.setSuppId(rs.getInt("supplierid"));
                    suppdto.setSuppname(rs.getString("name"));
                    suppdto.setSuppAddress(rs.getString("address"));
                    //suppdto.setSuppContact(rs.getString("contactno"));
                    suppdto.setContactNo(rs.getString("contactno"));
                    suppdto.setSuppBrand(rs.getString("brand"));
          
            
            
            
            
            supplist.add(suppdto);
           
        }
   
   }
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return supplist;
    
}
       //for product detail in prduct main class
public List<dto> productlistinner() {
        List<dto> list = new ArrayList<>();
   try  {
        String sql = "SELECT ProductID,Productname,Brand,Price,Stock,productclass FROM hamroshoestore.productinfo inner join productclass on productinfo.productclassid=productclass.id;";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto productdto = new dto();
          
            
            
            productdto.setPrductId(rs.getInt("ProductID"));
            productdto.setProductName(rs.getString("Productname"));
            productdto.setBrand(rs.getString("Brand"));
            productdto.setPrice(rs.getInt("Price"));
            productdto.setQuantity(rs.getInt("Stock"));
           // productdto.setProductclassid(rs.getInt("productclassid"));
            productdto.setProductClass(rs.getString("productclass"));
            list.add(productdto);
           
        }
   
   }
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    
    }

//for sale 
public List<dto> productsale() {
        List<dto> lists = new ArrayList<>();
   try  {
        String sql = "SELECT * FROM hamroshoestore.saless;";
        PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
        ResultSet rs = psd.executeQuery();
        while(rs.next()){
           dto productdto = new dto();
          
            
            
        
            productdto.setProductName(rs.getString("productname"));
            productdto.setBrand(rs.getString("brand"));
           
            productdto.setQuantity(rs.getInt("quantity"));
           // productdto.setProductclassid(rs.getInt("productclassid"));
           // productdto.setProductClass(rs.getString("productclass"));
            lists.add(productdto);
           
        }
   
   }
   catch (SQLException ex) {
            Logger.getLogger(doa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
        
    
    }

}