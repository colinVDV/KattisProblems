#https://open.kattis.com/problems/cups
n = int(input())
output = {}
for X in range(n):
    temp = input()
    array = temp.split()
    if array[0].isnumeric():
        output[array[1]] = int(array[0]) / 2
    else:
        output[array[0]] = int(array[1])

sortedDict = list(sorted(output, key = output.get))
for x in sortedDict:
    print(x)