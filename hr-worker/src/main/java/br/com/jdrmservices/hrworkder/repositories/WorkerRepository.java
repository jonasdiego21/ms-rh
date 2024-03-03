package br.com.jdrmservices.hrworkder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jdrmservices.hrworkder.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
