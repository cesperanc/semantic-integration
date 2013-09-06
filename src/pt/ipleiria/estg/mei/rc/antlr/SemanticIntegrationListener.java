// Generated from SemanticIntegration.g4 by ANTLR 4.0

         package pt.ipleiria.estg.mei.rc.antlr;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SemanticIntegrationListener extends ParseTreeListener {
	void enterProduto(SemanticIntegrationParser.ProdutoContext ctx);
	void exitProduto(SemanticIntegrationParser.ProdutoContext ctx);

	void enterDescricao_simples(SemanticIntegrationParser.Descricao_simplesContext ctx);
	void exitDescricao_simples(SemanticIntegrationParser.Descricao_simplesContext ctx);

	void enterFamilia_na_descricao(SemanticIntegrationParser.Familia_na_descricaoContext ctx);
	void exitFamilia_na_descricao(SemanticIntegrationParser.Familia_na_descricaoContext ctx);

	void enterContem(SemanticIntegrationParser.ContemContext ctx);
	void exitContem(SemanticIntegrationParser.ContemContext ctx);

	void enterGrandeza(SemanticIntegrationParser.GrandezaContext ctx);
	void exitGrandeza(SemanticIntegrationParser.GrandezaContext ctx);

	void enterPropriedade(SemanticIntegrationParser.PropriedadeContext ctx);
	void exitPropriedade(SemanticIntegrationParser.PropriedadeContext ctx);

	void enterDescricao(SemanticIntegrationParser.DescricaoContext ctx);
	void exitDescricao(SemanticIntegrationParser.DescricaoContext ctx);

	void enterNumero(SemanticIntegrationParser.NumeroContext ctx);
	void exitNumero(SemanticIntegrationParser.NumeroContext ctx);

	void enterPropriedades(SemanticIntegrationParser.PropriedadesContext ctx);
	void exitPropriedades(SemanticIntegrationParser.PropriedadesContext ctx);

	void enterDesconhecido(SemanticIntegrationParser.DesconhecidoContext ctx);
	void exitDesconhecido(SemanticIntegrationParser.DesconhecidoContext ctx);

	void enterPropriedadesSemprodutos(SemanticIntegrationParser.PropriedadesSemprodutosContext ctx);
	void exitPropriedadesSemprodutos(SemanticIntegrationParser.PropriedadesSemprodutosContext ctx);

	void enterQuantidade(SemanticIntegrationParser.QuantidadeContext ctx);
	void exitQuantidade(SemanticIntegrationParser.QuantidadeContext ctx);

	void enterQuantidades(SemanticIntegrationParser.QuantidadesContext ctx);
	void exitQuantidades(SemanticIntegrationParser.QuantidadesContext ctx);

	void enterDescricao_simples_Sem_Familia(SemanticIntegrationParser.Descricao_simples_Sem_FamiliaContext ctx);
	void exitDescricao_simples_Sem_Familia(SemanticIntegrationParser.Descricao_simples_Sem_FamiliaContext ctx);

	void enterProduto_desconhecido(SemanticIntegrationParser.Produto_desconhecidoContext ctx);
	void exitProduto_desconhecido(SemanticIntegrationParser.Produto_desconhecidoContext ctx);

	void enterPropriedade_desconhecida(SemanticIntegrationParser.Propriedade_desconhecidaContext ctx);
	void exitPropriedade_desconhecida(SemanticIntegrationParser.Propriedade_desconhecidaContext ctx);

	void enterDescricao_composta(SemanticIntegrationParser.Descricao_compostaContext ctx);
	void exitDescricao_composta(SemanticIntegrationParser.Descricao_compostaContext ctx);

	void enterDescricao_simples_Com_Familia(SemanticIntegrationParser.Descricao_simples_Com_FamiliaContext ctx);
	void exitDescricao_simples_Com_Familia(SemanticIntegrationParser.Descricao_simples_Com_FamiliaContext ctx);

	void enterPropriedade_receita(SemanticIntegrationParser.Propriedade_receitaContext ctx);
	void exitPropriedade_receita(SemanticIntegrationParser.Propriedade_receitaContext ctx);
}