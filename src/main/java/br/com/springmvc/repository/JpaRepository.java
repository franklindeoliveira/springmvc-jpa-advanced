package br.com.springmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class JpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void create() {
		System.out.println("CREATE");
		
		// id: simples
//		entityManager.persist(new IdIdentity("IdIdentity"));
//		entityManager.persist(new IdSequence("IdSequence"));
//		entityManager.persist(new IdTable("IdTable"));
//		entityManager.persist(new IdAuto("IdAuto"));
//		entityManager.persist(new IdCompostoIdClass(6, 6, "atributo")); TODO: tentar utilizar id automatico
//		entityManager.persist(new IdCompostoEmbeddedId(new IdCompostoEmbeddedIdID(1, 1), "atributo")); TODO: tentar utilizar id automatico
		
		// id: composto complexo com uma entidade
//		entityManager.persist(new IdCompostoComplexo1ID("atributo1"));
//		IdCompostoComplexo1ID id = entityManager.find(IdCompostoComplexo1ID.class, 1070);
//		entityManager.persist(new IdCompostoComplexo1(id, "atributo2"));
		
		// id: composto complexo com duas entidade
//		entityManager.persist(new IdCompostoComplexo2ID("atributo1"));
//		IdCompostoComplexo2ID id2 = entityManager.find(IdCompostoComplexo2ID.class, 1082);	
//		entityManager.persist(new IdCompostoComplexo2(id, id2, "atributo2"));
		
		// multiplastabelas: mapeando múltiplas tabelas
//		entityManager.persist(new Multiplas1("1", "2", "3", "4", "7"));
		
		// heranca: Single Table
//		entityManager.persist(new PessoaFisica("Nome PF", "111111"));
//		entityManager.persist(new PessoaJuridica("Nome PJ", "222222"));
//		Pessoa p = entityManager.find(Pessoa.class, 1102);
//		System.out.println(p.getNome());
//		Query q = entityManager.createQuery("select p from Pessoa p");
//		List<Pessoa> pessoas = q.getResultList();
//		System.out.println(pessoas.size());
		
		// heranca: Joined
//		entityManager.persist(new PessoaFisicaJoined("Nome PF Joined", "111111"));
//		entityManager.persist(new PessoaJuridicaJoined("Nome PJ Joined", "222222"));
		
		// heranca: Tabel Per Class
//		entityManager.persist(new PessoaFisicaTPC("Nome PF Joined", "111111"));
//		entityManager.persist(new PessoaJuridicaTPC("Nome PJ Joined", "222222"));
		
		// embbeddable
//		entityManager.persist(new Pessoa("Nome 1", 20, new Endereco("Estado",
//				"Cidade", "Logradouro", 100, "Complemento")));
		
		// collection: mapeando lista (string ou enum) de valores
//		entityManager.persist(
//				new Person2("Nome 1", 
//						new HashSet<String>(Arrays.asList("Email1", "Email2", "Email3")), 
//						Arrays.asList(CarBrands.FIAT, CarBrands.FORD, CarBrands.SUZUKI)));
		
		// relacionamentos: mapeamento one to one unidirecional
//		Rg rg = new Rg("123456", "01/01/2001");
//		entityManager.persist(rg);
//		Pessoa pessoa = new Pessoa("Nome", "20 anos", rg);
//		entityManager.persist(pessoa);

		// relacionamentos: mapeamento one to one bidirecional
//		Rg rg = new Rg("123456", "01/01/2001");
//		entityManager.persist(rg);
//		Pessoa pessoa = new Pessoa("Nome", "20 anos");
//		entityManager.persist(pessoa);
//		rg.setPessoa(pessoa);
//		pessoa.setRg(rg);
		
		// relacionamentos: mapeamento one to many unidirecional
//		Pessoa pessoa = new Pessoa("Nome", "20");
//		entityManager.persist(pessoa);
//		Carro carro1 = new Carro("Marca1", "Modelo1");
//		Carro carro2 = new Carro("Marca2", "Modelo2");
//		Carro carro3 = new Carro("Marca3", "Modelo3");
//		entityManager.persist(carro1);
//		entityManager.persist(carro2);
//		entityManager.persist(carro3);
//		if (pessoa.getCarros() != null) {
//			pessoa.getCarros().add(carro1);
//			pessoa.getCarros().add(carro2);
//			pessoa.getCarros().add(carro3);
//		} else {
//			pessoa.setCarros(Arrays.asList(carro1, carro2, carro3));
//		}
		
		// relacionamentos: mapeamento one to many bidirecional
//		Pessoa pessoa = new Pessoa("Nome", "20");
//		entityManager.persist(pessoa);
//		Carro carro = new Carro("Marca", "Modelo");
//		entityManager.persist(carro);
//		carro.setPessoa(pessoa);
//		if (pessoa.getCarros() != null) {
//			pessoa.getCarros().add(carro);
//		} else {
//			pessoa.setCarros(Arrays.asList(carro));
//		}
		
		// relacionamentos: mapeamento many to many unidirecional
//		Autor autor = new Autor("Nome 1");
//		Livro livro1 = new Livro("Título 1");
//		Livro livro2 = new Livro("Título 2");
//		Livro livro3 = new Livro("Título 3");
//		entityManager.persist(autor);
//		entityManager.persist(livro1);
//		entityManager.persist(livro2);
//		entityManager.persist(livro3);
//		autor.getLivros().add(livro1);
//		autor.getLivros().add(livro2);
//		autor.getLivros().add(livro3);
		
		// relacionamentos: mapeamento many to many bidirecional
//		Autor autor1 = new Autor("Nome 1");
//		Autor autor2 = new Autor("Nome 2");
//		Autor autor3 = new Autor("Nome 3");
//		Livro livro1 = new Livro("Título 1");
//		Livro livro2 = new Livro("Título 2");
//		Livro livro3 = new Livro("Título 3");
//		entityManager.persist(autor1);
//		entityManager.persist(autor2);
//		entityManager.persist(autor3);
//		entityManager.persist(livro1);
//		entityManager.persist(livro2);
//		entityManager.persist(livro3);
//		autor1.getLivros().add(livro1);
//		autor1.getLivros().add(livro2);
//		autor1.getLivros().add(livro3);
//		livro1.getAutores().add(autor1);
//		livro2.getAutores().add(autor1);
//		livro3.getAutores().add(autor1);
//		autor2.getLivros().add(livro1);
//		autor2.getLivros().add(livro2);
//		autor2.getLivros().add(livro3);
//		livro1.getAutores().add(autor2);
//		livro2.getAutores().add(autor2);
//		livro3.getAutores().add(autor2);
//		autor3.getLivros().add(livro1);
//		autor3.getLivros().add(livro2);
//		autor3.getLivros().add(livro3);
//		livro1.getAutores().add(autor3);
//		livro2.getAutores().add(autor3);
//		livro3.getAutores().add(autor3);
		
	}

	public void read(Integer id) {
		System.out.println("READ");
	}

	public void update() {
		System.out.println("UPDATE");
	}

	public void delete() {
		System.out.println("DELETE");
	}

}
