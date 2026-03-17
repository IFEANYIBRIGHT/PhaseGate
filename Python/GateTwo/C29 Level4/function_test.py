from unittest import TestCase

import function_task

class TestLevelFourTask(TestCase):

    def test_the_sum_of_two_numbers(self):

        Result = function_task.add_two_numbers(5, 6)

        self.assertEqual(Result, 11)


    def test_the_sum_of_two_numbers_two(self):

        Result = function_task.is_even(4)

        self.assertTrue(Result)



    def test_if_number_is_squared(self):

        Result = function_task.squares(10)

        self.assertEqual(Result, 100)

    def test_if_number_is_converted(self):

        Result = function_task.celcius(15)

        self.assertEqual(Result, 59.0)


    def test_number_simole_interest(self):

        Result = function_task.celcius(15)

        self.assertEqual(Result, 59.0)

