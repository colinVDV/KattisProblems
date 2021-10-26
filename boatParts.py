#https://open.kattis.com/problems/boatparts
string = input()
boatParts = set()
myList = list(map(int, string.split()))
for X in range(1, myList[1] + 1):
    part = input()
    boatParts.add(part)
    if len(boatParts) == myList[0]:
        print(X)
        break

if len(boatParts) < myList[0]:
    print('paradox avoided')