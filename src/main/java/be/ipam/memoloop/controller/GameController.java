package be.ipam.memoloop.controller;

import be.ipam.memoloop.dto.DeckDto;
import be.ipam.memoloop.dto.GameAnswerDto;
import be.ipam.memoloop.dto.GameDto;
import be.ipam.memoloop.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    // create game
    @PostMapping
    public GameDto addGame(@RequestBody DeckDto deckDto) {
        return this.gameService.createGame(deckDto);
    }

    //get game
    @GetMapping("/{id}")
    public GameDto getGames(@PathVariable long id) {
        return this.gameService.getGame(id);
    }

    //get next answer
    @GetMapping("/{id}/next")
    public GameAnswerDto getNextAnswer(@PathVariable long id) {
        return this.gameService.getNextCard(id);
    }

    //answer a question
    @PostMapping("/answer")
    public GameAnswerDto answer(@RequestBody GameAnswerDto gameAnswerDto) {
        return this.gameService.answer(gameAnswerDto);
    }

}
