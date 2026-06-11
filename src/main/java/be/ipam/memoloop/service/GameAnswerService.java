package be.ipam.memoloop.service;

import be.ipam.memoloop.model.Card;
import be.ipam.memoloop.model.Game;
import be.ipam.memoloop.model.GameAnswer;
import be.ipam.memoloop.repository.GameAnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class GameAnswerService {
    private GameAnswerRepository gameAnswerRepository;

    //constructor
    public GameAnswerService(GameAnswerRepository gameAnswerRepository) {
        this.gameAnswerRepository = gameAnswerRepository;
    }

    //create game answer
    public GameAnswer createGameAnswer(Game game, Card card){
        GameAnswer gameAnswer = new GameAnswer();
        gameAnswer.setCard(card);
        gameAnswer.setGame(game);
        return gameAnswerRepository.save(gameAnswer);
    }

}
