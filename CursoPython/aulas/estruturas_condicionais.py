

idade = int(input("Digite sua idade:"))
#IF ELIF ELSE
if idade < 16:
    print("Não é possivel Votar")
elif idade < 18:
    print("É possivel votar")
else: 
    print("Voto Obrigatorio")

valor = int(input("Digite a opção: [1]:Menu Principal [2]:Sair "))

#TERNARIO

escolha = "Menu" if valor == 1 else "Sair"
print(f'Você escolheu {escolha}')





