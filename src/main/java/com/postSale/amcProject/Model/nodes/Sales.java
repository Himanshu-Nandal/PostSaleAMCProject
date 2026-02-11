package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.OF_PRODUCT;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class Sales {
    @Id
    @GeneratedValue
    private Long saleId;
    private LocalDate saleDate;

    public Long getSaleId() {
        return saleId;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    @Relationship(type = "OF_PRODUCT", direction = Relationship.Direction.OUTGOING)
    private List<OF_PRODUCT> ofProducts;
}

