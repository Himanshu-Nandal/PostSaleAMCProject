package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.EXTENDED_BY;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class Warranty {
    @Getter
    @Id @GeneratedValue
    private Long warrantyId;
    @Getter
    @Setter
    private LocalDate warrantyStartDate;
    @Getter
    @Setter
    private LocalDate warrantyEndDate;

    @Relationship(type = "EXTENDED_BY", direction = Relationship.Direction.OUTGOING)
    private List<EXTENDED_BY> extendedByList;
}
