
package com.george.dev.sftpetclinic.bootstrap;

import com.george.dev.data.model.Owner;
import com.george.dev.data.model.Vet;
import com.george.dev.data.services.OwnerService;
import com.george.dev.data.services.VetService;
import com.george.dev.data.services.map.OwnerServiceMap;
import com.george.dev.data.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by George on 19/11/2018

*/

@Component
public class BootstrapData implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public BootstrapData() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("George");
        owner1.setLastName("Okez");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tobi");
        owner2.setLastName("Abram");

        ownerService.save(owner2);

        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jack");
        vet2.setLastName("Wood");

        vetService.save(vet2);

        System.out.println("Loading Vets....");


    }
}

