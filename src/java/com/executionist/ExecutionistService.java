/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.executionist;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jmx.HibernateService;

/**
 *
 * @author Bhushan
 */
@WebService(serviceName = "ExecutionistService")
public class ExecutionistService {

    Session session = null;
    
    public ExecutionistService() {
        SessionFactory fact = new Configuration().configure().buildSessionFactory();
        session = fact.openSession();
        
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getEmployeeByEmail")
    public Employee getEmployeeByEmail(@WebParam(name = "mailId") String mailId) {
        List<Employee> empList = null;
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Employee where m_emailId = '" + mailId + "'");
            empList = (List<Employee>) q.list();
            //tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empList.get(0);
    }

    @WebMethod(operationName = "checkLogin")
    public Employee checkLogin(@WebParam(name = "mailId") String mailId, @WebParam(name = "password") String password) {
        List<Logininfo> linfoList = null;
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Logininfo where m_emailId ='"+ mailId +"'");
            linfoList = (List<Logininfo>) q.list();
            tx.commit();
            if (linfoList.get(0).getMPassword().equals(password))
            {
                return getEmployeeByEmail(mailId);
            }
            else
            {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    
    @WebMethod(operationName = "addCompany")
    public boolean addCompany(@WebParam(name = "comName") String comName, @WebParam(name = "comTagLine") String comTagLine, @WebParam(name = "comLogo") byte[] comLogo)
    {
        Company cm = new Company(comName, comTagLine, comLogo);
        if(cm != null)
            return true;
        return false;
    }
}
