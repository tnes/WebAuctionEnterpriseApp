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

/**
 *
 * @author TorkelNes
 */
@Named(value = "product")
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private no.hvl.dat250.Product product;

    /**
     * Creates a new instance of Product
     */
    public ProductController() {
    }
    
}
