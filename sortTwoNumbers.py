#https://open.kattis.com/problems/sorttwonumbers
output = ""
line = input()
array = line.split()
array = list(map(int, array))
array.sort()
print(*array, sep=" ")
    