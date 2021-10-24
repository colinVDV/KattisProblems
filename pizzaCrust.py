#https://open.kattis.com/problems/pizza2
import math

line = input()
array = line.split()
for X in range(2):
    array[X-1] = float(array[X-1])

R = array[0]
C = array[1]

TSA = math.pi * R**2
SMA = math.pi * (R - C)**2

print(SMA/TSA * 100)