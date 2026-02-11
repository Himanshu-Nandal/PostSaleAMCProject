package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.AMC;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class EXTENDED_BY {

    @TargetNode
    private AMC amc;

    public AMC getAmc() {
        return amc;
    }

    public void setAmc(AMC amc) {
        this.amc = amc;
    }
}
