loops = int(input())
numberInput = input()
numbers = numberInput.split()
result = 0
for i in numbers:
    result += int(i)

print(result)