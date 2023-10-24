import kotlin.test.Test

class TestScope {

    @Test fun testLet() { ScopeExample().letTest() }
    @Test fun testRun() { ScopeExample().runTest() }
    @Test fun withRun() { ScopeExample().withTest() }
    @Test fun applyRun() { ScopeExample().applyTest() }
    @Test fun alsoRun() { ScopeExample().alsoTest() }
}
