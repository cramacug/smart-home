package org.cramacug.garden

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class TestDashboard {

    @Test
    fun `dashboard works`() {

        // Given
        val dashboard = Dashboard()

        // When
        val test = dashboard.test()

        // Then
        assertTrue(test)
    }
}