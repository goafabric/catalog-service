package org.goafabric.catalogservice.service.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//@Entity @Table(name = "chargeitem")
@Table(name = "chargeitem", schema = "catalog")
public class ChargeItemEo {
    //@org.springframework.data.annotation.Id @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    public String id;

    public String code;
    public String display;
    public Double price;
}