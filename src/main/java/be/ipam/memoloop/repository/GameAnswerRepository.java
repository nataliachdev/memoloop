package be.ipam.memoloop.repository;

import be.ipam.memoloop.model.GameAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameAnswerRepository extends JpaRepository<GameAnswer, Long> {
}