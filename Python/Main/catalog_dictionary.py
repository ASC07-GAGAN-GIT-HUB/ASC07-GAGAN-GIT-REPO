products = {
    "name": "Wireless Mouse",
    "price": 25.99,
    "stock": 50,
}

print("********************")
print(product["name"])
print(product["price"])
print(product["stock"])

catalog = {
    101: {"name": "Wireless Mouse", "price": 25.99, "stock": 50},
    102: {"name": "Keyboard", "price": 45.0, "stock": 8},
    103: {"name": "Monitor", "price": 150.0, "stock": 5},
}

print("********************")
print(catalog[101]["name"])
print(catalog[101]["price"])

# 2. Update stock after a purchase
product_id = 101
quantity_purchased = 2
catalog[product_id]["stock"] -= quantity_purchased
print(f"Updated stock for product {product_id}: {catalog[product_id]['stock']}")

# 3. Add a new product
catalog[104] = {"name": "USB-C Cable", "price": 10.0, "stock": 100}

# 4. Loop throough the catalog
for pid, details in catalog.items():
    print(f"Product ID: {pid}, Name: {details['name']}, Price: {details['price']}, Stock: {details['stock']}")


    