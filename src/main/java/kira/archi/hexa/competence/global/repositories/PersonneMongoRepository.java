package kira.archi.hexa.competence.global.repositories;

import kira.archi.hexa.competence.global.repositories.mongo.PersonneDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonneMongoRepository extends MongoRepository<PersonneDocument, String> {
}
