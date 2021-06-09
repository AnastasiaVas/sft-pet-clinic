package guru.springframework.sftpetclinic.bootstrap;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.services.OwnerService;
import guru.springframework.sftpetclinic.services.VetService;
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
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setFirstName("Nastya");
        owner1.setLastName("Vasilyeva");

        ownerService.save(owner1);
    }
}