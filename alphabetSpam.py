#https://open.kattis.com/problems/alphabetspam
string = input()
array = [0,0,0,0]
for char in string:
    if char == '_':
        array[0]+=1
    elif char.isalpha():
        if char.isupper():
            array[2]+=1
        else:
            array[1]+=1
    else:
        array[3]+=1

for x in array:
    print(x/len(string))
    