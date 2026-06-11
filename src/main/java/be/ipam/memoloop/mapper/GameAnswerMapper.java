package be.ipam.memoloop.mapper;

import be.ipam.memoloop.dto.GameAnswerDto;
import be.ipam.memoloop.model.GameAnswer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameAnswerMapper {
    GameAnswer toEntity(GameAnswerDto gameAnswerDto);

    GameAnswerDto toDto(GameAnswer gameAnswer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    GameAnswer partialUpdate(GameAnswerDto gameAnswerDto, @MappingTarget GameAnswer gameAnswer);
}