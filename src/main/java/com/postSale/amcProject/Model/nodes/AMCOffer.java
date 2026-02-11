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
    private Long offerId;
    @Setter
    private String offerType; // Silver / Gold
    @Setter
    private Integer offerDurationMonths;
    @Setter
    private Double offerPrice;
    @Setter
    private String offerTerms;


}
