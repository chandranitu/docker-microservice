package boot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationDao extends CrudRepository<RequestData,Integer> {

@Query(value = "SELECT * FROM contact WHERE contact_id=?1", nativeQuery = true)

  RequestData findResource(Integer i);

}
