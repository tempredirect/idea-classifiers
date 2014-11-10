import org.apache.hadoop.conf.TestConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 *
 */
public class AppTest {

  @Test
  public void test() {
    // the worst unit test ever
    assertNotNull(TestConfiguration.class.getName());
  }
}
