
package test;
import static org.junit.Assert.*;
import logic.WeightConversion;
import org.junit.Test;
public class TestWeightConversion {
	@Test
	public void TestKilosToPounds() {
		WeightConversion ktp = new WeightConversion();
		double output = ktp.KilosToPounds(3);
		assertEquals((double)6.6079295154, output, 0.0000000001);
	}
	@Test
	public void TestPoundsToKilos() {
		WeightConversion ptk = new WeightConversion();
		double output = ptk.PoundsToKilos(3);
		assertEquals((double)1.362, output, 0.0000000001);
	}

}
