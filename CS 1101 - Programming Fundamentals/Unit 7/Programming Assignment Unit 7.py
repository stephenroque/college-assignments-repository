# Function
def invert_dict(original_dict):
    inverted_dict = dict()
    for student, courses in original_dict.items():
        for course in courses:
            if course not in inverted_dict:
                inverted_dict[course] = []
            inverted_dict[course].append(student)
    return inverted_dict

# Input
students_dict = {
    'Stud1': ['CS1101', 'CS2402', 'CS2001'],
    'Stud2': ['CS2402', 'CS2001', 'CS1102']
}

# Print original
print("Sample input:")
print(students_dict)

# Invert
inverted_dict = invert_dict(students_dict)

# Print inverted
print("Inverted Output:")
print(inverted_dict)
