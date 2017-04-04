# 19) Você irá fazer uma viagem internacional e precisa levar seu dinheiro
# em dólares. Elabore um algoritmo para calcular e apresentar do valor da
# conversão de real (R$) para dólar (US$). O algoritmo deverá solicitar
# o valor da cotação do dólar e quantos Reais(R$) você tem para converter
# em dólar. Ao final mostre a quantidade de dólares que você irá levar
# para a viagem.

cotacao = float(input("Informe a cotação do dólar: "))
real = float(input("Informe o valor em reais: "))
dolar = real / cotacao
print("O valor em dólares é US$ ",dolar,".",sep="")
