package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.Sales;
import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
public class PURCHASED {
    @Id @GeneratedValue
    @Property
    private Long purchaseId;

    @TargetNode
    private Sales sale;

    public Sales getSale() {
        return sale;
    }

    public void setSale(Sales sale) {
        this.sale = sale;
    }
}
