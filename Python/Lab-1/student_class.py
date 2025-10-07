class Student:
    def __init__(self):
        self.student_id = None
        self.student_name = ""
        self.city = ""
        self.marks1 = 0
        self.marks2 = 0
        self.marks3 = 0
        self.fee_per_month = 0.0
        self.is_eligible_for_scholarship = False

    def set_student_id(self, student_id): self.student_id = student_id
    def set_student_name(self, name): self.student_name = name
    def set_city(self, city): self.city = city
    def set_marks(self, m1, m2, m3):
        self.marks1 = m1
        self.marks2 = m2
        self.marks3 = m3
    def set_fee_per_month(self, fee): self.fee_per_month = fee
    def set_scholarship_status(self, status): self.is_eligible_for_scholarship = status

    def get_student_name(self): return self.student_name
    def get_fee_per_month(self): return self.fee_per_month

    def get_annual_fee(self):
        return self.fee_per_month * 12

    def get_total_marks(self):
        return self.marks1 + self.marks2 + self.marks3

    def get_average(self):
        return self.get_total_marks() / 3

    def get_result(self):
        if self.marks1 > 60 and self.marks2 > 60 and self.marks3 > 60:
            return "Pass"
        else:
            return "Fail"

if __name__ == "__main__":
    s1 = Student()
    s2 = Student()
    s3 = Student()

    s1.set_student_id(101)
    s1.set_student_name("Alice")
    s1.set_city("New York")
    s1.set_marks(85, 90, 92)
    s1.set_fee_per_month(1500.0)
    s1.set_scholarship_status(True)

    s2.set_student_id(102)
    s2.set_student_name("Bob")
    s2.set_city("Los Angeles")
    s2.set_marks(55, 65, 70) 
    s2.set_fee_per_month(1200.0)
    s2.set_scholarship_status(False)

    s3.set_student_id(103)
    s3.set_student_name("Charlie")
    s3.set_city("Chicago")
    s3.set_marks(95, 88, 98)
    s3.set_fee_per_month(1800.0)
    s3.set_scholarship_status(True)

    students = [s1, s2, s3]

    highest_marks_student = max(students, key=lambda s: s.get_total_marks())
    print(f"Student with highest marks: {highest_marks_student.get_student_name()}")
    
    lowest_fee_student = min(students, key=lambda s: s.get_fee_per_month())
    print(f"Student with lowest fee: {lowest_fee_student.get_student_name()} (${lowest_fee_student.get_fee_per_month()}/month)")
    
    print("\n--- Student Details ---")
    for student in students:
        print(f"Name: {student.get_student_name()}")
        print(f"  Total Marks: {student.get_total_marks()}")
        print(f"  Average: {student.get_average():.2f}")
        print(f"  Result: {student.get_result()}")
        print(f"  Scholarship Status: {student.is_eligible_for_scholarship}\n")
