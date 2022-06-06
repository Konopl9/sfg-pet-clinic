package mishcma.springframework.petclinic.bootstrap;

import mishcma.springframework.petclinic.model.Owner;
import mishcma.springframework.petclinic.model.Vet;
import mishcma.springframework.petclinic.services.OwnerService;
import mishcma.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael1");
        owner2.setLastName("Weston1");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet = new Vet();
        vet.setFirstName("Sam");
        vet.setLastName("Fax");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam1");
        vet1.setLastName("Fax1");

        vetService.save(vet1);

        System.out.println("Loaded Vets...");

    }
}
