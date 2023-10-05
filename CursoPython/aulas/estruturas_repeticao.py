
#FOR

valor = int(input("Repita até: "))

print("FOR")
for x in range(1,valor+1,1):
    print(x)

print("WHILE")
x = 0
while x < valor:
    x += 1
    print(x)

print("WHILE BREAK")
x = 0
while True:
    if x == valor:
        break
    x +=1
    print(x)
