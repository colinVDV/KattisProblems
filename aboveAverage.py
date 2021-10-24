
n = int(input())

for x in range(n):
    i = int(input())
    myList = []
    count = 0
    total = 0
    
    for x in range(i):
        num = int(input())
        myList.append(num)
        total = total + num
    
    
    average = total / i


    for x in myList:
        if (x > average):
            count = count + 1
    percentage = (count / i) * 100
    print("%.3f" % percentage, "%")