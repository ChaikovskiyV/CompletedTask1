package com.vchaikovsky.arrayclass.parser;

import com.vchaikovsky.arrayclass.exceptions.WrongDataException;
import com.vchaikovsky.arrayclass.parser.impl.ParserStringToArrayNumbers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParserStringToArrayNumbersTest {
    static final Logger logger = LogManager.getLogger();
    private String sourceString;
    Integer[] expectedArray;
    ParserStringToArrayNumbers parser;

    @BeforeEach
    void setUp() {
        logger.info("Testing is starting ...");
        parser = new ParserStringToArrayNumbers();
        try {
            Path path = Path.of("sources/testfile.txt");
            sourceString = Files.readString(path);
        } catch (IOException e){
            logger.error(new WrongDataException("File was not found.", e));
        }
        expectedArray = new Integer[]{9, 6, 4, 8, 2, 5, 1, 7, 3};
    }

    @AfterEach
    void tearDown() {
        logger.info("The test has been finished.");
    }

    @Test
    public void parseStringToIntArray() {
        Integer[] array = parser.parseStringToIntArray(sourceString);
        assertArrayEquals(expectedArray, array);
    }
}