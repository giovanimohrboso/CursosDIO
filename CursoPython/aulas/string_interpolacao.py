nome = "Giovani"
idade = 28
profissao = "Programador"
linguagem = "Python"

#%
print("Olá, me chamo %s.Tenho %d anos de idade, trabalho como %s, estou no curso de %s"%(nome,idade,profissao,linguagem))
#format
print("Olá, me chamo {}.Tenho {} anos de idade, trabalho como {}, estou no curso de {}".format(nome,idade,profissao,linguagem))
#format
print("Olá, me chamo {0}.Tenho {1} anos de idade, trabalho como {2}, estou no curso de {3}".format(nome,idade,profissao,linguagem))
#format
print("Olá, me chamo {nome}.Tenho {idade} anos de idade, trabalho como {profissao}, estou no curso de {linguagem}".format(nome=nome,idade=idade,profissao=profissao,linguagem=linguagem))
#f string´s
print(f'Olá, me chamo {nome}.Tenho {idade} anos de idade, trabalho como {profissao}, estou no curso de {linguagem}')
pi = 3.14
print(f'Valor de Pi = {pi:.1f}')
print(f'Valor de Pi = {pi:.2f}')