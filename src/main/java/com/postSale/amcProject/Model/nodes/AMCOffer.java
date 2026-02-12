package com.postSale.amcProject.Model.nodes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Node
public class AMCOffer {
    @Id @GeneratedValue
    private String offerId;
    private String offerType; // Silver / Gold
    private Integer offerDurationMonths;
    private Double offerPrice;
    private String offerTerms;

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public void setOfferDurationMonths(Integer offerDurationMonths) {
        this.offerDurationMonths = offerDurationMonths;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public void setOfferTerms(String offerTerms) {
        this.offerTerms = offerTerms;
    }
}
