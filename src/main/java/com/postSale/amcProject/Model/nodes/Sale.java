package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.OF_PRODUCT;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class Sale {
    @Getter
    @Id @GeneratedValue
    private Long saleId;
    @Getter @Setter
    private LocalDate saleDate;

    @Relationship(type = "OF_PRODUCT", direction = Relationship.Direction.OUTGOING)
    private List<OF_PRODUCT> productList;
}

