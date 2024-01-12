package com.platzi_market.domain.service;

import com.platzi_market.domain.BuysModel;
import com.platzi_market.domain.repository.BuysModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuysService {

    @Autowired
    BuysModelRepository buysModelRepository;

    public List<BuysModel> getAll() {
        return buysModelRepository.getAll();
    }

    public Optional<List<BuysModel>> getByCustomer(String idCustomer) {
        return buysModelRepository.getByCustomer(idCustomer);
    }

    public BuysModel save(BuysModel buysModel) {
        return buysModelRepository.save(buysModel);
    }

}
