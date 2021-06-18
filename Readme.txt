		Instruções para uso do sistema de Eleição

	Lucas Martins Vasconcelos

O sistema consiste em um aplicativo voltado para desktop, desenvolvido
em java na plataforma NetBeans versão 12.0 em um ambiente de desenvol-
vimento windows 10.

O app, ainda em construção, permite realizar todo o fluxo de operações
que necessita uma eleição, desde sua criação/cadastro, até sua realiza-
ção/votação.

O software possui um funcionamento a partir de 2 tipos de usuários chave, 
o eleitor e o administrador, nas quais a partir da discriminação entre eles,
haverá diferentes funcionalidades para cada um.

Sendo que, para o eleitor, é permitido apenas algumas funções: visualizar 
quais eleições está cadastrado, visualizar os candidatos cadastrados nas res-
pectivas eleições, emitir o voto no candidato escolhido e ver as informações
do sistema, quais os desenvolvedores, data e versão. Enquando que para o 
administrador é permitido outras funções, como: cadastrar uma eleição, ca-
dastrar eleitores e candidatos e inseri-los em eleições já cadastradas, vi-
sualizar os resultados das eleições após os eleitores terem emitidos seus
votos.

Para cadastrar uma eleição, o administrador terá que entrar no sistema e se
identificar como administrador, fazer login com seus dados e em seguida irá
entrar em uma área de cadastro de eleição, onde terá que preencher dados como
o nome da eleição, a data em que será realizada, colocar uma pequena descrição
da mesma e em seguida clicar no botão cadastrar eleição. Nessa mesma área também
é possível visualizar outros botões: voltar, cadastrar eleitores, cadastrar can-
didatos e visualizar resultados. O botão voltar retorna para janela de login,
visualizar resultados abre outra janela onde, inserindo o nome da eleição dese-
jada, será aberto uma janela de diálogo apresentando os dados apurados da res-
pectiva eleição.

Ainda na mesma área de cadastro de eleição, o botão de cadastrar eleitores abrirá
uma outra área com locais a serem preenchidos com os dados do eleitor que deseja-
se cadastrar, seu nome, cpf, idade, sua cidade, seu nome de usuário e senha que
serão usados para realizar login no sistema. Nesta área de cadastrar eleitor tam-
bém se encontra um local para inseri-lo em alguma eleição já cadastrada, em que
inserindo o cpf do eleitor desejado e o nome da eleição e clicando em adicionar,
o eleitor desejado já estará cadastrado na eleição selecionada. clicando em vol-
tar, será redirecionado para área de cadastro de eleição, em em seguida clicando
em cadastrar candidatos será levado para uma área, onde poderá ser preenchido da-
dos de um novo candidato, como o numero_id, que pode ser interpretado como sua
chapa, seu nome, cpf, idade, e uma pequena descrição, em seguida basta clicar em
cadastrar que o novo candidato será adicionado ao sistema. Nesta mesa janela há
um local para inserir o candidato em uma eleição já cadastrada assim como anteri-
ormente. Basta preencher o cpf do candidato desejado, o nome da eleição que se
deseja inserir o candidato e clicar em adicionar, que o candidato já será inseri-
do na eleição. Clicando em voltar será redirecionado à area de cadastro de elei-
ção.Clicando em voltar novamente, irá para área de login, e a mesma operação mais
uma vez, irá para o local de identicicação de qual usuário você é: administrador
ou eleitor.

Entrando no sistema como eleitor, após realizar login com seu nome de usuário e
senha previamente cadastrados, será direcionado para uma área onde poderá ver
informações do software clicando em ver sistema, ver quais eleições está cadas-
trado, preenchendo seu cpf e clicando em ver eleições, abrir o campo de votação
clicando no botão apropriado e por fim sair do sistema clicando em sair. Caso
clique para ir ao campo de votação será aberto uma janela onde poderá emitir seu
voto. Preenchendo o nome da eleição desejada, poderá ver os candidatos que estão
participando, sua descrição e sua chapa, assim em local apropriado, poderá preen-
cher a chapa do candidato desejado e clicar em votar para emitir seu voto. Caso
queira emitir seu voto em outra eleição, basta preencher o nome da eleição para
verificar quais os candidatos que estão participando da outra eleição desejada,
escolher aquele que mais lhe agrada e emitir seu voto. Clicando em sair, será
redirecionado para área de identificação de usuário.

Para cadastrar outro administrador, o processo é um pouco diferente, pois será
necessário abrir os arquivos de funcionamento do sistema, ou seja, entrar na pas-
ta Eleicao, entrar na pasta src, entrar na pasta eleicao, procurar e abrir o ar-
quivo listaAdms e preencher com o seguinte formato: username;senha. substitua o 
campo username pelo nome de usuário desejado e o campo senha pela senha desejada.
Obrigatoriamente estas duas variáveis devem ser separadas por ponto e vírgula,
pois se trata de um arquivo do tipo .csv.Neste arquivo, provavelmente já have-
rão outros admistradores cadastrados, então basta seguir o formato.
