N = int(input())
saida = []

while(N > 0):
    A = str(input())
    B = str(input())
    if A.rfind(B)>=0:
        saida.append("encaixa")
    else:
        saida.append("nao encaixa")
    N-= 1

for mensagem in saida:
    print(mensagem)