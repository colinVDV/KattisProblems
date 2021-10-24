line = input()
output = ""
array = line.split()
Y = array[0]
P = array[1]

L = len(Y) - 1
end = Y[L]

if end == "e":
    output = Y + 'x' + P

elif end == "i" or end == "o" or end == "u" or end == "a":
    output = Y.rstrip(Y[-1]) + "ex" + P

elif end == "x":
    if Y[L-1] == "e":
        output = Y + P
else:
    output = Y + "ex" + P 


print(output)