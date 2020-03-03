package com.hivetech.springdataexample.repo;

import com.hivetech.springdataexample.model.ProductLine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductLineRepository extends CrudRepository<ProductLine, String> {
//    @Query("FROM productlines WHERE textDescription LIKE %?1%")
    List<ProductLine> findByTextDescription(String textDescription);
}
