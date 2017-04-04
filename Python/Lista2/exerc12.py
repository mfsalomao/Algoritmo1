# 12) Escreva um algoritmo para determinar o consumo médio
# de um automóvel sendo que será fornecida via teclado a distância total
# percorrida pelo automóvel e o total de combustível gasto.

distancia = float(input("Informe a distância percorrida em quilômetros: "))
combustivel = float(input("Informe o combustível gasto em litros: "))
consumo = distancia / combustivel
print("O consumo do automóvel é de ",consumo," km/l.",sep="")
