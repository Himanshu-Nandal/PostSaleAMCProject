package com.postSale.amcProject.Model.nodes;

//import com.postSale.amcProject.Model.Relationships.PURCHASED;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Customer {
    @Id @GeneratedValue
    private String custId;
    private String custName;

    public String getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Relationship(type = "PURCHASED", direction = Relationship.Direction.OUTGOING)
    private List<Sale> purchases;

}
