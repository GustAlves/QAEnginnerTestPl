#language :pt
Funcionalidade: Pagina Special Offer

	Cenario: Validar especificacoes do produto
		Dado que o 'usuario' clicar na opcao 'Special Offer'
		Quando clicar no botao 'See offer'
		Entao Validar as especificacoes do produto

	Cenario: Validar alteracao de cor do produto no carrinho
		Dado que o 'usuario' clicar na opcao 'Special Offer'
		Quando clicar no botao 'See offer'
		E selecionar a cor 'GRAY'
		E clicar no botao 'Add to cart'
		Entao validar que produto foi adicionado ao carrinho com a cor selecionada

	Cenario: Remover produto do carrinho de compras
		Dado que o 'usuario' clicar na opcao 'Special Offer'
		Quando clicar no botao 'See offer'
		E clicar no botao 'Add to cart'
		E clicar no carrinho de compras
		Quando clicar em remover o produto do carrinho de compras
		Entao Validar que o carrinho de compras esta vazio