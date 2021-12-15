#https://open.kattis.com/problems/heimavinna
myInput = input()
myList = myInput.split(';')
result = 0

for element in myList:
    newList = element.split('-')
    if len(newList) == 1:
        result+=1
    else:
        result = result + (int(newList[1]) - int(newList[0])) + 1

print(result)
