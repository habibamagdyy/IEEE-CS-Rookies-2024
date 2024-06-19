nf, h = map(int, input().split())
heights = list(map(int, input().split()))
width = sum(2 if height > h else 1 for height in heights)

print(width)