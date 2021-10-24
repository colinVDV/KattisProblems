#https://open.kattis.com/problems/3dprinter
import math
n = int(input())
printers = int(n/2)

statuesPrinted = 0
printerAmount = 1
days = 0
while statuesPrinted < n:
    if printerAmount < printers:
        if printerAmount == 1:
            printerAmount += 1
        else:
             printerAmount = printerAmount * 2
    
    else:
        statuesPrinted += printerAmount
    days += 1


print(days)