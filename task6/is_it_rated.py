n = int(input())
r_before = []
r_after = []

for _ in range(n):
    a, b = map(int, input().split())
    r_before.append(a)
    r_after.append(b)

if r_before != r_after:
    print("rated")
else:
    for i in range(1, n):
        if r_before[i] > r_before[i - 1]:
            print("unrated")
            break
    else:
        print("maybe")