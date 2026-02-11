package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.EXTENDED_BY;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class Warranty {
    @Id
    @GeneratedValue
    private Long warrentyId;
    private LocalDate warrentyStartDate;
    private LocalDate warrentyEndDate;

    public Long getWarrentyId() {
        return warrentyId;
    }

    public LocalDate getWarrentyStartDate() {
        return warrentyStartDate;
    }

    public void setWarrentyStartDate(LocalDate warrentyStartDate) {
        this.warrentyStartDate = warrentyStartDate;
    }

    public LocalDate getWarrentyEndDate() {
        return warrentyEndDate;
    }

    public void setWarrentyEndDate(LocalDate warrentyEndDate) {
        this.warrentyEndDate = warrentyEndDate;
    }

    @Relationship(type = "EXTENDED_BY", direction = Relationship.Direction.OUTGOING)
    private List<EXTENDED_BY> extendedBies;
}
