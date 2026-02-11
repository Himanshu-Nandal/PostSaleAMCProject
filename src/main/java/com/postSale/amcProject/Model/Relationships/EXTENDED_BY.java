package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.AMC;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@Getter @Setter
public class EXTENDED_BY {

    @TargetNode
    @Getter @Setter
    private AMC amc;

}
