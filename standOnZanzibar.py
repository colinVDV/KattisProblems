# https://open.kattis.com/problems/zanzibar
cases = int(input())
for _ in range(cases):
    temp = input()
    result = 0
    prev = 1
    array = map(int, temp.split())
    for x in array:
        if x > prev * 2:
            result += x - prev * 2
        prev = x
    print(result)