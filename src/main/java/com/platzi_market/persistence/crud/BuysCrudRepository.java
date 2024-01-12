package com.platzi_market.persistence.crud;

import com.platzi_market.persistence.entities.BuysEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BuysCrudRepository extends CrudRepository<BuysEntity, Integer> {
    Optional<List<BuysEntity>> findByIdCustomerOrderByNameAsc(String idCustomer);
}
