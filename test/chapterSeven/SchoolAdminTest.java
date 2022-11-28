package chapterSeven;

import org.junit.jupiter.api.BeforeEach;

public class SchoolAdminTest {
    private int[][] scores ={{30,50,60,69,80}, {40,59,79,80,60}};
    private SchoolAdmin admin;

    @BeforeEach
    public void setUp() {
        admin = new SchoolAdmin();
    }
}
