package ao.my_applications.my_app.controller;

import ao.my_applications.my_app.model.Candidatura;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/candidaturas")
public class CandidaturaController {

    private final List<Candidatura> candidaturas = new ArrayList<>();

    private Long id = 1L;

    @GetMapping
    public List<Candidatura> listarCandidaturas() {
        return candidaturas;
    }

	@PostMapping
	public ResponseEntity<Candidatura> criarCandidatura(
        @RequestBody Candidatura candidatura) {

    candidatura.setId(id);
    id++;

    candidaturas.add(candidatura);

    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(candidatura);
	}
}