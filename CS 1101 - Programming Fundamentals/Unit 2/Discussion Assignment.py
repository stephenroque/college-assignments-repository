#Example 1:

def format_result(result):      #Parameter = result
    print("Result: " + str(result))    

format_result(25)               #Argument = "Test"

#Parameters are variables that are used in the function definition.
#They act as placeholders for the values that will be passed to the function when it is called.
#Arguments are the actual values that are passed to a function when it is called.
#They correspond to the parameters in the function definition.

#Example 2:

format_result(25)               #value

result=25
format_result(result)           #variable

format_result(result*4)         #expression

#A value is a piece of data, a variable is a named storage location for a value, and an expression is a combination of values, variables, and operators that can be evaluated.

#Exemple 3:

def calc_discount(price):
    discount=(price * 0.2)
    print(discount)

calc_discount(500.00)

print(discount)

#When you try to use a local variable outside the function to which it belongs, you'll encounter a NameError in Python. This error occurs because the variable is confined to the scope of the function and is not accessible outside of it.

#Example 4

print(price)

#If you try to use the parameter outside the function, you will encounter a NameError. The error message will indicate that variable is not defined. This error occurs because the scope of the parameter is limited to the function. It doesn't exist outside of this function. 

#Example 5

message="This is the message."

def print_message():
    message="This is the new message."
    print(message)

print_message()

print(message)

#In this example, we have a global variable and a function that defines a local variable with the same name. When the function is called, it prints the value of the local variable. When the variable is printed outside the function, it prints the value of the global variable. The local variable is not visible outside the function, in the same way that the global variable cannot be read inside the function.