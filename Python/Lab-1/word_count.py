def count_words(input_string):
    """
    Counts the number of words in a given string.
    Words are assumed to be separated by whitespace.
    """
    words = input_string.split()
    return len(words)

sentence = "Sum of 12 and 20 is 32"
word_count = count_words(sentence)

print(f"Input: \"{sentence}\"")
print(f"Output: {word_count}")

sentence2 = "Python is a versatile language."
print(f"\nInput: \"{sentence2}\"")
print(f"Output: {count_words(sentence2)}")
