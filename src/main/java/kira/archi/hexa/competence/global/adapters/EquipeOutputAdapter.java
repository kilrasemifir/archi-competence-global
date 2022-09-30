package kira.archi.hexa.competence.global.adapters;

import com.fasterxml.jackson.databind.ObjectMapper;
import kira.archi.hexa.competence.global.repositories.EquipeMongoRepository;
import kira.archi.hexa.competence.global.hexa.equipes.entities.Equipe;
import kira.archi.hexa.competence.global.hexa.equipes.ports.output.EquipeOutputPort;
import kira.archi.hexa.competence.global.repositories.mongo.EquipeDocument;

import java.util.List;


public class EquipeOutputAdapter implements EquipeOutputPort {
    private final EquipeMongoRepository equipeMongoRepository;
    private final ObjectMapper objectMapper;

    public EquipeOutputAdapter(EquipeMongoRepository equipeMongoRepository, ObjectMapper objectMapper) {
        this.equipeMongoRepository = equipeMongoRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<Equipe> recupererEquipes() {
        List<EquipeDocument> equipes = equipeMongoRepository.findAll();
        return equipes.stream().map(equipeDocument -> objectMapper.convertValue(equipeDocument, Equipe.class)).toList();
    }

    @Override
    public Equipe recupererEquipe(String id) {
        EquipeDocument equipeDocument = equipeMongoRepository.findById(id).orElseThrow();
        return objectMapper.convertValue(equipeDocument, Equipe.class);
    }

    @Override
    public Equipe sauvegarderEquipe(Equipe equipe) {
        EquipeDocument equipeDocument = objectMapper.convertValue(equipe, EquipeDocument.class);
        return equipeDocument;
    }
}
