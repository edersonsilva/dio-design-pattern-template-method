package dio.diodesignpatterntemplate.model;

import dio.diodesignpatterntemplate.Game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("futebol")
public class Futebol extends Game {
    @Override
    protected void endPlay() {
        System.out.println("O jogo de futebol terminou !");
    }

    @Override
    protected void initialize() {
        System.out.println("Football Game iniciFutebolado! Inicie a jogar.");
    }

    @Override
    protected void startPlay() {
        System.out.println("O jogo de futebol começou. Aproveite o jogo!");
    }
}