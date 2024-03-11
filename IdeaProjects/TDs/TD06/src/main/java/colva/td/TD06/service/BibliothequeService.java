package colva.td.TD06.service;

import colva.td.TD06.repository.AuteurRepository;
import colva.td.TD06.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliothequeService {

    public static AuteurRepository auteurRepo;
    public static LivreRepository livreRepo;

    @Autowired
    public BibliothequeService(AuteurRepository auteurRepository, LivreRepository livreRepository) {
        auteurRepo = auteurRepository;
        livreRepo = livreRepository;
    }

    public static void testApp() {
        System.out.println(auteurRepo.findAll());
        System.out.println(livreRepo.findAll());
    }
}
