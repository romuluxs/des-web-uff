/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Evento;
import modelo.Ingresso;
import tipos.TipoEvento;
import tipos.TipoIngresso;

/**
 *
 * @author Romulo
 */
// Essa popula na memória dados para fazer os testes do sistema
public class Seed {

    public static List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente;
        cliente = new Cliente();
        cliente.setId(1);

        cliente.setUsuario("joao_silva");
        cliente.setSenha("joao123");
        cliente.setNome("João da silva");
        cliente.setEmail("joao@hotmail.com");
        cliente.setTelefone("(21)94745-6509");
        cliente.setCpf("123.456.645-11");
        cliente.setDataDeNascimento("15/04/1995");
        cliente.setEndereco("Rua das Araras, Fortaleza, BH");
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setId(2);
        cliente.setUsuario("mari_santos");
        cliente.setSenha("mari123");
        cliente.setNome("Maria dos Santos");
        cliente.setEmail("mari@gmail.com");
        cliente.setTelefone("(31)96392-4409");
        cliente.setCpf("543.657.821-14");
        cliente.setDataDeNascimento("08/07/1985");
        cliente.setEndereco("Rua das Palmeiras, Jacarépagua, RJ");
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setId(3);
        cliente.setUsuario("flavia_souza");
        cliente.setSenha("flavia123");
        cliente.setNome("Flavia Almeida Souza");
        cliente.setEmail("flavinha@gmail.com");
        cliente.setTelefone("(21)97245-7362");
        cliente.setCpf("876.132.654.-78");
        cliente.setDataDeNascimento("09/03/179");
        cliente.setEndereco("Rua Americo Santos, Campinas, SP");
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setId(4);
        cliente.setUsuario("alessandra_melo");
        cliente.setSenha("alessandra123");
        cliente.setNome("Alessandra de Souza Melo");
        cliente.setEmail("alexinha@hotmail.com");
        cliente.setTelefone("(21)99657-4811");
        cliente.setCpf("453.243.165-89");
        cliente.setDataDeNascimento("12/08/1992");
        cliente.setEndereco("Rua da Alegria, Terra do Nunca, PR");
        clientes.add(cliente);

        return clientes;
    }

    public static List<Evento> getEventos() {
        List<Evento> eventos = new ArrayList<>();

        Evento evento = null;
        Ingresso ingresso = null;

        evento = new Evento();
        evento.setId(1);
        evento.setNome("As Tartarugas Ninja - Fora das Sombras");
        evento.setTipo(TipoEvento.Cinema);
        evento.setDescricao("Afetados por uma substância radioativa, um grupo de tartarugas cresce anormalmente, ganha força e conhecimento. Vivendo nos esgotos de Manhattan, quatro jovens tartarugas, treinadas na arte de kung-fu, Leonardo, Rafael, Michelangelo e Donatello, junto com seu sensei, Mestre Splinter, tem que enfrentar o mal que habita cidade.");
        evento.setHora("21:30");
        evento.setData("27/06/2016");
        evento.setLocal("Cinemark plaza, Niteroi, RJ");
        evento.setQuantidadeDeIngressos(50);
        ingresso = getIngresso().get(1-1);
        ingresso.setEvento(evento);
        evento.setIngresso(ingresso);
        eventos.add(evento);

        evento = new Evento();
        evento.setId(2);
        evento.setNome("Warcraft - O primeiro encontro de dois mundos");
        evento.setTipo(TipoEvento.Cinema);
        evento.setDescricao("O reino pacífico de Azeroth está à beira de uma guerra enquanto sua civilização enfrenta uma raça temível de invasores: guerreiros Orcs fugindo de sua casa moribunda para colonizar um novo lugar. Enquanto um portal se abre para conectar os dois mundos, um exército enfrenta destruição e o outro enfrenta a extinção. De lados opostos, dois heróis são colocados em um caminho de colisão que irá decidir o destino de suas famílias, seu povo e seu lar. Então, uma saga espetacular de poder e sacrifício começa, onde a guerra tem muitas faces, e todos lutam por algo.");
        evento.setHora("14:45");
        evento.setData("14/07/2016");
        evento.setLocal("Cinemark plaza, Niteroi, RJ");
        evento.setQuantidadeDeIngressos(35);
        ingresso = getIngresso().get(2-1);
        ingresso.setEvento(evento);
        evento.setIngresso(ingresso);
        eventos.add(evento);

        evento = new Evento();
        evento.setId(3);
        evento.setNome("AEROSMITH");
        evento.setTipo(TipoEvento.Show);
        evento.setDescricao("Uma das bandas de rock mais conhecidas mundialmente se apresenta em São Paulo ainda neste ano. O grupo Aerosmith irá passar por Porto Alegre, São Paulo e Recife em outubro de 2016 com a turnê “Rock n’ Roll Rumble – Aerosmith Style 2016''.");
        evento.setHora("21:00");
        evento.setData("15 de outubro");
        evento.setLocal("Allianz Parque, Rua Palestra Itália, 1800 - Barra Funda, São Paulo - SP");
        evento.setQuantidadeDeIngressos(1200);
        ingresso = getIngresso().get(3-1);
        ingresso.setEvento(evento);
        evento.setIngresso(ingresso);
        eventos.add(evento);

        evento = new Evento();
        evento.setId(4);
        evento.setNome("ANGRA");
        evento.setTipo(TipoEvento.Show);
        evento.setDescricao("");
        evento.setHora("22:00");
        evento.setData("13 de agosto");
        evento.setLocal("Tom Brasil, Rua Bragança Paulista, 1281 - Chacara Santo Antonio, São Paulo - SP");
        evento.setQuantidadeDeIngressos(800);
        ingresso = getIngresso().get(4-1);
        ingresso.setEvento(evento);
        evento.setIngresso(ingresso);
        eventos.add(evento);

        evento = new Evento();
        evento.setId(5);
        evento.setNome("Peter Pan e Sininho na Terra do Nunca");
        evento.setTipo(TipoEvento.Teatro);
        evento.setDescricao("Em um mundo encantado chamado A Terra do Nunca, se passa a fantástica história de um menino que não quer crescer, conhecido como Peter Pan. Junto com a sua amiga fada Sininho, Peter acaba indo parar na casa dos irmãos Wendy, João e Miguel. Levando-os então, para uma aventura inesquecível em sua Terra. No caminho, surge o inimigo terrível, Capitão Gancho, que os avista e decide atacar o grupo de amigos. Eles conseguem fugir, mas o malvado Capitão Gancho junto com seu serviçal Pirata Maroaldo não desistem nunca. Assim, esta batalha de Peter Pan e Sininho contra este terrível Gancho, estava apenas começando.");
        evento.setHora("17:00");
        evento.setData("26 de junho");
        evento.setLocal("Teatro Bibi Ferreira, Avenida Brigadeiro Luís Antônio, 931 - Bela Vista,São Paulo/SP");
        evento.setQuantidadeDeIngressos(200);
        ingresso = getIngresso().get(5-1);
        ingresso.setEvento(evento);
        evento.setIngresso(ingresso);
        eventos.add(evento);

        return eventos;
    }

    private static List<Ingresso> getIngresso() {
        List<Ingresso> ingressos = new ArrayList<>();

        Ingresso ingresso = null;
        ingresso = new Ingresso();
        ingresso.setId(1);
        ingresso.setPreco(350);
        ingresso.setTipo(TipoIngresso.Inteira);
        ingressos.add(ingresso);

        ingresso = new Ingresso();
        ingresso.setId(2);
        ingresso.setPreco(160);
        ingresso.setTipo(TipoIngresso.Inteira);
        ingressos.add(ingresso);

        ingresso = new Ingresso();
        ingresso.setId(3);
        ingresso.setPreco(177);
        ingresso.setTipo(TipoIngresso.Inteira);
        ingressos.add(ingresso);

        ingresso = new Ingresso();
        ingresso.setId(4);
        ingresso.setPreco(85);
        ingresso.setTipo(TipoIngresso.Inteira);
        ingressos.add(ingresso);

        ingresso = new Ingresso();
        ingresso.setId(5);
        ingresso.setPreco(234);
        ingresso.setTipo(TipoIngresso.Inteira);
        ingressos.add(ingresso);

        return ingressos;
    }

}
