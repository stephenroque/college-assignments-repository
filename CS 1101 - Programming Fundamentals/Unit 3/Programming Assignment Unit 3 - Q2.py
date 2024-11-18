def divide_numbers():
    try:
        dividend = float(input("Enter the dividend: "))
        divisor = float(input("Enter the divisor: "))

        result = dividend / divisor

        print("Result of division: " + str(result))

    except ZeroDivisionError:
        print("Error: Division by zero is not allowed.")

divide_numbers()
