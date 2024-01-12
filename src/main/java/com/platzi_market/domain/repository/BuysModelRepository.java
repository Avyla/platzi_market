package com.platzi_market.domain.repository;

import com.platzi_market.domain.BuysModel;

import java.util.List;
import java.util.Optional;

public interface BuysModelRepository {

    List<BuysModel> getAll();
    Optional<List<BuysModel>> getByCustomer(String idCustomer);
    BuysModel save(BuysModel buysModel);

}
