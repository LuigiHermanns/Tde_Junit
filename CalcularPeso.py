def calcular():
    print("Digite o IMC: ")
    imc = float(input())
    print("Digite a altura: ")
    altura = float(input())

    peso = imc * (altura ** 2)


    print("O peso ideal é: ", peso)




if __name__ == "__main__":
    calcular()