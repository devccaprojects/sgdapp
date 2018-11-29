package com.ccaprojects.sgdapp.sgdapp.bootstrap;

import com.ccaprojects.sgdapp.sgdapp.model.Contract;
import com.ccaprojects.sgdapp.sgdapp.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by christianluque on 28/11/2018
 */
@Component
public class ContractLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ContractRepository contractRepository;

    @Autowired
    public void setContractRepository(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Contract contract = new Contract();
        contract.setIdContract(1);
        contract.setCode("11");
        contract.setFileName("File");
        contractRepository.save(contract);
    }
}
