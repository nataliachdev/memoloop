package be.ipam.memoloop.mapper;

import be.ipam.memoloop.dto.GameDto;
import be.ipam.memoloop.model.Game;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper {
    Game toEntity(GameDto gameDto);

    @AfterMapping
    default void linkAnswers(@MappingTarget Game game) {
        game.getAnswers().forEach(answer -> answer.setGame(game));
    }

    GameDto toDto(Game game);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Game partialUpdate(GameDto gameDto, @MappingTarget Game game);
}