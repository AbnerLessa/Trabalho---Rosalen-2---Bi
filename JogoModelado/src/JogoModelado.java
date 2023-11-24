
import pkgArma.*;
import pkgPersonagem.*;

public class JogoModelado {
    public static void main(String[] args) {
        boolean rodando = true;

        while (true) {
            int escolha = InOut.leInt("""
                                  Escolha sua classe 
                                      [1]-General 
                                      [2]-Lutador 
                                      [3]-Mago 
                                      []Sair"""
            );
            if (escolha != 1 && escolha != 2 && escolha != 3) {
                InOut.MsgDeAviso("Jogo", "FIM DE JOGO!");
                break;
            } else if (escolha == 1) {
                String nomeG = InOut.leString("Digite seu nome: ");
                General g = new General(nomeG);
                String nomeS = InOut.leString("Digite o nome de sua Faca: ");
                Faca facaA = new Faca(nomeS);
                g.setVida();
                g.setArma(facaA);
                InOut.MsgDeAviso("General", g.getInfo());
                boolean pocao = true;

                while (rodando) {
                    // Início do game
                    InOut.MsgDeAviso("PROLOGO", "Em uma longa jornada em busca de se tornar o General mais forte, " + nomeG +
                            " junto de sua fiel Faca " + nomeS + " caminha pelo vale dos Ossos, \nquando é surpreendido com uma Bola de fogo vindo em sua direção,. \n                                                                                  SEU MAIOR INIMIGO!");
                    DragaoAlado dg = new DragaoAlado("Shelong");
                    Fogo fogoA = new Fogo("Lanças-Chamas");
                    InOut.MsgDeAviso(dg.nome, dg.falar());
                    InOut.MsgDeAviso("História", "Shelong solta um sopro de fogo ardente!");
                    InOut.MsgDeAviso("História", "Mas o General desvia!");
                    InOut.MsgDeAviso("General ", dg.nome +  g.falar());
                    dg.setArma(fogoA);
                    dg.setVida();
                    dg.getInfo();
                    String[] desenhoDragao = dg.desenhar().split("\n");
                    String[] desenhoGeneral = g.desenhar().split("\n");
                    int numLinhas = Math.max(desenhoGeneral.length, desenhoDragao.length);

                    for (int i = 0; i < numLinhas; i++) {
                        String linhaGeneral = (i < desenhoGeneral.length) ? desenhoGeneral[i] : "";
                        String linhaDragao = (i < desenhoDragao.length) ? desenhoDragao[i] : "";

                        int espacosNecessarios = 100 - linhaGeneral.length();

                        String espacos = " ".repeat(Math.max(0, espacosNecessarios));

                        System.out.println(linhaGeneral + espacos + linhaDragao);
                    }

                    rodando = luta(g.getVida(), dg.getVida(), dg.getArma());
                    if (!rodando) {
                        break;
                    }
                    // Final do game
                    InOut.MsgDeAviso(nomeG, "Finalmente! Minha missão foi concluída, mas espere...");
                    InOut.MsgSemIcone("Voz misteriosa", "Você derrotou o grande Dragão, isto é impressionante. \n diga General, deseja ser o GENERAL SUPREMO???");
                    int opc = InOut.leInt("[1] - Sim [2] - Não");
                    if (opc == 1) {
                        InOut.MsgDeErro("Voz Misteriosa", "HAHAHAHHA, seu corpo agora é meu");
                        InOut.MsgDeAviso("História", "Traído pela própria ganância... Este é o seu Fim General");
                        break;
                    }
                    InOut.MsgDeAviso("História", "Parabéns, resistiu à tentação do mal, mostrando a honra e o seu valor \n, Parabéns General, você venceu!");

                    break;
                }
                if (!rodando) {
                    InOut.MsgDeAviso("História", "Fim de sua Jornada General.");

                }
            } else if (escolha == 2) {
                String nomeL = InOut.leString("Digite seu nome: ");
                Lutador l = new Lutador(nomeL);
                String nomeS = InOut.leString("Digite o nome de sua Kunai: ");
                Kunai kunaiA = new Kunai(nomeS);
                l.setVida();
                l.setArma(kunaiA);
                InOut.MsgDeAviso("Lutador", l.getInfo());
                boolean pocao = true;

                while (rodando) {
                    // Início do game
                    InOut.MsgDeAviso("PROLOGO", "Em uma longa jornada em busca de se tornar o Lutador mais forte, " + nomeL +
                            " junto de sua fiel Shuriken " + nomeS + " caminha pelo vale dos Ossos, \nquando é surpreendido com uma Bola de fogo vindo em sua direção,. \n                                                                                  SEU MAIOR INIMIGO!");
                    DragaoAlado dg = new DragaoAlado("Shelong");
                    Fogo fogoA = new Fogo("Lanças-Chamas");
                    InOut.MsgDeAviso(dg.nome, dg.falar());
                    InOut.MsgDeAviso("História", "Shelong solta um sopro de fogo ardente!");
                    InOut.MsgDeAviso("História", "Mas o Lutador desvia!");
                    InOut.MsgDeAviso("Lutador ", dg.nome + l.falar());
                    dg.setArma(fogoA);
                    dg.setVida();
                    dg.getInfo();
                    String[] desenhoDragao = dg.desenhar().split("\n");
                    String[] desenhoLutador = l.desenhar().split("\n");
                    int numLinhas = Math.max(desenhoLutador.length, desenhoDragao.length);

                    for (int i = 0; i < numLinhas; i++) {
                        String linhaLutador = (i < desenhoLutador.length) ? desenhoLutador[i] : "";
                        String linhaDragao = (i < desenhoDragao.length) ? desenhoDragao[i] : "";
                        int espacosNecessarios = 80 - linhaLutador.length();
                        String espacos = " ".repeat(Math.max(0, espacosNecessarios));
                        System.out.println(linhaLutador + espacos + linhaDragao);
                    }

                    rodando = luta(l.getVida(), dg.getVida(), dg.getArma());
                    if (!rodando) {
                        break;
                    }
                    // Final do game
                    InOut.MsgDeAviso(nomeL, "Finalmente! Minha missão foi concluída, mas espere...");
                                        InOut.MsgSemIcone("Voz misteriosa", "Você derrotou o grande Dragão, isto é impressionante. \n diga Lutador, deseja ser o Lutador SUPREMO???");
                    int opc = InOut.leInt("[1] - Sim [2] - Não");
                    if (opc == 1) {
                        InOut.MsgDeErro("Voz Misteriosa", "HAHAHAHHA, seu corpo agora é meu");
                        InOut.MsgDeAviso("História", "Traído pela própria ganância... Este é o seu Fim Lutador");
                        break;
                    }
                    InOut.MsgDeAviso("História", "Parabéns, resistiu à tentação do mal, mostrando a honra e o seu valor \n, Parabéns Lutador, você venceu!");

                    break;
                }
                if (!rodando) {
                    InOut.MsgDeAviso("História", "Fim de sua Jornada Lutador.");

                }
            } else if (escolha == 3) {
                String nomeM = InOut.leString("Digite seu nome: ");
                Mago m = new Mago(nomeM);
                String nomeS = InOut.leString("Digite o nome de sua Magia: ");
                Magia magic = new Magia(nomeS);
                m.setVida();
                m.setArma(magic);
                InOut.MsgDeAviso("Mago", m.getInfo());
                boolean pocao = true;

                while (rodando) {
                    // Início do game
                    InOut.MsgDeAviso("PROLOGO", "Em uma longa jornada em busca de se tornar o Mago mais forte, " + nomeM +
                            " junto de sua fiel Magia " + nomeS + " caminha pelo vale dos Ossos, \nquando é surpreendido com uma Bola de fogo vindo em sua direção,. \n                                                                                  SEU MAIOR INIMIGO!");
                    DragaoAlado dg = new DragaoAlado("Shelong");
                    Fogo fogoA = new Fogo("Lanças-Chamas");
                    InOut.MsgDeAviso(dg.nome, dg.falar());
                    InOut.MsgDeAviso("História", "Shelong solta um sopro de fogo ardente!");
                    InOut.MsgDeAviso("História", "Mas o Mago desvia!");
                    InOut.MsgDeAviso("Mago", dg.nome + m.falar());
                    dg.setArma(fogoA);
                    dg.setVida();
                    dg.getInfo();

                    String[] desenhoDragao = dg.desenhar().split("\n");
                    String[] desenhoMago = m.desenhar().split("\n");
                    int numLinhas = Math.max(desenhoMago.length, desenhoDragao.length);

                    for (int i = 0; i < numLinhas; i++) {
                        String linhaMago = (i < desenhoMago.length) ? desenhoMago[i] : "";
                        String linhaDragao = (i < desenhoDragao.length) ? desenhoDragao[i] : "";

                        
                        int espacosNecessarios = 50 - linhaMago.length(); 
                        String espacos = " ".repeat(Math.max(0, espacosNecessarios));
                        System.out.println(linhaMago + espacos + linhaDragao);
                    }

                    rodando = luta (m.getVida(), dg.getVida(), dg.getArma());
                    if (!rodando) {
                        break;
                    }
                    // Final do game
                    InOut.MsgDeAviso(nomeM, "Finalmente! Minha missão foi concluída, mas espere...");
                    InOut.MsgSemIcone("Voz misteriosa", "Você derrotou o grande Dragão, isto é impressionante. \n diga Mago, deseja ser o Mago SUPREMO???");
                    int opc = InOut.leInt("[1] - Sim [2] - Não");
                    if (opc == 1) {
                        InOut.MsgDeErro("Voz Misteriosa", "HAHAHAHHA, seu corpo agora é meu");
                        InOut.MsgDeAviso("História", "Traído pela própria ganância... Este é o seu Fim Mago");
                        break;
                    }
                    InOut.MsgDeAviso("História", "Parabéns, resistiu à tentação do mal, mostrando a honra e o seu valor \n, Parabéns Mago, você venceu!");

                    break;
                }
                if (!rodando) {
                    InOut.MsgDeAviso("História", "Fim de sua Jornada Mago.");

                }
            }
        }
    }

    public static boolean luta(int personagem, int inimigo, String arma) {
    int i = 1;
    int dano = 0;
    boolean pocao = true;
    boolean x = true;

    while (x) {
        InOut.MsgDeAviso("Batalha", "O inimigo tem " + inimigo + " de vida");
        int menu = InOut.leInt("O que deseja: [1] - Atacar, [2] - Correr");

        if (menu == 1) {
            InOut.MsgDeAviso("História", "A BATALHA COMEÇA! ");

            while (true) {
                if (personagem <= 25 && pocao) {
                    String frase = "Você tem menos da metade da vida, deseja usar uma poção?\n[1]-Sim\n[*]-Não";

                    if (InOut.leInt(frase) == 1) {
                        personagem += 25;
                        InOut.MsgDeAviso("Batalha", "Você restaurou 25 de vida, agora tem " + personagem + " vidas");
                        pocao = false;
                    }
                }

                if (i % 2 == 0) {
                    
                    if (voar(i)) {
                        InOut.MsgDeAviso("Batalha", "O Dragão voou para desviar do seu ataque!");
                    } else {
                        dano = (int) Math.floor(Math.random() * (16));
                        personagem -= dano;
                        InOut.MsgDeAviso("Batalha", "Você recebeu " + dano + " de dano do(a) " + arma + "! Você possui mais " + personagem + " de vida!");
                    }
                } else {
                    dano = (int) Math.floor(Math.random() * (16));
                    inimigo -= dano;
                    InOut.MsgDeAviso("Batalha", "Você deu " + dano + " de dano, o inimigo possui mais " + inimigo + " de vida!");
                }

                if (personagem <= 0) {
                    return false;
                } else if (inimigo <= 0) {
                    return true;
                }
                i++;
            }
        } else if (menu == 2) {
            InOut.MsgDeAviso("História", Personagem.correr());
            return false;
        }
    }

    return true;
}

private static boolean voar(int turno) {
    return turno % 2 == 0;
}

}
