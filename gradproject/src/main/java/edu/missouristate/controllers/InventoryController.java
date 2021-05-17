package edu.missouristate.controllers;

import java.util.List;

import edu.missouristate.domain.InventoryEntity;
import edu.missouristate.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;



	@GetMapping("/inventory/{sku}")
	public ResponseEntity<InventoryEntity> getInventoryBySku(@PathVariable Integer sku) {
		InventoryEntity inventoryEntity=null;
		try {
			inventoryEntity=inventoryService.getInventoryBySku(sku);
		}catch (Exception e){
			return new ResponseEntity<InventoryEntity>(inventoryEntity, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(inventoryEntity!=null) {
			return new ResponseEntity<InventoryEntity>(inventoryEntity, HttpStatus.OK);
		} else {
			return new ResponseEntity<InventoryEntity>(inventoryEntity, HttpStatus.NO_CONTENT);
		}

	}
	@GetMapping("/test")
	public String test() {

		return "test";
	}
}
