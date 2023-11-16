/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionBuilder;
import java.util.List;
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
public class StockDAO {

    public void saveStock(Double price, int qty, Item item, String desc) {
        Session session = null;
        Transaction tr = null;
        try {
            Stock stock = new Stock();
            stock.setItem(item);
            stock.setPrice(price);
            stock.setQty(qty);
            stock.setDescription(desc);

            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.save(stock);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public List<Stock> SearchUpdateTableItems() {
        Session session = ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Stock");
        List<Stock> list = query.list();
        return list;
    }

    public void updateItemStock(String stockid, Item itemid, String price, String qty, String desc) {

        Session session = null;
        Transaction tr = null;
        try {
            Stock stock = new Stock();
            int id = Integer.parseInt(stockid);
            double price1 = Double.parseDouble(price);
            int qty1 = Integer.parseInt(qty);

            stock.setId(id);
            stock.setItem(itemid);
            stock.setPrice(price1);
            stock.setQty(qty1);
            stock.setDescription(desc);

            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.update(stock);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }

    }

    public Stock search(int id) {
        Session session = ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Stock.class);
        criteria.add(Restrictions.eq("id", id));

        return (Stock) criteria.uniqueResult();
    }

}
