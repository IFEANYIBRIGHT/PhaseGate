from unittest import TestCase
import function_file

class TestifItWorks(TestCase):

    def test_array_and_fill(self):
        numbers = [10,11,12]
        result = function_file

        actual = result.fill_up_an_array(numbers)

        expected = [10,11,12,-1,-1]

        self.assertEqual(actual,expected)


    def test_and_return_two(self):

        numbers = [10,11,12,13,14]

        result = function_file

        actual = result.return_two(numbers)

        expected = [10,11] 

        self.assertEqual(actual,expected)
