package br.alves.steps;

import org.junit.Assert;

import br.alves.pages.PageHome;
import br.alves.pages.PageSeeOffer;
import br.alves.pages.PageShoppingCart;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SpecialOffersSteps {

	private static PageHome page = new PageHome();
	private static PageSeeOffer pageSeeOffer = new PageSeeOffer();
	private static PageShoppingCart pageShoppingCart = new PageShoppingCart();

	@Dado("^que o 'usuario' clicar na opcao 'Special Offer'$")
	public void que_o_usuario_clicar_na_op_o_Special_Offer() throws Throwable {
		page.clickButtonByText("SPECIAL OFFER");
	}

	@Quando("^clicar no botao 'See offer'$")
	public void clicar_no_botao_See_offer() throws Throwable {
		pageSeeOffer.clickButtonSeeOffer();
	}

	@Entao("^Validar as especificacoes do produto$")
	public void validar_as_especificacoes_do_produto() throws Throwable {
		Assert.assertEquals("Simplicity", pageSeeOffer.validateCustomization());
		Assert.assertEquals("15.6-inch diagonal Full HD WLED-backlit Display (1920x1080) Touchscreen",
				pageSeeOffer.validateDisplay());
		Assert.assertEquals("1920x1080", pageSeeOffer.validateDisplayResolution());
		Assert.assertEquals("15.6", pageSeeOffer.validateDisplaySize());
		Assert.assertEquals("16GB DDR3 - 2 DIMM", pageSeeOffer.validateMemory());
		Assert.assertEquals("Windows 10", pageSeeOffer.validateOperatingSystem());
		Assert.assertEquals("PROCESSOR AMD Quad-Core A10-8700P Processor + AMD Radeon(TM) R6 Graphics",
				pageSeeOffer.validateProcessor());
		Assert.assertEquals("Yes", pageSeeOffer.validateTouchScreen());
		Assert.assertEquals("5.51 lb", pageSeeOffer.validateWeight());
		Thread.sleep(2000);
	}

	@Quando("^selecionar a cor 'GRAY'$")
	public void selecionar_a_cor_GRAY() throws Throwable {
		pageSeeOffer.selectColor("CINZA");
	}

	@Quando("^clicar no botao 'Add to cart'$")
	public void clicar_no_botao_Add_to_cart() throws Throwable {
		pageSeeOffer.clickButtonADDToCart();
	}

	@Entao("^validar que produto foi adicionado ao carrinho com a cor selecionada$")
	public void validar_que_produto_foi_adicionado_ao_carrinho_com_a_cor_selecionada() throws Throwable {
		pageSeeOffer.clickCheckOutPopUp();
		Assert.assertEquals("HP PAVILION 15Z TOUCH LAPTOP", pageShoppingCart.validatePurchasedItem());
		Assert.assertEquals("GRAY", pageShoppingCart.validateColorItem());
	}

	@Quando("^clicar no carrinho de compras$")
	public void clicar_no_carrinho_de_compras() throws Throwable {
		pageSeeOffer.clickShoppingBasket();
	}

	@Quando("^clicar em remover o produto do carrinho de compras$")
	public void clicar_em_remover_o_produto_do_carrinho_de_compras() throws Throwable {
		pageShoppingCart.clickRemoveProduct();
	}

	@Entao("^Validar que o carrinho de compras esta vazio$")
	public void validar_que_o_carrinho_de_compras_esta_vazio() throws Throwable {
		pageShoppingCart.validateEmptyBasket();
	}

}
