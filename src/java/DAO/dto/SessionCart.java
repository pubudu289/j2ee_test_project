/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dto;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modal.Cartstatus;
import modal.Employee;

/**
 *
 * @author Pubudu Kasun
 */
public class SessionCart {

    private Date date;
    private double total;
    private boolean isactive;
    private List<SessionCartItem> itemList;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public List<SessionCartItem> getItemList() {
        if (itemList == null) {
            itemList = new ArrayList<>();
        }
        
        return itemList;
    }

    public void setItemList(List<SessionCartItem> itemList) {
        this.itemList = itemList;
    }
}
