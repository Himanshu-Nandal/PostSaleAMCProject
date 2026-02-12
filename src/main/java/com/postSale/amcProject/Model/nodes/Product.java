package com.postSale.amcProject.Model.nodes;

//import com.postSale.amcProject.Model.Relationships.HAS_WARRANTY;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Product {
    @Id
    @GeneratedValue
    private String productId;
    private String productName;
    @GeneratedValue
    private String productSerialNumber;

    public String getProductId() {
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

    @Relationship(type = "OF_PRODUCT", direction = Relationship.Direction.OUTGOING)
    private List<Warranty> warrantyList;
}

