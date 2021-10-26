#https://open.kattis.com/problems/t9spelling
keypad = [[' '], [None], ['a' , 'b', 'c'],['d' , 'e', 'f'],['g' , 'h', 'i'],['j' , 'k', 'l'],
                        ['m' , 'n', 'o'],['p' , 'q', 'r', 's'],['t' , 'u', 'v'],['w' , 'x', 'y' , 'z']]                       
cases = int(input())
for case in range(1, cases + 1):
    presses = ''
    prevChar = 10
    inputWord = input()
    for char in inputWord:
        for button in keypad:
            for letter in button:
                if letter == char:
                    if keypad.index(button) == prevChar:
                        presses+= ' '
                    for x in range(button.index(char) + 1):
                        presses += str(keypad.index(button))
                    prevChar = keypad.index(button)


    print(f'Case #{case}: {presses}')