/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DatabaseConnection;
import Model.Product;
import View.managerAccount;

public class managerController implements userController {

    DatabaseConnection db = new DatabaseConnection();

    public void View() {
        
    }

    public void Search() {
        

    }

    public void Add(String pName, String model, String price, String qty) {
       
        db.Add(pName,model, price, qty);

    }

    public void Delete(String pName, String model, String price, String qty) {
        
        db.Delete(pName,model,price,qty);

    }

   /* public void createAccount(String userName,char[]String Password,char[]String confirmPassword,String userType) {
        db.connect();
        db.createAccount(userName,Password,confirmPassword,String userType);
    }*/

    @Override
    public void Serach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void view() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
