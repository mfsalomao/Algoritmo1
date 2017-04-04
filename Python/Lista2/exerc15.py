# 15) Muitos países estão passando a usar o sistema métrico.
# Preparar um algoritmo para executar a conversão de Celsius para Fahrenheit.
# A fórmula de conversão é: F= (9*C+160) / 5, sendo F a temperatura em
# Fahrenheit e C a temperatura em Celsius.

C = float(input("Informe a temperatura em Celsius: "))
F = (9*C+160) / 5
print("A temperatura em Fahrenheit é ",F,".",sep="")
