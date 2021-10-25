#https://open.kattis.com/problems/grading
temp = input()
array = map(int, temp.split())
grade = int(input())
gradeString = 'ABCDEF'
result = gradeString[0]
iter = 1

for X in array:
    if grade < X:
        result = gradeString[iter]
        iter+=1
print(result)

