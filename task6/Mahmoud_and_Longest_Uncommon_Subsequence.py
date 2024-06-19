def lUS(a, b):
    if a == b:
        return -1
    else:
        return max(len(a), len(b))
a = input().strip()
b = input().strip()
print(lUS(a, b))