#https://open.kattis.com/problems/jobbyte
#does not work yet
n = int(input())
nums = input()
array = list(map(int, nums.split()))
switches = 0
for x in range(len(array)):
    if x - 1 != array[x]:
        switches += 1

print(switches - 1)