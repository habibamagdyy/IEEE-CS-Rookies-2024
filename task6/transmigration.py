import sys

input = sys.stdin.read


def main():
    data = input().splitlines()
    n, m, k = map(float, data[0].split())
    n = int(n)
    m = int(m)
    k = float(k)

    mp = {}

    for i in range(1, n + 1):
        skill, level = data[i].split()
        level = int(level)
        if level * k >= 100:
            mp[skill] = int(level * (k + 1e-9))

    for i in range(n + 1, n + m + 1):
        sk = data[i].strip()
        if sk not in mp:
            mp[sk] = 0

    sorted_skills = sorted(mp.items())

    print(len(sorted_skills))
    for skill, level in sorted_skills:
        print(skill, level)


if __name__ == "__main__":
    main()