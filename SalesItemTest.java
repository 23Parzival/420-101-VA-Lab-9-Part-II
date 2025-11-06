import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void testAddCommentAuthor()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(false, salesIte1.addComment("James Duckling", "Something", 2));
    }

    @Test
    public void testRatingBoundaries()
    {
        SalesItem salesIte1 = new SalesItem("Test1", 123);
        assertEquals(false, salesIte1.addComment("Test1", "Test1", 0));
        assertEquals(false, salesIte1.addComment("Test2", "Test2", 6));
    }

    @Test
    public void testFindMostHelpfulComment()
    {
        SalesItem salesIte2 = new SalesItem("test", 123);
        assertEquals(true, salesIte2.addComment("test", "test", 3));
        salesIte2.upvoteComment(0);
        Comment comment1 = salesIte2.findMostHelpfulComment();
        assertNotNull(comment1);
        assertNotNull(comment1.getFullDetails());
    }
}



