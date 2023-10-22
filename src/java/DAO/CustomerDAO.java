/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionBuilder;
import java.util.List;
import modal.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Pubudu Kasun
 */
public class CustomerDAO {

    public Customer seachByID(String id) {
        Customer customer = null;

        Session session = ConnectionBuilder.hibSession();
        customer = (Customer) session.load(Customer.class, id);

        return customer;
    }

    public void Save(Customer customer) {
        Session session = null;
        Transaction tr = null;
        try {
            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.save(customer);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }

    }

    public List<Customer> search() {
        Session session = ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Customer");
        List<Customer> list = query.list();
        return list;
    }

    public void delete(String code1) {
        Session session = null;
        Transaction tr = null;
        try {
            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            Customer customer = (Customer) session.load(Customer.class, code1);
            if (customer != null) {
                Query query = session.createQuery("DELETE FROM Customer WHERE code=:c");
                query.setParameter("c", code1);
                int executeUpdate = query.executeUpdate();
                System.out.println(executeUpdate);
                tr.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
