class ArrayStore:
    def __init__(self):
        self.data = []

    def accept_integers(self):
        print("Please enter 10 integers, one at a time.")
        while len(self.data) < 10:
            try:
                num = int(input(f"Enter number {len(self.data) + 1}: "))
                self.data.append(num)
            except ValueError:
                print("Invalid input. Please enter an integer.")

    def display_with_for(self):
        print("\n--- Displaying with for loop ---")
        if not self.data:
            print("The list is empty.")
            return
        for item in self.data:
            print(item, end=" ")
        print()

    def display_with_while(self):
        print("\n--- Displaying with while loop ---")
        if not self.data:
            print("The list is empty.")
            return
        i = 0
        while i < len(self.data):
            print(self.data[i], end=" ")
            i += 1
        print()

    def sort_list(self):
        self.data.sort()
        print("\nList has been sorted in ascending order.")

    def count_occurrences(self, number):
        count = self.data.count(number)
        print(f"\nThe number {number} appears {count} time(s).")
        return count

    def insert_at_position(self, number, position):
        if 0 <= position <= len(self.data):
            self.data.insert(position, number)
            print(f"\nInserted {number} at position {position}.")
        else:
            print(f"Error: Position {position} is out of bounds.")

    def get_unique_elements(self):
        unique_list = list(set(self.data))
        print("\n--- Unique Elements ---")
        print(unique_list)
        return unique_list

if __name__ == "__main__":
    store = ArrayStore()

    store.accept_integers()

    store.display_with_for()
    store.display_with_while()

    store.sort_list()
    store.display_with_for()

    num_to_find = int(input("\nEnter a number to count its occurrences: "))
    store.count_occurrences(num_to_find)

    num_to_insert = int(input("\nEnter a number to insert: "))
    pos_to_insert = int(input(f"Enter the position to insert {num_to_insert}: "))
    store.insert_at_position(num_to_insert, pos_to_insert)
    store.display_with_for()

    store.get_unique_elements()