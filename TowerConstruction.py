#https://open.kattis.com/problems/tornbygge
n = int(input())
blocks = input()
blockList = list(map(int, blocks.split()))
result = 1

for X in range(n):
    if X != 0:
        if blockList[X] > blockList[X-1]:
            result+=1

print(result)