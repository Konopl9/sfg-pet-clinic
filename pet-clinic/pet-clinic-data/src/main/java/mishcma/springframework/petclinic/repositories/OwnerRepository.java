package mishcma.springframework.petclinic.repositories;

import mishcma.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {


}
