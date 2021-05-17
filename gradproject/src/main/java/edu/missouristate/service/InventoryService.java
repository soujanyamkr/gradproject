/**
 * 
 */
package edu.missouristate.service;

import edu.missouristate.domain.InventoryEntity;
import edu.missouristate.dao.InventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Soujanya
 *
 */
@Service
public class InventoryService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private InventoryRepository inventoryRepository;


	public InventoryEntity getInventoryBySku(Integer sku) {

		return inventoryRepository.getInventoryBySku(sku);

	}
}
