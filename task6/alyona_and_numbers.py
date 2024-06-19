def count_pairs(n, m):
    count_n = [0] * 5
    count_m = [0] * 5

    for i in range(1, n + 1):
        count_n[i % 5] += 1

    for i in range(1, m + 1):
        count_m[i % 5] += 1

    result = 0
    for i in range(5):
        result += count_n[i] * count_m[(5 - i) % 5]

    return result
n, m = map(int, input().split())
print(count_pairs(n, m))