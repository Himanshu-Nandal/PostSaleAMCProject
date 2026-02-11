package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.AMCOffer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@Getter @Setter
public class BASED_ON {

    @TargetNode
    @Getter @Setter
    private AMCOffer amcOffer;

}
