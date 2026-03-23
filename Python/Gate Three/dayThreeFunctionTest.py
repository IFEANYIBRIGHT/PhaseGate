from unittest import TestCase
import dayThreeFunction

class TestIfItWorks(TestCase):

    def test_two_array(self):
        numbers = [45.2,90.28,77.1]
           
        second_numbers = [3.52,9.86,11.77]
                  
        third_numbers =  [7.7,10,22.33,12]         
          
                  

        
        largest = dayThreeFunction

        actual = largest.get_the_largest(numbers,second_numbers,third_numbers)

        expected = 90.28

        self.assertEqual(actual,expected)
