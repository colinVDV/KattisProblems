n = int(input())
nums = []
for _ in range(n):
    X = int(input())
    nums.append(X)

nums.sort(reverse=True)

for X in range(n):
    print(nums[X]) 