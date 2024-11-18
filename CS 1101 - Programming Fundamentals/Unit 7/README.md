**Explanation:**

The code outlines a function named *invert\_dict* which accepts an input
dictionary *original\_dict*. This dictionary has student names as keys
and their respective enrolled courses as values. The function\'s purpose
is to return a new dictionary *inverted\_dict* where the keys are
distinct course names and the values are lists of students enrolled in
each course.

The function begins by creating an empty dictionary *inverted\_dict*. It
then loops through the items of *original\_dict*, each item being a
student and their list of enrolled courses. Within this loop, another
loop iterates over each course in the student\'s list. For every course,
the code verifies if the course already exists as a key in
*inverted\_dict*. If it doesn\'t, the course is added as a key with an
empty list as its initial value. Subsequently, the current student is
appended to the list of students linked to that course.

Once all students and courses have been processed, the function returns
the *inverted\_dict*. The given input *students\_dict* holds data about
two students and their enrolled courses. The output showcases the
original input dictionary, followed by the inverted dictionary where
courses are keys and the associated students are the values. The aim of
this code is to offer a swift method to identify all students enrolled
in a specific course, which can be beneficial for tasks such as course
management or scheduling.

**References:**

Downey, A. (2015). _Think Python: How to think like a computer
scientist_ (https://greenteapress.com/thinkpython2/thinkpython2.pdf)
(2nd ed.). Green Tea Press. 

kjdElectronics. (2017, August 5). Python beginner tutorial 8 - For loop,
lists, and dictionaries \[Video\]. YouTube.
<https://youtu.be/bE6mSBNp4YU> 

Raj, A. (2022, March 3). _Reverse a dictionary in
Python_ (https://www.pythonforbeginners.com/basics/reverse-a-dictionary-in-python). PythonForBeginners. 

_Python
Dictionaries._ (https://www.w3schools.com/python/python_dictionaries.asp) (n.d.). W3schools. 
