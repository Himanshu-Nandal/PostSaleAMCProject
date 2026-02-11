package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.Sales;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SaleRepository extends Neo4jRepository<Sales, Long> {
}
