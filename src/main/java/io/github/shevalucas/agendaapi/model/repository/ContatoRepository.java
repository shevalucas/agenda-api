package io.github.shevalucas.agendaapi.model.repository;

import io.github.shevalucas.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository <Contato, Integer> {

}
