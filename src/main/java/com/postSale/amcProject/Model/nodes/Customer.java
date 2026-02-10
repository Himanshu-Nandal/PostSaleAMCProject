package com.postSale.amcProject.Model.nodes;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
