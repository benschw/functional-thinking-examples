package bv.funcdemo;

import org.junit.Assert;
import org.junit.Test;

class FunctionalClassifierTest {

	@Test
	def void isPerfect_shouldPass_whenNumberIsPerfect() {
		Assert.assertTrue(FunctionalClassifier.isPerfect(6))
		Assert.assertTrue(FunctionalClassifier.isPerfect(28))
		Assert.assertTrue(FunctionalClassifier.isPerfect(496))
	}

	@Test
	def void isPerfect_shouldFail_whenNumberIsNotPerfect() {
		Assert.assertFalse(FunctionalClassifier.isPerfect(5))
	}

}
