package org.generation.lojaGames.repository;

import java.util.List;
import org.generation.lojaGames.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {
	public List<Games> findAllByNomeContainingIgnoreCase(String nome);
	public List<Games> findAllByLancamento(int lancamento);
}
