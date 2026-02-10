package com.postSale.amcProject.Model.nodes;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class AMCOffer {
    @Id
    @GeneratedValue
    private Long id;
    private String type; // Silver / Gold
    private Integer durationMonths;
    private Double price;
    private String terms;
}
