def move_zeros(numbers):

    for index in range(len(numbers) - 1):
        for count in range(len(numbers) - 1 - index):

            if numbers[count] == 0:   
                if numbers[count] == 0:
                    numbers[count], numbers[count + 1] = numbers[count + 1], numbers[count]
    return numbers



def replace_negatives(numbers):

    for count in range(len(numbers)):
        if numbers[count] < 0:
            numbers[count] = 0

    return numbers

