# 17) Faça um programa para simular o pagamento em um caixa de supermercado.
# O usuário deverá informar o preço do produto e depois o valor pago pelo
# cliente (este valor deverá ser igual ou maior que o preço do produto).
# Ao final, mostre o valor do troco a ser retornado para o cliente.

preco = float(input("Informe o preço do produto: "))
pago = float(input("Informe o valor pago pelo cliente: "))
troco = pago - preco
if troco >= 0:    
    print("O troco é R$ ",troco,".",sep="")
else:
    print("O cliente deve R$ ",(troco*(-1)),".",sep="")

