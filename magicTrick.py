#https://open.kattis.com/problems/magictrick
line = input()
myList = [char for char in line]

if len(myList) != len(set(myList)):
    print(0)
else:
    print(1)