package com.postSale.amcProject.Repositories;

import com.postSale.amcProject.Model.nodes.Warranty;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarrantyRepository extends Neo4jRepository<Warranty, Long> {

    @Query("""
    MATCH (w:Warranty)
    WHERE w.endDate <= date() + duration('P30D')
    RETURN w
    """)
    List<Warranty> findWarrantiesExpiringSoon();
}

