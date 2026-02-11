package com.postSale.amcProject.Model.nodes;

import com.postSale.amcProject.Model.Relationships.PURCHASED;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Customers {
    @Id
    @GeneratedValue
    private Long custid;
    private String custName;

    public Long getCustid() {
        return custid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Relationship(type = "PURCHASED", direction = Relationship.Direction.OUTGOING)
    private List<PURCHASED> purchases;

}
