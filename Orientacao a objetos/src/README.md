# Aprendendo Classes e objetos

## Classes são formas que criam objetos
> As classe podem ser chamadas de duas formas
> - Static onde não precisa dar new para utilizar o (ponto) porém somente itens static aparecem como opção
> - objeto onde para acessar os atributos e metodos é necessário dar new para cria um objeto

## Encapsulamento
> Pode ser visto como uma burocracia no código, porém, facilita e muito a refatoração com o mínimo ou nenhum impacto para 
> quem já consome os objetos dessa classe.
> Exemplos:
> - alterar o nome de um atributo que esta sento acessado diretamente fora da classe, requer que la fora seja ajustado também
> - mudar privilégios de alteração ou leitura sem impactar em quem consome, basta alterar a implementação dos gets e sets
