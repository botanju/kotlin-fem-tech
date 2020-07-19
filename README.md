# kotlin-fem-tech

Mini curso para quem esta iniciando com o aprendizado de Android kotlin, cada pasta representa um código backup para cada etapa do curso. 
Este app é um mini aplicativo com exemplos de requisição e construção de listas.

## Módulo 1 - Home
Criar sua primeira aplicação com uma tela de home (código de referência SampleApp - home)
A tela de Home deve conter um botão que vai abrir uma nova tela vazia

## Módulo 2 - Requisição
Criar a estrutura básica para fazer uma requisição REST quando abrir a segunda tela (código de referência SampleApp - requisição)
API utilizada: https://jsonplaceholder.typicode.com/users/

## Modulo 3 - Lista
Criar o layout para exibir a lista retornada na requisição (feita no módulo 2) (código de referência SampleApp - lista)
Quando o usuário clicar em um item da lista, deverá ser redirecionado para uma nova tela vazia recebendo o id do usuário selecionado na lista

## Modulo 4 - Detalhe
Criar a requisição para buscar as postagens do usuário selecionado no módulo anterior e exibir o resultado numa lista (código de referência SampleApp - detalhes)
API utilizada: https://jsonplaceholder.typicode.com/posts?userId={id}


## Ficha técnica
 - App exemplo desenvolvido em `Kotlin`
 - Estrutura de Layouts utilizados: `ConstraintLayout`, `LinearLayout`
 - Request realizadas usando: `Retrofit`
 - Lista: `recyclerview`
 - Parse de modelos `gson`
