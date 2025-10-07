def simple_calculator(a, b):
        print(f"{a} + {b} = {a + b}")
        print(f"{a} - {b} = {a - b}")
        print(f"{a} * {b} = {a * b}")
        if b != 0:
            print(f"{a} / {b} = {a / b}")
        else:
            print("Division by zero is not allowed.")

try: 
     a = float(input("Enter first number: "))
     b = float(input("Enter second number: "))
     simple_calculator(a, b)
except ValueError:
     print("Invalid input. Please enter numeric values.")