public class TicTacToePlayer extends Player {
    protected char symbol;
    protected int game_played;
    protected int win_score;
    protected int loss_score;

    public TicTacToePlayer(){}
    public TicTacToePlayer(String name, char symbol){
        this.setName(name);
        this.symbol = symbol;
        this.game_played = 0;
        this.win_score = 0;
        this.loss_score = 0;
    }
    public TicTacToePlayer(String name, int age, int jersey_no, char gender, String country, char symbol){
        super(name, age, jersey_no, gender, country);
        this.symbol = symbol;
        this.game_played = 0;
        this.win_score = 0;
        this.loss_score = 0;
    }
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
    public char getSymbol(){
        return this.symbol;
    }
    public void incrementGame_played(){
        this.game_played++;
    }
    public int getGame_played(){
        return this.game_played;
    }
    public void incrementWin_score(){
        this.win_score++;
    }
    public int getWin_score(){
        return this.win_score;
    }
    public void incrementLoss_score(){
        this.loss_score++;
    }
    public int getLoss_score(){
        return this.loss_score;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Game played: " + this.game_played);
        System.out.println("Win score: " + this.win_score);
        System.out.println("Loss score: " + this.loss_score);
    }
}
