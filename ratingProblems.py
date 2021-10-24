#https://open.kattis.com/problems/ratingproblems

line = input()
n, k = line.split()
n = int(n)
k = int(k)
ratings = []
for _ in range(k):
    ratings.append(int(input()))

total_score = 0
for X in range(k):
    total_score += ratings[X]

#minimumscore
minimumscore = ((n - k) * -3 + int(total_score)) / n

#maximumscore
maximumscore = ((n - k) * 3 + int(total_score)) / n

print(minimumscore, maximumscore)