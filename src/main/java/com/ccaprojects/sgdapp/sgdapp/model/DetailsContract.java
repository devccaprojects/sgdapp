package com.ccaprojects.sgdapp.sgdapp.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by christianluque on 28/11/2018
 */
@Entity
public class DetailsContract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDetailsContract;
    private String label;
    private String field;

    @ManyToOne
    @JoinColumn(name = "id_contract")
    private Contract contract;

    public DetailsContract() {
    }

    public DetailsContract(String label, String field, Contract contract) {
        this.label = label;
        this.field = field;
        this.contract = contract;
    }

    public Integer getIdDetailsContract() {
        return idDetailsContract;
    }

    public void setIdDetailsContract(Integer idDetailsContract) {
        this.idDetailsContract = idDetailsContract;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "DetailsContract{" +
                "idDetailsContract=" + idDetailsContract +
                ", label='" + label + '\'' +
                ", field='" + field + '\'' +
                ", contract=" + contract +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailsContract that = (DetailsContract) o;
        return Objects.equals(idDetailsContract, that.idDetailsContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetailsContract);
    }
}
