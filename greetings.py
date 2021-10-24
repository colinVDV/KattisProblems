greeting = input()
length = int(len(greeting))
number_of_e = (length - 2) * 2
output = "h"
for X in range(number_of_e):
    output += "e"
output = output + "y"

print(output)