package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.HAS_WARRANTY;
import com.postSale.amcProject.Model.Relationships.OF_PRODUCT;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Product {
    @Id
    @GeneratedValue
    private Long productId;
    private String productName;
    private String productSerialNumber;

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    @Relationship(type = "OF_PRODUCT", direction = Relationship.Direction.OUTGOING)
    private List<HAS_WARRANTY> hasWarranties;
}

