#https://open.kattis.com/problems/hangman
word = input()
guesses = input()
wordList = set(word)
guessList = list(guesses)

lives = 10
iter = 0

while lives > 0 and len(wordList) > 0:
    if guessList[iter] in wordList:
        wordList.discard(guessList[iter])
    else:
        lives-=1
    iter+=1

if lives == 0:
    print('LOSE')
else:
    print('WIN')