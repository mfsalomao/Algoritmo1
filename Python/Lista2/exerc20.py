# 20) Escrever um algoritmo que leia o nome de um vendedor,
# o seu salário fixo e o total de vendas efetuadas por ele
# no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
# sobre suas vendas efetuadas, informar ao final do programa o seu nome,
# o salário fixo e salário no final do mês.

vendedor = input("Informe o nome do vendedor: ")
fixo = float(input("Informe o salário fixo do vendedor: "))
vendas = float(input("Informe o total de vendas efetuadas: "))
salario = fixo + 0.15*vendas
print("Vendedor: ",vendedor)
print("Salário fixo: R$",fixo)
print("Salário total: R$",salario)
