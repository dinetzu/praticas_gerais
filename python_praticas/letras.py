#--------------------------------------------------------------------------------------

#Verifica se um palavra é palindroma ou não
def palindromoCheckBoolean(palavra):
    palavra_invertida = palavra[::-1] #Inverte a ordem dos caracteres da palavra
    return palavra == palavra_invertida
   
#Calcula o número de letras
def calcularPalavra(palavra):
    tamanho = len(palavra) #Obtém o tamanho de uma String
    return tamanho
   
#Checa a quantia de vogais e consoantes
def calcularVogaisEConsoantes(palavra):
    vogais = 'aeiouáéíóúâêîôûãõ'
    consoantes = 'bcdfghjklmnpqrstvwxyzç'
    #Variaveis de contagem
    total_vogais = 0
    total_consoantes = 0
   
    for letra in palavra.lower(): #Variavel temporáraria recebe o valor de cada parte da palavra
        if letra in vogais: # Se o caracter estiver contido em vogais, ele contará +1
            total_vogais += 1
        elif letra in consoantes: # Se o caracter estiver contido em consoantes, ele contará +1
            total_consoantes += 1
    #Retorna uma mensagem conclusiva
    return print(f"A palavra {palavra} contém {total_vogais} vogais e {total_consoantes} consoantes.")
   
#---------------------------------------------------------------------------------------

#Função que contém o Menu
def menu():
    while True: #Mantém o loop funcionando até que se escolha a opção de 4 -Sair
        #Recebe um número como parâmetro do usuário
        resposta = int(input("1. Contagem de letras\n2. Checar se a palavra é um palíndromo\n3. Contagem de vogais e consoantes\n4. Sair"))
       
        #Chama uma função para cada respota que o usuário solicitar
        if (resposta == 1):
            print(f"A palavra {palavra} contém {calcularPalavra(palavra)} letras.")
        elif (resposta == 2):
            palindromoCheckBoolean(palavra)  
            if palindromoCheckBoolean(palavra):
                print(f"A palavra {palavra} é um palíndromo")
            else:
                print(f"A palavra {palavra} não é um palíndromo")
        elif (resposta == 3):
            calcularVogaisEConsoantes(palavra)
        else:
            if(resposta != 4): #Finaliza o programa
                print("Erro.")
                break
            else:
                print("Tchau")
                break #Encerra o loop
   
palavra = input(f"Seja bem-vindo ao nosso programa!\nDigite uma palavra: ")

print(f"Que procedimento você quer aplicar à sua palavra?")
menu()  #Chama a função menu