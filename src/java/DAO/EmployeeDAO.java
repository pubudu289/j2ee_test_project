/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionBuilder;
import java.util.List;
import modal.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class EmployeeDAO {

    public List<Employee> search() {
        Session session = ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Employee");
        List<Employee> list = query.list();
        return list;
    }

    public Employee SearchEMPID(int id) {
        Employee employee = null;
        Session session = ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.eq("id", id));
        if(criteria.uniqueResult() != null){
        
        employee = (Employee) criteria.uniqueResult();
        }
        return employee;
    }

//    public List<Employee> Search(){
//    List<Employee>employees = null;
//        Session session = ConnectionBuilder.hibSession();
//        Criteria criteria = session.createCriteria(Employee.class);
//        criteria.add(Restrictions.eq("firstname", "pubudu"));
//        List<Employee> list = criteria.list();
//        for (Employee employee : list) {
//            System.out.println(employee.toString());
//        }
//    return employees;
//    }
    public Employee loadEmployee(String id1) {
        Employee employee = null;
        Session session = ConnectionBuilder.hibSession();
        employee = (Employee) session.load(Employee.class, id1);

        return employee;
    }
}
