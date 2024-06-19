n, k = map(int, input().split())
count = 0
for _ in range(n):
    num_str = input().strip()
    num_set = set(num_str)
    if all(str(digit) in num_set for digit in range(k+1)):
        count += 1
print(count)