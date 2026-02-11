package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.BASED_ON;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class AMC {
    @Id
    @GeneratedValue
    private Long amcid;

    private LocalDate amcStartDate;
    private LocalDate amcEndDate;

    public Long getAmcid() {
        return amcid;
    }

    public LocalDate getAmcStartDate() {
        return amcStartDate;
    }

    public void setAmcStartDate(LocalDate amcStartDate) {
        this.amcStartDate = amcStartDate;
    }

    public LocalDate getAmcEndDate() {
        return amcEndDate;
    }

    public void setAmcEndDate(LocalDate amcEndDate) {
        this.amcEndDate = amcEndDate;
    }

    @Relationship(type = "BASED_ON", direction = Relationship.Direction.OUTGOING)
    private List<BASED_ON> basedOns;

}
