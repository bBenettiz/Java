import java.util.*;//Permite o acesso as demais classes que estejam dentro do mesmo pacote. MainjogoDados consegue acessar jogoDados.


Bruno Ferreira Benetti
Ana Paula Macedo
Gabriel Aragão da Silva
Camilo Maddalena de Souza
Allicia Guida Brant

/*
Aqui é feita a criação da primeira classe, jogoDados, dentro dela serão declarados atributos e métodos, 
que vão representar as características e comportamentos da mesma.
 */
public class jogoDados {

    /*
     Aqui ocorre a criação de uma classe que cria pseudonúmeros aleatórios.
    */
    public Random randomNum = new Random();

    /*
    Aqui ocorre a criação de um tipo especial de dado, utilizado para armazenar valores fixos, por isso é utilizado "enum", 
    ou seja, Status terá três valores fixos, Continue, WON e LOST.
    */
    public enum Status {Continue, WON, LOST};
public final static int SNAKE_EYES = 2; //Criação de uma várivel do tipo inteiro com um valor que não irá mudar.
public final static int TREY = 3; //Criação de uma várivel do tipo inteiro com um valor que não irá mudar.
public final static int SEVEN = 7; //Criação de uma várivel do tipo inteiro com um valor que não irá mudar.
public final static int YO_LEVEN = 11; //Criação de uma várivel do tipo inteiro com um valor que não irá mudar.
public final static int BOX_CARS = 12; //Criação de uma várivel do tipo inteiro com um valor que não irá mudar.

    /* 
    Função do tipo "void", sem retorno, é utilizada apenas para executar
    as instruções que estão dentro dela.
    */
    public void play(){
        int myPoint = 0; //Criação de uma várivel do tipo inteiro.
        Status gameStatus;  
        int sumDice = rollDice(); //Atribuindo outro nome à função.


            switch (sumDice){//Criação do condicional "sumDice".
                case SEVEN://Condição para satisfazer o condicional.
                case YO_LEVEN://Condição para satisfazer o condicional.
                    gameStatus=Status.WON;//gameStatus receberá o valor Status.WON caso for a condição ideal.
                case SNAKE_EYES://Condição para satisfazer o condicional.
                case BOX_CARS://Condição para satisfazer o condicional.
                    gameStatus=Status.LOST;//gameStatus receberá o valor Status.LOST caso for a condição ideal.
                case TREY://Condição para satisfazer o condicional.
                default://Última condição para satisfazer o condicional.
                    gameStatus=Status.Continue;//gameStatus receberá o valor Status.Continue caso for a condição ideal.
                    myPoint=sumDice;//Atribuindo sumDice ao myPoint.
                    System.out.printf("Point is %d\n", myPoint);//Exibição do "case" que satifez o condicional.
                    break;//Fim do condicional.
            }
        while(gameStatus==Status.Continue){//Equanto gameStatus for igual à Status.Continue será feito o que está abaixo.
            sumDice = rollDice();//Atribuindo outro nome à função.

            if (sumDice == myPoint)//Se sumDice for igual à myPoint, será feito o que está abaixo.
                gameStatus = Status.WON;//game.Status será igual à Status.WON.
            else
                if (sumDice==SEVEN)//Se sumDice for igual à SEVEN, será feito o que está abaixo.
                    gameStatus = Status.LOST;//game.Status será igual à Status.LOST.
        }
        if (gameStatus == Status.WON)//Se game.Status for igual à Status.WON, será feito o que está abaixo.
            System.out.println("Player Wins!");//Será exibido "Player Wins!".
        else//Caso game.Stauts não seja igual à Status.WON, será feito o que está abaixo.
            System.out.println("Player Loses!");//Será exibido "Player Loses!".
    }

    /* 
    É uma função na qual "rollDice" retorna apenas um valores inteiros.
    */
    public int rollDice(){
        int die1 = 1+ randomNum.nextInt(6);//A variável die1 terá o valor de 1+ algum pseudonúmero aleatório de 0 à 6.
        int die2 = 1+ randomNum.nextInt(6);//A variável die2 terá o valor de 1+ algum pseudonúmero aleatório de 0 à 6.
        int sum = die1 + die2;//A variável sum terá o valor de die1 somado ao die2.
        System.out.printf("Player rolled %dn = %d\n", die1, die2, sum);//Será exibido o número aleatório que foi criado.
        return sum;
    }


}
