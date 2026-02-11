package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.HAS_WARRANTY;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Product {
    @Getter
    @Id
    @GeneratedValue
    private Long productId;
    @Setter
    @Getter
    private String productName;
    @Setter
    @Getter
    private String productSerialNumber;

    @Relationship(type = "OF_PRODUCT", direction = Relationship.Direction.OUTGOING)
    private List<HAS_WARRANTY> warrantyList;
}

