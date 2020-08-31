package com.comunidade.grupos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pergunta")
public class ComunidadeController {
	
	@GetMapping
	public String getPergunta()
	{
		return "Que papel seus grupos organizados têm em sua vida? São importantes? Você gosta de se reunir com eles? Por que?";
	}
	@GetMapping("/resposta")
	public String getResposta()
	{
		return "Os grupos organizados em minhas vida tem um papel de grande importância, são nesses grupos onde consigo me divertir, aprender, sorrir e ser eu mesma sem que nada me barre, sem que eu me sinta julgada por uma roupa, maquiagem ou forma de falar, me sinto bem e livre e por isso gosto de me reunir com eles que seja da maneira que for todos podemos ser quem somos e aceitamos todos os novos integrantes também";
	}
	@PutMapping
	public String setPergunta()
	{
		return "\"Alegria compartilhada é alegria em dobro. Tristeza compartilhada é tristeza pela metade.\"  O QUE VOCÊS ACHAM QUE ESSE DITADO SIGNIFICA?";
	}
	@PutMapping("/resposta")
	public String setResposta()
	{
		return "Acho que esse provébio sueco quer dizer que quando você está alegre e compartilha essa alegria faz outra pessoa também alegre, e quando está triste e compartilha sua tristeza, a outra pessoa tenta acalmar e fazê-lo pensar em coisas boas, diminuindo o peso da tristeza";
	}

}
