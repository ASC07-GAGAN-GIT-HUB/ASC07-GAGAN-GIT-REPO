def largest_number(a, b, c):
    return max(a, b, c)

print("\nEnter three numbers to find the largest:")
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
c = int(input("Enter third number: "))
print("Largest number is:", largest_number(a, b, c))