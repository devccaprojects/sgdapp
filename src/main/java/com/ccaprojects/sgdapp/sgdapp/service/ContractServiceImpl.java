package com.ccaprojects.sgdapp.sgdapp.service;

import com.ccaprojects.sgdapp.sgdapp.model.Contract;
import com.ccaprojects.sgdapp.sgdapp.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by christianluque on 28/11/2018
 */
@Service
public class ContractServiceImpl implements ContractService {

    private ContractRepository contractRepository;

    @Autowired
    public void setContractRepository(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract getContract(Integer idContract) {
        return contractRepository.findById(idContract).get();
    }
}
