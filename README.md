# pratica-3-unidade-3-PROGRAMÇÃO-ORIENTADA-A-OBJETOS
## Exemplo de Cálculo de Áreas de Figuras Geométricas

Este projeto Java demonstra como calcular as áreas de diferentes figuras geométricas, utilizando conceitos de herança e polimorfismo.

### Estrutura do Código

O código é organizado em quatro classes:

1. **`Programa`:** A classe principal que executa o programa.
2. **`FiguraGeometrica`:** Uma classe abstrata que serve como base para todas as formas geométricas.
3. **`Retangulo`:** Uma classe que representa um retângulo e herda de `FiguraGeometrica`.
4. **`Triangulo`:** Uma classe que representa um triângulo e herda de `FiguraGeometrica`.
5. **`Circulo`:** Uma classe que representa um círculo e herda de `FiguraGeometrica`.

### Como Funciona

1. **Criação de objetos:** O programa cria instâncias de `Retangulo`, `Triangulo` e `Circulo`, definindo seus respectivos nomes e dimensões.
2. **Armazenamento em array:** Essas instâncias são armazenadas em um array do tipo `FiguraGeometrica`, aproveitando o polimorfismo.
3. **Iteração e cálculo:** O programa percorre o array de figuras, chamando os métodos `getDescricao()` e `getArea()` para cada figura.  
   * `getDescricao()` retorna uma string com o nome e as dimensões da figura.
   * `getArea()` calcula e retorna a área da figura específica.
4. **Exibição dos resultados:** As descrições e áreas das figuras são exibidas no console.

### Utilização

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Gefferson-Souza/pratica-3-unidade-3-PROGRAMA-O-ORIENTADA-A-OBJETOS.git
   ```

2. **Compile o código:**

   ```bash
   javac Programa.java
   ```

3. **Execute o programa:**

   ```bash
   java Programa
   ```

### Exemplo de Saída

```
Retangulo, base: 10.0, altura: 5.0
Area da figura: 50.00 
Triangulo, base: 10.0, altura: 5.0
Area da figura: 25.00 
Circulo, Raio: 5.0
Area da figura: 78.54 
```

### Observações

* **Abstração:** A classe abstrata `FiguraGeometrica` define a estrutura comum para as figuras.
* **Herança:** As classes `Retangulo`, `Triangulo` e `Circulo` herdam de `FiguraGeometrica`, reutilizando código e especializando comportamentos.
* **Polimorfismo:** O array de `FiguraGeometrica` pode armazenar diferentes tipos de figuras, permitindo o tratamento uniforme delas.

**Contribuições são bem-vindas!** Se você tiver sugestões de melhorias ou novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.
