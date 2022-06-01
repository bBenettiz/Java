/*
Aqui é feita a criação de outra classe, mainjogoDados, dentro dela será executado tudo que foi
desenvolvido na primeira clase, jogoDados.
 */
public class mainjogoDados {
    
    /*
    Aqui é criado um método, do tipo público estático que não retorna nada, este método deve receber como
    parâmetro um array de String chamdo de args.
    */
    public static void main(String[]args){
        jogoDados game = new jogoDados();//A classe jogoDados é atribuida à "game", que agora possui todas as informações da classe.
        game.play();//Aqui é executado tudo que foi desenvolvido na primeira classe.
    }

}
