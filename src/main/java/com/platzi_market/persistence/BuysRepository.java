package com.platzi_market.persistence;

import com.platzi_market.domain.BuysModel;
import com.platzi_market.domain.repository.BuysModelRepository;
import com.platzi_market.persistence.crud.BuysCrudRepository;
import com.platzi_market.persistence.entities.BuysEntity;
import com.platzi_market.persistence.mapper.BuysMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BuysRepository implements BuysModelRepository {

    @Autowired
    private BuysMapper buysMapper;

    @Autowired
    private BuysCrudRepository buysCrudRepository;


    @Override
    public List<BuysModel> getAll() {
        return buysMapper.toBuysModels((List<BuysEntity>) buysCrudRepository.findAll());
    }

    @Override
    public Optional<List<BuysModel>> getByCustomer(String idCustomer) {
        return buysCrudRepository.findByIdCustomerOrderByNameAsc(idCustomer)
                .map(buys -> buysMapper.toBuysModels(buys));
    }

    @Override
    public BuysModel save(BuysModel buysModel) {
        BuysEntity buysEntity = buysMapper.toBuysEntity(buysModel);
        buysEntity.getBuysProductEntities().forEach(product-> product.setBuys(buysEntity));
        return buysMapper.toBuysModel(buysCrudRepository.save(buysEntity));
    }
}
