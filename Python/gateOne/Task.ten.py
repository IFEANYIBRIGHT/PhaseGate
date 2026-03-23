sum_of_numbers = 0
average = 0
for number in range(3):

    ask_numbers = int(input("Enter number "))

    sum_of_numbers += ask_numbers

    average = sum_of_numbers / len(ask_numbers)
print("The sum of numbers is ",average)
