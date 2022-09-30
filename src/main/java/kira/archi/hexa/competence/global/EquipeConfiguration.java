package kira.archi.hexa.competence.global;

import com.fasterxml.jackson.databind.ObjectMapper;
import kira.archi.hexa.competence.global.adapters.EquipeOutputAdapter;
import kira.archi.hexa.competence.global.adapters.PersonneOutputAdapter;
import kira.archi.hexa.competence.global.hexa.equipes.logics.EquipeLogique;
import kira.archi.hexa.competence.global.hexa.equipes.ports.input.EquipeInputPort;
import kira.archi.hexa.competence.global.repositories.EquipeMongoRepository;
import kira.archi.hexa.competence.global.repositories.PersonneMongoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EquipeConfiguration {

    @Bean
    public EquipeOutputAdapter equipeOutputAdapter(EquipeMongoRepository equipeMongoRepository, ObjectMapper objectMapper) {
        return new EquipeOutputAdapter(equipeMongoRepository, objectMapper);
    }

    @Bean
    public PersonneOutputAdapter personneOutputAdapter(PersonneMongoRepository repository, ObjectMapper objectMapper) {
        return new PersonneOutputAdapter(repository, objectMapper);
    }

    @Bean
    public EquipeInputPort equipeInputPort(EquipeOutputAdapter equipeOutputAdapter, PersonneOutputAdapter personneOutputAdapter) {
        return new EquipeLogique(equipeOutputAdapter, personneOutputAdapter);
    }
}
