package kira.archi.hexa.competence.global.repositories.mongo;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Equipe;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "equipes")
public class EquipeDocument extends Equipe {
    public EquipeDocument(String id, String nom) {
        super(id, nom);
    }

    @Id
    public String getId() {
        return super.getId();
    }

    public String getNom() {
        return super.getNom();
    }
}
