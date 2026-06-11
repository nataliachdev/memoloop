package be.ipam.memoloop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link be.ipam.memoloop.model.Game}
 */
@Value
public class GameDto implements Serializable {
    Long id;
    DeckDto deck;
    List<GameAnswerDto> answers;
}