/**
 * 
 */
package edu.missouristate.dao;

import edu.missouristate.domain.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Soujanya
 *
 */
public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

	@Query(value = "SELECT * from inventory where SKU=?1", nativeQuery = true)
	InventoryEntity getInventoryBySku(Integer sku);

}
