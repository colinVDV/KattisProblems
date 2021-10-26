#https://open.kattis.com/problems/railroad2
case = input()
myList = list(map(int, case.split()))
if myList[1] % 2 != 0:
    print('impossible')
else:
    print('possible')