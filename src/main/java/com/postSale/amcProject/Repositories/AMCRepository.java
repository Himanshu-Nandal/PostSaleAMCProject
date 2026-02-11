package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.AMC;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AMCRepository extends Neo4jRepository<AMC, Long> {
}
