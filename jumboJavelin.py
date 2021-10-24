#https://open.kattis.com/problems/jumbojavelin
n = int(input())
total = 0
for X in range(n):
    total += int(input())

total -= (n-1)
print(total)