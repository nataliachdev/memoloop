package be.ipam.memoloop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "game_answer")
public class GameAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "card_id", nullable = false)
    private Card card;
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    private String answer;

    private boolean correctAnswer;
}
