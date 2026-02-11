package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.BASED_ON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class AMC {
    @Getter
    @Id @GeneratedValue
    private Long amcId;

    @Getter @Setter
    private LocalDate amcStartDate;
    @Getter @Setter
    private LocalDate amcEndDate;

    @Relationship(type = "BASED_ON", direction = Relationship.Direction.OUTGOING)
    private List<BASED_ON> basedOns;

}
