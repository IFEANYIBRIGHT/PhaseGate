import contact_app
from unittest import TestCase

class ContactAppSystem(TestCase):

    def test_Add_Contact(self):
    
        userInfo = contact_app
        
        actual = userInfo.add_Contact("Ifeanyi","bright","08131913381") 
       
               
        self.assertTrue(actual)
        
    
    def test_remove_contact(self):
    
        contact = ["Ifeanyi","bright","08131913381"]
        
        remove_user_contact =  contact_app
        
        actual =  remove_user_contact.remove_contact(contact)
        
        expected = []

        self.assertEqual(actual,expected)        
