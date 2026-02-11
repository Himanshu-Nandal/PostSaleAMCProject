package com.postSale.amcProject.Model.Relationships;

import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Model.nodes.Warranty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class HAS_WARRANTY {
//    @Id @GeneratedValue
//    private Long hasWarrantyId;

    @Getter
    @Setter
    @TargetNode
    private Warranty warranty;

}