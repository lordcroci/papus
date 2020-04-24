package com.lordcroci.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lordcroci.entity.Customer;
import com.lordcroci.restService.Response.EthEurResponse;
import com.lordcroci.restService.RestClientImpl;
import com.lordcroci.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EthereumController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    RestClientImpl restClient;

    @GetMapping("/showEth")
    public String listEth(Model model) {
        restClient.getEthereumPrice();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);

        EthEurResponse ethEurResponse = new EthEurResponse();

        try {
            ethEurResponse = objectMapper.readValue(restClient.getEthereumPrice(), EthEurResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("ethPrice", ethEurResponse.getPrice());
        return "show-eth-price";
    }
}