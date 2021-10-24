#https://open.kattis.com/problems/finalexam2
n = int(input())
prev = 'F'
result = 0
for _ in range(n):
    answer = input()
    if answer == prev:
        result+=1
    prev = answer
print(result)