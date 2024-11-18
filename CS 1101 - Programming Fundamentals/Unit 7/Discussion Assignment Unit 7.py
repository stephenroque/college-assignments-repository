label = ['Name', 'Unit', 'Department']
user = ['Stephen', 'DLF', 'NTS']

zipped = zip(label, user)

print(list(zipped))

for i, data in enumerate(user):
    print("Element " + str(i) + " is " + data)

user_dict = {'Name': 'Stephen', 'Unit': 'DLF', 'Department': 'NTS'}

for key, value in user_dict.items():
    print("The key is " + key + " and the value is " + value)

