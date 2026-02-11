package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.Customers;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRepository extends Neo4jRepository<Customers, Long> {
}
