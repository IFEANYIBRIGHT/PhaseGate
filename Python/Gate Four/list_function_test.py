from unittest import TestCase
import list_function

class TestIfItWorks(TestCase):

    def test_for_negative_numbers(self):
        numbers = [5, -9, 3, -6, 2, -11]

        actual = list_function.replace_negatives(numbers)

        expected = [5, 0, 3, 0, 2, 0]

        self.assertEqual(actual, expected)


    def test_if_all_zeros_are_the_back(self):

        numbers = [5, 0, 3, 0, 2, 0]

        actual = list_function.move_zeros(numbers)

        expected = [5, 3, 2, 0, 0, 0]

        self.assertEqual(actual, expected)
