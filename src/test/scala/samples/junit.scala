package samples

import org.junit._
import Assert._

@Test
class AppTest {

  @Test
  def testOK() = assertTrue(true)

  @Test
  def checkUser() = assertNotNull("")

  //    @Test
  //    def testKO() = assertTrue(false)

  @Test
  def checkEmployee(){
    val emplyoee = "";
    assertTrue(""== emplyoee);
  }
  
  
}


