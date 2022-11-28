package chiefsClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NativeTest {
    private Native amirah;
    private Native wumi;
    private Native raphael;
    private Native jude;
    @BeforeEach
    public void setup() {
        amirah = new Native();

    }
    @Test
    public void findTest(){
        Native natives[] = {amirah, wumi, raphael, jude};
//        Native foundNative = amirah.findNative(natives);
    }


}
