/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.session.loginsession;

import com.accounting.entities.user.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author faisal
 */
@Stateless
@LocalBean
public class LogInSessionBean {
    @PersistenceContext 
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

  
    public User findUserByNama(String userName ){
        try{
              Query query = em.createNamedQuery("User.findByUsername");
          query.setParameter("username", userName);
        return (User) query.getSingleResult();
        }
        catch (Exception e){
            return null;
                    
        }
            
    }
    
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
