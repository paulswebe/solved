number = int(input('Please enter a number to reverse'))
while   number > 0:
        number = number % 10
        print(number, end="")
        number = number / 10
