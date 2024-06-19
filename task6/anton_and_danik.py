n = int(input())
outcomes = input()
anton_wins = outcomes.count('A')
danik_wins = outcomes.count('D')

if anton_wins > danik_wins:
    print("Anton")
elif danik_wins > anton_wins:
    print("Danik")
else:
    print("Friendship")