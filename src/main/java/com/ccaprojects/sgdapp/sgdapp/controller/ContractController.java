package com.ccaprojects.sgdapp.sgdapp.controller;

import com.ccaprojects.sgdapp.sgdapp.model.Contract;
import com.ccaprojects.sgdapp.sgdapp.service.ContractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christianluque on 28/11/2018
 */
@RestController
public class ContractController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ContractService contractService;

    @Autowired
    public void setContractService(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contract/{idContract}")
    public Contract getContract(@PathVariable Integer idContract) {

        Contract contract = contractService.getContract(idContract);

        return  contract;
    }

}
