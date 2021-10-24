#https://open.kattis.com/problems/laptopsticker
line = input()
wc, hc, ws, hs = line.split()
check = True

if int(wc) - (int(ws) + 2) < 0:
    check = False

if int(hc) - (int(hs) + 2) < 0:
    check = False


if check:
    print(1)
else:
    print(0)