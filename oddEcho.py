#https://open.kattis.com/problems/oddecho
n = int(input())
array = []
for _ in range(n):
    array.append(input())

boolean = True
for X in array:
    if boolean == True:
        print(X)
    boolean = not boolean