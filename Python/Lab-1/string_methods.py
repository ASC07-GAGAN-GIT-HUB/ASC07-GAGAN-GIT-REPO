text = "  Python is Fun!  "
words = ["Learn", "Python", "Now"]

print(f"Original text: '{text}'\n")

# --- Demonstrations ---

# Indexing: Access a character at a specific position.
print(f"1. Indexing: text[3] -> '{text[3]}'")

# Slicing: Extract a substring from the text.
print(f"2. Slicing: text[2:8] -> '{text[2:8]}'")

# Membership test: Check if a substring exists in the text.
print(f"3. Membership: 'Fun' in text -> {'Fun' in text}")

# len(): Get the total length of the string (including spaces).
print(f"4. len(): len(text) -> {len(text)}")

# lower() and upper(): Convert the string to lowercase or uppercase.
print(f"5. lower(): text.lower() -> '{text.lower()}'")
print(f"6. upper(): text.upper() -> '{text.upper()}'")

# strip(): Remove leading/trailing whitespace.
print(f"7. strip(): text.strip() -> '{text.strip()}'")

# find(): Find the starting index of a substring (-1 if not found).
print(f"8. find(): text.find('is') -> {text.find('is')}")

# rfind(): Find the starting index from the right side.
example_rfind = "apple pie apple"
print(f"9. rfind(): '{example_rfind}'.rfind('apple') -> {example_rfind.rfind('apple')}")

# join(): Join elements of an iterable with the string as a separator.
print(f"10. join(): '-'.join({words}) -> '{'-'.join(words)}'")

# Equality (==): Check if two strings are exactly the same.
other_text = "Python is Fun!"
print(f"11. Equality: text.strip() == other_text -> {text.strip() == other_text}")

# Case-insensitive equality: Compare strings after converting them to the same case.
print(f"12. Case-insensitive equality: text.lower() == '  python is fun!  '.lower() -> {text.lower() == '  python is fun!  '.lower()}")