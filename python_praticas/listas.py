tipolista = input("Digite n para número ou p para palavras: \n") # Escolhe o tipo de lista (Stirng ou Int)

lista = [] # Lista vazia
if(tipolista == "n"): # Verfica o tipo de lista
    
    while True: 
        resposta = input("Digite s para parar ou mande um número para prosseguir: \n") # Cria uma variavel para receber a resposta do usuário
        
        try:
            resposta = int(resposta)   # Define a variavel como valor inteiro
            lista.append(resposta) # Adiciona na lista
        except ValueError:
            if resposta.lower() == "s": # 
                break # Finaliza o loop
        else: 
                print("Insira um número: \n")    
    
    
    ordem = input("Digite c para  crescente ou d para decrescente: \n") # Opção de ordenação da lista
    
    try:
        if (ordem == "c"): 
            lista.sort()    # Ordena
            print("Números em ordem crescente: \n"+ str(lista))
        elif (ordem == "d"):
            lista.sort()    # Ordena
            lista.reverse() # Decrescente
            print("Números em ordem decrescente: \n"+ str(lista))
        else:
            raise ValueError
    except ValueError:
        print("Erro: digite apenas c ou d. ") # Imprime a lista em ordem crescente ou decrescente


elif (tipolista == "p"): # Lista para palavras(caracteres no geral)

    while True:
        resposta = input("Digite s para parar ou mande uma palavra para prosseguir: \n")
        resposta = str(resposta)
        if (resposta!="s"):
            lista.append(resposta)

        if resposta.lower() == "s":
            break    
    
    ordem = input("Digite c para  crescente ou d para decrescente: \n")
    
    try:
        if (ordem == "c"):
            lista.sort()
            print("Palavras em ordem crescente: \n"+ str(lista))
        elif (ordem == "d"):
            lista.sort()
            lista.reverse()
            print("Palavras em ordem decrescente: \n"+ str(lista))
        else:
            raise ValueError
    except ValueError:
        print("Erro: digite apenas c ou d. ")

    else:
        print("Erro: os únicos valores aceitos são n ou p.")       


        '''OBS:
                Na lista de números há uma estrutura try-except, pois as letras não podem assumir valor numérico.
                 No entanto, na lista de palavras não existe  essa preocupação porque números também são considerados caracteres. '''