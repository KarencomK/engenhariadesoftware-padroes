# engenhariadesoftware-padroes

A proposta do padr�o Decorator � de encapsular um objeto de destino para que se possam adicionar dinamicamente 
novas responsabilidades em tempo de execu��o. 
Cada Decorator pode encapsular um no outro,
 o que permite um n�mero teoricamente ilimitado de Decorators de objetos destino.

No projeto do NetBeans foi simulado uma sorveteria onde era adicionadas as bolas de sorvete, 
o sabor que cada uma tinha e os valores.

Come�ando pela classe Sorvete, � abstrata para que n�o seja instanciada,
onde vai ter os principais atributos como nome, pre�o e quantidade de bolas.

A classe SorveteSabor vai extender Sorvete, aonde vai ser refenciado
a classe Sorvete sorvete, de acordo com o decorator, o metado SorveteSabor recebe
como parametro (Sorvete sorvete) vai ser repassado como referencia para o atributo.

No caso da classe creme (o mesmo serve para todos os sabores) vai extender SaborSorvete
sem ser abstrata, no contrutor vai receber como par�metro a classe (Sorvete sorvete) e vai passar
como referencia para a super classe "super(sorvete)" por meio do operado super, e implentar os m�todos 
abstratos getQuantidadeBolas e getPreco da classe Sorvete 

getPreco= acrescentar 1.25 a referencia de sorvete que j� esta armazenada na super classe que ser� enviada por meio do contrutor.

getQuantidadeBolas = getPreco

A Classe sorveteNapolitano extende Sorvete, onde a classe principal ter� como objetivo configurar o setNome,
 implementando tambem os m�todos abstratos e retornando 0 em ambas.

e a classe principal � o Decorator,  vamos chamar a classe SorveteNapolitano e usar um Static retornaInforma��es para fazer o pre�o do sorvete e a quantidade de bolas.

