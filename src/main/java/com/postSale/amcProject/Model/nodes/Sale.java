package com.postSale.amcProject.Model.nodes;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDate;

@Node
public class Sale {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate saleDate;
}

