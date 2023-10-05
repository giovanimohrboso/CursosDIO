
saldo = 1000
saque = 200
limite = 100

print("AND",saldo >= saque and saque <= limite)

print("AND COM NOT",not (saldo >= saque and saque <= limite))

print("OR",saldo >= saque or saque <= limite)

print("OR COM NOT",not(saldo >= saque or saque <= limite))