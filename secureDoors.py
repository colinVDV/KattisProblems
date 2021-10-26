#https://open.kattis.com/problems/securedoors
cases = int(input())
buildingLog = []
for _ in range(cases):
    string = input()
    tempList = string.split()
    if tempList[0] == 'entry':
        if tempList[1] in buildingLog:
            print(tempList[1], 'entered (ANOMALY)')
        else:
            print(tempList[1], 'entered')
            buildingLog.append(tempList[1])
    else:
        if tempList[1] in buildingLog:
            print(tempList[1], 'exited')
            buildingLog.remove(tempList[1])
        else:
            print(tempList[1], 'exited (ANOMALY)')