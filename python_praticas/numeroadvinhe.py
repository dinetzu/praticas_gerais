# importa extensão para gerar números aleatórios
import random

# explica a finalidade do programa
print("Olá, este é um programa que tem como fim advinhar um número randômico entre 1 e 20 \n Você terá seis tentativas \n Divirta-se")

# cria-se um número aleatório, delimitando-o entre 1 e 20
num = random.randint(1, 20)

# cria-se uma estrutura para fazer a mesma pergunta apenas seis vezes
for resposta in range(6):
    # cria-se uma variável para receber a resposta do usuário
    resposta = input("Digite seu palpite: ")
    
    # cria-se um try except para checar se usuário inseriu um valor inteiro ou não
    try:
        # define a variável resposta como a entrada numérica da resposta do usuário
        resposta = int(resposta)
        # caso o usuário acerte o número sorteado
        if(resposta == num):
            # parabeniza o usuário
            print("Você acertou! \n Parabéns")
            # finaliza o loop
            break
        else:
            if(resposta > num):
                # dá uma dica ao usuário
                print("Ops, tente um número menor!")
            else:
                # dá uma dica ao usuário
                print("Ops, tente um número maior!")
    # except para captar a entrada inválida do usuário
    except ValueError:
        # repreende o usuário
        print("Insira um valor numérico!")
