#https://open.kattis.com/problems/oddgnome
n = int(input())
for _ in range(n):
    row = input()
    rowList = list(map(int, row.split()))
    del rowList[0]
    for X in range(len(rowList)):
        if X != 0:
            if rowList[X] - 1 != rowList[X-1]:
                print(X + 1)
                break