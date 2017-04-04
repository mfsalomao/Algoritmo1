# 16) Leia dois valores para as variáveis A e B, efetuar a troca dos
# valores de forma que a variável A passe a possuir o valor da variável B,
# e que a variável B passe a possuir o valor da variável A.
# Apresentar os valores trocados pelas variáveis.

A = input("Informe o valor de A: ")
B = input("Informe o valor de B: ")
AUX = B
B = A
A = AUX
print("O valor de A agora é ",A," e o de B agora é ",B,".",sep="")
