# engenhariadesoftware-padroes

A proposta do padrão Decorator é de encapsular um objeto de destino para que se possam adicionar dinamicamente 
novas responsabilidades em tempo de execução. 
Cada Decorator pode encapsular um no outro,
 o que permite um número teoricamente ilimitado de Decorators de objetos destino.

No projeto do NetBeans foi simulado uma sorveteria onde era adicionadas as bolas de sorvete, 
o sabor que cada uma tinha e os valores.

Começando pela classe Sorvete, é abstrata para que não seja instanciada,
onde vai ter os principais atributos como nome, preço e quantidade de bolas.

A classe SorveteSabor vai extender Sorvete, aonde vai ser refenciado
a classe Sorvete sorvete, de acordo com o decorator, o metado SorveteSabor recebe
como parametro (Sorvete sorvete) vai ser repassado como referencia para o atributo.

No caso da classe creme (o mesmo serve para todos os sabores) vai extender SaborSorvete
sem ser abstrata, no contrutor vai receber como parâmetro a classe (Sorvete sorvete) e vai passar
como referencia para a super classe "super(sorvete)" por meio do operado super, e implentar os métodos 
abstratos getQuantidadeBolas e getPreco da classe Sorvete 

getPreco= acrescentar 1.25 a referencia de sorvete que já esta armazenada na super classe que será enviada por meio do contrutor.

getQuantidadeBolas = getPreco

A Classe sorveteNapolitano extende Sorvete, onde a classe principal terá como objetivo configurar o setNome,
 implementando tambem os métodos abstratos e retornando 0 em ambas.

e a classe principal é o Decorator,  vamos chamar a classe SorveteNapolitano e usar um Static retornaInformações para fazer o preço do sorvete e a quantidade de bolas.

