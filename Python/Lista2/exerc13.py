# 13) Faça um programa para ler dois números inteiros,
# e apresente o quociente e o resto da divisão entre eles.

x = int(input("Digite um número inteiro (dividendo): "))
y = int(input("Digite um número inteiro (divisor): "))
quociente = x // y
resto = x % y
print("O quociente entre ",x," e ",y," é ",quociente,".",sep="")
print("O resto entre ",x," e ",y," é ",resto,".",sep="")
