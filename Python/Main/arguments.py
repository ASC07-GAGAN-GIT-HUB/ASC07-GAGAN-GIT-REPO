# The import sys module to access command-line arguments
# Modules in Python are files containing Python code. They can define functions,
#  classes, and variables that you can reuse in other Python scripts.

import sys
# The syntax sys.argv[1:] gets all the arguments except the script name. The script name is always 
# the first argument (sys.argv[0]). The slice [1:] means "from the second element to the end of 
# the list".
# sys.argv is a list in Python, which contains the command-line arguments passed to the script.
# The first element, sys.argv[0], is the name of the script itself. The subsequent elements are the
# arguments passed to the script.

print("Script Name:", sys.argv[0])
print("sixth Argument:", sys.argv[6])

# Print arument from 1 to end

for arg in sys.argv[1:]:
    print("Argument:",arg)

if len(sys.argv) > 1:
    print("Arguments passed:", sys.argv[1:])
else:
    print("No arguments passed.")

# to run this file use the command: python Main/main.py arg1 arg2