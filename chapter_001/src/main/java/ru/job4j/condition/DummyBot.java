package ru.job4j.condition;

/**
 * Dummy bot
 * @author Pavel Vladi (mailto:w.h.81@mail.ru)
 * @version $id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Answer questions.
     * @param question Question from client.
     * @return Answer.
     */
    public String answer(String question) {
        String rsl = "It's baffling to me. Ask another question.";
        if ("Hello, Bot.".equals(question)) {
            rsl = "Hello, wiseacre.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you soon.";
        }
        return rsl;
    }

}
