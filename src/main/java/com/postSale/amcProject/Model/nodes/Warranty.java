package com.postSale.amcProject.Model.nodes;

//import com.postSale.amcProject.Model.Relationships.EXTENDED_BY;
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
    @Id @GeneratedValue
    private String warrantyId;
    private LocalDate warrantyStartDate;
    private LocalDate warrantyEndDate;

    public String getWarrantyId() {
        return warrantyId;
    }

    public LocalDate getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(LocalDate warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public LocalDate getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(LocalDate warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    @Relationship(type = "EXTENDED_BY", direction = Relationship.Direction.OUTGOING)
    private List<AMC> amcList;
}
