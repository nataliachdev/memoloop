package be.ipam.memoloop.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link be.ipam.memoloop.model.GameAnswer}
 */
@Value
public class GameAnswerDto implements Serializable {
    Long id;
    CardDto card;
    String answer;
    boolean correctAnswer;
}