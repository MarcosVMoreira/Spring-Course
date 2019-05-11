package com.luv2code.springdemo;

// crio um construtor para FortuneService para conseguir implementar diversos tipos de fortune e nao 
// ficar preso apenas a uma fortune implementada dentro de cada Coach. Essas fortunes diferentes
// podem ser chamadas pelo XML do Spring. Logo ,se eu quiser que algum coach chame um novo Bean que acabei de criar
// eu preciso apenas mudar no XML o bean que to usando no id="myFortuneService"

public interface FortuneService {
	public String getFortune ();
}
