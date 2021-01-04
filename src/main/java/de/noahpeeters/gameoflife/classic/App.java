package de.noahpeeters.gameoflife.classic;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        BoardController boardController = new BoardController();

        boardController.print();

        for (int i = 0; i < 10; i++) {
            boardController.step();
            boardController.print();
        }
    }
}
