def table_with_for_loop(n):
    print(f"--- Multiplication Table for {n} (for loop) ---")
    for i in range(1, 11):
        print(f"{n} x {i} = {n * i}")
    print("-" * 20)

def table_with_while_loop(n):
    print(f"--- Multiplication Table for {n} (while loop) ---")
    i = 1
    while i <= 10:
        print(f"{n} x {i} = {n * i}")
        i += 1
    print("-" * 20)

def table_with_do_while_simulation(n):
    print(f"--- Multiplication Table for {n} (do-while simulation) ---")
    i = 1
    while True:
        print(f"{n} x {i} = {n * i}")
        i += 1
        if i > 10:
            break
    print("-" * 20)

# --- Main Execution ---
if __name__ == "__main__":
    try:
        num = int(input("Enter a number to see its multiplication table: "))
        table_with_for_loop(num)
        table_with_while_loop(num)
        table_with_do_while_simulation(num)
    except ValueError:
        print("Invalid input. Please enter an integer.")
