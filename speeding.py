#https://open.kattis.com/problems/speeding
n = int(input())
X_prev = 0
Y_prev = 0
maxspeed = 0
for i in range(n):
    line = input()
    array = line.split()
    X = int(array[0])
    Y = int(array[1])
    if X != 0 and Y!= 0:
        temp = (Y - Y_prev) / (X - X_prev)
        if temp > maxspeed:
            maxspeed = temp
    X_prev = X
    Y_prev = Y
    

print(int(maxspeed))

        
