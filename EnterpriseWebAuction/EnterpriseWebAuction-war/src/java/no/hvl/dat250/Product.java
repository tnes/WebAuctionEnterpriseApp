/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat250;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author S1ndr3
 */
@Stateless
@LocalBean
@Entity
public class Product implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    private String name;
    private String picture; // May change
    private String features;
    
    private Double rating;
    
    private Boolean published;
    
    private Long remainingTime; // currentTimeMillis
     
    @ManyToOne
    private ProductCatalog catalog;
        
    @OneToOne
    private Bid currentBid;
    
      /**
     * Creates a new instance of Product
     */
    public Product() {
    }

    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public long getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(long remainingTime) {
        this.remainingTime = remainingTime;
    }
    
     public Bid getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(Bid currentBid) {
        this.currentBid = currentBid;
    }
    
     public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public void setRemainingTime(Long remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void setCatalog(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public Boolean getPublished() {
        return published;
    }

    public ProductCatalog getCatalog() {
        return catalog;
    }
}
