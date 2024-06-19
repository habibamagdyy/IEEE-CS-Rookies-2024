def min_bacteria(x):
    res = 0
    while x > 0:
        if x & 1:
            res += 1
        x >>= 1
    return res

x = int(input())
print(min_bacteria(x))