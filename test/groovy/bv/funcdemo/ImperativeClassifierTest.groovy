package bv.funcdemo;

import org.junit.Assert;
import org.junit.Test;

public class ImperativeClassifierTest {

	@Test
	def void isPerfect_shouldPass_whenNumberIsPerfect() {
		ImperativeClassifier classifier = new ImperativeClassifier(6) // or 28 or 496
		Assert.assertTrue(classifier.isPerfect())
	}

	@Test
	def void isPerfect_shouldFail_whenNumberIsNotPerfect() {
		ImperativeClassifier classifier = new ImperativeClassifier(5)
		Assert.assertFalse(classifier.isPerfect())
	}
}
