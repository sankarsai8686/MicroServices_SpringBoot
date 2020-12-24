package com.sankar.tech.pro;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sankar.tech.pro.dto.Item;

import org.springframework.hateoas.CollectionModel;
@FeignClient("item-catalog-service")
public interface ItemClient {
	
	@GetMapping("/items")
	CollectionModel<Item> readItems();

}
