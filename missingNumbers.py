#https://open.kattis.com/problems/missingnumbers
n = int(input())
myList = []
for _ in range(n):
    X = int(input())
    myList.append(X)
myList.sort()
if n == myList[len(myList)-1]:
    print("good job")

for X in range(myList[len(myList)-1]):
    if X != 0:
        if X not in myList:
            print(X)