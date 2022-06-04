package mishcma.springframework.petclinic.services;

import mishcma.springframework.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
