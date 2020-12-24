package com.sankar.tech.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sankar.tech.pro.model.Item;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long>{
//@RepositoryRestResource since this creates a HATEOAS service with Spring JPA.
}
