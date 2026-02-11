package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.Sale;
import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
public class PURCHASED {
//    @Id @GeneratedValue
//    @Property
//    private Long purchaseId;

    @TargetNode
    private Sale sale;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
