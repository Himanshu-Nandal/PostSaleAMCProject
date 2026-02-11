package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.Product;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class OF_PRODUCT {
//    @Id @GeneratedValue
//    private Long ofproductId;

    @TargetNode
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
