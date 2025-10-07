store_name = "ShopEase"

# This f is used to format the string with variables
welcome_message = f"Welcome to {store_name} - Your Online Marketplace!"
print(welcome_message)

# Different Variable types in Java

item_count = 150 # integer
item_price = 29.09 # float
is_available = True # boolean
item_description = "A versatile gadget for everyday use." # string
item_tags = ["gadget","electronics","utility"] #list
item_details = {"brand": "TechCorp", "Warranty": "2 years"} #dictionary
item_id = None #NoneType

# Displaying variable types
print(f"Item Count: {item_count}")
print(f"Item Price: {item_price}")
print(f"Is Available: {is_available}")
print(f"Item Description: {item_description}")
print(f"Item Tags: {item_tags}")
print(f"Item Details: {item_details}") 
print(f"Item ID: {item_id}") 

# Demonstrating type conversion
total_cost = item_count * item_price # float 
total_cost_str = str(total_cost) # converting float to string

print(f"Total Cost for {item_count} items: ${total_cost_str}")

# Converting string to integer
item_count_str = "200" # converting integer to string
item_count_int = int(item_count_str) # converting string to integer
print(f"Updated Item Count: {item_count_int}")

# Converting integer to float
item_count_float = float(item_count_int) # converting integer to float
print(f"Item Count as Float: {item_count_float}")