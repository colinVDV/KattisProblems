#https://open.kattis.com/problems/apaxiaaans
line = input()
output = ""
for X in range(len(line)):
    if X == 0:
        output += line[X]
    else:
        if line[X] != line[X-1]:
            output += line[X]

print(output)