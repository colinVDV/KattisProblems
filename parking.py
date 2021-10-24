#https://open.kattis.com/problems/parking2
t = int(input())
for _ in range(t):
    n = int(input())
    line = input()
    array = line.split()
    for X in range(len(array)):
        array[X] = int(array[X])
    array.sort()
    print((array[n-1] - array[0])*2)

