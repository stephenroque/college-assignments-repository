# try to open a file
try:
    # open the file
    fin = open("test.txt")
    # read the content
    content = fin.read()
    # close the file
    fin.close()
    # print the content
    print(content)
# catch the FileNotFoundError exception
except FileNotFoundError:
    # print a friendly message if the file doesn't exist
    print("Sorry, the file you are looking for does not exist.")
# catch other exceptions
except:
    # print a friendly message if another type of error occurs 
    print('Sorry, something went wrong.')
