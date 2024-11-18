# #Part 1

def print_circum(radius):
  pi=3.14159
  circumference = 2 * pi * radius
  print("Circumference = "+str(circumference))

print_circum(10)
print_circum(15)
print_circum(20)

#Part 2

def print_catalog(item1,item2,item3):

  combo_pack=0.9
  gift_pack=0.75

  combo1=(item1+item2)*combo_pack
  combo2=(item2+item3)*combo_pack
  combo3=(item1+item3)*combo_pack
  combo4=(item1+item2+item3)*gift_pack

  catalog="Online Store\n"
  catalog+="----------------------\n"
  catalog+="Product(S)                  Price\n"
  catalog+="Item 1                      $" + str(item1) + "\n"
  catalog+="Item 2                      $" + str(item2) + "\n"
  catalog+="Item 3                      $" + str(item3) + "\n"
  catalog+="Combo 1(Item 1 + 2)         $" + str(combo1) + "\n"
  catalog+="Combo 2(Item 2 + 3)         $" + str(combo2) + "\n"
  catalog+="Combo 3(Item 1 + 3)         $" + str(combo3) + "\n"
  catalog+="Combo 4(Item 1 + 2 + 3)     $" + str(combo4) + "\n"
  catalog+="______________________\n"
  catalog+="For delivery Contact:98764678899"

  print(catalog)

price_item1=200.0
price_item2=400.0
price_item3=600.0

print_catalog(price_item1,price_item2,price_item3)
