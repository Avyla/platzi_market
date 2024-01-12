package com.platzi_market.web.controller;

import com.platzi_market.domain.BuysModel;
import com.platzi_market.domain.service.BuysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buys")
public class BuysController {

    @Autowired
    BuysService buysService;

    @GetMapping("/all")
    public ResponseEntity<List<BuysModel>> getAll() {
        return new ResponseEntity<>(buysService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/cutomer/{id}")
    public ResponseEntity<List<BuysModel>> getByCustomer(@PathVariable("id") String idCustomer) {
        return buysService.getByCustomer(idCustomer)
                .map(list -> new ResponseEntity<>(list, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    public ResponseEntity<BuysModel> save(BuysModel buysModel) {
        return new ResponseEntity<>(buysService.save(buysModel),HttpStatus.CREATED);
    }

}
