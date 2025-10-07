def add(*args):
    """
    Adds numbers or concatenates arguments as strings.
    - If all arguments are integers or floats, it returns their sum.
    - Otherwise, it converts all arguments to strings and joins them with spaces.
    """
    is_all_numeric = all(isinstance(arg, (int, float)) for arg in args)

    if is_all_numeric:
        total = 0
        for num in args:
            total += num
        return total
    else:
        return " ".join(map(str, args))

print(f"add(10, 20)        -> {add(10, 20)}")
print(f"add(10, 20, 30)    -> {add(10, 20, 30)}")
print(f"add(10.5, 20.1)    -> {add(10.5, 20.1)}")
print(f"add('Hello', 20)     -> \"{add('Hello', 20)}\"")
