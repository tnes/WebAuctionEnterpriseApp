/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import no.hvl.dat250.User;

/**
 *
 * @author TorkelNes
 */
@Named(value = "user")
@SessionScoped
public class UserController implements Serializable {

    @EJB
    private User user;
    private String username;
    private String email;
    private String phonenumber;
    private String password;

    /**
     * Creates a new instance of UserController
     */
    public UserController() {
    
    
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        String result;
        boolean isValid;
        
        this.username = request.getParameter("username");
        this.password = request.getParameter("password");
        
        isValid = this.user.isValidLogin(this.username, this.password);
        
        if(isValid) {
            this.user.fetchUser(this.username);
            result = "/products";
        } else {
            //Bruker er ugyldig
            result = "login";
        }
       return null; 
    }
    
    public String register() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        String result;
        
        this.username = request.getParameter("username");
        this.email = request.getParameter("email");
        this.phonenumber = request.getParameter("phonenumber");
        this.password = request.getParameter("password");
        
        
        
        return "";
    }
    
}
