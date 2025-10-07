# ----- Strings------------------

s = "Hello, World!"
print("Original String:", s)
print("Uppercase: ", s.upper())
print("Replace 'World' with 'Python':", s.replace("World", "Python"))
print("Split by comma:", s.split(","))

# --------- Numbers--------------
a = 10
b = 3
print("\nNumbers: a =", a, ", b =", b)
print("Addition:", a + b)
print("Division:", a / b)
print("Integer Division:", a // b)
print("Power:", a ** b)

# --------- Lists----------------
lst = [1,2,3,4,5]
print("\nOriginal List:", lst)
lst.append(6)
print("After Append 6:", lst)
lst.remove(3)
print("After Remove 3:", lst)
print("List Slice [1:4]:", lst[1:4])
print("Sum of List:", sum(lst))

# --------- Deep Dive: Lists ---------------

print("\nDeep Dive into Lists:")

# List comprehension
squared = [x**2 for x in lst]
print("Squared List using Comprehension:", squared)

# sorting

unsorted_list = [5, 2, 9, 1]
print("Unsorted List:", unsorted_list)
unsorted_list.sort()
print("Sorted List:", unsorted_list)

# Reversing

unsorted_list.reverse()
print("Reversed List:", unsorted_list)  

# Indexing and Membership 

print("Index of 2 in List:", unsorted_list.index(2))
print("Is 3 in List?:", 3 in unsorted_list)
print("Is 10 in List?:", 10 in unsorted_list)

# copying lists
lst_copy = lst.copy()
lst_copy.append(99)
print("Original List after copying and modifying copy:", lst)
print("Modified Copy of List:", lst_copy)












