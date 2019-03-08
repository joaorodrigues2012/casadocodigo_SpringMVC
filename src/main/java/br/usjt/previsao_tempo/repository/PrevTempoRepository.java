package br.usjt.previsao_tempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsao_tempo.model.PrevTempo;

public interface PrevTempoRepository extends JpaRepository<PrevTempo, Long> {

}
