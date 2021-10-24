#https://open.kattis.com/problems/conundrum
line = input()
myList = [char for char in line]
days = 0
counter = 1

for X in range(len(myList)):
    if counter == 4:
        counter = 1

    if counter == 1:
        if myList[X] != 'P':
            days += 1

    if counter == 2:
        if myList[X] != 'E':
            days += 1

    if counter == 3:
        if myList[X] != 'R':
            days += 1
    
    counter += 1

print(days)