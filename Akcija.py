#https://open.kattis.com/problems/akcija
n = int(input())
bookPrices = []
result = 0
for x in range(n):
    bookPrices.append(int(input()))
bookPrices.sort(reverse = True)

for x in range(len(bookPrices)):
    if (x + 1) % 3 != 0:
        result += bookPrices[x]
print(result)