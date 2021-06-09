package guru.springframework.sftpetclinic.bootstrap;

import guru.springframework.sftpetclinic.services.OwnerService;
import guru.springframework.sftpetclinic.services.VetService;
import guru.springframework.sftpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sftpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) {

    }
}