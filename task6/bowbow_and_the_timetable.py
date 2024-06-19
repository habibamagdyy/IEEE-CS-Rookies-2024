def count_missed_trains(s):
    count = 0
    power_of_4 = 1
    while power_of_4 < s:
        power_of_4 *= 4
        count += 1

    return count

s = int(input(), 2)
print(count_missed_trains(s))