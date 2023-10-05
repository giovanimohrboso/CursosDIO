mensagem = str(input("Digite a mensagem com menos de 140 caracteres:"))

if len(mensagem) > 0 and len(mensagem) <= 140:
    print("TWEET")
else:
    print("MUTE")