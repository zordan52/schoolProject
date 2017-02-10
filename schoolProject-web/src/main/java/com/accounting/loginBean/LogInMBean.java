/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accounting.loginBean;

import com.accounting.commonutil.HelperUtil;
import com.accounting.ejb.exceptions.ClientException;
import com.accounting.entities.user.User;
import com.accounting.session.loginsession.LogInSessionBean;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author faisal
 */
@ManagedBean
@SessionScoped
public class LogInMBean {
    
    @EJB
    LogInSessionBean logInSessionBean;
    
    
    private String userName;
    private String password;
    
    public void logInMbean(){
        
    }
    public String login()throws ClientException {
        if(userName.trim().isEmpty() || password.trim().isEmpty()){
            HelperUtil.showWarnMessage("Username and password is required");
            return null;
            
        }
        User user = logInSessionBean.findUserByNama(userName.trim());
        if(user !=null){
            if(HelperUtil.md5(password).equals(user.getPassword())){
                return "dashboard.xhtml?faces-redirect=true";
            }
            else{
                HelperUtil.showErrorMessage("Username or password not valid!");
                return null;
            }
            
        }
        else {
            HelperUtil.showErrorMessage("Username not exist!");
            return null;
        }
        
        
    }

    public LogInSessionBean getLogInSessionBean() {
        return logInSessionBean;
    }

    public void setLogInSessionBean(LogInSessionBean logInSessionBean) {
        this.logInSessionBean = logInSessionBean;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
