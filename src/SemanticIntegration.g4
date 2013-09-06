/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar SemanticIntegration;
options {
	language = Java;
}

@header {
         package pt.ipleiria.estg.mei.rc.antlr;
}
//Token
//Rule
descricao returns [String value ]: ( 
    descricao_composta {$value="<DESCRICAO_COMPOSTA valor=\""+$descricao_composta.text+"\">"+$descricao_composta.value+"</DESCRICAO_COMPOSTA>\n";}
)
;
descricao_composta returns [String value ]: 
    descricao_simples                                                       { $value="<DESCRICAO_SIMPLES>"+$descricao_simples.value+"</DESCRICAO_SIMPLES>"; }
    | left=descricao_composta GRAMATICA_COM descricao_simples               { $value=$left.value+"<DESCRICAO_SIMPLES>"+$descricao_simples.value+"</DESCRICAO_SIMPLES>"; }
    | left=descricao_composta GRAMATICA_E right=descricao_composta          { $value=$left.value+$right.value; }
    | left=descricao_composta GRAMATICA_DISJUNCAO descricao_simples         { $value=$left.value+$descricao_simples.value; }
    | left=descricao_composta GRAMATICA_PREPOSICAO right=descricao_composta { $value=$left.value+$right.value; }
;
descricao_simples returns [String value ]: 
    descricao_simples_Com_Familia   { $value=$descricao_simples_Com_Familia.value; }	
    | descricao_simples_Sem_Familia { $value=$descricao_simples_Sem_Familia.value; }		
;
descricao_simples_Com_Familia returns [String value ]:
    familia_na_descricao                                                        { $value=$familia_na_descricao.value; } 		
    | familia_na_descricao descricao_simples_Sem_Familia                        { $value=$familia_na_descricao.value+$descricao_simples_Sem_Familia.value; } 		
    | familia_na_descricao GRAMATICA_PREPOSICAO descricao_simples_Sem_Familia   { $value=$familia_na_descricao.value+$descricao_simples_Sem_Familia.value; } 		
    | familia_na_descricao propriedades                                         { $value=$familia_na_descricao.value+$propriedades.value; } 		
;
familia_na_descricao  returns [String value ]:	CLASSE_TODASASCLASSES       { $value="<CLASSE_TODASASCLASSES valor=\""+$CLASSE_TODASASCLASSES.text+"\"/>"; }		
;
descricao_simples_Sem_Familia returns [String value ] :
    produto                                                                             { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$produto.value; }	
    | GRAMATICA_PREPOSICAO produto                                                      { $value="<PRODUTO valor=\""+$produto.text+"\"/>"; }
    | produto propriedades                                                              { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$propriedades.value; }	//here
    | produto GRAMATICA_PREPOSICAO propriedades                                         { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$propriedades.value; }
    | produto propriedades quantidades                                                  { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$propriedades.value+$quantidades.value; }				
    | produto lefts=propriedades quantidades rights=propriedades                        { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$lefts.value+$quantidades.value+$rights.value; }				
    | quantidades                                                                       { $value=$quantidades.value; }	
    | quantidades produto                                                               { $value=$quantidades.value+"<PRODUTO valor=\""+$produto.text+"\"/>"; }
    | quantidades propriedades                                                          { $value=$quantidades.value+$propriedades.value; }
    | quantidades produto propriedades                                                  { $value=$quantidades.value+"<PRODUTO valor=\""+$produto.text+"\"/>"+$propriedades.value; }
    | quantidades lefts=propriedades GRAMATICA_PREPOSICAO produto rights=propriedades   { $value=$quantidades.value+$lefts.value+"<PRODUTO valor=\""+$produto.text+"\"/>"+$rights.value; }
    | produto quantidades                                                               { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$quantidades.value; }
    | produto quantidades propriedades                                                  { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$quantidades.value+$propriedades.value; }
    | produto left=quantidades propriedades right=quantidades                           { $value="<PRODUTO valor=\""+$produto.text+"\"/>"+$left.value+$propriedades.value+$right.value; }

;
quantidades	 returns [String value ]: 
    grandeza                                                    { $value=$grandeza.value; }
    | quantidade                                                { $value=$quantidade.value; }
    | quantidade GRAMATICA_PREPOSICAO                           { $value=$quantidade.value; }	
    | left=quantidade right=quantidade                          { $value=$left.value+$right.value; }	
    | quantidade grandeza                                       { $value=$quantidade.value+$grandeza.value; }
    | quantidade grandeza GRAMATICA_PREPOSICAO                  { $value=$quantidade.value+$grandeza.value; }
    | quantidade grandeza right1=quantidades                     { $value=$quantidade.value+$grandeza.value+$right1.value; }
    | quantidade grandeza GRAMATICA_PREPOSICAO right1=quantidades{ $value=$quantidade.value+$grandeza.value+$right1.value; }
;



quantidade  returns [String value ]:
    numero                          { $value=$numero.value; }
    | PROPRIEDADE_TAMANHO           { $value="<PROPRIEDADE_TAMANHO valor=\""+$PROPRIEDADE_TAMANHO.text+"\"/>"; }
    | PROPRIEDADE_grandezaUNITARIA  { $value="<PROPRIEDADE_GRANDEZAUNITARIA valor=\""+$PROPRIEDADE_grandezaUNITARIA.text+"\"/>"; }
    | PROPRIEDADE_ESTADOFISICO      { $value="<PROPRIEDADE_ESTADOFISICO valor=\""+$PROPRIEDADE_ESTADOFISICO.text+"\"/>"; }
    | PROPRIEDADE_PARTEDEPRODUTO    { $value="<PROPRIEDADE_PARTEDEPRODUTO valor=\""+$PROPRIEDADE_PARTEDEPRODUTO.text+"\"/>"; }
    | PROPRIEDADE_PARTEDEANIMAL     { $value="<PROPRIEDADE_PARTEDEANIMAL valor=\""+$PROPRIEDADE_PARTEDEANIMAL.text+"\"/>"; }
    | PROPRIEDADE_CONCENTRACAO      { $value="<PROPRIEDADE_CONCENTRACAO valor=\""+$PROPRIEDADE_CONCENTRACAO.text+"\"/>"; }
    | PROPRIEDADE_EMBALAGEM         { $value="<PROPRIEDADE_EMBALAGEM valor=\""+$PROPRIEDADE_EMBALAGEM.text+"\"/>"; }
    | PROPRIEDADE_GEOMETRIA         { $value="<PROPRIEDADE_GEOMETRIA valor=\""+$PROPRIEDADE_GEOMETRIA.text+"\"/>"; }
    | PROPRIEDADE_APRESENTACAO      { $value="<PROPRIEDADE_APRESENTACAO valor=\""+$PROPRIEDADE_APRESENTACAO.text+"\"/>"; }
    | PROPRIEDADE_CORTE 	    { $value="<PROPRIEDADE_CORTE valor=\""+$PROPRIEDADE_CORTE.text+"\"/>"; }
    | PROPRIEDADE_CONFECAO	    { $value="<PROPRIEDADE_CONFECAO valor=\""+$PROPRIEDADE_CONFECAO.text+"\"/>"; }
    | PROPRIEDADE_BEBIDAS	    { $value="<PROPRIEDADE_BEBIDAS valor=\""+$PROPRIEDADE_BEBIDAS.text+"\"/>"; }
    | PROPRIEDADE_GERAL             { $value="<PROPRIEDADE_GERAL valor=\""+$PROPRIEDADE_GERAL.text+"\"/>"; }
;
numero  returns [String value ]: 
    ALGEBRICO_INTEIRO   { $value="<ALGEBRICO_INTEIRO valor=\""+$ALGEBRICO_INTEIRO.text+"\"/>"; }
    | ALGEBRICO_DECIMAL { $value="<ALGEBRICO_DECIMAL valor=\""+$ALGEBRICO_DECIMAL.text+"\"/>"; }
    | ALGEBRICO_FRACAO  { $value="<ALGEBRICO_FRACAO valor=\""+$ALGEBRICO_FRACAO.text+"\"/>"; }
;
grandeza	 returns [String value ]: 
    PROPRIEDADE_grandezaLIQUIDA     { $value="<PROPRIEDADE_GRANDEZALIQUIDA valor=\""+$PROPRIEDADE_grandezaLIQUIDA.text+"\"/>"; }
    | PROPRIEDADE_grandezaSOLIDA    { $value="<PROPRIEDADE_GRANDEZASOLIDA valor=\""+$PROPRIEDADE_grandezaSOLIDA.text+"\"/>"; }
    | PROPRIEDADE_grandezaUNITARIA  { $value="<PROPRIEDADE_GRANDEZAUNITARIA valor=\""+$PROPRIEDADE_grandezaUNITARIA.text+"\"/>"; }
;
propriedades  returns [String value ]: 
    propriedade                                                 { $value=$propriedade.value; }
    | contem                                                    { $value=$contem.value; }
    | left=propriedades contem                                  { $value=$left.value+$contem.value; }
    | left=propriedades propriedade                             { $value=$left.value+$propriedade.value; }
    | left=propriedades GRAMATICA_E right=propriedades 		{ $value=$left.value+$right.value; }
    | left=propriedades GRAMATICA_PREPOSICAO right=propriedades { $value=$left.value+$right.value; } 
;


propriedadesSemprodutos	 returns [String value ]: 
    propriedade                                                     { $value="<PROPRIEDADE valor=\""+$propriedade.text+"\"/>"; }
    | left=propriedadesSemprodutos propriedade                      { $value="<PROPRIEDADESSEMPRODUTOS valor=\""+$left.text+"' />"+$propriedade.value; }
    | left=propriedadesSemprodutos GRAMATICA_E propriedade          { $value="<PROPRIEDADESSEMPRODUTOS valor=\""+$left.text+"' />"+$propriedade.value; }
    | left=propriedadesSemprodutos GRAMATICA_PREPOSICAO propriedade { $value="<PROPRIEDADESSEMPRODUTOS valor=\""+$left.text+"' />"+$propriedade.value; }
;
propriedade returns [String value ]: 
    PROPRIEDADE_BEBIDAS                     { $value="<PROPRIEDADE_BEBIDAS valor=\""+$PROPRIEDADE_BEBIDAS.text+"\"/>"; }
    | PROPRIEDADE_GERAL                     { $value="<PROPRIEDADE_GERAL valor=\""+$PROPRIEDADE_GERAL.text+"\"/>"; }
    | PROPRIEDADE_CONFECAO                  { $value="<PROPRIEDADE_CONFECAO valor=\""+$PROPRIEDADE_CONFECAO.text+"\"/>"; }
    | PROPRIEDADE_COR                       { $value="<PROPRIEDADE_COR valor=\""+$PROPRIEDADE_COR.text+"\"/>"; }
    | PROPRIEDADE_CLASSIFICACAODIETETICA    { $value="<PROPRIEDADE_CLASSIFICACAODIETETICA valor=\""+$PROPRIEDADE_CLASSIFICACAODIETETICA.text+"\"/>"; }
    | PROPRIEDADE_ANO                       { $value="<PROPRIEDADE_ANO valor=\""+$PROPRIEDADE_ANO.text+"\"/>"; }
    | PROPRIEDADE_ANOS                      { $value="<PROPRIEDADE_ANOS valor=\""+$PROPRIEDADE_ANOS.text+"\"/>"; }
    | PROPRIEDADE_GEOMETRIA                 { $value="<PROPRIEDADE_GEOMETRIA valor=\""+$PROPRIEDADE_GEOMETRIA.text+"\"/>"; }
    | PROPRIEDADE_TAMANHO                   { $value="<PROPRIEDADE_TAMANHO valor=\""+$PROPRIEDADE_TAMANHO.text+"\"/>"; }
    | propriedade_receita                   { $value=$propriedade_receita.value; }
    | PROPRIEDADE_PARTEDEANIMAL             { $value="<PROPRIEDADE_PARTEDEANIMAL valor=\""+$PROPRIEDADE_PARTEDEANIMAL.text+"\"/>"; }
    | quantidades                           { $value=$quantidades.value; }
    | familia_na_descricao                  { $value=$familia_na_descricao.value; }
    | propriedade_desconhecida              { $value=$propriedade_desconhecida.value; }
;
propriedade_receita 	 returns [String value ]: 
    NOME_RECEITA                                                            { $value="<NOME_RECEITA valor=\""+$NOME_RECEITA.text+"\"/>"; }	
    | left=propriedade_receita PALAVRA_DESCONHECIDA                         { $value=$left.value+"<PALAVRA_DESCONHECIDA valor=\""+$PALAVRA_DESCONHECIDA.text+"\"/>"; }
    | left=propriedade_receita GRAMATICA_PREPOSICAO PALAVRA_DESCONHECIDA    { $value=$left.value+"<PALAVRA_DESCONHECIDA valor=\""+$PALAVRA_DESCONHECIDA.text+"\"/>"; }	
;
contem  returns [String value ]: 
    produto { $value=$produto.value; }		
;
produto	returns [String value ]: 
    CLASSE_SOPAS                    { $value="<CLASSE_SOPAS valor=\""+$CLASSE_SOPAS.text+"\"/>"; }
    | CLASSE_CEREAIS                { $value="<CLASSE_CEREAIS valor=\""+$CLASSE_CEREAIS.text+"\"/>"; }
    | CLASSE_LEGUMINOSAS            { $value="<CLASSE_LEGUMINOSAS valor=\""+$CLASSE_LEGUMINOSAS.text+"\"/>"; }
    | CLASSE_HORTICOLAS             { $value="<CLASSE_HORTICOLAS valor=\""+$CLASSE_HORTICOLAS.text+"\"/>"; }
    | CLASSE_FRUTA                  { $value="<CLASSE_FRUTA valor=\""+$CLASSE_FRUTA.text+"\"/>"; }	
    | CLASSE_LACTEOS                { $value="<CLASSE_LACTEOS valor=\""+$CLASSE_LACTEOS.text+"\"/>"; }	
    | CLASSE_CHOCOLATES             { $value="<CLASSE_CHOCOLATES valor=\""+$CLASSE_CHOCOLATES.text+"\"/>"; }
    | CLASSE_ERVAAROMATICA          { $value="<CLASSE_ERVAAROMATICA valor=\""+$CLASSE_ERVAAROMATICA.text+"\"/>"; }
    | PROPRIEDADE_MARCA             { $value="<PROPRIEDADE_MARCA valor=\""+$PROPRIEDADE_MARCA.text+"\"/>"; }	
    | CLASSE_CONDIMENTO             { $value="<CLASSE_CONDIMENTO valor=\""+$CLASSE_CONDIMENTO.text+"\"/>"; }	
    | CLASSE_BEBIDA_COMCAFEINA      { $value="<CLASSE_BEBIDA_COMCAFEINA valor=\""+$CLASSE_BEBIDA_COMCAFEINA.text+"\"/>"; }
    | CLASSE_BEBIDAS_ALCOOLICAS     { $value="<CLASSE_BEBIDAS_ALCOOLICAS valor=\""+$CLASSE_BEBIDAS_ALCOOLICAS.text+"\"/>"; }
    | CLASSE_BEBIDAS_NAOALCOOLICAS  { $value="<CLASSE_BEBIDAS_NAOALCOOLICAS valor=\""+$CLASSE_BEBIDAS_NAOALCOOLICAS.text+"\"/>"; }
    | CLASSE_BEBIDAS_REFRIGERANTES  { $value="<CLASSE_BEBIDAS_REFRIGERANTES valor=\""+$CLASSE_BEBIDAS_REFRIGERANTES.text+"\"/>"; }
    | CLASSE_ACUCARADOS             { $value="<CLASSE_ACUCARADOS valor=\""+$CLASSE_ACUCARADOS.text+"\"/>"; }
    | CLASSE_CARNE                  { $value="<CLASSE_CARNE valor=\""+$CLASSE_CARNE.text+"\"/>"; }
    | CLASSE_PESCADO                { $value="<CLASSE_PESCADO valor=\""+$CLASSE_PESCADO.text+"\"/>"; }
    | CLASSE_CARNE_TRANSFORMADO     { $value="<CLASSE_CARNE_TRANSFORMADO valor=\""+$CLASSE_CARNE_TRANSFORMADO.text+"\"/>"; }
    | CLASSE_OVOS                   { $value="<CLASSE_OVOS valor=\""+$CLASSE_OVOS.text+"\"/>"; }
    | CLASSE_SOBREMESAS             { $value="<CLASSE_SOBREMESAS valor=\""+$CLASSE_SOBREMESAS.text+"\"/>"; }
    | CLASSE_MOLHOS                 { $value="<CLASSE_MOLHOS valor=\""+$CLASSE_MOLHOS.text+"\"/>"; }
    | CLASSE_AZEITES                { $value="<CLASSE_AZEITES valor=\""+$CLASSE_AZEITES.text+"\"/>"; }
    | CLASSE_GORDURAS               { $value="<CLASSE_GORDURAS valor=\""+$CLASSE_GORDURAS.text+"\"/>"; }
    | produto_desconhecido          { $value=$produto_desconhecido.value; }
;
propriedade_desconhecida  returns [String value ]: 
    desconhecido { $value="<PROPRIEDADE_DESCONHECIDA valor=\""+$desconhecido.text+"\"/>"; }
;
produto_desconhecido returns [String value ] : 
    desconhecido { $value="<PRODUTO_DESCONHECIDO valor=\""+$desconhecido.text+"\"/>"; }
;
desconhecido 	returns [String value ]: 
    PALAVRA_DESCONHECIDA                     { $value="<PALAVRA_DESCONHECIDA valor=\""+$PALAVRA_DESCONHECIDA.text+"\"/>"; }
    | left=desconhecido PALAVRA_DESCONHECIDA { $value=$left.value+"<PALAVRA_DESCONHECIDA valor=\""+$PALAVRA_DESCONHECIDA.text+"\"/>"; } 
;

/*
----------------------------------------------------------------------------------
*/

GRAMATICA_E :'e'('com')?;
//GRAMATICA_A : ('a'|'a')+;
GRAMATICA_COM :'com'|'c/']['']?;
GRAMATICA_DISJUNCAO :'sem'|'s'[/];
GRAMATICA_PREPOSICAO :'d'['e'|'a'];
//GRAMATICA_EM:'em';

PROPRIEDADE_ANO: [12][90][0-9]?[0-9]?;
PROPRIEDADE_ANOS:[1-9][0-9]?[0-9]?;
PROPRIEDADE_grandezaLIQUIDA: ('l'['t']? |'cl'|'ml'|'litro'|'garrafa');
PROPRIEDADE_grandezaSOLIDA: ('kg'|'gr'|'grs');
PROPRIEDADE_grandezaUNITARIA: ('dose'['s']? |'unidade'['s']? |'peca'['s']?);
PROPRIEDADE_ESTADOFISICO:'liquido';
PROPRIEDADE_BEBIDAS:'gas';
PROPRIEDADE_GERAL: ('aroma'['s']? | ['s'|'S']'imples'| ['m']'ist'['a'|'o']['s']? | ['c']'ombinad'['a'|'o']['s']? | ['r']'echeio'| ['f'|'F']'resc'['a'|'o']['s']? | ['r'|'R']'eserva');
PROPRIEDADE_GEOMETRIA: ('triangular'['es']? |'rodela'['s']? |'cubo'['s']? |'barra'['s']? |'palito'['s']? );
PROPRIEDADE_COR: ('branc'['a'|'o']['s']? |'tinto'|'verde'['s']? |'pret'['a'|'o']['s']? |'vermelh'['a'|'o']['s']? );
PROPRIEDADE_CORTE: ('febra'['s']? |'espetada'['s']? |'bif'['e'|'inho']['s']?);
PROPRIEDADE_PARTEDEANIMAL: ('lombo'['s']? |'costoleta'['s']? |'entrecosto'|'filete'['s']? );
PROPRIEDADE_PARTEDEPRODUTO: ('fatia'['s']?);
PROPRIEDADE_CONFECAO: ('grelhad'['a'|'o']['s']? |'cozid'['a'|'o']['s']? |'assad'(['a'|'o']['s']?)? |'frit'(['a'|'o']['s']?)? |'estufad'(['a'|'o']['s']?)? | ('no'*)?'forno');
PROPRIEDADE_MARCA: ('7up'|'b!'|'sagres'|'coca'['-']?'cola'|'super'[]*'bock');
PROPRIEDADE_CLASSIFICACAODIETETICA: ('light'|'magro'| ('meio'*)?'gordo');
PROPRIEDADE_APRESENTACAO:('pure'|'polpa');
PROPRIEDADE_TAMANHO: ('grande'|'mini'|'maxi'|'miniatura'|'pequen'['o'|'a']['s']?);
PROPRIEDADE_EMBALAGEM: ('gr'~'.'|'gr'|'gfa'|'lata'|'pacote'|'copo'|'chavena');

CLASSE_FRUTA: ('alperce'['s']? |'pera'['s']? |'banana'['s']? |'abacaxi'['s']? |'ananas'|'manga'['s']? |'morango'['s']? |'maca'|'citrino'['s']? |'laranja'['s']? |'lima'['o']? |'pessego'['s']? );
CLASSE_HORTICOLAS: ('batata'['s']? |'alface'|'alho'['s']? |'cebola'['s']? |'cenoura'['s']? |'cogumelo'['s']? |'couve'['s']? |'tomate'['s']? |'nabo'['s']? |'espinafre'['s']? |'espargo'['s']?);
CLASSE_LEGUMINOSAS: ('vegetariana'['s']? |'ervilha'['s']? |'fava'['s']? |'feij'['ao'|'oes']);
CLASSE_LACTEOS: ('leite'|'iogurte'|'queijo');
CLASSE_TODASASCLASSES: ('frut'['a'|'o']['s']? |'lacteo'['s']? |'carne'['s']? |'peixe'['s']? |'chocolate'['s']? |'sobremesa'['s']? |'refrigerante'['s']? |'sopa'['s']? |'bebida'['s']? |'cera'['l'|'is'] |'alcool'('ica'['s']?)? |'nao'*'alcoolica'['s']? | ('com'|'c/')'cafeina');                     
CLASSE_CARNE: ('frango'|'porco'|'pato'|'peru');
CLASSE_CARNE_TRANSFORMADO: ('fiambre'|'salsicha'['s']? |'chourico'['s']?);
CLASSE_PESCADO:('carapau'['s']? |'choco'['s']? |'bacalhau'|'atum'|'pescada');
CLASSE_OVOS: ('omolete'|'ovo'['s']?);
CLASSE_CEREAIS: ('arroz'|'farinha'|'massa'|'pao'|'tosta'|'flocos'|'biscoito'['s']? |'bolacha'['s']? |'croissant'['s']? |'folhado'['s']?);
CLASSE_CHOCOLATES: ('cacau'|'chocolate'['s']? |'achocolatado');
CLASSE_SOBREMESAS: ('mousse'|'pudim'|'gelado'|'gelatina');
CLASSE_ACUCARADOS: ('bolo'['s']? |'acucar'('ado'['s']?)? |'mel'|'compota'|'doce'['s']? |'nata'|'caramelo'['s']? |'creme'|'marmelada'|'pastilha'| 'chiclet'['e']['s']? |'elastica'|'rebucado'['s']? );
CLASSE_BEBIDAS_ALCOOLICAS: ('whisky'|'vinho'|'cerveja'|'digestivo'['s']?);
CLASSE_BEBIDAS_NAOALCOOLICAS: ('agua'|'descafeinado'|'sumo'|'cha');
CLASSE_BEBIDAS_REFRIGERANTES: ('cola');
CLASSE_MOLHOS: ('molho'['s']? |'nata'['s']);
CLASSE_SOPAS: ('caldo verde');
CLASSE_CONDIMENTO: ('sal'|'pimenta');
CLASSE_ERVAAROMATICA: ('m'['i'|'e']'nt'['a'|'o'|'ol']? |'baunilha'|'camomila'|'cidreira'|'erva'['s']? |'canela');
CLASSE_BEBIDA_COMCAFEINA: ('cafe'|'cappucino'|'abatanado'|'galao');
CLASSE_AZEITES: ('azeite');
CLASSE_GORDURAS: ('banha'|'manteiga'|'margarina');

ALGEBRICO_INTEIRO: ('0'..'9')+;
ALGEBRICO_DECIMAL: ALGEBRICO_INTEIRO'.'ALGEBRICO_INTEIRO+;
ALGEBRICO_FRACAO: ('meia'|ALGEBRICO_INTEIRO'/'ALGEBRICO_INTEIRO);
PROPRIEDADE_CONCENTRACAO:(ALGEBRICO_INTEIRO'%'|('concentrad'['a'|'o']));

NOME_RECEITA:WS+['aàáAÀ']WS+PALAVRA_DESCONHECIDA+;

PALAVRA_DESCONHECIDA: ('a'..'z'|'A'..'Z')+['.']?;

WS : (' '|'\t'|'\n'|'\r'|'\f'|'-'|'&'|'/'|'('|')'|'"'|'\''|',') -> channel(HIDDEN);

//[ \t\(\)'&\." / ",-]+ ;

//IDENT : ('a'..'z'|'A'..'Z')+;
