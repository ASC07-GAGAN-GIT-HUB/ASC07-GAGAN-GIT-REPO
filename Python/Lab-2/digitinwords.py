def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    print("Digits in words:", end=" ")
    for digit in str(number):
        print(words[int(digit)], end=" ")
    print()

number = int(input("\nEnter a three-digit number: "))
print_digits_in_words(number)
