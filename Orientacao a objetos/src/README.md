# Aprendendo Classes e objetos

## Classes s�o formas que criam objetos
> As classe podem ser chamadas de duas formas
> - Static onde n�o precisa dar new para utilizar o (ponto) por�m somente itens static aparecem como op��o
> - objeto onde para acessar os atributos e metodos � necess�rio dar new para cria um objeto

## Encapsulamento
> Pode ser visto como uma burocracia no c�digo, por�m, facilita e muito a refatora��o com o m�nimo ou nenhum impacto para 
> quem j� consome os objetos dessa classe.
> Exemplos:
> - alterar o nome de um atributo que esta sento acessado diretamente fora da classe, requer que la fora seja ajustado tamb�m
> - mudar privil�gios de altera��o ou leitura sem impactar em quem consome, basta alterar a implementa��o dos gets e sets
