n = input()
n = int(n)

for i in range(n):
    output = 0
    string = input()
    array = string.split()
    array = list(map(int, array))
    for X in array:
        output += X
    output -= 2*array[0] - 1
    print(output)