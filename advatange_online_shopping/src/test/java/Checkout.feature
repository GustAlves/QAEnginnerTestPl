#language :pt
Funcionalidade: Pagina de checkout

	Esquema do Cenario: Validar especificacoes do produto
		Dado que o 'usuario' clique no icone de lupa
		E pesquise o produto <nome_produto>
		E selecionar produto pesquisado
		E alterar a cor do produto para <cor_produto>
		E alterar a quantidade de produtos para <qtd_produtos>
		Quando clicar no botao 'Add to cart'
		E acessar a pagina de checkout
		Entao validar que a soma dos precos <total_produtos> corresponde ao total apresentado

		Exemplos:
			| nome_produto                   |cor_produto |qtd_produtos|total_produtos|
			| "HP PAVILION 15Z TOUCH LAPTOP" |"AZUL"      |1           |"$449.99"     |
			| "HP PAVILION 15Z TOUCH LAPTOP" |"PRETO"     |2           |"$899.98"     |
			| "HP PAVILION 15Z TOUCH LAPTOP" |"CINZA"     |3           |"$1,349.97"   |