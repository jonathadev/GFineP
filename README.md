# Anote Já!

NOTA DE LIBERAÇÃO: Anote Já!

INTRODUÇÃO
Este documento provê uma visão geral da versão do aplicativo Anote Já que está sendo liberada. Aqui descreveremos as funcionalidades do aplicativo, bem como seus problemas e limitações conhecidos. Por último são descritas as demandas e os problemas que foram resolvidos para liberação da versão atual.

1.	NOTA DE RELEASE A SER PUBLICADO
•	  1 – Inserido iconepersonalizado 
•   2 – inserido tela de splash
•	  3 – modificado backgroud para padrão da IDE.
•	  4 – Compartibilidade para Sistema operacional Android API 10: Android 2.3.3 (Gingerbread)
•	  5 – Tradução dos botões e resposta das funções CRUD para português.
•	  6 – Mudadado nome do aplicativo (antes GfineP para AnoteJa)  devida caracteriticas  da estrutura não implementada.
•	  7 - O espaço para escrever anotação agora auto apaga texto.
•	  8 – Concertado botoes deletar e editar.
•	  9 – Removido opção "Nova Despesas" 



2.	PROBLEMAS CONHECIDOS E LIMITAÇÕES
Limitação
As notas são amazenadas ate que processo da aplicação seja fechado.
Botão deletar fecha a aplicação caso nenhuma anotação selecionada. 
Não tem banco de dados interno e nem externo.
Não tem login de usuário.


3.	DATAS IMPORTANTES
Segue abaixo as datas importante do desenvolvimento:
10/03/2016	Início do planejamento
10/03/2016	Início do desenvolvimento
01/06/2016	Entrega para teste
09/06/2016	Fim do teste
09/06/2016	Liberação para produção


4.	COMPATIBILIDADE
Segue abaixo os requisitos:
Requisitos	Ferramentas
Sistema operacional	 Mínimo Android API 10: Android 2.3.3 (Gingerbread)

Tecnologias
Linguagem de programação	Java orientado a objetos
Framework WEB	Não existente
IDE 	Android Studio
Design pattern	Google
Servidor Web	Não existente

5.	PROCEDIMENTO E ALTERAÇAO DE CONFIGURAÇÃO DO AMBIENTE
Descrever o processo de implantação.
Nesta versão foi Necessario atualização para adaptação da classe do splash na IDE Android Studio. Devido funções usadas como Runnable para android support repositor ver 32
Teste efetuado em dispositos spmatphone Motorola XT305, MOTOXPLAY, e ferramenta Bluestacks


6.	ATIVIDADES REALIZADAS NO PERÍODO

1
Inserido ícone personalizado 
Possibilitar o usuário a identificação da aplicação de forma atrativa. 
Concluído
Imagem editada de imagens google na ferramenta PhotoScape

2
inserido tela de splash	Para melhor a aparência do aplicativo.	
Concluído	
Criado nova classejava e editado o androidManifest.xml para definir como tela inicial (launcher).

3	
modificado backgroud para padrão da IDE	Backgroud do layout na cor preta as letras não apareciam em na ferramenta (bluestacks) e dispositovos testados mais novos não apareciam bonita segundo usuario. sendo assim modificada para backgroud padrão. 
Concluído	

4	
Compartibilidade para Sistema operacional Android API 10: Android 2.3.3 (Gingerbread) e resolução telas.
Em estruturas de projeto flavors foi  possível implementação a adaptação para maior abrangência de versão do sistema operacacional android API 10: Android 2.3.3 (Gingerbread) e também necessário a mudança versão de previsão do layout da IDE para ajuste  de tamanho de tela no  dispositivo Motorola XT305.
Concluído	

5	
Tradução do Sistema	Tradução dos botões e resposta das funções CRUD para português.	
Concluído
Atualmente somente português antes era em inglês 

6	
Nome aplicativo	Mudadado nome do aplicativo (antes GfineP para AnoteJa)  devida caracteriticas  da estrutura não implementada.	Concluído	

7	
Campo para escrever a anotação	O espaço para escrever anotação edittext agora auto apaga texto.
Concluído
No arquivo xml do layout foi editado como exemplo a seguir android:text="Enter Name" para android:hint="Enter Name"
Ele exibe o texto quando o campo de entrada está vazia, selecionada ou não

8
Botoes deletar e editar	antes fechava a aplicação caso nenhuma anotação selecionada.	Concluido	

9
Remover opção "Nova Despesas" e classes java layout xml	Itens não implementados, sendo desnecessários.	Concluido	


REFERÊNCIAS  
Edittext auto apagar - http://pt.androids.help/q26205
CRUD – video em inglês  https://www.youtube.com/watch?v=WnTKJKNB4kc 
Icone e splash pelo Curso Udemy no Android no Android Studio https://www.udemy.com/draft/354406/?utm_medium=post_enroll&dl=1&utm_campaign=post_enroll&aa7ac=EyN/HjgDByVQHV8eLw4FJFBR&utm_source=email_pro&utm_content=t1
Erros android studio, git e demais adaptações no site http://pt.stackoverflow.com/
Vídeo no youtube Android Studio - Como exportar APK https://www.youtube.com/watch?v=f8qTzVfO4gA
Github tutorial http://www.guj.com.br/t/como-colocar-projetos-no-github/190687/2

