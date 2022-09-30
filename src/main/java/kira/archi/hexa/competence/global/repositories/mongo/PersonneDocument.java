package kira.archi.hexa.competence.global.repositories.mongo;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Personne;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personnes")
public class PersonneDocument extends Personne {

    @Id
    public String getId() {
        return super.getId();
    }
}
