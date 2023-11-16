/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionBuilder;
import java.util.List;
import modal.Employee;
import modal.Item;
import modal.Stock;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class ItemDAO {

    public void saveItem(Item item) {
        Session session = null;
        Transaction tr = null;
        try {
            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.save(item);
            tr.commit();

        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public List<Item> ItemsSearch() {
        Session session = ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Item.class);
        List<Item> list = criteria.list();

        return list;
    }

    public List<Item> SearchTableItems() {
        Session session = ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Item");
        List<Item> list = query.list();
        return list;
    }
  

    public List<Item> ItemsActiveItems() {
        Session session = ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Item.class);
        criteria.add(Restrictions.eq("isactive", Boolean.TRUE));
        List<Item> list = criteria.list();

        
        return list;
    }
    
      public Item SearchItemID(String id) {
        Item item = null;
        Session session = ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Item.class);
        criteria.add(Restrictions.eq("id", id));
        if(criteria.uniqueResult() != null){
            
        item = (Item) criteria.uniqueResult();
        }
        return item;
    }
      
     

}
