def countdown(n): 
     if n <= 0: 
          print('Blastoff!') 
     else: 
          print(n) 
          countdown(n-1) 

def countup(n): 
     if n >= 0: 
          print('Blastoff!') 
     else: 
          print(n) 
          countup(n+1)

def count(n):
     if n >= 0:
          countdown(n)
     else:
          countup(n)     

try:
    prompt='Enter a integer to start counting: '
    number = int(input(prompt))
    count(int(number))
except ValueError:
    print('ERROR: Invalid Format')


