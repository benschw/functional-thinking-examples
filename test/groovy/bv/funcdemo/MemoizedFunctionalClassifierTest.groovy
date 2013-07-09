package bv.funcdemo;

import org.junit.Assert;
import org.junit.Test;

class MemoizedFunctionalClassifierTest {

	@Test
	def void isPerfect_shouldPass_whenNumberIsPerfect() {
		Assert.assertTrue(MemoizedFunctionalClassifier.isPerfect(6))
		Assert.assertTrue(MemoizedFunctionalClassifier.isPerfect(28))
		Assert.assertTrue(MemoizedFunctionalClassifier.isPerfect(496))
	}

	@Test
	def void isPerfect_shouldFail_whenNumberIsNotPerfect() {
		Assert.assertFalse(MemoizedFunctionalClassifier.isPerfect(5))
	}

}
