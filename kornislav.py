dimensions = input()
array = dimensions.split()
array = list(map(int, array))
array.sort()
output = array[0] * array[2]
print(output)