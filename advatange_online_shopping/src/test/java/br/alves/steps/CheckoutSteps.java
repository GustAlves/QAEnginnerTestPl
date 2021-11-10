package br.alves.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.alves.pages.PageHome;
import br.alves.pages.PageSeeOffer;
import br.alves.pages.PageShoppingCart;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CheckoutSteps {

	private static PageHome page = new PageHome();
	private static PageSeeOffer pageSeeOffer = new PageSeeOffer();
	private static PageShoppingCart pageShoppingCart = new PageShoppingCart();

	@Dado("^que o 'usuario' clique no icone de lupa$")
	public void que_o_usuario_clique_no_icone_de_lupa() throws Throwable {
		page.clickButton(By.id("menuSearch"));
	}

	@Dado("^pesquise o produto \"([^\"]*)\"$")
	public void pesquise_o_produto(String nome_produto) throws Throwable {
		page.write("autoComplete", nome_produto);
	}

	@Dado("^selecionar produto pesquisado$")
	public void selecionar_produto_pesquisado() throws Throwable {
		Thread.sleep(3000);
		page.clickButton(By.xpath("//div[@id='output']/div/div[2]/a[2]/img"));
	}

	@Dado("^alterar a cor do produto para \"([^\"]*)\"$")
	public void alterar_a_cor_do_produto_para(String cor_produto) throws Throwable {
		pageSeeOffer.selectColor(cor_produto);
	}

	@Dado("^alterar a quantidade de produtos para (\\d+)$")
	public void alterar_a_quantidade_de_produtos_para(int qtd_produtos) throws Throwable {
		if (qtd_produtos > 1) {
			for (int i = 1; i < qtd_produtos; i++) {
				pageShoppingCart.clickIncreaseQuantityOfProducts();
			}
		}
	}

	@Quando("^acessar a pagina de checkout$")
	public void acessar_a_pagina_de_checkout() throws Throwable {
		pageSeeOffer.clickCheckOutPopUp();
	}

	@Entao("^validar que a soma dos precos \"([^\"]*)\" corresponde ao total apresentado$")
	public void validar_que_a_soma_dos_precos_corresponde_ao_total_apresentado(String total_produtos) throws Throwable {
		Assert.assertEquals(total_produtos, pageShoppingCart.validateTotal());
	}
}