

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testDetailStorage()
    {
        SalesItem salesIte1 = new SalesItem("test1", 123);
        assertEquals(true, salesIte1.addComment("test1", "test1", 3));
    }

    @Test
    public void testUpvote()
    {
        SalesItem salesIte1 = new SalesItem("test1", 123);
        assertEquals(true, salesIte1.addComment("test", "test", 2));
        salesIte1.upvoteComment(0);
        salesIte1.downvoteComment(0);
    }
}

