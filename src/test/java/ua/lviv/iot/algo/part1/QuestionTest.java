package ua.lviv.iot.algo.part1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class QuestionTest {

    @ParameterizedTest
    @CsvSource({
            "'Привіт. Надворі гарна погода, чи не так?', 'чи не так?', 'Привіт.'",
            "'Привіт. Надворі гарна погода, чи не так? Падає дощ, чи не так.', 'чи не так?' , 'Привіт. Падає дощ, чи не так.'",
            "'Привіт. Чи не так?', ' Чи не так?', 'Привіт.'",
            "'Привіт. Чи не так, Олю?', 'Чи не так', 'Привіт.'"
    })
    public void testRemove(String text, String q, String expected) {
        Question question = new Question();
        assertEquals(expected, question.remove(text, q).toString());
    }
}