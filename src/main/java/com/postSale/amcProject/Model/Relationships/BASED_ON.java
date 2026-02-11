package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.AMCOffer;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class BASED_ON {

    @TargetNode
    private AMCOffer amcOffer;

    public AMCOffer getAmcOffer() {
        return amcOffer;
    }

    public void setAmcOffer(AMCOffer amcOffer) {
        this.amcOffer = amcOffer;
    }
}
