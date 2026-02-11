package com.postSale.amcProject.Model.nodes;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class AMCOffer {
    @Id
    @GeneratedValue
    private Long offerId;
    private String offerType; // Silver / Gold
    private Integer offerDurationMonths;
    private Double offerPrice;
    private String offerTerms;

    public Long getOfferId() {
        return offerId;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Integer getOfferDurationMonths() {
        return offerDurationMonths;
    }

    public void setOfferDurationMonths(Integer offerDurationMonths) {
        this.offerDurationMonths = offerDurationMonths;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getOfferTerms() {
        return offerTerms;
    }

    public void setOfferTerms(String offerTerms) {
        this.offerTerms = offerTerms;
    }
}
