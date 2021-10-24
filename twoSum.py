'''
author: Colin Vande Vijvere
Description: adds to numbers
Date: 10/23/2021
'''
input1 = input()
array = input1.split()
result = 0
for i in array:
    result = result + int(i)
print(result)