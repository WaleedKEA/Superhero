import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class DatabaseTest {

    private Database database;

    @BeforeEach
    void prepareTest() {
        database = new Database();
        database.createTestData();
    }


    @Test
    void createSuperhero() {

    }

    @Test
    void getSuperheroes() {
    }

    @Test
    void searchForSuperhero() {
    }
}