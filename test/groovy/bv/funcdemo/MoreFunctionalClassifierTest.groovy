package bv.funcdemo

import org.junit.Assert;
import org.junit.Test;

public class MoreFunctionalClassifierTest {

	@Test
	def void isPerfect_shouldPass_whenNumberIsPerfect() {
		Assert.assertTrue(MoreFunctionalClassifier.isPerfect(6))
		Assert.assertTrue(MoreFunctionalClassifier.isPerfect(28))
		Assert.assertTrue(MoreFunctionalClassifier.isPerfect(496))
	}

	@Test
	def void isPerfect_shouldFail_whenNumberIsNotPerfect() {
		Assert.assertFalse(MoreFunctionalClassifier.isPerfect(5))
	}
}
