package kira.archi.hexa.competence.global.adapters;

import com.fasterxml.jackson.databind.ObjectMapper;
import kira.archi.hexa.competence.global.hexa.equipes.entities.Personne;
import kira.archi.hexa.competence.global.hexa.equipes.ports.output.PersonneOutputPort;
import kira.archi.hexa.competence.global.repositories.mongo.PersonneDocument;
import kira.archi.hexa.competence.global.repositories.PersonneMongoRepository;

import java.util.List;

public class PersonneOutputAdapter implements PersonneOutputPort {

    private PersonneMongoRepository personneMongoRepository;
    private ObjectMapper objectMapper;

    public PersonneOutputAdapter(PersonneMongoRepository personneMongoRepository, ObjectMapper objectMapper) {
        this.personneMongoRepository = personneMongoRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public Personne sauvegarderPersonne(Personne personne) {
        PersonneDocument personneDocument = personneMongoRepository.save(objectMapper.convertValue(personne, PersonneDocument.class));
        return objectMapper.convertValue(personneDocument, Personne.class);
    }

    @Override
    public List<Personne> trouverLesManagersDeLequipe(String idEquipe) {
        return null;
    }
}
