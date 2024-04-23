# Conversor de moedas

A aplicação referida utiliza a API ExchangeRate para realizar a conversão entre 4 moedas específicas (real brasileiro, dólar, peso argentino e peso colombiano). Para isso, o usuário é apresentado a um menu interativo com 7 opções onde ele poderá escolher a moeda que deseja converter e para qual moeda deseja converter um valor também informado através do console. O usuário pode também escolher uma opção para encerrar a execução do programa.

# Funcionalidade

Para utilizar a aplicação, o usuário deve escolher a opção em que deseja realizar a conversão, por exemplo, se ele deseja converter 100 dólares em reais, o mesmo deve escolher a opção 3 e posteriormente informar o valor de 100 dólares.

A partir da escolha, o programa fará uma requisição a API referida e realizará a conversão entre as moedas (considerando a cotação mais atualizada o possível dentro da API). Por fim, o programa retornará o valor convertido ao usuário, dando a opção do mesmo realizar novas conversões ou sair da aplicação.

# Classes

Principal.java:

É a classe "main" do programa, que executa a chamada para as outras classes e é responsável pelo laço de repetição e o tratamento de exceções.

interfaceMenu.java:

É a classe responsável por exibir as opções do menu conforme o usuário continuar dentro da aplicação.

interacaoMenu.java:

É a classe responsável por receber os dados das moedas (moeda base e moeda para conversão) e também é responsável pelo armazenamento do valor monetário no qual o usuário deseja converter. A mesma também executa a chamada para a função ConversorDeMoeda.java.

ConversorDeMoeda.java:

É a classe que possui a finalidade de conectar o valor a ser convertido e as moedas consideradas na conversão e enviar para a classe ConsultaMoeda.java, retornando o que será mostrado no console após a execução do programa.

ConsultaMoeda.java:

É a classe que executa de fato a requisição para a API utilizando o valor, moeda base e moeda para conversão informados na ação do usuário, tratando também da conversão do formato Json que a API retorna utilizando o GSON.

Moeda.java:

Consiste apenas em um Record que armazena o peso de conversão e o resultado da conversão, de modo que possa ser usado pelas outras classes para o cálculo dos resultados finais.



