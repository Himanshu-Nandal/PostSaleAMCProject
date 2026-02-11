package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.PURCHASED;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Customer {
    @Getter
    @Id @GeneratedValue
    private Long custId;
    @Getter
    @Setter
    private String custName;

    @Relationship(type = "PURCHASED", direction = Relationship.Direction.OUTGOING)
    private List<PURCHASED> purchases;

}
