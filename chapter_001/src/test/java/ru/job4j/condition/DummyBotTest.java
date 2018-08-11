package ru.job4j.condition;

/**
 * Created by whp on 12.08.2018.
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Vladi (mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Hello, Bot."),
                is("Hello, wiseacre.")
        );
    }

    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Bye."),
                is("See you soon.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("How much is 2 + 2?"),
                is("It's baffling to me. Ask another question.")
        );
    }
}