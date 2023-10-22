/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Pubudu Kasun
 */
public class ConnectionBuilder {

    private static Session session;

    public static Session hibSession() {
        try {
            session = Connection.NewHibernateUtil.getSessionFactory().getCurrentSession();
        } catch (HibernateException ex) {
            session = Connection.NewHibernateUtil.getSessionFactory().openSession();
        }
        return session;
    }
}
