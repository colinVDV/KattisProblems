#https://open.kattis.com/problems/sevenwonders
line = input()
List = [char for char in line]
compas = 0
gear = 0
tablet = 0

for X in List:
    if X == 'C':
        compas += 1

    if X == 'T':
        tablet += 1

    if X == 'G':
        gear += 1

Numbers = [compas, gear, tablet]
output = tablet**2 + compas**2 + gear**2

if 0 not in Numbers:
    output += min(Numbers) * 7

print(output)