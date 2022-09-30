package kira.archi.hexa.competence.global.api;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Equipe;
import kira.archi.hexa.competence.global.hexa.equipes.ports.input.EquipeInputPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {

    private EquipeInputPort equipeInputPort;

    public EquipeController(EquipeInputPort equipeInputPort) {
        this.equipeInputPort = equipeInputPort;
    }

    @GetMapping("")
    public List<Equipe> getEquipes() {
        return equipeInputPort.recupererEquipes();
    }
}
