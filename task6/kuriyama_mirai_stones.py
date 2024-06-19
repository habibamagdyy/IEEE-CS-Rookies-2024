def answer_queries(n, costs, m, queries):
    prefix_sum = [0] * (n + 1)
    sorted_prefix_sum = [0] * (n + 1)

    for i in range(1, n + 1):
        prefix_sum[i] = prefix_sum[i - 1] + costs[i - 1]

    sorted_costs = sorted(costs)
    for i in range(1, n + 1):
        sorted_prefix_sum[i] = sorted_prefix_sum[i - 1] + sorted_costs[i - 1]

    answers = []
    for query in queries:
        q_type, l, r = query
        if q_type == 1:
            answers.append(prefix_sum[r] - prefix_sum[l - 1])
        else:
            answers.append(sorted_prefix_sum[r] - sorted_prefix_sum[l - 1])

    return answers
n = int(input())
costs = list(map(int, input().split()))
m = int(input())
queries = [list(map(int, input().split())) for _ in range(m)]
for ans in answer_queries(n, costs, m, queries):
    print(ans)