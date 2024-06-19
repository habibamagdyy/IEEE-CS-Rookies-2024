while True:
    try:
        n = int(input())
        s = input()
        r, l = False, False
        x, y = 0, 0
        prev = '$'
        a, b = 0, 0

        for i, c in enumerate(s):
            if c == 'R':
                r = True
                if c == prev:
                    y = i + 2
                    b = i + 1
                else:
                    b = i + 1
                    x = i + 1
                    y = x + 1
            elif c == 'L':
                l = True
                if c == prev:
                    a = i + 1
                    x = i + 1
                else:
                    a = i + 1
                    x = i + 1
                    y = x - 1

            prev = c

        if l and r:
            print(a, b)
        else:
            print(x, y)
    except EOFError:
        break