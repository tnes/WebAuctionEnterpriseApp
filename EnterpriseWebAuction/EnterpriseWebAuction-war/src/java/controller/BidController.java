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
@Named(value = "bid")
@SessionScoped
public class BidController implements Serializable {

    @EJB
    private no.hvl.dat250.Bid bid;

    /**
     * Creates a new instance of Bid
     */
    public BidController() {
    }
    
}
