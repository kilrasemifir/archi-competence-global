package kira.archi.hexa.competence.global.hexa.equipes.ports.output;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Personne;

import java.util.List;

public interface PersonneOutputPort {

    /**
     * Sauvegarde d'une personne dans le but de pouvoir la réutiliser plus tard.
     * @param personne a sauvegarder
     * @return la personne sauvegarder
     */
    Personne sauvegarderPersonne(Personne personne);

    /**
     * Retourne la liste des managers de l'équipe
     * @param idEquipe
     * @return
     */
    List<Personne> trouverLesManagersDeLequipe(String idEquipe);
}
