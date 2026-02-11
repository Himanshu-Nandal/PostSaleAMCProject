package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.AMCOffer;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AMCOfferRepository extends Neo4jRepository<AMCOffer, Long> {
}