package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductRepository extends Neo4jRepository<Product, Long> {
}
