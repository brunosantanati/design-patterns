## Quando usar cada Design Pattern (explicações do curso)

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o Strategy?

O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação. No exemplo do vídeo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.

O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o Chain of Responsibility?

O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o Template Method?

Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.

Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o Decorator?

Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser compostos por outros impostos. O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o State?

A principal situação que faz emergir o Design Pattern State é a necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando usar o Builder?

Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.

Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Quando podemos aplicar o padrão Observer?

Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes a serem executadas após um determinado processo, podemos implementar o Observer.

Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.

#### ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) Além dos padrões de projeto

Parabéns! Você chegou ao final do curso de padrões de projeto. A pergunta agora é: acabou? Não há mais o que estudar?

Pelo contrário, ainda existem muitas coisas a serem estudadas! O primeiro, e talvez mais importante ponto desse curso, é entender o bom uso de orientação a objetos, que todos os padrões de projeto fazem tanto uso.

Você deve ter reparado, ao longo do curso, que todos os padrões de projeto tentam desacoplar seu código, além de criar classes coesas, com poucas responsabilidades. Para isso, todos eles fazem uso de abstrações, sejam elas implementadas através de interfaces ou classes abstratas, e separam o tempo todo as diversas responsabilidades em pequenas classes. Observe como os padrões resolveram problemas complexos do mundo procedural de maneira clara e simples. Veja as ideias por trás dele, e adapte-os para o seu problema. Lembre-se que no final, o que importa é código de qualidade.

Existem ainda muitos outros padrões de projeto espalhados por aí. Padrões que visam ajudar na solução dos mais diversos tipos de problemas. Como sempre, ao ver um padrão, entenda a motivação do padrão; a razão dele existir. Não vá direto para a implementação. Um padrão é mais do que uma implementação, mas sim um conceito, uma ideia de como resolver um problema.

Esperamos que essa ideia tenha ficado clara ao longo do curso. Refaça os exercícios, leia novamente as definições dos padrões que você estudou em livros ou internet, e reforce seus conceitos.

Mas no final, lembre-se: o que importa é código de qualidade. Se você implementou uma solução que faz uso de boa orientação a objetos, mas não sabe qual padrão usou, não tem problema; o seu código e os outros desenvolvedores agradecem mesmo assim!
