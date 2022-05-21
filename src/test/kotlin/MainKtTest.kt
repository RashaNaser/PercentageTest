import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnMinusOne_When_EmptyList() {
        // given list
        val list = mutableListOf<String>()
        // when searching for a
        val result = percentageOfCharacterA(list)
        // then check the result
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinusOne_When_InvalidStringLength() {
        // given list
        val list = mutableListOf("a", "aa")
        // when searching for a
        val result = percentageOfCharacterA(list)
        // then check the result
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnPercentage_When_HasA() {
        // given list
        val list = mutableListOf("a", "b", "b")
        // when searching for a
        val result = percentageOfCharacterA(list)
        // then check the result
        assertEquals(33.3, result)
    }

    @Test
    fun should_ReturnPercentage_When_UseDifferentLetterCases() {
        // given list
        val list = mutableListOf("a", "A", "b")
        // when searching for a
        val result = percentageOfCharacterA(list)
        // then check the result
        assertEquals(66.7, result)
    }

    @Test
    fun should_ReturnPercentage_when_FoundJustA() {
        // given list
        val list = mutableListOf("a", "A")
        //when check if it is valid and calculate the percentage of 'a'.
        val result = percentageOfCharacterA(list)
        //then check the result
        assertEquals(100.0, result)
    }

    @Test
    fun should_ReturnPercentage_When_CharNotFound() {
        // given list
        val list = mutableListOf("b")
        // when searching for a
        val result = percentageOfCharacterA(list)
        //then check the result
        assertEquals(0.0, result)
    }

    @Test
    fun should_ReturnMinusOne_when_CharNotAcceptable() {
        // given list
        val list = mutableListOf("a", "r")
        // when searching for a
        val result = percentageOfCharacterA(list)
        //then check the result
        assertEquals(-1.0, result)
    }
}