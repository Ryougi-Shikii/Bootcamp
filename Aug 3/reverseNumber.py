def reverseNumber(n):
    temp = 0
    while n>0:
        rem = n%10
        temp = temp*10 + rem
        n = n//10
    return temp
for _ in range(10):
    num = int(input("enter a number: "))
    print(reverseNumber(num))