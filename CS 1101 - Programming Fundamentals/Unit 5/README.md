**1. Display n characters from left:** The function display\_n\_chars is
designed to extract a specified number of characters from the beginning
of a given string. This function accepts two parameters: a string,
referred to as name, and an integer, num. The integer num represents the
number of characters to be extracted from the string. The function
employs the slicing technique in Python, denoted by name\[:num\], to
extract the leftmost n characters from the string. The result of this
operation, which is a substring of the original name, is then printed to
the console.

**2. Count the number of vowels:** The count\_vowels function is tasked
with determining the total number of vowels present in a user's name.
This function operates by iterating over each character in the name
string. For each character, the function checks if it is a vowel. If the
character is a vowel, it contributes to the total vowel count. Once all
characters in the name have been examined, the function prints the final
vowel count.

**3. Reverse it:** The reverse function is used to reverse the order of
characters in the user's name. This function works by iterating over
each character in the name string. For each character, the function adds
it to the left of a variable named reversed. This operation effectively
reverses the order of characters in the name. The function then prints
the reversed name.

**Conclusion:** The main program begins by displaying the name. It then
prompt the user to input the number of characters they wish to display
from the left of their name. It calls each of the above functions in
turn, passing the user's name and the input number as arguments. Each
function performs its specified operation on the name and prints the
result. This way, the user can see the initial characters of the name,
the number of vowels in the name, and the name in reverse order.
