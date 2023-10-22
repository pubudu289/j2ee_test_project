/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionBuilder;
import Util.MD5Utils;
import modal.Employee;
import modal.Login;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class SystemUserDAO {

    public void save(Login login) {
        Session session = null;
        Transaction tr = null;
        try {
            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.save(login);
            // System.out.println(login);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }

    }

    public void saveUser(Employee employee, String uname, String pw, String stat) {

        Session session = null;
        Transaction tr = null;
        try {
            Login login = new Login();
            login.setUsername(uname);

            String passwordEncript = MD5Utils.passwordEncript(pw);

            login.setPassword(passwordEncript);
            login.setIsactive(Boolean.TRUE);

            login.setEmployee(employee);

            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.saveOrUpdate(login);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public Login login(String user, String pass) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria cr = session.createCriteria(Login.class);
        cr.add(Restrictions.eq("username", user));
        String encryptPassword = MD5Utils.passwordEncript(pass);
        cr.add(Restrictions.eq("password", encryptPassword));

        
        Login login = (Login) cr.uniqueResult();
        return login;
    }

}
