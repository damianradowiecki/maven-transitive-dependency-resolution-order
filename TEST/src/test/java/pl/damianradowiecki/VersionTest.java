package pl.damianradowiecki;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionTest {

    /**
     * First run
     * mvn clean install
     * on the top level pom.xml
     * The test below will run
     * <br><br>
     * To see dependency tree run:
     * mvn dependency:tree -Dverbose -Dexclude
     * on the TEST module level
     */
    @Test
    public void testVersion() {
        VersionPresenter versionPresenter = new VersionPresenter();
        System.out.println("RESOLVED VERSION IS: " + versionPresenter.version());
        assertEquals(versionPresenter.version(), "2");
    }


}
