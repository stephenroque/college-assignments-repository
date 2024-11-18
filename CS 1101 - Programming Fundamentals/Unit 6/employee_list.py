# Assume we have a list of 10 employee names
employeeList = ['John Doe', 'Jane Smith', 'Robert Johnson', 'Michael Williams', 'Sarah Brown', 'James Davis', 'Patricia Miller', 'Linda Wilson', 'Charles Moore', 'Jessica Taylor']

# Split the list into two sub-lists
subList1 = employeeList[:5]
subList2 = employeeList[5:]

# Add new employee to subList2
subList2.append('Kriti Brown')

# Remove second employee from subList1
subList1.pop(1)

# Merge both the lists
mergedList = subList1 + subList2

# Assume we have a list of salaries for these employees
salaryList = [50000, 60000, 70000, 80000, 90000, 100000, 110000, 120000, 130000, 140000]

# Give a rise of 4% to every employee and update the salaryList
newSalaryList = []
for salary in salaryList:
    newSalaryList.append(salary * 1.04)
salaryList = newSalaryList

# Sort the salaryList and show top 3 salaries
salaryList.sort()
top3Salaries = salaryList[-3:]

print("Merged Employee List: " + str(mergedList))
print("Updated Salary List: " + str(salaryList))
print("Top 3 Salaries: " + str(top3Salaries))

